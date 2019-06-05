package org.shaalakosh.school;

import java.io.IOException;
import java.text.ParseException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;
import org.springframework.web.filter.GenericFilterBean;

public class JwtFilter extends GenericFilterBean {

	public void doFilter(final ServletRequest req, final ServletResponse res, final FilterChain chain)
			throws IOException, ServletException {
		final HttpServletRequest request = (HttpServletRequest) req;
		final HttpServletResponse response = (HttpServletResponse) res;
		final String authHeader = request.getHeader("authorization");
		if ("OPTIONS".equals(request.getMethod())) {
			response.setStatus(HttpServletResponse.SC_OK);
			chain.doFilter(req, res);
		} else {
			if (authHeader == null || !authHeader.startsWith("Bearer ")) {
				throw new UserOauthException("Missing or invalid Authorization header");
			}
			final String token = authHeader.substring(7);
			try {
				System.out.println("token :- " + token);
				JSONObject mapToken = JwtTokenParser.parseToken(token);
				long unixTime = (int) mapToken.get("exp");
				System.out.println(unixTime);
				if (JwtTokenParser.isExpired(unixTime)) {
					throw new UserOauthException("Access token expired: "+token);
				}
			} catch (ParseException e) {				
				throw new UserOauthException("Cannot convert access token to JSON");
			}
			chain.doFilter(req, res);
		}
	}
}