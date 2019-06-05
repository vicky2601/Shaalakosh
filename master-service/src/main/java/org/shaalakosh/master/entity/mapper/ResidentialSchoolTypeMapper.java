package org.shaalakosh.master.entity.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.shaalakosh.master.model.ResidentialSchoolType;
import org.springframework.jdbc.core.RowMapper;

public class ResidentialSchoolTypeMapper implements RowMapper<ResidentialSchoolType> {

	@Override
	public ResidentialSchoolType mapRow(ResultSet rs, int arg1) throws SQLException {
		ResidentialSchoolType residentialSchoolType = new ResidentialSchoolType();
		residentialSchoolType.setResidentialSchoolTypeID(rs.getInt("ResidentialSchoolTypeID"));
		residentialSchoolType.setResidentialSchoolTypeDesc(rs.getString("ResidentialSchoolTypeDesc"));
		residentialSchoolType.setActive(rs.getBoolean("IsActive"));

		return residentialSchoolType;
	}

}
