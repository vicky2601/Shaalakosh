package org.shaalakosh.school.bean;

//Table name "smdc_committee"
public class SMDCCommitteeInfoBean {

	// Primary Key column
	private String schoolId; // SchoolID (foreign key)

	// SMDC Committee Information
	private String sessionId; // SessionID

	// Profile of Schools with Secondary / Higher Secondary Section
	private String isSmcSmdcSame; // Is_Smc_Smdc_Same
	private String isSmdcConstitued; // is_Smdc_Constituted
	private String totalMemberMale; // Smdc_Tot_M
	private String totalMemberFemale; // Smdc_Tot_F
	private String parentMale; // Smdc_Parents_M
	private String parentFemale; // Smdc_Parents_F
	private String lgbMale; // Smdc_Lgb_M
	private String lgbFemale; // Smdc_Lgb_F
	private String ebmcMale; // Smdc_Ebmc_M
	private String ebmcFemale; // Smdc_Ebmc_F
	private String womenFemale; // Smdc_Women_F
	private String scstMale; // Smdc_Scst_M
	private String scstFemale; // Smdc_Scst_F
	private String deoMale; // Smdc_Deo_M
	private String deoFemale; // Smdc_Deo_F
	private String auditMale; // Smdc_Audit_M
	private String auditFemale; // Smdc_Audit_F
	private String rmsaMale; // Smdc_Rmsa_M
	private String rmsaFemale; // Smdc_Rmsa_F
	private String teacherMale; // Smdc_Tch_M
	private String teacherFemale; // Smdc_Tch_F
	private String vpMale; // Smdc_Vp_M
	private String vpFemale; // Smdc_Vp_F
	private String principalMale; // Smdc_P_M
	private String principaleFemale; // Smdc_P_F
	private String chairPersonMale; // Smdc_Cp_M
	private String chairPersonFemale; // Smdc_Cp_F
	private String noSmdcMeeting; // No_Smdc_Meeting
	private String isSchoolImprovePlanSmdc; // Is_Sch_Plan_Smdc
	private String isSmdcBankAccout; // Is_Smdc_Bank_Account
	private String smdcBankName; // Smdc_Bank_Name
	private String smdcBankBranch; // Smdc_Bank_Branch
	private String smdcBankAccountNo; // Smdc_Bank_Account
	private String smdcBankAccountName; // Smdc_Bank_Ac_Name
	private String smdcBankIFSCCode; // Smdc_Bank_Ifsc
	private String isSchoolBuildingCommittee; // IsSbc
	private String isSchoolAcademicCommittee; // IsAc
	private String isParentTeacherAssociation; // IsPta
	private String noOfPTAMeeting; // No_PtaMeeting

	// user details
	private String CreatedByUser;  
	

	
	public String getSchoolId() {
		return schoolId;
	}

	public void setSchoolId(String schoolId) {
		this.schoolId = schoolId;
	}

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public String getIsSmcSmdcSame() {
		return isSmcSmdcSame;
	}

	public void setIsSmcSmdcSame(String isSmcSmdcSame) {
		this.isSmcSmdcSame = isSmcSmdcSame;
	}

	public String getIsSmdcConstitued() {
		return isSmdcConstitued;
	}

	public void setIsSmdcConstitued(String isSmdcConstitued) {
		this.isSmdcConstitued = isSmdcConstitued;
	}

	public String getTotalMemberMale() {
		return totalMemberMale;
	}

	public void setTotalMemberMale(String totalMemberMale) {
		this.totalMemberMale = totalMemberMale;
	}

	public String getTotalMemberFemale() {
		return totalMemberFemale;
	}

	public void setTotalMemberFemale(String totalMemberFemale) {
		this.totalMemberFemale = totalMemberFemale;
	}

	public String getParentMale() {
		return parentMale;
	}

	public void setParentMale(String parentMale) {
		this.parentMale = parentMale;
	}

	public String getParentFemale() {
		return parentFemale;
	}

	public void setParentFemale(String parentFemale) {
		this.parentFemale = parentFemale;
	}

	public String getLgbMale() {
		return lgbMale;
	}

	public void setLgbMale(String lgbMale) {
		this.lgbMale = lgbMale;
	}

	public String getLgbFemale() {
		return lgbFemale;
	}

	public void setLgbFemale(String lgbFemale) {
		this.lgbFemale = lgbFemale;
	}

	public String getEbmcMale() {
		return ebmcMale;
	}

	public void setEbmcMale(String ebmcMale) {
		this.ebmcMale = ebmcMale;
	}

	public String getEbmcFemale() {
		return ebmcFemale;
	}

	public void setEbmcFemale(String ebmcFemale) {
		this.ebmcFemale = ebmcFemale;
	}

	public String getWomenFemale() {
		return womenFemale;
	}

	public void setWomenFemale(String womenFemale) {
		this.womenFemale = womenFemale;
	}

	public String getScstMale() {
		return scstMale;
	}

	public void setScstMale(String scstMale) {
		this.scstMale = scstMale;
	}

	public String getScstFemale() {
		return scstFemale;
	}

	public void setScstFemale(String scstFemale) {
		this.scstFemale = scstFemale;
	}

	public String getDeoMale() {
		return deoMale;
	}

	public void setDeoMale(String deoMale) {
		this.deoMale = deoMale;
	}

	public String getDeoFemale() {
		return deoFemale;
	}

	public void setDeoFemale(String deoFemale) {
		this.deoFemale = deoFemale;
	}

	public String getAuditMale() {
		return auditMale;
	}

	public void setAuditMale(String auditMale) {
		this.auditMale = auditMale;
	}

	public String getAuditFemale() {
		return auditFemale;
	}

	public void setAuditFemale(String auditFemale) {
		this.auditFemale = auditFemale;
	}

	public String getRmsaMale() {
		return rmsaMale;
	}

	public void setRmsaMale(String rmsaMale) {
		this.rmsaMale = rmsaMale;
	}

	public String getRmsaFemale() {
		return rmsaFemale;
	}

	public void setRmsaFemale(String rmsaFemale) {
		this.rmsaFemale = rmsaFemale;
	}

	public String getTeacherMale() {
		return teacherMale;
	}

	public void setTeacherMale(String teacherMale) {
		this.teacherMale = teacherMale;
	}

	public String getTeacherFemale() {
		return teacherFemale;
	}

	public void setTeacherFemale(String teacherFemale) {
		this.teacherFemale = teacherFemale;
	}

	public String getVpMale() {
		return vpMale;
	}

	public void setVpMale(String vpMale) {
		this.vpMale = vpMale;
	}

	public String getVpFemale() {
		return vpFemale;
	}

	public void setVpFemale(String vpFemale) {
		this.vpFemale = vpFemale;
	}

	public String getPrincipalMale() {
		return principalMale;
	}

	public void setPrincipalMale(String principalMale) {
		this.principalMale = principalMale;
	}

	public String getPrincipaleFemale() {
		return principaleFemale;
	}

	public void setPrincipaleFemale(String principaleFemale) {
		this.principaleFemale = principaleFemale;
	}

	public String getChairPersonMale() {
		return chairPersonMale;
	}

	public void setChairPersonMale(String chairPersonMale) {
		this.chairPersonMale = chairPersonMale;
	}

	public String getChairPersonFemale() {
		return chairPersonFemale;
	}

	public void setChairPersonFemale(String chairPersonFemale) {
		this.chairPersonFemale = chairPersonFemale;
	}

	public String getNoSmdcMeeting() {
		return noSmdcMeeting;
	}

	public void setNoSmdcMeeting(String noSmdcMeeting) {
		this.noSmdcMeeting = noSmdcMeeting;
	}

	public String getIsSchoolImprovePlanSmdc() {
		return isSchoolImprovePlanSmdc;
	}

	public void setIsSchoolImprovePlanSmdc(String isSchoolImprovePlanSmdc) {
		this.isSchoolImprovePlanSmdc = isSchoolImprovePlanSmdc;
	}

	public String getIsSmdcBankAccout() {
		return isSmdcBankAccout;
	}

	public void setIsSmdcBankAccout(String isSmdcBankAccout) {
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

	public String getSmdcBankAccountNo() {
		return smdcBankAccountNo;
	}

	public void setSmdcBankAccountNo(String smdcBankAccountNo) {
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

	public String getIsSchoolBuildingCommittee() {
		return isSchoolBuildingCommittee;
	}

	public void setIsSchoolBuildingCommittee(String isSchoolBuildingCommittee) {
		this.isSchoolBuildingCommittee = isSchoolBuildingCommittee;
	}

	public String getIsSchoolAcademicCommittee() {
		return isSchoolAcademicCommittee;
	}

	public void setIsSchoolAcademicCommittee(String isSchoolAcademicCommittee) {
		this.isSchoolAcademicCommittee = isSchoolAcademicCommittee;
	}

	public String getIsParentTeacherAssociation() {
		return isParentTeacherAssociation;
	}

	public void setIsParentTeacherAssociation(String isParentTeacherAssociation) {
		this.isParentTeacherAssociation = isParentTeacherAssociation;
	}

	public String getNoOfPTAMeeting() {
		return noOfPTAMeeting;
	}

	public void setNoOfPTAMeeting(String noOfPTAMeeting) {
		this.noOfPTAMeeting = noOfPTAMeeting;
	}

	public String getCreatedByUser() {
		return CreatedByUser;
	}

	public void setCreatedByUser(String createdByUser) {
		CreatedByUser = createdByUser;
	}	
}
