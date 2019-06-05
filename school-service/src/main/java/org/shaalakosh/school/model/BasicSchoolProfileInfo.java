package org.shaalakosh.school.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author UTL0813 Dayal
 *
 */

// Table name "trn_school" or "trn_school_basic_info"
public class BasicSchoolProfileInfo {

	// Basic Information-I Sections Fields
	private int schoolId; // SchoolID
	private String udiseSchoolCode; // UdiseSchoolCode
	private int stateId; // StateID
	private int districtId; // DistrictID
	private int blockId; // BlockID
	private String schoolName; // SchoolName
	private String schoolAddress; // SchoolAddress
	private int pincode; // PinCode
	private int blockResourcentreId; // BlockResourceCentreID
	private int clusterResourceCentreId; // ClusterResourceCentreID

	// School Management & Category Information Sections Fields
	private int schoolCategoryCodeId; // SchoolCategoryID
	private int lowestClassId; // LowestClassID
	private int highestClassId; // HighestClassID
	private int schoolTypeId; // SchoolTypeID
	private int managementOfTheSchoolId; // SchoolManagementID
	private String monthOfAcademicYearStart; // Acad_Session_Start_Month

	// Is this a residential school? sections Fields
	private int isThisAResidentialSchool; // Is_Residential_School
	private int typeOfResidentialSchoolId; // ResidentialSchoolTypeDesc

	// Is this a Minority Managed School? Sections Fields
	private int isThisAMinorityManagedSchool; // Is_Minority_Managed
	private int typeOfSchoolCommunityId; // MinorityCommunityID
	private int isThisASpecialSchoolForCWSN; // Is_CWSN
	private int isThisAShiftschool; // Is_Shift_School

	// Extra Fields
	private int createBy; // CreatedByUserID
	private int updatedBy; // UpdatedByUserID
	private Date createDateTime; // CreatedDate
	private Date updatedDateTime; // UpdatedDate

	@JsonIgnore
	private String SchoolCode; // SchoolCode

	@JsonIgnore
	private int SessionID; // SessionID

	@JsonIgnore
	private int ClusterID; // ClusterID

	@JsonIgnore
	private String ClusterCode; // ClusterCode

	@JsonIgnore
	private String UdiseClusterCode; // UdiseClusterCode

	@JsonIgnore
	private String BlockCode; // BlockCode

	@JsonIgnore
	private String UdiseBlockCode; // UdiseBlockCode

	@JsonIgnore
	private String DistrictCode; // DistrictCode

	@JsonIgnore
	private String UdiseDistrictCode; // UdiseDistrictCode

	@JsonIgnore
	private String StateCode; // StateCode

	@JsonIgnore
	private String UdiseStateCode; // UdiseStateCode

	@JsonIgnore
	private int MergedSchoolID; // MergedSchoolID

	@JsonIgnore
	private String MergedSchoolCode; // MergedSchoolCode

	@JsonIgnore
	private int MergedClosedYear; // MergedClosedYear

	@JsonIgnore
	private int MergedSessionID; // MergedSessionID

	@JsonIgnore
	private String MergedSessionCode; // MergedSessionCode

	@JsonIgnore
	private String MergedRemarks; // MergedRemarks

	@JsonIgnore
	private int Lgd_District_Code; // Lgd_District_Code

	@JsonIgnore
	private int Lgd_SubDistrict_Code; // Lgd_SubDistrict_Code

	@JsonIgnore
	private int Lgd_Ward_Code; // Lgd_Ward_Code

	@JsonIgnore
	private int Lgd_LocalBody_Code; // Lgd_LocalBody_Code

	@JsonIgnore
	private int Rev_District_Code; // Rev_District_Code

	@JsonIgnore
	private int Rev_SubDistrict_Code; // Rev_SubDistrict_Code

	@JsonIgnore
	private int Rev_Block_Code; // Rev_Block_Code

	@JsonIgnore
	private int Rev_Village_Code; // Rev_Village_Code

	@JsonIgnore
	private String Status; // Status

	public int getSchoolId() {
		return schoolId;
	}

	public void setSchoolId(int schoolId) {
		this.schoolId = schoolId;
	}

	public String getUdiseSchoolCode() {
		return udiseSchoolCode;
	}

	public void setUdiseSchoolCode(String udiseSchoolCode) {
		this.udiseSchoolCode = udiseSchoolCode;
	}

	public int getStateId() {
		return stateId;
	}

	public void setStateId(int stateId) {
		this.stateId = stateId;
	}

	public int getDistrictId() {
		return districtId;
	}

	public void setDistrictId(int districtId) {
		this.districtId = districtId;
	}

	public int getBlockId() {
		return blockId;
	}

	public void setBlockId(int blockId) {
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

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public int getBlockResourcentreId() {
		return blockResourcentreId;
	}

	public void setBlockResourcentreId(int blockResourcentreId) {
		this.blockResourcentreId = blockResourcentreId;
	}

	public int getClusterResourceCentreId() {
		return clusterResourceCentreId;
	}

	public void setClusterResourceCentreId(int clusterResourceCentreId) {
		this.clusterResourceCentreId = clusterResourceCentreId;
	}

	public int getSchoolCategoryCodeId() {
		return schoolCategoryCodeId;
	}

	public void setSchoolCategoryCodeId(int schoolCategoryCodeId) {
		this.schoolCategoryCodeId = schoolCategoryCodeId;
	}

	public int getLowestClassId() {
		return lowestClassId;
	}

	public void setLowestClassId(int lowestClassId) {
		this.lowestClassId = lowestClassId;
	}

	public int getHighestClassId() {
		return highestClassId;
	}

	public void setHighestClassId(int highestClassId) {
		this.highestClassId = highestClassId;
	}

	public int getSchoolTypeId() {
		return schoolTypeId;
	}

	public void setSchoolTypeId(int schoolTypeId) {
		this.schoolTypeId = schoolTypeId;
	}

	public int getManagementOfTheSchoolId() {
		return managementOfTheSchoolId;
	}

	public void setManagementOfTheSchoolId(int managementOfTheSchoolId) {
		this.managementOfTheSchoolId = managementOfTheSchoolId;
	}

	public String getMonthOfAcademicYearStart() {
		return monthOfAcademicYearStart;
	}

	public void setMonthOfAcademicYearStart(String monthOfAcademicYearStart) {
		this.monthOfAcademicYearStart = monthOfAcademicYearStart;
	}

	public int getIsThisAResidentialSchool() {
		return isThisAResidentialSchool;
	}

	public void setIsThisAResidentialSchool(int isThisAResidentialSchool) {
		this.isThisAResidentialSchool = isThisAResidentialSchool;
	}

	public int getTypeOfResidentialSchoolId() {
		return typeOfResidentialSchoolId;
	}

	public void setTypeOfResidentialSchoolId(int typeOfResidentialSchoolId) {
		this.typeOfResidentialSchoolId = typeOfResidentialSchoolId;
	}

	public int getIsThisAMinorityManagedSchool() {
		return isThisAMinorityManagedSchool;
	}

	public void setIsThisAMinorityManagedSchool(int isThisAMinorityManagedSchool) {
		this.isThisAMinorityManagedSchool = isThisAMinorityManagedSchool;
	}

	public int getTypeOfSchoolCommunityId() {
		return typeOfSchoolCommunityId;
	}

	public void setTypeOfSchoolCommunityId(int typeOfSchoolCommunityId) {
		this.typeOfSchoolCommunityId = typeOfSchoolCommunityId;
	}

	public int getIsThisASpecialSchoolForCWSN() {
		return isThisASpecialSchoolForCWSN;
	}

	public void setIsThisASpecialSchoolForCWSN(int isThisASpecialSchoolForCWSN) {
		this.isThisASpecialSchoolForCWSN = isThisASpecialSchoolForCWSN;
	}

	public int getIsThisAShiftschool() {
		return isThisAShiftschool;
	}

	public void setIsThisAShiftschool(int isThisAShiftschool) {
		this.isThisAShiftschool = isThisAShiftschool;
	}

	public int getCreateBy() {
		return createBy;
	}

	public void setCreateBy(int createBy) {
		this.createBy = createBy;
	}

	public int getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(int updatedBy) {
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

	public int getSessionID() {
		return SessionID;
	}

	public void setSessionID(int sessionID) {
		SessionID = sessionID;
	}

	public int getClusterID() {
		return ClusterID;
	}

	public void setClusterID(int clusterID) {
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

	public int getMergedSchoolID() {
		return MergedSchoolID;
	}

	public void setMergedSchoolID(int mergedSchoolID) {
		MergedSchoolID = mergedSchoolID;
	}

	public String getMergedSchoolCode() {
		return MergedSchoolCode;
	}

	public void setMergedSchoolCode(String mergedSchoolCode) {
		MergedSchoolCode = mergedSchoolCode;
	}

	public int getMergedClosedYear() {
		return MergedClosedYear;
	}

	public void setMergedClosedYear(int mergedClosedYear) {
		MergedClosedYear = mergedClosedYear;
	}

	public int getMergedSessionID() {
		return MergedSessionID;
	}

	public void setMergedSessionID(int mergedSessionID) {
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

	public int getLgd_District_Code() {
		return Lgd_District_Code;
	}

	public void setLgd_District_Code(int lgd_District_Code) {
		Lgd_District_Code = lgd_District_Code;
	}

	public int getLgd_SubDistrict_Code() {
		return Lgd_SubDistrict_Code;
	}

	public void setLgd_SubDistrict_Code(int lgd_SubDistrict_Code) {
		Lgd_SubDistrict_Code = lgd_SubDistrict_Code;
	}

	public int getLgd_Ward_Code() {
		return Lgd_Ward_Code;
	}

	public void setLgd_Ward_Code(int lgd_Ward_Code) {
		Lgd_Ward_Code = lgd_Ward_Code;
	}

	public int getLgd_LocalBody_Code() {
		return Lgd_LocalBody_Code;
	}

	public void setLgd_LocalBody_Code(int lgd_LocalBody_Code) {
		Lgd_LocalBody_Code = lgd_LocalBody_Code;
	}

	public int getRev_District_Code() {
		return Rev_District_Code;
	}

	public void setRev_District_Code(int rev_District_Code) {
		Rev_District_Code = rev_District_Code;
	}

	public int getRev_SubDistrict_Code() {
		return Rev_SubDistrict_Code;
	}

	public void setRev_SubDistrict_Code(int rev_SubDistrict_Code) {
		Rev_SubDistrict_Code = rev_SubDistrict_Code;
	}

	public int getRev_Block_Code() {
		return Rev_Block_Code;
	}

	public void setRev_Block_Code(int rev_Block_Code) {
		Rev_Block_Code = rev_Block_Code;
	}

	public int getRev_Village_Code() {
		return Rev_Village_Code;
	}

	public void setRev_Village_Code(int rev_Village_Code) {
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
		return "BasicSchoolProfileInfo [schoolId=" + schoolId + ", udiseSchoolCode=" + udiseSchoolCode + ", stateId="
				+ stateId + ", districtId=" + districtId + ", blockId=" + blockId + ", schoolName=" + schoolName
				+ ", schoolAddress=" + schoolAddress + ", pincode=" + pincode + ", blockResourcentreId="
				+ blockResourcentreId + ", clusterResourceCentreId=" + clusterResourceCentreId
				+ ", schoolCategoryCodeId=" + schoolCategoryCodeId + ", lowestClassId=" + lowestClassId
				+ ", highestClassId=" + highestClassId + ", schoolTypeId=" + schoolTypeId + ", managementOfTheSchoolId="
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
