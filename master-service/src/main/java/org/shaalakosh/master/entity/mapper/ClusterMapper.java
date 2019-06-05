package org.shaalakosh.master.entity.mapper;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.shaalakosh.master.model.Cluster;
import org.springframework.jdbc.core.RowMapper;

public class ClusterMapper implements RowMapper<Cluster>{
	

		@Override
		public Cluster mapRow(ResultSet rs, int arg1) throws SQLException {
			Cluster cluster = new Cluster();
			cluster.setClusterID(rs.getInt("ClusterID"));
			cluster.setClusterCode(rs.getString("ClusterCode"));
			cluster.setClusterName(rs.getString("ClusterName"));
			cluster.setBlockID(rs.getInt("BlockID"));
			cluster.setBlockCode(rs.getString("BlockCode"));
			cluster.setActive(rs.getBoolean("IsActive"));
			cluster.setStateID(rs.getInt("StateID"));
			cluster.setStateCode(rs.getString("StateCode"));
			cluster.setDistrictID(rs.getInt("DistrictID"));
	        cluster.setDistrictCode(rs.getString("DistrictCode"));
	        cluster.setCreatedByUserID(rs.getInt("CreatedByUserID"));
	        cluster.setCreatedDate(rs.getDate("CreatedDate"));
	        cluster.setUdiseClusterCode(rs.getString("UdiseClusterCode"));
	        cluster.setUpdatedByUserID(rs.getInt("UpdatedByUserID"));
	        cluster.setUpdatedDate(rs.getDate("UpdatedDate"));
			return cluster;
		}
		

	}


