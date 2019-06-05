package org.shaalakosh.auth.entity.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.shaalakosh.auth.model.UserMaster;
import org.springframework.jdbc.core.RowMapper;

public class UserMapper implements RowMapper<UserMaster> {

	@Override
	public UserMaster mapRow(ResultSet rs, int arg1) throws SQLException {
		UserMaster user = new UserMaster();
		user.setUserID(rs.getInt("UserID"));
		user.setUserName(rs.getString("UserName"));
		user.setPassword(rs.getString("Password"));
		user.setName(rs.getString("Name"));		
		user.setMobile(rs.getString("Mobile"));
		user.setEmail(rs.getString("Email"));
		user.setUserGroupID(rs.getInt("UserGroupID"));
		user.setLevelID(rs.getInt("LevelID"));
		user.setRemarks(rs.getString("Remarks"));
		user.setIsActive(rs.getInt("IsActive"));
		user.setIsFirstAttempt(rs.getInt("IsFirstAttempt"));
		return user;
	}
	

}
