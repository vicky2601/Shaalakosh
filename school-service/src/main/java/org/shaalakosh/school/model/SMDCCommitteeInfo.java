package org.shaalakosh.school.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

//Table name "smdc_committee"
public class SMDCCommitteeInfo {

	// Primary Key column
	private int schoolId; 	 // SchoolID 
	

	// SMDC Committee Information
	private int sessionId; // SessionID
	
	// Profile of Schools with Secondary / Higher Secondary Section
	private int isSmcSmdcSame; // Is_Smc_Smdc_Same
	private int isSmdcConstitued; // is_Smdc_Constituted
	private int totalMemberMale; // Smdc_Tot_M
	private int totalMemberFemale; // Smdc_Tot_F
	private int parentMale; // Smdc_Parents_M
	private int parentFemale; // Smdc_Parents_F
	private int lgbMale; // Smdc_Lgb_M
	private int lgbFemale; // Smdc_Lgb_F
	private int ebmcMale; // Smdc_Ebmc_M
	private int ebmcFemale; // Smdc_Ebmc_F
	private int womenFemale; // Smdc_Women_F
	private int scstMale; // Smdc_Scst_M
	private int scstFemale; // Smdc_Scst_F
	private int deoMale; // Smdc_Deo_M
	private int deoFemale; // Smdc_Deo_F
	private int auditMale; // Smdc_Audit_M
	private int auditFemale; // Smdc_Audit_F
	private int rmsaMale; // Smdc_Rmsa_M
	private int rmsaFemale; // Smdc_Rmsa_F
	private int teacherMale; // Smdc_Tch_M
	private int teacherFemale; // Smdc_Tch_F
	private int vpMale; // Smdc_Vp_M
	private int vpFemale; // Smdc_Vp_F
	private int principalMale; // Smdc_P_M
	private int principaleFemale; // Smdc_P_F
	private int chairPersonMale; // Smdc_Cp_M
	private int chairPersonFemale; // Smdc_Cp_F
	private int noSmdcMeeting; // No_Smdc_Meeting
	private int isSchoolImprovePlanSmdc; // Is_Sch_Plan_Smdc
	private int isSmdcBankAccout; // Is_Smdc_Bank_Account
	private String smdcBankName; // Smdc_Bank_Name
	private String smdcBankBranch; // Smdc_Bank_Branch
	private int smdcBankAccountNo; // Smdc_Bank_Account
	private String smdcBankAccountName; // Smdc_Bank_Ac_Name
	private String smdcBankIFSCCode; // Smdc_Bank_Ifsc
	private int isSchoolBuildingCommittee; // IsSbc
	private int isSchoolAcademicCommittee; // IsAc
	private int isParentTeacherAssociation; // IsPta
	private int noOfPTAMeeting; // No_PtaMeeting

	@JsonIgnore
	private int CreatedByUserID; // CreatedByUserID
	@JsonIgnore
	private String CreatedDate; // CreatedDate
	@JsonIgnore
	private int UpdatedByUserID; // UpdatedByUserID
	@JsonIgnore
	private String UpdatedDate; // UpdatedDate
	
	private String userName;
	

	public int getSchoolId() {
		return schoolId;
	}

	public void setSchoolId(int schoolId) {
		this.schoolId = schoolId;
	}

	public int getSessionId() {
		return sessionId;
	}

	public void setSessionId(int sessionId) {
		this.sessionId = sessionId;
	}

	public int getIsSmcSmdcSame() {
		return isSmcSmdcSame;
	}

	public void setIsSmcSmdcSame(int isSmcSmdcSame) {
		this.isSmcSmdcSame = isSmcSmdcSame;
	}
	
	public int getIsSmdcConstitued() {
		return isSmdcConstitued;
	}

	public void setIsSmdcConstitued(int isSmdcConstitued) {
		this.isSmdcConstitued = isSmdcConstitued;
	}

	public int getTotalMemberMale() {
		return totalMemberMale;
	}

	public void setTotalMemberMale(int totalMemberMale) {
		this.totalMemberMale = totalMemberMale;
	}

	public int getTotalMemberFemale() {
		return totalMemberFemale;
	}

	public void setTotalMemberFemale(int totalMemberFemale) {
		this.totalMemberFemale = totalMemberFemale;
	}

	public int getParentMale() {
		return parentMale;
	}

	public void setParentMale(int parentMale) {
		this.parentMale = parentMale;
	}

	public int getParentFemale() {
		return parentFemale;
	}

	public void setParentFemale(int parentFemale) {
		this.parentFemale = parentFemale;
	}

	public int getLgbMale() {
		return lgbMale;
	}

	public void setLgbMale(int lgbMale) {
		this.lgbMale = lgbMale;
	}

	public int getLgbFemale() {
		return lgbFemale;
	}

	public void setLgbFemale(int lgbFemale) {
		this.lgbFemale = lgbFemale;
	}

	public int getEbmcMale() {
		return ebmcMale;
	}

	public void setEbmcMale(int ebmcMale) {
		this.ebmcMale = ebmcMale;
	}

	public int getEbmcFemale() {
		return ebmcFemale;
	}

	public void setEbmcFemale(int ebmcFemale) {
		this.ebmcFemale = ebmcFemale;
	}

	public int getWomenFemale() {
		return womenFemale;
	}

	public void setWomenFemale(int womenFemale) {
		this.womenFemale = womenFemale;
	}

	public int getScstMale() {
		return scstMale;
	}

	public void setScstMale(int scstMale) {
		this.scstMale = scstMale;
	}

	public int getScstFemale() {
		return scstFemale;
	}

	public void setScstFemale(int scstFemale) {
		this.scstFemale = scstFemale;
	}

	public int getDeoMale() {
		return deoMale;
	}

	public void setDeoMale(int deoMale) {
		this.deoMale = deoMale;
	}

	public int getDeoFemale() {
		return deoFemale;
	}

	public void setDeoFemale(int deoFemale) {
		this.deoFemale = deoFemale;
	}

	public int getAuditMale() {
		return auditMale;
	}

	public void setAuditMale(int auditMale) {
		this.auditMale = auditMale;
	}

	public int getAuditFemale() {
		return auditFemale;
	}

	public void setAuditFemale(int auditFemale) {
		this.auditFemale = auditFemale;
	}

	public int getRmsaMale() {
		return rmsaMale;
	}

	public void setRmsaMale(int rmsaMale) {
		this.rmsaMale = rmsaMale;
	}

	public int getRmsaFemale() {
		return rmsaFemale;
	}

	public void setRmsaFemale(int rmsaFemale) {
		this.rmsaFemale = rmsaFemale;
	}

	public int getTeacherMale() {
		return teacherMale;
	}

	public void setTeacherMale(int teacherMale) {
		this.teacherMale = teacherMale;
	}

	public int getTeacherFemale() {
		return teacherFemale;
	}

	public void setTeacherFemale(int teacherFemale) {
		this.teacherFemale = teacherFemale;
	}

	public int getVpMale() {
		return vpMale;
	}

	public void setVpMale(int vpMale) {
		this.vpMale = vpMale;
	}

	public int getVpFemale() {
		return vpFemale;
	}

	public void setVpFemale(int vpFemale) {
		this.vpFemale = vpFemale;
	}

	public int getPrincipalMale() {
		return principalMale;
	}

	public void setPrincipalMale(int principalMale) {
		this.principalMale = principalMale;
	}

	public int getPrincipaleFemale() {
		return principaleFemale;
	}

	public void setPrincipaleFemale(int principaleFemale) {
		this.principaleFemale = principaleFemale;
	}

	public int getChairPersonMale() {
		return chairPersonMale;
	}

	public void setChairPersonMale(int chairPersonMale) {
		this.chairPersonMale = chairPersonMale;
	}	

	public int getChairPersonFemale() {
		return chairPersonFemale;
	}

	public void setChairPersonFemale(int chairPersonFemale) {
		this.chairPersonFemale = chairPersonFemale;
	}

	public int getNoSmdcMeeting() {
		return noSmdcMeeting;
	}

	public void setNoSmdcMeeting(int noSmdcMeeting) {
		this.noSmdcMeeting = noSmdcMeeting;
	}

	public int getIsSchoolImprovePlanSmdc() {
		return isSchoolImprovePlanSmdc;
	}

	public void setIsSchoolImprovePlanSmdc(int isSchoolImprovePlanSmdc) {
		this.isSchoolImprovePlanSmdc = isSchoolImprovePlanSmdc;
	}

	public int getIsSmdcBankAccout() {
		return isSmdcBankAccout;
	}

	public void setIsSmdcBankAccout(int isSmdcBankAccout) {
		this.isSmdcBankAccout = isSmdcBankAccout;
	}

	public String getSmdcBankName() {
		return smdcBankName;
	}

	public void setSmdcBankName(String smdcBankName) {
		this.smdcBankName = smdcBankName;
	}

	public String getSmdcBankBranch() {
		return smdcBankBranch;
	}

	public void setSmdcBankBranch(String smdcBankBranch) {
		this.smdcBankBranch = smdcBankBranch;
	}

	public int getSmdcBankAccountNo() {
		return smdcBankAccountNo;
	}

	public void setSmdcBankAccountNo(int smdcBankAccountNo) {
		this.smdcBankAccountNo = smdcBankAccountNo;
	}

	public String getSmdcBankAccountName() {
		return smdcBankAccountName;
	}

	public void setSmdcBankAccountName(String smdcBankAccountName) {
		this.smdcBankAccountName = smdcBankAccountName;
	}

	public String getSmdcBankIFSCCode() {
		return smdcBankIFSCCode;
	}

	public void setSmdcBankIFSCCode(String smdcBankIFSCCode) {
		this.smdcBankIFSCCode = smdcBankIFSCCode;
	}

	public int getIsSchoolBuildingCommittee() {
		return isSchoolBuildingCommittee;
	}

	public void setIsSchoolBuildingCommittee(int isSchoolBuildingCommittee) {
		this.isSchoolBuildingCommittee = isSchoolBuildingCommittee;
	}

	public int getIsSchoolAcademicCommittee() {
		return isSchoolAcademicCommittee;
	}

	public void setIsSchoolAcademicCommittee(int isSchoolAcademicCommittee) {
		this.isSchoolAcademicCommittee = isSchoolAcademicCommittee;
	}

	public int getIsParentTeacherAssociation() {
		return isParentTeacherAssociation;
	}

	public void setIsParentTeacherAssociation(int isParentTeacherAssociation) {
		this.isParentTeacherAssociation = isParentTeacherAssociation;
	}

	public int getNoOfPTAMeeting() {
		return noOfPTAMeeting;
	}

	public void setNoOfPTAMeeting(int noOfPTAMeeting) {
		this.noOfPTAMeeting = noOfPTAMeeting;
	}

	public int getCreatedByUserID() {
		return CreatedByUserID;
	}

	public void setCreatedByUserID(int createdByUserID) {
		CreatedByUserID = createdByUserID;
	}

	public String getCreatedDate() {
		return CreatedDate;
	}

	public void setCreatedDate(String createdDate) {
		CreatedDate = createdDate;
	}

	public int getUpdatedByUserID() {
		return UpdatedByUserID;
	}

	public void setUpdatedByUserID(int updatedByUserID) {
		UpdatedByUserID = updatedByUserID;
	}

	public String getUpdatedDate() {
		return UpdatedDate;
	}

	public void setUpdatedDate(String updatedDate) {
		UpdatedDate = updatedDate;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
}
