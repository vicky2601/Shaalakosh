package org.shaalakosh.master.entity.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.shaalakosh.master.model.District;
import org.springframework.jdbc.core.RowMapper;

public class DistrictMapper implements RowMapper<District> {

	@Override
	public District mapRow(ResultSet rs, int arg1) throws SQLException {
		District district = new District();
		district.setDistrictID(rs.getInt("DistrictID"));
		district.setDistrictCode(rs.getString("DistrictCode"));
		district.setDistrictName(rs.getString("DistrictName"));
		district.setUdiseDistrictCode(rs.getString("UdiseDistrictCode"));
		district.setLgdDistrictCode(rs.getString("LgdDistrictCode"));
		district.setStateID(rs.getInt("StateID"));
		district.setCreatedByUserID(rs.getInt("CreatedByUserID"));
		district.setCreatedDate(rs.getDate("CreatedDate"));
		district.setUpdatedByUserID(rs.getInt("UpdatedByUserID"));
		district.setUpdatedDate(rs.getDate("UpdatedDate"));
		district.setActive(rs.getBoolean("IsActive"));
		return district;
	}
	

}
