package org.shaalakosh.auth.config;

import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.oauth2.common.exceptions.OAuth2Exception;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.provider.token.TokenEnhancer;
import org.springframework.security.oauth2.provider.token.TokenEnhancerChain;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;

@Configuration
@EnableAuthorizationServer
@PropertySource("classpath:authorization.properties")
public class AuthorizationServerConfig extends AuthorizationServerConfigurerAdapter {

	@Value("${security.jwt.client-id}")
	private String clientId;

	@Value("${security.jwt.client-secret}")
	private String clientSecret;

	@Value("${security.jwt.grant-type}")
	private String grantType;

	@Value("${security.jwt.refresh-token}")
	private String refreshToken;

	@Value("${security.jwt.scope-read}")
	private String scopeRead;

	@Value("${security.jwt.scope-write}")
	private String scopeWrite;

	@Value("${security.jwt.resource-ids}")
	private String resourceIds;

	@Value("${security.jwt.token-validity}")
	private int tokenValidity;

	@Value("${security.jwt.refresh-token-validity}")
	private int refreshtokenValidity;

	@Autowired
	private TokenStore tokenStore;

	@Autowired
	private JwtAccessTokenConverter accessTokenConverter;

	@Autowired
	private AuthenticationManager authenticationManager;

	@Override
	public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
		TokenEnhancerChain enhancerChain = new TokenEnhancerChain();
		enhancerChain.setTokenEnhancers(Arrays.asList(accessTokenConverter,tokenEnhancer()));
		endpoints.tokenStore(tokenStore).accessTokenConverter(accessTokenConverter).tokenEnhancer(enhancerChain)
				.authenticationManager(authenticationManager);
		
		/*endpoints.tokenStore(tokenStore).tokenEnhancer(customTokenEnhancer())
		.authenticationManager(authenticationManager);*/
		endpoints.exceptionTranslator(e -> {
			if (e instanceof OAuth2Exception) {
				OAuth2Exception oAuth2Exception = (OAuth2Exception) e;

				return ResponseEntity.status(oAuth2Exception.getHttpErrorCode())
						.body(new UserOauthException(oAuth2Exception.getMessage()));
			} else {
				throw e;
			}
		});
	}

	@Bean
	public TokenEnhancer tokenEnhancer() {
	   return new CustomTokenEnhancer();
	}	

	@Override
	public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
		clients.inMemory().withClient(clientId).secret(clientSecret).authorizedGrantTypes(grantType, refreshToken)
				.scopes(scopeRead, scopeWrite).resourceIds(resourceIds).accessTokenValiditySeconds(tokenValidity)
				.refreshTokenValiditySeconds(refreshtokenValidity);
	}
}
