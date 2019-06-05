package org.shaalakosh.master.entity.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.shaalakosh.master.model.School;
import org.springframework.jdbc.core.RowMapper;

public class SchoolMapper implements RowMapper<School>{

	@Override
	public School mapRow(ResultSet rs, int arg1) throws SQLException {
			School school=new School();
			school.setAssemblyconstName(rs.getString("AssemblyConstName"));
			school.setBlockCode(rs.getString("BlockCode"));
			school.setSchoolID(rs.getInt("SchoolID"));
			school.setSchoolCode(rs.getString("SchoolCode"));
			school.setSchoolName(rs.getString("SchoolName"));
			school.setUdiseschoolCode(rs.getString("UdiseSchoolCode"));
			school.setSessionID(rs.getInt("SessionID"));
			school.setSchoolAddress(rs.getString("SchoolAddress"));
			school.setPinCode(rs.getInt("PinCode"));
			school.setSchoolStdCode(rs.getString("SchoolStdCode"));
			school.setSchoolTelephone(rs.getString("SchoolTelephone"));
			school.setSchoolMobile(rs.getString("SchoolMobile"));
			school.setRespondentID(rs.getInt("RespondentID"));
			school.setRespName(rs.getString("RespName"));
			school.setRespStdCode(rs.getString("RespStdCode"));
			school.setRespTelephone(rs.getString("RespTelephone"));
			school.setRespMobile(rs.getString("RespMobile"));
			school.setSchoolWebsite(rs.getString("SchoolWebsite"));
			school.setSchoolEmail(rs.getString("SchoolEmail"));
			school.setLatitude(rs.getString("Latitude"));
			school.setLongitude(rs.getString("Longitude"));
			school.setSchoolLocationID(rs.getInt("SchoolLocationID"));
			school.setVillageName(rs.getString("VillageName"));
			school.setWardNumber(rs.getString("WardNumber"));
			school.setMunicipalityName(rs.getString("MunicipalityName"));
			school.setHabitation(rs.getString("Habitation"));
			school.setMohalla(rs.getString("Mohalla"));
			school.setGramPanchayat(rs.getString("GramPanchayat"));
			school.setCityName(rs.getString("CityName"));
			school.setClusterID(rs.getInt("ClusterID"));
			school.setClusterCode(rs.getString("ClusterCode"));
		    school.setUdiseClusterCode(rs.getString("UdiseClusterCode"));
		    school.setBlockID(rs.getInt("BlockID"));
		    school.setBlockCode(rs.getString("BlockCode"));
		    school.setUdiseBlockCode(rs.getString("UdiseBlockCode"));
		    school.setDistrictID(rs.getInt("DistrictID"));
		    school.setDistrictCode(rs.getString("DistrictCode"));
		    school.setUdisedistrictCode(rs.getString("UdiseDistrictCode"));
		    school.setStateID(rs.getInt("StateID"));
		    school.setStateCode(rs.getString("StateCode"));
		    school.setUdisestateCode(rs.getString("UdiseStateCode"));
		    school.setAssemblyconstName(rs.getString("AssemblyConstName"));
		    school.setParliamentaryconstName(rs.getString("ParliamenteryConstName"));
		    school.setMergedschoolID(rs.getInt("MergedSchoolID"));
		    school.setMergedschoolCode(rs.getString("MergedSchoolCode"));
		    school.setMergedclosedyear(rs.getInt("MergedClosedYear"));
		    school.setMergedsessionID(rs.getInt("MergedSessionID"));
		    school.setMergedsessionCode(rs.getString("MergedSessionCode"));
		    school.setMergedRemarks(rs.getString("MergedRemarks"));
		    school.setStatus(rs.getString("Status"));
		    school.setLgdID(rs.getInt("LgdID"));
		    school.setSchoolImageURL("SchoolImageURL");
		    school.setBlockresourcecentreID(rs.getInt("BlockResourceCentreID"));
		    school.setClusterresourcecentreID(rs.getInt("ClusterResourceCentreID"));
		    school.setCreatedbyuserID(rs.getInt("CreatedByUserID"));
		    school.setCreatedDate(rs.getDate("CreatedDate"));
		    school.setUpdatedbyUserId(rs.getInt("UpdatedByUserID"));
		    school.setUpdateDate(rs.getDate("UpdatedDate"));
			return school;
			
	}
	

}
