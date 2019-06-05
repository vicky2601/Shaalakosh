package org.shaalakosh.school.bean;

import java.util.Date;

/**
 * @author UTL0813 Dayal
 *
 */

// Table name "trn_school" or "trn_school_basic_info"
public class BasicSchoolProfileInfoBean {

	// Basic Information-I Sections Fields
	private String schoolId; // SchoolID
	private String udiseSchoolCode; // UdiseSchoolCode
	private String stateId; // StateID
	private String districtId; // DistrictID
	private String blockId; // BlockID
	private String schoolName; // SchoolName
	private String schoolAddress; // SchoolAddress
	private String pincode; // PinCode
	private String blockResourcentreId; // BlockResourceCentreID
	private String clusterResourceCentreId; // ClusterResourceCentreID

	// School Management & Category Information Sections Fields
	private String schoolCategoryCodeId; // SchoolCategoryID
	private String lowestClass; // LowestClassID
	private String highestClass; // HighestClassID
	private String schoolTypeId; // SchoolTypeID
	private String managementOfTheSchoolId; // SchoolManagementID
	private String monthOfAcademicYearStart; // Acad_Session_Start_Month

	// Is this a residential school? sections Fields
	private String isThisAResidentialSchool; // Is_Residential_School
	private String typeOfResidentialSchoolId; // ResidentialSchoolTypeID

	// Is this a Minority Managed School? Sections Fields
	private String isThisAMinorityManagedSchool; // Is_Minority_Managed
	private String typeOfSchoolCommunityId; // MinorityCommunityID
	private String isThisASpecialSchoolForCWSN; // Is_CWSN
	private String isThisAShiftschool; // Is_Shift_School

	private String createBy; // CreatedByUserID
	private String updatedBy; // UpdatedByUserID
	private Date createDateTime; // CreatedDate
	private Date updatedDateTime; // UpdatedDate

	// Extra Fields
	private String SchoolCode; // SchoolCode
	private String SessionID; // SessionID
	private String ClusterID; // ClusterID
	private String ClusterCode; // ClusterCode
	private String UdiseClusterCode; // UdiseClusterCode
	private String BlockCode; // BlockCode
	private String UdiseBlockCode; // UdiseBlockCode
	private String DistrictCode; // DistrictCode
	private String UdiseDistrictCode; // UdiseDistrictCode
	private String StateCode; // StateCode
	private String UdiseStateCode; // UdiseStateCode
	private String MergedSchoolID; // MergedSchoolID
	private String MergedSchoolCode; // MergedSchoolCode
	private String MergedClosedYear; // MergedClosedYear
	private String MergedSessionID; // MergedSessionID
	private String MergedSessionCode; // MergedSessionCode
	private String MergedRemarks; // MergedRemarks
	private String Lgd_District_Code; // Lgd_District_Code
	private String Lgd_SubDistrict_Code; // Lgd_SubDistrict_Code
	private String Lgd_Ward_Code; // Lgd_Ward_Code
	private String Lgd_LocalBody_Code; // Lgd_LocalBody_Code
	private String Rev_District_Code; // Rev_District_Code
	private String Rev_SubDistrict_Code; // Rev_SubDistrict_Code
	private String Rev_Block_Code; // Rev_Block_Code
	private String Rev_Village_Code; // Rev_Village_Code
	private String Status; // Status

	public String getSchoolId() {
		return schoolId;
	}

	public void setSchoolId(String schoolId) {
		this.schoolId = schoolId;
	}

	public String getUdiseSchoolCode() {
		return udiseSchoolCode;
	}

	public void setUdiseSchoolCode(String udiseSchoolCode) {
		this.udiseSchoolCode = udiseSchoolCode;
	}

	public String getStateId() {
		return stateId;
	}

	public void setStateId(String stateId) {
		this.stateId = stateId;
	}

	public String getDistrictId() {
		return districtId;
	}

	public void setDistrictId(String districtId) {
		this.districtId = districtId;
	}

	public String getBlockId() {
		return blockId;
	}

	public void setBlockId(String blockId) {
		this.blockId = blockId;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getSchoolAddress() {
		return schoolAddress;
	}

	public void setSchoolAddress(String schoolAddress) {
		this.schoolAddress = schoolAddress;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getBlockResourcentreId() {
		return blockResourcentreId;
	}

	public void setBlockResourcentreId(String blockResourcentreId) {
		this.blockResourcentreId = blockResourcentreId;
	}

	public String getClusterResourceCentreId() {
		return clusterResourceCentreId;
	}

	public void setClusterResourceCentreId(String clusterResourceCentreId) {
		this.clusterResourceCentreId = clusterResourceCentreId;
	}

	public String getSchoolCategoryCodeId() {
		return schoolCategoryCodeId;
	}

	public void setSchoolCategoryCodeId(String schoolCategoryCodeId) {
		this.schoolCategoryCodeId = schoolCategoryCodeId;
	}

	public String getLowestClass() {
		return lowestClass;
	}

	public void setLowestClass(String lowestClass) {
		this.lowestClass = lowestClass;
	}

	public String getHighestClass() {
		return highestClass;
	}

	public void setHighestClass(String highestClass) {
		this.highestClass = highestClass;
	}

	public String getSchoolTypeId() {
		return schoolTypeId;
	}

	public void setSchoolTypeId(String schoolTypeId) {
		this.schoolTypeId = schoolTypeId;
	}

	public String getManagementOfTheSchoolId() {
		return managementOfTheSchoolId;
	}

	public void setManagementOfTheSchoolId(String managementOfTheSchoolId) {
		this.managementOfTheSchoolId = managementOfTheSchoolId;
	}

	public String getMonthOfAcademicYearStart() {
		return monthOfAcademicYearStart;
	}

	public void setMonthOfAcademicYearStart(String monthOfAcademicYearStart) {
		this.monthOfAcademicYearStart = monthOfAcademicYearStart;
	}

	public String getIsThisAResidentialSchool() {
		return isThisAResidentialSchool;
	}

	public void setIsThisAResidentialSchool(String isThisAResidentialSchool) {
		this.isThisAResidentialSchool = isThisAResidentialSchool;
	}

	public String getTypeOfResidentialSchoolId() {
		return typeOfResidentialSchoolId;
	}

	public void setTypeOfResidentialSchoolId(String typeOfResidentialSchoolId) {
		this.typeOfResidentialSchoolId = typeOfResidentialSchoolId;
	}

	public String getIsThisAMinorityManagedSchool() {
		return isThisAMinorityManagedSchool;
	}

	public void setIsThisAMinorityManagedSchool(String isThisAMinorityManagedSchool) {
		this.isThisAMinorityManagedSchool = isThisAMinorityManagedSchool;
	}

	public String getTypeOfSchoolCommunityId() {
		return typeOfSchoolCommunityId;
	}

	public void setTypeOfSchoolCommunityId(String typeOfSchoolCommunityId) {
		this.typeOfSchoolCommunityId = typeOfSchoolCommunityId;
	}

	public String getIsThisASpecialSchoolForCWSN() {
		return isThisASpecialSchoolForCWSN;
	}

	public void setIsThisASpecialSchoolForCWSN(String isThisASpecialSchoolForCWSN) {
		this.isThisASpecialSchoolForCWSN = isThisASpecialSchoolForCWSN;
	}

	public String getIsThisAShiftschool() {
		return isThisAShiftschool;
	}

	public void setIsThisAShiftschool(String isThisAShiftschool) {
		this.isThisAShiftschool = isThisAShiftschool;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getCreateDateTime() {
		return createDateTime;
	}

	public void setCreateDateTime(Date createDateTime) {
		this.createDateTime = createDateTime;
	}

	public Date getUpdatedDateTime() {
		return updatedDateTime;
	}

	public void setUpdatedDateTime(Date updatedDateTime) {
		this.updatedDateTime = updatedDateTime;
	}

	public String getSchoolCode() {
		return SchoolCode;
	}

	public void setSchoolCode(String schoolCode) {
		SchoolCode = schoolCode;
	}

	public String getSessionID() {
		return SessionID;
	}

	public void setSessionID(String sessionID) {
		SessionID = sessionID;
	}

	public String getClusterID() {
		return ClusterID;
	}

	public void setClusterID(String clusterID) {
		ClusterID = clusterID;
	}

	public String getClusterCode() {
		return ClusterCode;
	}

	public void setClusterCode(String clusterCode) {
		ClusterCode = clusterCode;
	}

	public String getUdiseClusterCode() {
		return UdiseClusterCode;
	}

	public void setUdiseClusterCode(String udiseClusterCode) {
		UdiseClusterCode = udiseClusterCode;
	}

	public String getBlockCode() {
		return BlockCode;
	}

	public void setBlockCode(String blockCode) {
		BlockCode = blockCode;
	}

	public String getUdiseBlockCode() {
		return UdiseBlockCode;
	}

	public void setUdiseBlockCode(String udiseBlockCode) {
		UdiseBlockCode = udiseBlockCode;
	}

	public String getDistrictCode() {
		return DistrictCode;
	}

	public void setDistrictCode(String districtCode) {
		DistrictCode = districtCode;
	}

	public String getUdiseDistrictCode() {
		return UdiseDistrictCode;
	}

	public void setUdiseDistrictCode(String udiseDistrictCode) {
		UdiseDistrictCode = udiseDistrictCode;
	}

	public String getStateCode() {
		return StateCode;
	}

	public void setStateCode(String stateCode) {
		StateCode = stateCode;
	}

	public String getUdiseStateCode() {
		return UdiseStateCode;
	}

	public void setUdiseStateCode(String udiseStateCode) {
		UdiseStateCode = udiseStateCode;
	}

	public String getMergedSchoolID() {
		return MergedSchoolID;
	}

	public void setMergedSchoolID(String mergedSchoolID) {
		MergedSchoolID = mergedSchoolID;
	}

	public String getMergedSchoolCode() {
		return MergedSchoolCode;
	}

	public void setMergedSchoolCode(String mergedSchoolCode) {
		MergedSchoolCode = mergedSchoolCode;
	}

	public String getMergedClosedYear() {
		return MergedClosedYear;
	}

	public void setMergedClosedYear(String mergedClosedYear) {
		MergedClosedYear = mergedClosedYear;
	}

	public String getMergedSessionID() {
		return MergedSessionID;
	}

	public void setMergedSessionID(String mergedSessionID) {
		MergedSessionID = mergedSessionID;
	}

	public String getMergedSessionCode() {
		return MergedSessionCode;
	}

	public void setMergedSessionCode(String mergedSessionCode) {
		MergedSessionCode = mergedSessionCode;
	}

	public String getMergedRemarks() {
		return MergedRemarks;
	}

	public void setMergedRemarks(String mergedRemarks) {
		MergedRemarks = mergedRemarks;
	}

	public String getLgd_District_Code() {
		return Lgd_District_Code;
	}

	public void setLgd_District_Code(String lgd_District_Code) {
		Lgd_District_Code = lgd_District_Code;
	}

	public String getLgd_SubDistrict_Code() {
		return Lgd_SubDistrict_Code;
	}

	public void setLgd_SubDistrict_Code(String lgd_SubDistrict_Code) {
		Lgd_SubDistrict_Code = lgd_SubDistrict_Code;
	}

	public String getLgd_Ward_Code() {
		return Lgd_Ward_Code;
	}

	public void setLgd_Ward_Code(String lgd_Ward_Code) {
		Lgd_Ward_Code = lgd_Ward_Code;
	}

	public String getLgd_LocalBody_Code() {
		return Lgd_LocalBody_Code;
	}

	public void setLgd_LocalBody_Code(String lgd_LocalBody_Code) {
		Lgd_LocalBody_Code = lgd_LocalBody_Code;
	}

	public String getRev_District_Code() {
		return Rev_District_Code;
	}

	public void setRev_District_Code(String rev_District_Code) {
		Rev_District_Code = rev_District_Code;
	}

	public String getRev_SubDistrict_Code() {
		return Rev_SubDistrict_Code;
	}

	public void setRev_SubDistrict_Code(String rev_SubDistrict_Code) {
		Rev_SubDistrict_Code = rev_SubDistrict_Code;
	}

	public String getRev_Block_Code() {
		return Rev_Block_Code;
	}

	public void setRev_Block_Code(String rev_Block_Code) {
		Rev_Block_Code = rev_Block_Code;
	}

	public String getRev_Village_Code() {
		return Rev_Village_Code;
	}

	public void setRev_Village_Code(String rev_Village_Code) {
		Rev_Village_Code = rev_Village_Code;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	@Override
	public String toString() {
		return "BasicSchoolProfileInfoBean [schoolId=" + schoolId + ", udiseSchoolCode=" + udiseSchoolCode
				+ ", stateId=" + stateId + ", districtId=" + districtId + ", blockId=" + blockId + ", schoolName="
				+ schoolName + ", schoolAddress=" + schoolAddress + ", pincode=" + pincode + ", blockResourcentreId="
				+ blockResourcentreId + ", clusterResourceCentreId=" + clusterResourceCentreId
				+ ", schoolCategoryCodeId=" + schoolCategoryCodeId + ", lowestClass=" + lowestClass + ", highestClass="
				+ highestClass + ", schoolTypeId=" + schoolTypeId + ", managementOfTheSchoolId="
				+ managementOfTheSchoolId + ", monthOfAcademicYearStart=" + monthOfAcademicYearStart
				+ ", isThisAResidentialSchool=" + isThisAResidentialSchool + ", typeOfResidentialSchoolId="
				+ typeOfResidentialSchoolId + ", isThisAMinorityManagedSchool=" + isThisAMinorityManagedSchool
				+ ", typeOfSchoolCommunityId=" + typeOfSchoolCommunityId + ", isThisASpecialSchoolForCWSN="
				+ isThisASpecialSchoolForCWSN + ", isThisAShiftschool=" + isThisAShiftschool + ", createBy=" + createBy
				+ ", updatedBy=" + updatedBy + ", createDateTime=" + createDateTime + ", updatedDateTime="
				+ updatedDateTime + ", SchoolCode=" + SchoolCode + ", SessionID=" + SessionID + ", ClusterID="
				+ ClusterID + ", ClusterCode=" + ClusterCode + ", UdiseClusterCode=" + UdiseClusterCode + ", BlockCode="
				+ BlockCode + ", UdiseBlockCode=" + UdiseBlockCode + ", DistrictCode=" + DistrictCode
				+ ", UdiseDistrictCode=" + UdiseDistrictCode + ", StateCode=" + StateCode + ", UdiseStateCode="
				+ UdiseStateCode + ", MergedSchoolID=" + MergedSchoolID + ", MergedSchoolCode=" + MergedSchoolCode
				+ ", MergedClosedYear=" + MergedClosedYear + ", MergedSessionID=" + MergedSessionID
				+ ", MergedSessionCode=" + MergedSessionCode + ", MergedRemarks=" + MergedRemarks
				+ ", Lgd_District_Code=" + Lgd_District_Code + ", Lgd_SubDistrict_Code=" + Lgd_SubDistrict_Code
				+ ", Lgd_Ward_Code=" + Lgd_Ward_Code + ", Lgd_LocalBody_Code=" + Lgd_LocalBody_Code
				+ ", Rev_District_Code=" + Rev_District_Code + ", Rev_SubDistrict_Code=" + Rev_SubDistrict_Code
				+ ", Rev_Block_Code=" + Rev_Block_Code + ", Rev_Village_Code=" + Rev_Village_Code + ", Status=" + Status
				+ "]";
	}

}
