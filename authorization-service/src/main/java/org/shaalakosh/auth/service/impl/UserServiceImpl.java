package org.shaalakosh.auth.service.impl;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;

import org.shaalakosh.auth.constant.StatusMaster;
import org.shaalakosh.auth.dao.UserDao;
import org.shaalakosh.auth.model.UserMaster;
import org.shaalakosh.auth.response.dto.CustomReponseStatus;
import org.shaalakosh.auth.response.dto.ServiceResponse;
import org.shaalakosh.auth.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service(value = "userService")
public class UserServiceImpl implements UserDetailsService, UserService {

	@Autowired
	private UserDao userDao;

	public int save(UserMaster user) {
		return userDao.save(user);
	}

	public ServiceResponse findByUserName(String username) {
		ServiceResponse serviceResponse = new ServiceResponse();
		LinkedHashMap<Object, Object> response = new LinkedHashMap<>();
		CustomReponseStatus responseStatus = null;

		if (!"".equalsIgnoreCase(username)) {

			try {
				UserMaster userMaster = userDao.findByUserName(username);
				responseStatus = new CustomReponseStatus(StatusMaster.SUCCESS.getResponseId(),
						StatusMaster.SUCCESS.getResponseCode(), StatusMaster.SUCCESS.getResponseMessage(),
						StatusMaster.SUCCESS.getResponseDescription());
				response.put("customResponse", responseStatus);
				response.put("AllData", userMaster);

			} catch (Exception e) {
				responseStatus = new CustomReponseStatus(StatusMaster.FAILED.getResponseId(),
						StatusMaster.FAILED.getResponseCode(), StatusMaster.FAILED.getResponseMessage(),
						StatusMaster.FAILED.getResponseDescription());
				response.put("customResponse", responseStatus);
			}			
		} else {
			try {
				List<UserMaster> userMasterList = userDao.findAll();
				responseStatus = new CustomReponseStatus(StatusMaster.SUCCESS.getResponseId(),
						StatusMaster.SUCCESS.getResponseCode(), StatusMaster.SUCCESS.getResponseMessage(),
						StatusMaster.SUCCESS.getResponseDescription());
				response.put("customResponse", responseStatus);
				response.put("totalSize", userMasterList.size());
				response.put("allData", userMasterList);

			} catch (Exception e) {
				responseStatus = new CustomReponseStatus(StatusMaster.FAILED.getResponseId(),
						StatusMaster.FAILED.getResponseCode(), StatusMaster.FAILED.getResponseMessage(),
						StatusMaster.FAILED.getResponseDescription());
				response.put("customResponse", responseStatus);
			}
		}
		serviceResponse.setServiceResponse(response);
		return serviceResponse;		
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		System.out.println("Username :- " + username);
		UserMaster user = userDao.findByUserName(username);
		System.out.println(user);
		if (user == null) {
			throw new UsernameNotFoundException("Invalid username or password.");
		}
		return new org.springframework.security.core.userdetails.User(user.getUserName(), user.getPassword(),
				getAuthority());
	}

	private List getAuthority() {
		return Arrays.asList(new SimpleGrantedAuthority("ROLE_ADMIN"));
	}

	@Override
	public CustomReponseStatus changePassword(UserMaster user) {
		CustomReponseStatus responseStatus = null;
		try {
			int status = userDao.changePassword(user);
			System.out.println("Status :- " + status);
			if (status == 1 || status == 2) {
				responseStatus = new CustomReponseStatus(StatusMaster.SUCCESS.getResponseId(),
						StatusMaster.SUCCESS.getResponseCode(), StatusMaster.SUCCESS.getResponseMessage(),
						StatusMaster.SUCCESS.getResponseDescription());
			} else {
				responseStatus = new CustomReponseStatus(StatusMaster.FAILED.getResponseId(),
						StatusMaster.FAILED.getResponseCode(), StatusMaster.FAILED.getResponseMessage(),
						StatusMaster.FAILED.getResponseDescription());
			}
		} catch (Exception e) {
			responseStatus = new CustomReponseStatus(StatusMaster.FAILED.getResponseId(),
					StatusMaster.FAILED.getResponseCode(), StatusMaster.FAILED.getResponseMessage(),
					StatusMaster.FAILED.getResponseDescription());
			e.printStackTrace();
		}
		return responseStatus;		
	}

	@Override
	public int loginTrail(String user, String ipaddress) {
		return userDao.loginTrail(userDao.findByUserName(user), ipaddress);
	}

	@Override
	public UserMaster getUserDetailByUserName(String username) {
		return userDao.findByUserName(username);
	}

}
