package org.shaalakosh.school.model.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.shaalakosh.school.model.BasicSchoolProfileInfo;
import org.springframework.jdbc.core.RowMapper;

public class BasicSchoolProfileInfoMapper implements RowMapper<BasicSchoolProfileInfo> {

	@Override
	public BasicSchoolProfileInfo mapRow(ResultSet resultSet, int arg1) throws SQLException {
		BasicSchoolProfileInfo basicSchoolProfileInfo = new BasicSchoolProfileInfo();
		basicSchoolProfileInfo.setSchoolId(resultSet.getInt("SchoolID"));
		basicSchoolProfileInfo.setUdiseSchoolCode(resultSet.getString("UdiseSchoolCode"));
		basicSchoolProfileInfo.setStateId(resultSet.getInt("StateID"));
		basicSchoolProfileInfo.setDistrictId(resultSet.getInt("DistrictID"));
		basicSchoolProfileInfo.setBlockId(resultSet.getInt("BlockID"));
		basicSchoolProfileInfo.setSchoolName(resultSet.getString("SchoolName"));
		basicSchoolProfileInfo.setSchoolAddress(resultSet.getString("SchoolAddress"));
		basicSchoolProfileInfo.setPincode(resultSet.getInt("PinCode"));
		basicSchoolProfileInfo.setBlockResourcentreId(resultSet.getInt("BlockResourceCentreID"));
		basicSchoolProfileInfo.setClusterResourceCentreId(resultSet.getInt("ClusterResourceCentreID"));
		basicSchoolProfileInfo.setSchoolCategoryCodeId(resultSet.getInt("SchoolCategoryID"));
		basicSchoolProfileInfo.setLowestClassId(resultSet.getInt("LowestClassID"));
		basicSchoolProfileInfo.setHighestClassId(resultSet.getInt("HighestClassID"));
		basicSchoolProfileInfo.setSchoolTypeId(resultSet.getInt("SchoolTypeID"));
		basicSchoolProfileInfo.setManagementOfTheSchoolId(resultSet.getInt("SchoolManagementID"));
		basicSchoolProfileInfo.setMonthOfAcademicYearStart(resultSet.getString("Acad_Session_Start_Month"));
		basicSchoolProfileInfo.setIsThisAResidentialSchool(resultSet.getInt("Is_Residential_School"));
		basicSchoolProfileInfo.setTypeOfResidentialSchoolId(resultSet.getInt("ResidentialSchoolTypeID"));
		basicSchoolProfileInfo.setIsThisAMinorityManagedSchool(resultSet.getInt("Is_Minority_Managed"));
		basicSchoolProfileInfo.setTypeOfSchoolCommunityId(resultSet.getInt("MinorityCommunityID"));
		basicSchoolProfileInfo.setIsThisASpecialSchoolForCWSN(resultSet.getInt("Is_CWSN"));
		basicSchoolProfileInfo.setIsThisAShiftschool(resultSet.getInt("Is_Shift_School"));
		basicSchoolProfileInfo.setCreateBy(resultSet.getInt("CreatedByUserID"));
		basicSchoolProfileInfo.setUpdatedBy(resultSet.getInt("UpdatedByUserID"));
		basicSchoolProfileInfo.setCreateDateTime(resultSet.getDate("CreatedDate"));
		basicSchoolProfileInfo.setUpdatedDateTime(resultSet.getDate("UpdatedDate"));
		basicSchoolProfileInfo.setSchoolCode(resultSet.getString("SchoolCode"));
		basicSchoolProfileInfo.setSessionID(resultSet.getInt("SessionID"));
		basicSchoolProfileInfo.setClusterID(resultSet.getInt("ClusterID"));
		basicSchoolProfileInfo.setClusterCode(resultSet.getString("ClusterCode"));
		basicSchoolProfileInfo.setUdiseClusterCode(resultSet.getString("UdiseClusterCode"));
		basicSchoolProfileInfo.setBlockCode(resultSet.getString("BlockCode"));
		basicSchoolProfileInfo.setUdiseBlockCode(resultSet.getString("UdiseBlockCode"));
		basicSchoolProfileInfo.setDistrictCode(resultSet.getString("DistrictCode"));
		basicSchoolProfileInfo.setUdiseDistrictCode(resultSet.getString("UdiseDistrictCode"));
		basicSchoolProfileInfo.setStateCode(resultSet.getString("StateCode"));
		basicSchoolProfileInfo.setUdiseStateCode(resultSet.getString("UdiseStateCode"));
		basicSchoolProfileInfo.setMergedSchoolID(resultSet.getInt("MergedSchoolID"));
		basicSchoolProfileInfo.setMergedSchoolCode(resultSet.getString("MergedSchoolCode"));
		basicSchoolProfileInfo.setMergedClosedYear(resultSet.getInt("MergedClosedYear"));
		basicSchoolProfileInfo.setMergedSessionID(resultSet.getInt("MergedSessionID"));
		basicSchoolProfileInfo.setMergedSessionCode(resultSet.getString("MergedSessionCode"));
		basicSchoolProfileInfo.setMergedRemarks(resultSet.getString("MergedRemarks"));
		basicSchoolProfileInfo.setLgd_District_Code(resultSet.getInt("Lgd_District_Code"));
		basicSchoolProfileInfo.setLgd_SubDistrict_Code(resultSet.getInt("Lgd_SubDistrict_Code"));
		basicSchoolProfileInfo.setLgd_Ward_Code(resultSet.getInt("Lgd_Ward_Code"));
		basicSchoolProfileInfo.setLgd_LocalBody_Code(resultSet.getInt("Lgd_LocalBody_Code"));
		basicSchoolProfileInfo.setRev_District_Code(resultSet.getInt("Rev_District_Code"));
		basicSchoolProfileInfo.setRev_SubDistrict_Code(resultSet.getInt("Rev_SubDistrict_Code"));
		basicSchoolProfileInfo.setRev_Block_Code(resultSet.getInt("Rev_Block_Code"));
		basicSchoolProfileInfo.setRev_Village_Code(resultSet.getInt("Rev_Village_Code"));
		basicSchoolProfileInfo.setStatus(resultSet.getString("Status"));
		return basicSchoolProfileInfo;
	}

}
