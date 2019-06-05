package org.shaalakosh.auth.config;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import javax.servlet.ServletException;

import org.json.JSONObject;
import org.springframework.security.jwt.Jwt;
import org.springframework.security.jwt.JwtHelper;

public class JwtTokenParser {

	@SuppressWarnings("unchecked")
	public static JSONObject parseToken(String token) throws ServletException {
		JSONObject jsonObject = null;
		try {
			Jwt jwt = JwtHelper.decode(token);
			System.out.println(jwt.toString());
			System.out.println(jwt.getClaims());
			System.out.println(jwt.getEncoded());
			jsonObject = new JSONObject(jwt.getClaims());
		} catch (Exception e) {
			throw new ServletException("Invalid token");
		}
		return jsonObject;
	}

	public static boolean isExpired(long unixTime) throws ParseException {
		Date date = new Date(unixTime * 1000L);
		// format of the date
		SimpleDateFormat jdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss z");
		jdf.setTimeZone(TimeZone.getTimeZone("GMT+5:30"));
		String java_date = jdf.format(date);
		System.out.println("\n" + java_date + "\n");
		System.out.println(jdf.parse(java_date).before(new Date()));
		return jdf.parse(java_date).before(new Date());
	}
}
