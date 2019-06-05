package org.shaalakosh.auth.config;

import java.util.Collection;

import javax.servlet.http.HttpServletRequest;

import org.json.JSONObject;
import org.shaalakosh.auth.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;



@Component
public class CustomAuthenticationProvider implements AuthenticationProvider {

	@Autowired
	private UserDetailsService userDetailsService;

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	@Autowired
	private UserService userService;
		
	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {

		System.out.println("coming Auth.....");
		String username = authentication.getName();
		String rawPassword = authentication.getCredentials().toString();
		String string = authentication.getDetails().toString();
		/*JSONObject jsonObject = new JSONObject(string);*/
		System.out.println(rawPassword+" "+string);
		UserDetails user = null;
		String password = null;
		Collection<? extends GrantedAuthority> authorities = null;		
		user = userDetailsService.loadUserByUsername(username);
		System.out.println("check...."+passwordEncoder.matches(rawPassword, user.getPassword()));
		authorities = user.getAuthorities();
		userService.loginTrail(username,"192.168.101.1");
		if(passwordEncoder.matches(rawPassword, user.getPassword())) {
			return new UsernamePasswordAuthenticationToken(user, password, authorities);			
		}
		else {
			throw new UsernameNotFoundException("Invalid username or password.");
		}		
	}

	@Override
	public boolean supports(Class<?> authentication) {
		return authentication.equals(UsernamePasswordAuthenticationToken.class);
	}

}
