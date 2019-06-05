package org.shaalakosh.auth.dao.impl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.shaalakosh.auth.dao.UserDao;
import org.shaalakosh.auth.entity.mapper.UserMapper;
import org.shaalakosh.auth.model.UserMaster;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDaoImpl implements UserDao {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public int save(UserMaster user) {
		String SQL_INSERT_User = "insert into mst_usermaster(first_name, last_name, email,password) values(?,?,?,?)";
		return jdbcTemplate.update(SQL_INSERT_User, user.getName(), user.getUserName(), user.getEmail(),
				user.getPassword());
	}

	@Override
	public UserMaster findByUserName(String username) {
		String SQL_FIND_User = "select * from mst_usermaster where UserName = ? and IsActive=1";
		try {
			return jdbcTemplate.queryForObject(SQL_FIND_User, new Object[] { username }, new UserMapper());
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<UserMaster> findAll() {
		return jdbcTemplate.query("Select * from mst_usermaster", new UserMapper());
	}

	@Override
	public int changePassword(UserMaster user) {
		System.out.println(user);
		String SQL_INSERT_User = "update mst_usermaster set Password=? , IsFirstAttempt=0 where UserName=?";
		return jdbcTemplate.update(SQL_INSERT_User, user.getPassword(), user.getUserName());
	}

	@Override
	public int loginTrail(UserMaster user, String ipaddress) {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String SQL_INSERT_User = "insert into mst_logindetail(LoginDate, UserID, LoginIP,IsLogIn) values(?,?,?,?)";
		return jdbcTemplate.update(SQL_INSERT_User, df.format(new Date()), user.getUserID(),ipaddress,1);		
	}

	

}
