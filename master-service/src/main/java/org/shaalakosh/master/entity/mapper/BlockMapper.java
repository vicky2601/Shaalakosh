package org.shaalakosh.master.entity.mapper;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.shaalakosh.master.model.Block;
import org.springframework.jdbc.core.RowMapper;

public class BlockMapper implements RowMapper<Block>{
	

		@Override
		public Block mapRow(ResultSet rs, int arg1) throws SQLException {
			Block block = new Block();
			block.setBlockID(rs.getInt("BlockID"));
			block.setBlockCode(rs.getString("BlockCode"));
			block.setBlockName(rs.getString("BlockName"));
			block.setUdiseBlockCode(rs.getString("UdiseBlockCode"));
			block.setLgdBlockCode(rs.getString("LgdBlockCode"));
			block.setDistrictID(rs.getInt("DistrictID"));
			block.setDistrictCode(rs.getString("DistrictCode"));
		    block.setStateID(rs.getInt("StateID"));
		    block.setStateCode(rs.getString("StateCode"));
		    block.setCreatedByUserID(rs.getInt("CreatedByUserID"));
		    block.setCreatedDate(rs.getDate("CreatedDate"));
		    block.setUpdatedByUserID(rs.getInt("UpdatedByUserID"));
		    block.setUpdatedDate(rs.getDate("UpdatedDate"));
		    block.setActive(rs.getBoolean("IsActive"));
			//state.setStateID(rs.);
			/*user.setUserId(rs.getLong("user_id"));
			user.setEmail(rs.getString("email"));
			user.setFirstName(rs.getString("first_name"));
			user.setLastName(rs.getString("last_name"));		
			user.setPassword(rs.getString("password"));
			user.setCreated(rs.getDate("created"));*/
			return block;
		}
		

	}


