package org.shaalakosh.school.model;
//Table name "trn_school_spl_smc_info"
public class SchoolSplSmcInfo {

	
	//Primary Key Column
	private int schoolId;//SchoolID
	
	private int sessionId; // SessionID
	
	//SMC information
		private int smcConstituency;//Is_Smc
		private int smcTotalMale;//Smc_Tot_M
		private int smcTotalFemale;//Smc_Tot_F
		private int smcParentsMale;//Smc_Parents_M
		private int smcParentsFemale;//Smc_Parents_F
		private int localGovtBodyMale;//Smc_Lgb_M
		private int localGovtBodyFemale;//Smc_Lgb_F
		private int smcMeetingPreviousYr;//Smc_Meetings_Previous_Yr
		private int smcSchoolDevelopmentPlan;//Is_Smc_Sdp_Prepared
		private int isSmcBankAccount;//Is_Smc_Bank_Account
		private String smcBankName;//Smc_Bank_Name
		private String smcBranch;//Smc_Bank_Branch
		private String smcBankAccount;//Smc_Bank_Account
		private String smcBankAccountName;//Smc_Bank_Ac_Name
		private String smcBankIfsc;//Smc_Bank_Ifsc
	//special Training Information
		private int attendingSpecialTraining;//Is_Spl_Trng_Any
		private int specialTrainingCurrentYrBoys;//Spl_Trg_Cy_Enrolled_B
		private int specialTrainingCurrentYrGirls;//Spl_Trg_Cy_Enrolled_G
		private int specialTrainingPreviousYrBoys;//Spl_Trg_Py_Enrolled_B
		private int specialTrainingPreviousYrGirls;//Spl_Trg_Py_Enrolled_G
		private int completeSplTrngPreviousYrBoys;//Spl_Trg_Py_Completed_B
		private int completeSplTrngPreviousYrGirls;//Spl_Trg_Py_Completed_G
		private int splTrainingConductedBy;//Spl_Trg_Conducted_By
		private int splTrainingConductedIn;//Spl_Trg_Place
		private int typeOfTrainingConducted;//Spl_Trg_Type
		private int fullTextbookSetRecieved;//Is_Txt_Bk_Recd
		private int textbookRecieveMonth;//Txt_Bk_Receive_Month
		private int textbookRecieveYear;//Txt_Bk_Receive_Yr
		
	//Availability of Free Textbooks, Teaching Learning Equipment (TLE) and Play Material Information
		private int freeBooksAvaialbleToPrimary;//Is_Free_Textbook_Av_Pri
		private int freeBooksAvailableToUprimary;//Is_Free_Textbook_Av_Ups
		private int tleAvailabilityPrimary;//Is_Tle_Rec_Pri
		private int tleAvailabilityUrimary;//Is_Tle_Rec_Ups
		private int playmtrlEqpmtAvailabilityPrinary;//Is_Play_Mat_Av_Pri
		private int playmtrlEqpmtAvailabilityUprimary;//Is_Play_Mat_Av_Ups
		private int playmtrlEqpmtAvailabilitySecondary;//Is_Play_Mat_Av_Sec
		private int playmtrlEqpmtAvailabilityHsecondary;//Is_Play_Mat_Av_Hsec
		
	//user details
		private int createdByUserId;//CreatedByUserID
		private String createdDate;//CreatedDate
		private int updatedByUserID;//UpdatedByUserID
		private String updatedDate;//UpdatedDate
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
		public int getSmcConstituency() {
			return smcConstituency;
		}
		public void setSmcConstituency(int smcConstituency) {
			this.smcConstituency = smcConstituency;
		}
		public int getSmcTotalMale() {
			return smcTotalMale;
		}
		public void setSmcTotalMale(int smcTotalMale) {
			this.smcTotalMale = smcTotalMale;
		}
		public int getSmcTotalFemale() {
			return smcTotalFemale;
		}
		public void setSmcTotalFemale(int smcTotalFemale) {
			this.smcTotalFemale = smcTotalFemale;
		}
		public int getSmcParentsMale() {
			return smcParentsMale;
		}
		public void setSmcParentsMale(int smcParentsMale) {
			this.smcParentsMale = smcParentsMale;
		}
		public int getSmcParentsFemale() {
			return smcParentsFemale;
		}
		public void setSmcParentsFemale(int smcParentsFemale) {
			this.smcParentsFemale = smcParentsFemale;
		}
		public int getLocalGovtBodyMale() {
			return localGovtBodyMale;
		}
		public void setLocalGovtBodyMale(int localGovtBodyMale) {
			this.localGovtBodyMale = localGovtBodyMale;
		}
		public int getLocalGovtBodyFemale() {
			return localGovtBodyFemale;
		}
		public void setLocalGovtBodyFemale(int localGovtBodyFemale) {
			this.localGovtBodyFemale = localGovtBodyFemale;
		}
		public int getSmcMeetingPreviousYr() {
			return smcMeetingPreviousYr;
		}
		public void setSmcMeetingPreviousYr(int smcMeetingPreviousYr) {
			this.smcMeetingPreviousYr = smcMeetingPreviousYr;
		}
		public int getSmcSchoolDevelopmentPlan() {
			return smcSchoolDevelopmentPlan;
		}
		public void setSmcSchoolDevelopmentPlan(int smcSchoolDevelopmentPlan) {
			this.smcSchoolDevelopmentPlan = smcSchoolDevelopmentPlan;
		}
		public int getIsSmcBankAccount() {
			return isSmcBankAccount;
		}
		public void setIsSmcBankAccount(int isSmcBankAccount) {
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
		public int getAttendingSpecialTraining() {
			return attendingSpecialTraining;
		}
		public void setAttendingSpecialTraining(int attendingSpecialTraining) {
			this.attendingSpecialTraining = attendingSpecialTraining;
		}
		public int getSpecialTrainingCurrentYrBoys() {
			return specialTrainingCurrentYrBoys;
		}
		public void setSpecialTrainingCurrentYrBoys(int specialTrainingCurrentYrBoys) {
			this.specialTrainingCurrentYrBoys = specialTrainingCurrentYrBoys;
		}
		public int getSpecialTrainingCurrentYrGirls() {
			return specialTrainingCurrentYrGirls;
		}
		public void setSpecialTrainingCurrentYrGirls(int specialTrainingCurrentYrGirls) {
			this.specialTrainingCurrentYrGirls = specialTrainingCurrentYrGirls;
		}
		public int getSpecialTrainingPreviousYrBoys() {
			return specialTrainingPreviousYrBoys;
		}
		public void setSpecialTrainingPreviousYrBoys(int specialTrainingPreviousYrBoys) {
			this.specialTrainingPreviousYrBoys = specialTrainingPreviousYrBoys;
		}
		public int getSpecialTrainingPreviousYrGirls() {
			return specialTrainingPreviousYrGirls;
		}
		public void setSpecialTrainingPreviousYrGirls(int specialTrainingPreviousYrGirls) {
			this.specialTrainingPreviousYrGirls = specialTrainingPreviousYrGirls;
		}
		public int getCompleteSplTrngPreviousYrBoys() {
			return completeSplTrngPreviousYrBoys;
		}
		public void setCompleteSplTrngPreviousYrBoys(int completeSplTrngPreviousYrBoys) {
			this.completeSplTrngPreviousYrBoys = completeSplTrngPreviousYrBoys;
		}
		public int getCompleteSplTrngPreviousYrGirls() {
			return completeSplTrngPreviousYrGirls;
		}
		public void setCompleteSplTrngPreviousYrGirls(int completeSplTrngPreviousYrGirls) {
			this.completeSplTrngPreviousYrGirls = completeSplTrngPreviousYrGirls;
		}
		public int getSplTrainingConductedBy() {
			return splTrainingConductedBy;
		}
		public void setSplTrainingConductedBy(int splTrainingConductedBy) {
			this.splTrainingConductedBy = splTrainingConductedBy;
		}
		public int getSplTrainingConductedIn() {
			return splTrainingConductedIn;
		}
		public void setSplTrainingConductedIn(int splTrainingConductedIn) {
			this.splTrainingConductedIn = splTrainingConductedIn;
		}
		public int getTypeOfTrainingConducted() {
			return typeOfTrainingConducted;
		}
		public void setTypeOfTrainingConducted(int typeOfTrainingConducted) {
			this.typeOfTrainingConducted = typeOfTrainingConducted;
		}
		public int getFullTextbookSetRecieved() {
			return fullTextbookSetRecieved;
		}
		public void setFullTextbookSetRecieved(int fullTextbookSetRecieved) {
			this.fullTextbookSetRecieved = fullTextbookSetRecieved;
		}
		public int getTextbookRecieveMonth() {
			return textbookRecieveMonth;
		}
		public void setTextbookRecieveMonth(int textbookRecieveMonth) {
			this.textbookRecieveMonth = textbookRecieveMonth;
		}
		public int getTextbookRecieveYear() {
			return textbookRecieveYear;
		}
		public void setTextbookRecieveYear(int textbookRecieveYear) {
			this.textbookRecieveYear = textbookRecieveYear;
		}
		public int getFreeBooksAvaialbleToPrimary() {
			return freeBooksAvaialbleToPrimary;
		}
		public void setFreeBooksAvaialbleToPrimary(int freeBooksAvaialbleToPrimary) {
			this.freeBooksAvaialbleToPrimary = freeBooksAvaialbleToPrimary;
		}
		public int getFreeBooksAvailableToUprimary() {
			return freeBooksAvailableToUprimary;
		}
		public void setFreeBooksAvailableToUprimary(int freeBooksAvailableToUprimary) {
			this.freeBooksAvailableToUprimary = freeBooksAvailableToUprimary;
		}
		public int getTleAvailabilityPrimary() {
			return tleAvailabilityPrimary;
		}
		public void setTleAvailabilityPrimary(int tleAvailabilityPrimary) {
			this.tleAvailabilityPrimary = tleAvailabilityPrimary;
		}
		public int getTleAvailabilityUrimary() {
			return tleAvailabilityUrimary;
		}
		public void setTleAvailabilityUrimary(int tleAvailabilityUrimary) {
			this.tleAvailabilityUrimary = tleAvailabilityUrimary;
		}
		public int getPlaymtrlEqpmtAvailabilityPrinary() {
			return playmtrlEqpmtAvailabilityPrinary;
		}
		public void setPlaymtrlEqpmtAvailabilityPrinary(int playmtrlEqpmtAvailabilityPrinary) {
			this.playmtrlEqpmtAvailabilityPrinary = playmtrlEqpmtAvailabilityPrinary;
		}
		public int getPlaymtrlEqpmtAvailabilityUprimary() {
			return playmtrlEqpmtAvailabilityUprimary;
		}
		public void setPlaymtrlEqpmtAvailabilityUprimary(int playmtrlEqpmtAvailabilityUprimary) {
			this.playmtrlEqpmtAvailabilityUprimary = playmtrlEqpmtAvailabilityUprimary;
		}
		public int getPlaymtrlEqpmtAvailabilitySecondary() {
			return playmtrlEqpmtAvailabilitySecondary;
		}
		public void setPlaymtrlEqpmtAvailabilitySecondary(int playmtrlEqpmtAvailabilitySecondary) {
			this.playmtrlEqpmtAvailabilitySecondary = playmtrlEqpmtAvailabilitySecondary;
		}
		public int getPlaymtrlEqpmtAvailabilityHsecondary() {
			return playmtrlEqpmtAvailabilityHsecondary;
		}
		public void setPlaymtrlEqpmtAvailabilityHsecondary(int playmtrlEqpmtAvailabilityHsecondary) {
			this.playmtrlEqpmtAvailabilityHsecondary = playmtrlEqpmtAvailabilityHsecondary;
		}
		public int getCreatedByUserId() {
			return createdByUserId;
		}
		public void setCreatedByUserId(int createdByUserId) {
			this.createdByUserId = createdByUserId;
		}
		public String getCreatedDate() {
			return createdDate;
		}
		public void setCreatedDate(String createdDate) {
			this.createdDate = createdDate;
		}
		public int getUpdatedByUserID() {
			return updatedByUserID;
		}
		public void setUpdatedByUserID(int updatedByUserID) {
			this.updatedByUserID = updatedByUserID;
		}
		public String getUpdatedDate() {
			return updatedDate;
		}
		public void setUpdatedDate(String updatedDate) {
			this.updatedDate = updatedDate;
		}
			
	
}