package org.shaalakosh.master.entity.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.shaalakosh.master.model.SchoolCategory;
import org.shaalakosh.master.model.SchoolCategoryType;
import org.springframework.jdbc.core.RowMapper;

public class SchoolCategoryTypeMapper implements RowMapper<SchoolCategoryType> {
	
	@Override
	public SchoolCategoryType mapRow(ResultSet rs, int arg1) throws SQLException {
		SchoolCategoryType schoolCategoryType = new SchoolCategoryType();
		schoolCategoryType.setSchoolCategoryTypeID(rs.getInt("SchoolCategoryTypeID"));
		schoolCategoryType.setSchoolCategoryTypeName(rs.getString("SchoolCategoryTypeName"));
		schoolCategoryType.setActive(rs.getBoolean("IsActive"));	

		return schoolCategoryType;
	}

}
