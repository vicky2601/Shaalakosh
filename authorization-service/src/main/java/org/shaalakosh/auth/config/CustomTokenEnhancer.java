package org.shaalakosh.auth.config;

import java.util.HashMap;
import java.util.Map;

import org.shaalakosh.auth.dao.UserDao;
import org.shaalakosh.auth.model.UserMaster;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.TokenEnhancer;

public class CustomTokenEnhancer implements TokenEnhancer {
	
	@Autowired
	private UserDao userDao;

	@Override
	public OAuth2AccessToken enhance(OAuth2AccessToken accessToken,
			OAuth2Authentication authentication) {
		// TODO Auto-generated method stub
		User user = (User) authentication.getPrincipal();
        final Map<String, Object> additionalInfo = new HashMap<>();
        UserMaster userDetail = userDao.findByUserName(user.getUsername());
		System.out.println("User Information :- "+user.getUsername());
		additionalInfo.put("IsFirstAttempt",userDetail.getIsFirstAttempt());

        ((DefaultOAuth2AccessToken) accessToken).setAdditionalInformation(additionalInfo);

        return accessToken;
	}

}
