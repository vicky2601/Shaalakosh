package org.shaalakosh.master.entity.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.shaalakosh.master.model.Role;
import org.springframework.jdbc.core.RowMapper;

public class RoleMapper implements RowMapper<Role> {
	
	@Override
	public Role mapRow(ResultSet rs, int arg1) throws SQLException {
		Role role = new Role();
		role.setRoleID(rs.getInt("RoleID"));
		role.setRoleName(rs.getString("RoleName"));
		role.setLevelID(rs.getInt("LevelID"));
		role.setActive(rs.getBoolean("IsActive"));	

		return role;
	}

}
