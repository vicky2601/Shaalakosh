package org.shaalakosh.school.model.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.shaalakosh.school.model.SchoolSplSmcInfo;
import org.springframework.jdbc.core.RowMapper;

public class SchoolSplSmcInfoMapper implements RowMapper<SchoolSplSmcInfo> {

	public SchoolSplSmcInfo mapRow(ResultSet resultSet, int arg1)
			throws SQLException {
		SchoolSplSmcInfo trainingTleSmcInfo = new SchoolSplSmcInfo();
		trainingTleSmcInfo.setSchoolId(resultSet.getInt("SchoolID"));
		trainingTleSmcInfo.setSessionId(resultSet.getInt("SessionID"));
		trainingTleSmcInfo.setSmcConstituency(resultSet.getInt("Is_Smc"));
		
		trainingTleSmcInfo.setSmcTotalMale(resultSet.getInt("Smc_Tot_M"));
		trainingTleSmcInfo.setSmcTotalFemale(resultSet.getInt("Smc_Tot_F"));
		trainingTleSmcInfo.setSmcParentsMale(resultSet.getInt("Smc_Parents_M"));
		trainingTleSmcInfo.setSmcParentsFemale(resultSet.getInt("Smc_Parents_F"));
		
		trainingTleSmcInfo.setLocalGovtBodyMale(resultSet.getInt("Smc_Lgb_M"));
		trainingTleSmcInfo.setLocalGovtBodyFemale(resultSet.getInt("Smc_Lgb_F"));
		trainingTleSmcInfo.setSmcMeetingPreviousYr(resultSet.getInt("SmcMmeetings_Previous_Yr"));
		trainingTleSmcInfo.setSmcSchoolDevelopmentPlan(resultSet.getInt("Is_Smc_Sdp_Prepared"));
		
		trainingTleSmcInfo.setIsSmcBankAccount(resultSet.getInt("Is_Smc_Bank_Account"));
		trainingTleSmcInfo.setSmcBankName(resultSet.getString("Smc_Bank_Name"));
		trainingTleSmcInfo.setSmcBranch(resultSet.getString("Smc_Bank_Branch"));
		trainingTleSmcInfo.setSmcBankAccount(resultSet.getString("Smc_Bank_Account"));
		
		trainingTleSmcInfo.setSmcBankAccountName(resultSet.getString("Smc_Bank_Ac_Mame"));
		trainingTleSmcInfo.setSmcBankIfsc(resultSet.getString("Smc_Bank_Ifsc"));
		trainingTleSmcInfo.setAttendingSpecialTraining(resultSet.getInt("Is_Spl_Trng_Any"));
		trainingTleSmcInfo.setSpecialTrainingCurrentYrBoys(resultSet.getInt("Spl_trg_Cy_Enrolled_B"));
		
		trainingTleSmcInfo.setSpecialTrainingCurrentYrGirls(resultSet.getInt("Spl_Trg_Cy_Enrolled_G"));
		trainingTleSmcInfo.setSpecialTrainingPreviousYrBoys(resultSet.getInt("Spl_Trg_Py_Enrolled_B"));
		trainingTleSmcInfo.setSpecialTrainingPreviousYrGirls(resultSet.getInt("Spl_Trg_Py_Enrolled_G"));
		trainingTleSmcInfo.setCompleteSplTrngPreviousYrBoys(resultSet.getInt("Spl_Trg_Py_Completed_B"));
		
		trainingTleSmcInfo.setCompleteSplTrngPreviousYrGirls(resultSet.getInt("Spl_Trg_Py_Completed_G"));
		trainingTleSmcInfo.setSplTrainingConductedBy(resultSet.getInt("Spl_Trg_Conducted_By"));
		trainingTleSmcInfo.setSplTrainingConductedIn(resultSet.getInt("Spl_Trg_Place"));
		trainingTleSmcInfo.setTypeOfTrainingConducted(resultSet.getInt("Spl_Trg_Type"));
		
		trainingTleSmcInfo.setFullTextbookSetRecieved(resultSet.getInt("Is_Txt_Bk_Recd"));
		trainingTleSmcInfo.setTextbookRecieveMonth(resultSet.getInt("Txt_Bk_Receive_Month"));
		trainingTleSmcInfo.setTextbookRecieveYear(resultSet.getInt("Txt_Bk_Receive_Yr"));
		trainingTleSmcInfo.setFreeBooksAvaialbleToPrimary(resultSet.getInt("Is_Free_Textbook_Av_Pri"));
		
		trainingTleSmcInfo.setFreeBooksAvailableToUprimary(resultSet.getInt("Is_Free_Textbook_Av_Ups"));
		trainingTleSmcInfo.setTleAvailabilityPrimary(resultSet.getInt("Is_Tle_Rec_pri"));
		trainingTleSmcInfo.setTleAvailabilityUrimary(resultSet.getInt("Is_Tle_Rec_Ups"));
		trainingTleSmcInfo.setPlaymtrlEqpmtAvailabilityPrinary(resultSet.getInt("Is_Play_Mat_Av_Pri"));
		
		trainingTleSmcInfo.setPlaymtrlEqpmtAvailabilityUprimary(resultSet.getInt("Is_Play_Mat_Av_Ups"));
		trainingTleSmcInfo.setPlaymtrlEqpmtAvailabilitySecondary(resultSet.getInt("Is_Play_Mat_Av_Sec"));
		trainingTleSmcInfo.setPlaymtrlEqpmtAvailabilityHsecondary(resultSet.getInt("Is_Play_Mat_Av_Hsec"));
		trainingTleSmcInfo.setCreatedByUserId(resultSet.getInt("CreatedByUserID"));
		
		trainingTleSmcInfo.setCreatedDate(resultSet.getString("CreatedDate"));
		trainingTleSmcInfo.setUpdatedByUserID(resultSet.getInt("UpdatedByUserID"));
		trainingTleSmcInfo.setUpdatedDate(resultSet.getString("UpdatedDate"));
		
		return trainingTleSmcInfo;
	}
}