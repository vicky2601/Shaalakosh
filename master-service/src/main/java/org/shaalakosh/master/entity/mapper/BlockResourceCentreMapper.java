package org.shaalakosh.master.entity.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.shaalakosh.master.model.BlockResourceCentre;
import org.shaalakosh.master.model.ResidentialSchoolType;
import org.springframework.jdbc.core.RowMapper;

public class BlockResourceCentreMapper implements RowMapper<BlockResourceCentre> {
	
	@Override
	public BlockResourceCentre mapRow(ResultSet rs, int arg1) throws SQLException {
		BlockResourceCentre blockResourceCentre = new BlockResourceCentre();
		blockResourceCentre.setBlockResourceCentreID(rs.getInt("BlockResourceCentreID"));
		blockResourceCentre.setBlockResourceCentreCode(rs.getString("BlockResourceCentreCode"));
		blockResourceCentre.setBlockResourceCentre(rs.getString("BlockResourceCentre"));
		blockResourceCentre.setBlockID(rs.getInt("BlockID"));
		blockResourceCentre.setBlockCode(rs.getString("BlockCode"));
		blockResourceCentre.setDistrictID(rs.getInt("DistrictID"));
		blockResourceCentre.setDistrictCode	(rs.getString("DistrictCode"));
		blockResourceCentre.setStateID(rs.getInt("StateID"));
		blockResourceCentre.setStateCode(rs.getString("StateCode"));
		blockResourceCentre.setCreatedByUserID(rs.getInt("CreatedByUserID"));
		blockResourceCentre.setCreatedDate(rs.getDate("CreatedDate"));
		blockResourceCentre.setUpdatedByUserID(rs.getInt("UpdatedByUserID"));
		blockResourceCentre.setUpdatedDate(rs.getDate("UpdatedDate"));
		blockResourceCentre.setActive(rs.getBoolean("IsActive"));	

		return blockResourceCentre;
	}

}
