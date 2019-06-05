package org.shaalakosh.school.bean;

//Table name "trn_school_spl_smc_info"
public class SchoolSplSmcInfoBean {

	// Primary Key Column
	private String schoolId;// SchoolID

	private String sessionId; // SessionID

	// SMC information
	private String smcConstituency;// Is_Smc
	private String smcTotalMale;// Smc_Tot_M
	private String smcTotalFemale;// Smc_Tot_F
	private String smcParentsMale;// Smc_Parents_M
	private String smcParentsFemale;// Smc_Parents_F
	private String localGovtBodyMale;// Smc_Lgb_M
	private String localGovtBodyFemale;// Smc_Lgb_F
	private String smcMeetingPreviousYr;// Smc_Meetings_Previous_Yr
	private String smcSchoolDevelopmentPlan;// Is_Smc_Sdp_Prepared
	private String isSmcBankAccount;// Is_Smc_Bank_Account
	private String smcBankName;// Smc_Bank_Name
	private String smcBranch;// Smc_Bank_Branch
	private String smcBankAccount;// Smc_Bank_Account
	private String smcBankAccountName;// Smc_Bank_Ac_Name
	private String smcBankIfsc;// Smc_Bank_Ifsc
	// special Training Information
	private String attendingSpecialTraining;// Is_Spl_Trng_Any
	private String specialTrainingCurrentYrBoys;// Spl_Trg_Cy_Enrolled_B
	private String specialTrainingCurrentYrGirls;// Spl_Trg_Cy_Enrolled_G
	private String specialTrainingPreviousYrBoys;// Spl_Trg_Py_Enrolled_B
	private String specialTrainingPreviousYrGirls;// Spl_Trg_Py_Enrolled_G
	private String completeSplTrngPreviousYrBoys;// Spl_Trg_Py_Completed_B
	private String completeSplTrngPreviousYrGirls;// Spl_Trg_Py_Completed_G
	private String splTrainingConductedBy;// Spl_Trg_Conducted_By
	private String splTrainingConductedIn;// Spl_Trg_Place
	private String typeOfTrainingConducted;// Spl_Trg_Type
	private String fullTextbookSetRecieved;// Is_Txt_Bk_Recd
	private String textbookRecieveMonth;// Txt_Bk_Receive_Month
	private String textbookRecieveYear;// Txt_Bk_Receive_Yr

	// Availability of Free Textbooks, Teaching Learning Equipment (TLE) and Play
	// Material Information
	private String freeBooksAvaialbleToPrimary;// Is_Free_Textbook_Av_Pri
	private String freeBooksAvailableToUprimary;// Is_Free_Textbook_Av_Ups
	private String tleAvailabilityPrimary;// Is_Tle_Rec_Pri
	private String tleAvailabilityUrimary;// Is_Tle_Rec_Ups
	private String playmtrlEqpmtAvailabilityPrinary;// Is_Play_Mat_Av_Pri
	private String playmtrlEqpmtAvailabilityUprimary;// Is_Play_Mat_Av_Ups
	private String playmtrlEqpmtAvailabilitySecondary;// Is_Play_Mat_Av_Sec
	private String playmtrlEqpmtAvailabilityHsecondary;// Is_Play_Mat_Av_Hsec

	// user details
	private String createdByUserId;// CreatedByUserID
	private String createdDate;// CreatedDate
	private String updatedByUserID;// UpdatedByUserID
	private String updatedDate;// UpdatedDate

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

	public String getSmcConstituency() {
		return smcConstituency;
	}

	public void setSmcConstituency(String smcConstituency) {
		this.smcConstituency = smcConstituency;
	}

	public String getSmcTotalMale() {
		return smcTotalMale;
	}

	public void setSmcTotalMale(String smcTotalMale) {
		this.smcTotalMale = smcTotalMale;
	}

	public String getSmcTotalFemale() {
		return smcTotalFemale;
	}

	public void setSmcTotalFemale(String smcTotalFemale) {
		this.smcTotalFemale = smcTotalFemale;
	}

	public String getSmcParentsMale() {
		return smcParentsMale;
	}

	public void setSmcParentsMale(String smcParentsMale) {
		this.smcParentsMale = smcParentsMale;
	}

	public String getSmcParentsFemale() {
		return smcParentsFemale;
	}

	public void setSmcParentsFemale(String smcParentsFemale) {
		this.smcParentsFemale = smcParentsFemale;
	}

	public String getLocalGovtBodyMale() {
		return localGovtBodyMale;
	}

	public void setLocalGovtBodyMale(String localGovtBodyMale) {
		this.localGovtBodyMale = localGovtBodyMale;
	}

	public String getLocalGovtBodyFemale() {
		return localGovtBodyFemale;
	}

	public void setLocalGovtBodyFemale(String localGovtBodyFemale) {
		this.localGovtBodyFemale = localGovtBodyFemale;
	}

	public String getSmcMeetingPreviousYr() {
		return smcMeetingPreviousYr;
	}

	public void setSmcMeetingPreviousYr(String smcMeetingPreviousYr) {
		this.smcMeetingPreviousYr = smcMeetingPreviousYr;
	}

	public String getSmcSchoolDevelopmentPlan() {
		return smcSchoolDevelopmentPlan;
	}

	public void setSmcSchoolDevelopmentPlan(String smcSchoolDevelopmentPlan) {
		this.smcSchoolDevelopmentPlan = smcSchoolDevelopmentPlan;
	}

	public String getIsSmcBankAccount() {
		return isSmcBankAccount;
	}

	public void setIsSmcBankAccount(String isSmcBankAccount) {
		this.isSmcBankAccount = isSmcBankAccount;
	}

	public String getSmcBankName() {
		return smcBankName;
	}

	public void setSmcBankName(String smcBankName) {
		this.smcBankName = smcBankName;
	}

	public String getSmcBranch() {
		return smcBranch;
	}

	public void setSmcBranch(String smcBranch) {
		this.smcBranch = smcBranch;
	}

	public String getSmcBankAccount() {
		return smcBankAccount;
	}

	public void setSmcBankAccount(String smcBankAccount) {
		this.smcBankAccount = smcBankAccount;
	}

	public String getSmcBankAccountName() {
		return smcBankAccountName;
	}

	public void setSmcBankAccountName(String smcBankAccountName) {
		this.smcBankAccountName = smcBankAccountName;
	}

	public String getSmcBankIfsc() {
		return smcBankIfsc;
	}

	public void setSmcBankIfsc(String smcBankIfsc) {
		this.smcBankIfsc = smcBankIfsc;
	}

	public String getAttendingSpecialTraining() {
		return attendingSpecialTraining;
	}

	public void setAttendingSpecialTraining(String attendingSpecialTraining) {
		this.attendingSpecialTraining = attendingSpecialTraining;
	}

	public String getSpecialTrainingCurrentYrBoys() {
		return specialTrainingCurrentYrBoys;
	}

	public void setSpecialTrainingCurrentYrBoys(String specialTrainingCurrentYrBoys) {
		this.specialTrainingCurrentYrBoys = specialTrainingCurrentYrBoys;
	}

	public String getSpecialTrainingCurrentYrGirls() {
		return specialTrainingCurrentYrGirls;
	}

	public void setSpecialTrainingCurrentYrGirls(String specialTrainingCurrentYrGirls) {
		this.specialTrainingCurrentYrGirls = specialTrainingCurrentYrGirls;
	}

	public String getSpecialTrainingPreviousYrBoys() {
		return specialTrainingPreviousYrBoys;
	}

	public void setSpecialTrainingPreviousYrBoys(String specialTrainingPreviousYrBoys) {
		this.specialTrainingPreviousYrBoys = specialTrainingPreviousYrBoys;
	}

	public String getSpecialTrainingPreviousYrGirls() {
		return specialTrainingPreviousYrGirls;
	}

	public void setSpecialTrainingPreviousYrGirls(String specialTrainingPreviousYrGirls) {
		this.specialTrainingPreviousYrGirls = specialTrainingPreviousYrGirls;
	}

	public String getCompleteSplTrngPreviousYrBoys() {
		return completeSplTrngPreviousYrBoys;
	}

	public void setCompleteSplTrngPreviousYrBoys(String completeSplTrngPreviousYrBoys) {
		this.completeSplTrngPreviousYrBoys = completeSplTrngPreviousYrBoys;
	}

	public String getCompleteSplTrngPreviousYrGirls() {
		return completeSplTrngPreviousYrGirls;
	}

	public void setCompleteSplTrngPreviousYrGirls(String completeSplTrngPreviousYrGirls) {
		this.completeSplTrngPreviousYrGirls = completeSplTrngPreviousYrGirls;
	}

	public String getSplTrainingConductedBy() {
		return splTrainingConductedBy;
	}

	public void setSplTrainingConductedBy(String splTrainingConductedBy) {
		this.splTrainingConductedBy = splTrainingConductedBy;
	}

	public String getSplTrainingConductedIn() {
		return splTrainingConductedIn;
	}

	public void setSplTrainingConductedIn(String splTrainingConductedIn) {
		this.splTrainingConductedIn = splTrainingConductedIn;
	}

	public String getTypeOfTrainingConducted() {
		return typeOfTrainingConducted;
	}

	public void setTypeOfTrainingConducted(String typeOfTrainingConducted) {
		this.typeOfTrainingConducted = typeOfTrainingConducted;
	}

	public String getFullTextbookSetRecieved() {
		return fullTextbookSetRecieved;
	}

	public void setFullTextbookSetRecieved(String fullTextbookSetRecieved) {
		this.fullTextbookSetRecieved = fullTextbookSetRecieved;
	}

	public String getTextbookRecieveMonth() {
		return textbookRecieveMonth;
	}

	public void setTextbookRecieveMonth(String textbookRecieveMonth) {
		this.textbookRecieveMonth = textbookRecieveMonth;
	}

	public String getTextbookRecieveYear() {
		return textbookRecieveYear;
	}

	public void setTextbookRecieveYear(String textbookRecieveYear) {
		this.textbookRecieveYear = textbookRecieveYear;
	}

	public String getFreeBooksAvaialbleToPrimary() {
		return freeBooksAvaialbleToPrimary;
	}

	public void setFreeBooksAvaialbleToPrimary(String freeBooksAvaialbleToPrimary) {
		this.freeBooksAvaialbleToPrimary = freeBooksAvaialbleToPrimary;
	}

	public String getFreeBooksAvailableToUprimary() {
		return freeBooksAvailableToUprimary;
	}

	public void setFreeBooksAvailableToUprimary(String freeBooksAvailableToUprimary) {
		this.freeBooksAvailableToUprimary = freeBooksAvailableToUprimary;
	}

	public String getTleAvailabilityPrimary() {
		return tleAvailabilityPrimary;
	}

	public void setTleAvailabilityPrimary(String tleAvailabilityPrimary) {
		this.tleAvailabilityPrimary = tleAvailabilityPrimary;
	}

	public String getTleAvailabilityUrimary() {
		return tleAvailabilityUrimary;
	}

	public void setTleAvailabilityUrimary(String tleAvailabilityUrimary) {
		this.tleAvailabilityUrimary = tleAvailabilityUrimary;
	}

	public String getPlaymtrlEqpmtAvailabilityPrinary() {
		return playmtrlEqpmtAvailabilityPrinary;
	}

	public void setPlaymtrlEqpmtAvailabilityPrinary(String playmtrlEqpmtAvailabilityPrinary) {
		this.playmtrlEqpmtAvailabilityPrinary = playmtrlEqpmtAvailabilityPrinary;
	}

	public String getPlaymtrlEqpmtAvailabilityUprimary() {
		return playmtrlEqpmtAvailabilityUprimary;
	}

	public void setPlaymtrlEqpmtAvailabilityUprimary(String playmtrlEqpmtAvailabilityUprimary) {
		this.playmtrlEqpmtAvailabilityUprimary = playmtrlEqpmtAvailabilityUprimary;
	}

	public String getPlaymtrlEqpmtAvailabilitySecondary() {
		return playmtrlEqpmtAvailabilitySecondary;
	}

	public void setPlaymtrlEqpmtAvailabilitySecondary(String playmtrlEqpmtAvailabilitySecondary) {
		this.playmtrlEqpmtAvailabilitySecondary = playmtrlEqpmtAvailabilitySecondary;
	}

	public String getPlaymtrlEqpmtAvailabilityHsecondary() {
		return playmtrlEqpmtAvailabilityHsecondary;
	}

	public void setPlaymtrlEqpmtAvailabilityHsecondary(String playmtrlEqpmtAvailabilityHsecondary) {
		this.playmtrlEqpmtAvailabilityHsecondary = playmtrlEqpmtAvailabilityHsecondary;
	}

	public String getCreatedByUserId() {
		return createdByUserId;
	}

	public void setCreatedByUserId(String createdByUserId) {
		this.createdByUserId = createdByUserId;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	public String getUpdatedByUserID() {
		return updatedByUserID;
	}

	public void setUpdatedByUserID(String updatedByUserID) {
		this.updatedByUserID = updatedByUserID;
	}

	public String getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(String updatedDate) {
		this.updatedDate = updatedDate;
	}

}