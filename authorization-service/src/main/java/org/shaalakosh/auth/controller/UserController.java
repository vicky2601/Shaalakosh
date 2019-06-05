package org.shaalakosh.auth.controller;

import java.util.Collection;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.json.JSONObject;
import org.shaalakosh.auth.model.UserMaster;
import org.shaalakosh.auth.response.dto.CustomReponseStatus;
import org.shaalakosh.auth.response.dto.ServiceResponse;
import org.shaalakosh.auth.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.token.ConsumerTokenServices;
import org.springframework.security.oauth2.provider.token.DefaultTokenServices;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost", maxAge = 3600)
@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@Autowired
	private TokenStore tokenStore;

	@Autowired
	private ConsumerTokenServices consumerTokenServices;

	@Autowired
	private DefaultTokenServices tokenServices;

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(HttpServletRequest request) {
		String authHeader = request.getHeader("Authorization");
		if (authHeader != null) {
			try {
				System.out.println("access " + authHeader.replace("Bearer", "").trim());
				String tokenValue = authHeader.replace("Bearer", "").trim();
				OAuth2AccessToken accessToken = tokenStore.readAccessToken(tokenValue);
				System.out
						.println(accessToken.getAdditionalInformation() + "Access token :- " + accessToken.toString());

				Collection<OAuth2AccessToken> tokens = tokenStore.findTokensByClientId("mhrd_shaala");
				for (OAuth2AccessToken token : tokens) {
					System.out.println(token.getValue());
					consumerTokenServices.revokeToken(token.getValue());
				}
				/*
				 * if (accessToken == null) { return "Null"; } if (accessToken.getRefreshToken()
				 * != null) { tokenStore.removeRefreshToken(accessToken.getRefreshToken()); }
				 * tokenStore.removeAccessToken(accessToken);
				 */
				// tokenStore.removeAccessToken(accessToken);
				tokenServices.readAccessToken(tokenValue);
				System.out.println("******** :- " + tokenServices.getClientId(tokenValue));
				tokenServices.setAccessTokenValiditySeconds(1);
				tokenServices.setRefreshTokenValiditySeconds(1);
				tokenStore.removeAccessToken(accessToken);

				OAuth2AccessToken accessToken2 = tokenStore.readAccessToken(tokenValue);
				System.out.println(
						accessToken2.getAdditionalInformation() + "Access token :- " + accessToken2.toString());

			} catch (Exception e) {
				e.printStackTrace();
				return "Not Success";
			}
		}
		return "Success";
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public int registerUser(@RequestBody UserMaster user) {
		return userService.save(user);
	}

	@RequestMapping(value = "/changepassword", method = RequestMethod.POST)
	public CustomReponseStatus changeUserPassword(@RequestBody UserMaster user) {
		return userService.changePassword(user);
	}

	@RequestMapping(value = "/userdetails", method = RequestMethod.GET)
	public ServiceResponse listUser() {
		System.out.println("comingg...");
		return userService.findByUserName("");
	}

	@RequestMapping(value = "/userdetail", method = RequestMethod.GET)
	public ServiceResponse listUser(HttpServletRequest request) {
		String authHeader = request.getHeader("Authorization");
		if (authHeader != null) {
			try {
				System.out.println("comingg...");
				String tokenValue = authHeader.replace("Bearer", "").trim();
				OAuth2AccessToken accessToken = tokenStore.readAccessToken(tokenValue);
				System.out
						.println(accessToken.getAdditionalInformation() + "Access token :- " + accessToken.toString());
				JSONObject jsonObject = new JSONObject(accessToken.getAdditionalInformation());
				return userService.findByUserName(jsonObject.getString("user_name"));
			} catch (Exception e) {
				e.printStackTrace();
				return null;
			}
		}
		return null;
	}

	@RequestMapping(value = "/userdetail/{username}", method = RequestMethod.GET)
	public UserMaster getUserDetail(@PathVariable String username) {
		return userService.getUserDetailByUserName(username);
	}
}
