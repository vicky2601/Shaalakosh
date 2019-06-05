package org.shaalakosh.master.entity.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.shaalakosh.master.model.SchoolManagementDetails;
import org.springframework.jdbc.core.RowMapper;

public class SchoolManagementDetailMapper implements RowMapper<SchoolManagementDetails> {
	
	@Override
	public SchoolManagementDetails mapRow(ResultSet rs, int arg1) throws SQLException {
		SchoolManagementDetails schoolManagementDetails = new SchoolManagementDetails();
		schoolManagementDetails.setSchoolManagementID(rs.getInt("SchoolManagementID"));
		schoolManagementDetails.setSchoolManagementDesc(rs.getString("SchoolManagementDesc"));
		schoolManagementDetails.setActive(rs.getBoolean("IsActive"));	

		return schoolManagementDetails;
	}
	
}
