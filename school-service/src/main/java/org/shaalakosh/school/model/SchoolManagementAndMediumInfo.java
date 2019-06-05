package org.shaalakosh.school.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

//Table name "tbl_school_management_medium"
public class SchoolManagementAndMediumInfo {

	// Primary Key column
	private int schoolId; // SchoolID

	// School Distance Information
	
	private int sessionId; // SessionID
	// School Distance Information
	private String schoolDistancePS; // SchoolDistance_PS
	private String schoolDistanceUPS; // SchoolDistance_UPS
	private String schoolDistanceSS; // SchoolDistance_SS
	private String schoolDistanceHSS; // SchoolDistance_HSS
	private String schoolApproachableByWeatherroads; // Is_Sch_approach_road
	
	//private SchoolDistance schoolDistance;
	
	
	// Language and Medium of Instruction Information
	
	private String taughtMotherTonguePrimary; // Taught_Mother_ToungePrimary	
	private String mediumInstruction1; // Medium_Instruction_1	
	private String otherLanguages1; // Medium_Instruction_1_Other
	private String mediumInstruction2; // Medium_Instruction_2	
	private String otherLanguages2; // Medium_Instruction_2_Other
	private String mediumInstruction3; // Medium_Instruction_3	
	private String otherLanguages3; // Medium_Instruction_3_Other
	private String mediumInstruction4; // Medium_Instruction_4	
	private String otherLanguages4; // Medium_Instruction_4_Other
	private String langTaughtPrimary1; // Lang_Taught_Primary_1
	private String langTaughtPrimary2; // Lang_Taught_Primary_2
	private String langTaughtPrimary3; // Lang_Taught_Primary_3
	private String preVocCourseOffered; // Pre_Voc_Course_Offered
	private String eduVocGuideOffered; // Edu_Voc_Guide_Offered

	/*private List<Integer> mediumInstructionList; // medium_instruction
	private List<Integer> langTaughtPrimaryList; // other_languages
*/	
	
	//private LanguageMedium languageMedium;
	
	
	// Affiliation Board of the school
	private String eleAffBoardID; // Ele_AffiliationBoardID
	private String eleAffBoardNum; // Ele_AffiliationBoard_No
	private String eleAffBoardOther; // Ele_AffiliationBoard_Other
	private String secAffBoardID; // Sec_AffiliationBoardID
	private String secAffBoardNum; // Sec_AffiliationBoard_No
	private String secAffBoardOther; // Sec_AffiliationBoard_Other
	private String hsecAffBoardID; // HSec_AffiliationBoardID
	private String hsecAffBoardNum; // HSec_AffiliationBoard_No
	private String hsecAffBoardOther; // HSec_AffiliationBoard_Other

	// Details of Visits to the School during the Previous Academic Year sections
	// Fields
	private String visitForAcedmicInspections; // No_Inspect_Previous_Yr
	private String visitsByCRCCoordinator; // No_Visit_Crc_Previous_Yr
	private String visitsByBRCBEO; // No_Visit_Blo_Previous_Yr
	
	
	//private AffiliationBoard affiliationBoard;
	
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
	public String getSchoolDistancePS() {
		return schoolDistancePS;
	}
	public void setSchoolDistancePS(String schoolDistancePS) {
		this.schoolDistancePS = schoolDistancePS;
	}
	public String getSchoolDistanceUPS() {
		return schoolDistanceUPS;
	}
	public void setSchoolDistanceUPS(String schoolDistanceUPS) {
		this.schoolDistanceUPS = schoolDistanceUPS;
	}
	public String getSchoolDistanceSS() {
		return schoolDistanceSS;
	}
	public void setSchoolDistanceSS(String schoolDistanceSS) {
		this.schoolDistanceSS = schoolDistanceSS;
	}
	public String getSchoolDistanceHSS() {
		return schoolDistanceHSS;
	}
	public void setSchoolDistanceHSS(String schoolDistanceHSS) {
		this.schoolDistanceHSS = schoolDistanceHSS;
	}
	public String getSchoolApproachableByWeatherroads() {
		return schoolApproachableByWeatherroads;
	}
	public void setSchoolApproachableByWeatherroads(String schoolApproachableByWeatherroads) {
		this.schoolApproachableByWeatherroads = schoolApproachableByWeatherroads;
	}
	public String getTaughtMotherTonguePrimary() {
		return taughtMotherTonguePrimary;
	}
	public void setTaughtMotherTonguePrimary(String taughtMotherTonguePrimary) {
		this.taughtMotherTonguePrimary = taughtMotherTonguePrimary;
	}
	public String getMediumInstruction1() {
		return mediumInstruction1;
	}
	public void setMediumInstruction1(String mediumInstruction1) {
		this.mediumInstruction1 = mediumInstruction1;
	}
	public String getOtherLanguages1() {
		return otherLanguages1;
	}
	public void setOtherLanguages1(String otherLanguages1) {
		this.otherLanguages1 = otherLanguages1;
	}
	public String getMediumInstruction2() {
		return mediumInstruction2;
	}
	public void setMediumInstruction2(String mediumInstruction2) {
		this.mediumInstruction2 = mediumInstruction2;
	}
	public String getOtherLanguages2() {
		return otherLanguages2;
	}
	public void setOtherLanguages2(String otherLanguages2) {
		this.otherLanguages2 = otherLanguages2;
	}
	public String getMediumInstruction3() {
		return mediumInstruction3;
	}
	public void setMediumInstruction3(String mediumInstruction3) {
		this.mediumInstruction3 = mediumInstruction3;
	}
	public String getOtherLanguages3() {
		return otherLanguages3;
	}
	public void setOtherLanguages3(String otherLanguages3) {
		this.otherLanguages3 = otherLanguages3;
	}
	public String getMediumInstruction4() {
		return mediumInstruction4;
	}
	public void setMediumInstruction4(String mediumInstruction4) {
		this.mediumInstruction4 = mediumInstruction4;
	}
	public String getOtherLanguages4() {
		return otherLanguages4;
	}
	public void setOtherLanguages4(String otherLanguages4) {
		this.otherLanguages4 = otherLanguages4;
	}
	public String getLangTaughtPrimary1() {
		return langTaughtPrimary1;
	}
	public void setLangTaughtPrimary1(String langTaughtPrimary1) {
		this.langTaughtPrimary1 = langTaughtPrimary1;
	}
	public String getLangTaughtPrimary2() {
		return langTaughtPrimary2;
	}
	public void setLangTaughtPrimary2(String langTaughtPrimary2) {
		this.langTaughtPrimary2 = langTaughtPrimary2;
	}
	public String getLangTaughtPrimary3() {
		return langTaughtPrimary3;
	}
	public void setLangTaughtPrimary3(String langTaughtPrimary3) {
		this.langTaughtPrimary3 = langTaughtPrimary3;
	}
	public String getPreVocCourseOffered() {
		return preVocCourseOffered;
	}
	public void setPreVocCourseOffered(String preVocCourseOffered) {
		this.preVocCourseOffered = preVocCourseOffered;
	}
	public String getEduVocGuideOffered() {
		return eduVocGuideOffered;
	}
	public void setEduVocGuideOffered(String eduVocGuideOffered) {
		this.eduVocGuideOffered = eduVocGuideOffered;
	}
	public String getEleAffBoardID() {
		return eleAffBoardID;
	}
	public void setEleAffBoardID(String eleAffBoardID) {
		this.eleAffBoardID = eleAffBoardID;
	}
	public String getEleAffBoardNum() {
		return eleAffBoardNum;
	}
	public void setEleAffBoardNum(String eleAffBoardNum) {
		this.eleAffBoardNum = eleAffBoardNum;
	}
	public String getEleAffBoardOther() {
		return eleAffBoardOther;
	}
	public void setEleAffBoardOther(String eleAffBoardOther) {
		this.eleAffBoardOther = eleAffBoardOther;
	}
	public String getSecAffBoardID() {
		return secAffBoardID;
	}
	public void setSecAffBoardID(String secAffBoardID) {
		this.secAffBoardID = secAffBoardID;
	}
	public String getSecAffBoardNum() {
		return secAffBoardNum;
	}
	public void setSecAffBoardNum(String secAffBoardNum) {
		this.secAffBoardNum = secAffBoardNum;
	}
	public String getSecAffBoardOther() {
		return secAffBoardOther;
	}
	public void setSecAffBoardOther(String secAffBoardOther) {
		this.secAffBoardOther = secAffBoardOther;
	}
	public String getHsecAffBoardID() {
		return hsecAffBoardID;
	}
	public void setHsecAffBoardID(String hsecAffBoardID) {
		this.hsecAffBoardID = hsecAffBoardID;
	}
	public String getHsecAffBoardNum() {
		return hsecAffBoardNum;
	}
	public void setHsecAffBoardNum(String hsecAffBoardNum) {
		this.hsecAffBoardNum = hsecAffBoardNum;
	}
	public String getHsecAffBoardOther() {
		return hsecAffBoardOther;
	}
	public void setHsecAffBoardOther(String hsecAffBoardOther) {
		this.hsecAffBoardOther = hsecAffBoardOther;
	}
	public String getVisitForAcedmicInspections() {
		return visitForAcedmicInspections;
	}
	public void setVisitForAcedmicInspections(String visitForAcedmicInspections) {
		this.visitForAcedmicInspections = visitForAcedmicInspections;
	}
	public String getVisitsByCRCCoordinator() {
		return visitsByCRCCoordinator;
	}
	public void setVisitsByCRCCoordinator(String visitsByCRCCoordinator) {
		this.visitsByCRCCoordinator = visitsByCRCCoordinator;
	}
	public String getVisitsByBRCBEO() {
		return visitsByBRCBEO;
	}
	public void setVisitsByBRCBEO(String visitsByBRCBEO) {
		this.visitsByBRCBEO = visitsByBRCBEO;
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
