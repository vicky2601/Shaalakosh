package org.shaalakosh.auth.dao;

import java.util.List;

import org.shaalakosh.auth.model.UserMaster;


public interface UserDao{	
	int save(UserMaster user);
	UserMaster findByUserName(String username);
	List<UserMaster> findAll();
	int changePassword(UserMaster user);
	int loginTrail(UserMaster user , String ipaddress);	
}
