package org.shaalakosh.auth.service;

import org.shaalakosh.auth.model.UserMaster;
import org.shaalakosh.auth.response.dto.CustomReponseStatus;
import org.shaalakosh.auth.response.dto.ServiceResponse;

public interface UserService {
	int save(UserMaster user);

	CustomReponseStatus changePassword(UserMaster user);

	ServiceResponse findByUserName(String username);

	int loginTrail(String user, String ipaddress);
	UserMaster getUserDetailByUserName(String username);

}
