package org.shaalakosh.master.entity.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.shaalakosh.master.model.MinorityCommunity;
import org.springframework.jdbc.core.RowMapper;

public class MinorityCommunityMapper implements RowMapper<MinorityCommunity> {

	public MinorityCommunity mapRow(ResultSet rs, int arg1) throws SQLException {
		MinorityCommunity minorityCommunity = new MinorityCommunity();
		minorityCommunity.setMinorityCommunityID(rs.getInt("MinorityCommunityID"));
		minorityCommunity.setMinorityCommunityDesc(rs.getString("MinorityCommunityDesc"));
		minorityCommunity.setActive(rs.getBoolean("IsActive"));

		return minorityCommunity;
	}

}
