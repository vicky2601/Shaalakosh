package org.shaalakosh.master.entity.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.shaalakosh.master.model.SchoolCategory;
import org.springframework.jdbc.core.RowMapper;

public class SchoolCategoryMapper implements RowMapper<SchoolCategory> {

	@Override
	public SchoolCategory mapRow(ResultSet rs, int arg1) throws SQLException {
		SchoolCategory schoolCategory = new SchoolCategory();
		schoolCategory.setSchoolCategoryID(rs.getInt("SchoolCategoryID"));
		schoolCategory.setSchoolCategoryName(rs.getString("SchoolCategoryName"));
		schoolCategory.setLowestClassID(rs.getInt("LowestClassID"));
		schoolCategory.setHighestClassID(rs.getInt("HighestClassID"));
		schoolCategory.setCreatedByUserID(rs.getInt("CreatedByUserID"));
		schoolCategory.setCreatedDate(rs.getDate("CreatedDate"));
		schoolCategory.setUpdatedByUserID(rs.getInt("UpdatedByUserID"));
		schoolCategory.setUpdatedDate(rs.getDate("UpdatedDate"));
		schoolCategory.setActive(rs.getBoolean("IsActive"));	

		return schoolCategory;
	}

}
