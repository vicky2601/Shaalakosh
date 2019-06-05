package org.shaalakosh.auth.config;

import org.springframework.security.oauth2.common.exceptions.OAuth2Exception;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize(using = CustomOauthExceptionSerializer.class)
public class UserOauthException extends OAuth2Exception {

	private static final long serialVersionUID = 1L;

	public UserOauthException(String msg) {
		super(msg);		
	}
	

}
