package org.shaalakosh.school.DAOServiceImpl;

import java.util.List;

import org.shaalakosh.school.DAOService.SchoolProfileDAOService;
import org.shaalakosh.school.model.BasicSchoolProfileInfo;
import org.shaalakosh.school.model.LocationAndEstablishmentInfo;
import org.shaalakosh.school.model.SMDCCommitteeInfo;
import org.shaalakosh.school.model.SchoolManagementAndMediumInfo;
import org.shaalakosh.school.model.SchoolSplSmcInfo;
import org.shaalakosh.school.model.mapper.BasicSchoolProfileInfoMapper;
import org.shaalakosh.school.model.mapper.LocationAndEstablishmentInfoMapper;
import org.shaalakosh.school.model.mapper.SMDCCommitteeInfoMapper;
import org.shaalakosh.school.model.mapper.SchoolManagementAndMediumInfoMapper;
import org.shaalakosh.school.model.mapper.SchoolSplSmcInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service(value = "schoolProfileDAOService")
public class SchoolProfileDAOServiceImpl implements SchoolProfileDAOService {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public int saveBasicSchoolProfileInfo(BasicSchoolProfileInfo basicSchoolProfileInfo) {
		final String BASIC_SCHOOL_PROFILE_INFO_INSERT = "insert into trn_school_basic_info(SchoolID, UdiseSchoolCode, StateID, "
				+ "DistrictID, BlockID, SchoolName, SchoolAddress, PinCode, BlockResourceCentreID, ClusterResourceCentreID,"
				+ " SchoolCategoryID, LowestClassID, HighestClassID, SchoolTypeID, SchoolManagementID, Acad_Session_Start_Month, "
				+ "Is_Residential_School, ResidentialSchoolTypeId, Is_Minority_Managed, MinorityCommunityID, Is_CWSN, "
				+ "Is_Shift_School, CreatedByUserID, UpdatedByUserID, CreatedDate, UpdatedDate)"
				+ " values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

		return jdbcTemplate.update(BASIC_SCHOOL_PROFILE_INFO_INSERT, basicSchoolProfileInfo.getSchoolId(),
				basicSchoolProfileInfo.getUdiseSchoolCode(), basicSchoolProfileInfo.getStateId(),
				basicSchoolProfileInfo.getDistrictId(), basicSchoolProfileInfo.getBlockId(),
				basicSchoolProfileInfo.getSchoolName(), basicSchoolProfileInfo.getSchoolAddress(),
				basicSchoolProfileInfo.getPincode(), basicSchoolProfileInfo.getBlockResourcentreId(),
				basicSchoolProfileInfo.getClusterResourceCentreId(), basicSchoolProfileInfo.getSchoolCategoryCodeId(),
				basicSchoolProfileInfo.getLowestClassId(), basicSchoolProfileInfo.getHighestClassId(),
				basicSchoolProfileInfo.getSchoolTypeId(), basicSchoolProfileInfo.getManagementOfTheSchoolId(),
				basicSchoolProfileInfo.getMonthOfAcademicYearStart(),
				basicSchoolProfileInfo.getIsThisAResidentialSchool(),
				basicSchoolProfileInfo.getTypeOfResidentialSchoolId(),
				basicSchoolProfileInfo.getIsThisAMinorityManagedSchool(),
				basicSchoolProfileInfo.getTypeOfSchoolCommunityId(),
				basicSchoolProfileInfo.getIsThisASpecialSchoolForCWSN(), basicSchoolProfileInfo.getIsThisAShiftschool(),
				basicSchoolProfileInfo.getCreateBy(), basicSchoolProfileInfo.getUpdatedBy(),
				basicSchoolProfileInfo.getCreateDateTime(), basicSchoolProfileInfo.getUpdatedDateTime());
	}

	@Override
	public int updateBasicSchoolProfileInfo(BasicSchoolProfileInfo basicSchoolProfileInfo) {
		final String BASIC_SCHOOL_PROFILE_INFO_INSERT = "update trn_school_basic_info set UdiseSchoolCode=?, StateID=?, "
				+ "DistrictID=?, BlockID=?, SchoolName=?, SchoolAddress=?, PinCode=?, BlockResourceCentreID=?, ClusterResourceCentreID=?,"
				+ " SchoolCategoryID=?, LowestClassID=?, HighestClassID=?, SchoolTypeID=?, SchoolManagementID=?, Acad_Session_Start_Month=?, "
				+ "Is_Residential_School=?, ResidentialSchoolTypeId=?, Is_Minority_Managed=?, MinorityCommunityID=?, Is_CWSN=?, "
				+ "Is_Shift_School=?, CreatedByUserID=?, UpdatedByUserID=?, CreatedDate=?, UpdatedDate=? where SchoolID=?";

		return jdbcTemplate.update(BASIC_SCHOOL_PROFILE_INFO_INSERT, basicSchoolProfileInfo.getUdiseSchoolCode(),
				basicSchoolProfileInfo.getStateId(), basicSchoolProfileInfo.getDistrictId(),
				basicSchoolProfileInfo.getBlockId(), basicSchoolProfileInfo.getSchoolName(),
				basicSchoolProfileInfo.getSchoolAddress(), basicSchoolProfileInfo.getPincode(),
				basicSchoolProfileInfo.getBlockResourcentreId(), basicSchoolProfileInfo.getClusterResourceCentreId(),
				basicSchoolProfileInfo.getSchoolCategoryCodeId(), basicSchoolProfileInfo.getLowestClassId(),
				basicSchoolProfileInfo.getHighestClassId(), basicSchoolProfileInfo.getSchoolTypeId(),
				basicSchoolProfileInfo.getManagementOfTheSchoolId(),
				basicSchoolProfileInfo.getMonthOfAcademicYearStart(),
				basicSchoolProfileInfo.getIsThisAResidentialSchool(),
				basicSchoolProfileInfo.getTypeOfResidentialSchoolId(),
				basicSchoolProfileInfo.getIsThisAMinorityManagedSchool(),
				basicSchoolProfileInfo.getTypeOfSchoolCommunityId(),
				basicSchoolProfileInfo.getIsThisASpecialSchoolForCWSN(), basicSchoolProfileInfo.getIsThisAShiftschool(),
				basicSchoolProfileInfo.getCreateBy(), basicSchoolProfileInfo.getUpdatedBy(),
				basicSchoolProfileInfo.getCreateDateTime(), basicSchoolProfileInfo.getUpdatedDateTime(),
				basicSchoolProfileInfo.getSchoolId());
	}

	@Override
	public BasicSchoolProfileInfo fetchBasicSchoolProfileInfoBySchoolId(int schoolId) {
		String BASIC_SCHOOL_PROFILE_INFO_FETCH = "select * from trn_school_basic_info where SchoolID = ?";
		return jdbcTemplate.queryForObject(BASIC_SCHOOL_PROFILE_INFO_FETCH, new Object[] { schoolId },
				new BasicSchoolProfileInfoMapper());
	}

	@Override
	public List<BasicSchoolProfileInfo> fetchAllBasicSchoolProfileInfo() {
		return jdbcTemplate.query("Select * from trn_school_basic_info", new BasicSchoolProfileInfoMapper());
	}

	// ===============================================LocationAndEstablishmentInfo================================

	@Override
	public int saveLocationAndEstablishmentInfo(LocationAndEstablishmentInfo locationAndEstablishmentInfo) {
		final String LOCATION_AND_STABLISHMENT_INFO_INSERT = "insert into location_and_establishment_information(lattitude, longitude, "
				+ "name_of_adm_rb_mn_tl, school_location_id, village_name, gram_panchayat, habitation,"
				+ " municipality_name, ward_number, mohalla, assembly_const_name, parliamentry_const_name, city_name, "
				+ "respondant_name, std_code, school_telephone1, resp_mobile, school_std_code, school_telephone2, "
				+ "school_website, school_email, school_establishment_yr, ele_recognition_yr, sec_establishment_yr, "
				+ "hr_sec_recognition_yr, upgrade_up_yr, upgrade_sec_yr, upgrade_hr_sec_yr, basic_school_profile_id)"
				+ " values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

		return jdbcTemplate.update(LOCATION_AND_STABLISHMENT_INFO_INSERT, locationAndEstablishmentInfo.getLattitude(),
				locationAndEstablishmentInfo.getLongitude(), locationAndEstablishmentInfo.getNameOfTheABMT(),
				locationAndEstablishmentInfo.getSchoolLocationId(), locationAndEstablishmentInfo.getVillageName(),
				locationAndEstablishmentInfo.getGramPanchayat(), locationAndEstablishmentInfo.getHabitation(),
				locationAndEstablishmentInfo.getMunicipalityName(), locationAndEstablishmentInfo.getWardNumber(),
				locationAndEstablishmentInfo.getMohalla(), locationAndEstablishmentInfo.getAssemblyConstName(),
				locationAndEstablishmentInfo.getParliamentryConstName(), locationAndEstablishmentInfo.getCityName(),
				locationAndEstablishmentInfo.getRespondantName(), locationAndEstablishmentInfo.getStdCode(),
				locationAndEstablishmentInfo.getSchoolTelephone1(), locationAndEstablishmentInfo.getRespMobile(),
				locationAndEstablishmentInfo.getSchoolStdCode(), locationAndEstablishmentInfo.getSchoolTelephone2(),
				locationAndEstablishmentInfo.getSchoolWebsite(), locationAndEstablishmentInfo.getSchool_email(),
				locationAndEstablishmentInfo.getSchoolEstablishmentYear(),
				locationAndEstablishmentInfo.getEleRecognitionYear(),
				locationAndEstablishmentInfo.getSecEstablishmentYear(),
				locationAndEstablishmentInfo.getHrSecRecognitionYear(), locationAndEstablishmentInfo.getUpgradeUpYear(),
				locationAndEstablishmentInfo.getUpgradeSecYear(), locationAndEstablishmentInfo.getUpgradeHRSecYear(),
				locationAndEstablishmentInfo.getBasicSchoolProfileId());
	}

	@Override
	public int updateLocationAndEstablishmentInfo(LocationAndEstablishmentInfo locationAndEstablishmentInfo) {
		final String LOCATION_AND_STABLISHMENT_INFO_UPDATE = "update location_and_establishment_information set lattitude=?, longitude=?, "
				+ "name_of_adm_rb_mn_tl=?, school_location_id=?, village_name=?, gram_panchayat=?, habitation=?,"
				+ " municipality_name=?, ward_number=?, mohalla=?, assembly_const_name=?, parliamentry_const_name=?, city_name=?, "
				+ "respondant_name=?, std_code=?, school_telephone1=?, resp_mobile=?, school_std_code=?, school_telephone2=?, "
				+ "school_website=?, school_email=?, school_establishment_yr=?, ele_recognition_yr=?, sec_establishment_yr=?, "
				+ "hr_sec_recognition_yr=?, upgrade_up_yr=?, upgrade_sec_yr=?, upgrade_hr_sec_yr=?, where location_id=? and basic_school_profile_id=?";

		return jdbcTemplate.update(LOCATION_AND_STABLISHMENT_INFO_UPDATE, locationAndEstablishmentInfo.getLattitude(),
				locationAndEstablishmentInfo.getLongitude(), locationAndEstablishmentInfo.getNameOfTheABMT(),
				locationAndEstablishmentInfo.getSchoolLocationId(), locationAndEstablishmentInfo.getVillageName(),
				locationAndEstablishmentInfo.getGramPanchayat(), locationAndEstablishmentInfo.getHabitation(),
				locationAndEstablishmentInfo.getMunicipalityName(), locationAndEstablishmentInfo.getWardNumber(),
				locationAndEstablishmentInfo.getMohalla(), locationAndEstablishmentInfo.getAssemblyConstName(),
				locationAndEstablishmentInfo.getParliamentryConstName(), locationAndEstablishmentInfo.getCityName(),
				locationAndEstablishmentInfo.getRespondantName(), locationAndEstablishmentInfo.getStdCode(),
				locationAndEstablishmentInfo.getSchoolTelephone1(), locationAndEstablishmentInfo.getRespMobile(),
				locationAndEstablishmentInfo.getSchoolStdCode(), locationAndEstablishmentInfo.getSchoolTelephone2(),
				locationAndEstablishmentInfo.getSchoolWebsite(), locationAndEstablishmentInfo.getSchool_email(),
				locationAndEstablishmentInfo.getSchoolEstablishmentYear(),
				locationAndEstablishmentInfo.getEleRecognitionYear(),
				locationAndEstablishmentInfo.getSecEstablishmentYear(),
				locationAndEstablishmentInfo.getHrSecRecognitionYear(), locationAndEstablishmentInfo.getUpgradeUpYear(),
				locationAndEstablishmentInfo.getUpgradeSecYear(), locationAndEstablishmentInfo.getUpgradeHRSecYear(),
				locationAndEstablishmentInfo.getLocationAndEstablishmentId(),
				locationAndEstablishmentInfo.getBasicSchoolProfileId());
	}

	@Override
	public LocationAndEstablishmentInfo fetchLocationAndEstablishmentInfoById(int id) {
		String LOCATION_AND_ESTABLISHMENT_INFO_FETCH = "select * from location_and_establishment_information where location_id = ?";
		return jdbcTemplate.queryForObject(LOCATION_AND_ESTABLISHMENT_INFO_FETCH, new Object[] { id },
				new LocationAndEstablishmentInfoMapper());
	}

	@Override
	public LocationAndEstablishmentInfo fetchLocationAndEstablishmentInfoByBasicSchoolProfileId(
			int basicSchoolProfileId) {
		String LOCATION_AND_ESTABLISHMENT_INFO_FETCH = "select * from location_and_establishment_information where basic_school_profile_id = ?";
		return jdbcTemplate.queryForObject(LOCATION_AND_ESTABLISHMENT_INFO_FETCH, new Object[] { basicSchoolProfileId },
				new LocationAndEstablishmentInfoMapper());
	}

	@Override
	public List<LocationAndEstablishmentInfo> fetchAllLocationAndEstablishmentInfo() {
		return jdbcTemplate.query("Select * from location_and_establishment_information",
				new LocationAndEstablishmentInfoMapper());
	}

	// =======================StartManagementAndMediumInfo================================

	// Save if basic profile id is not in table otherwise update query will fire
	@Override
	public int saveOrUpdateSchoolManagementAndMediumInfo(SchoolManagementAndMediumInfo schoolManagementAndMediumInfo) {
		String currentSessionId = "SELECT SessionID FROM udise_shaalakosh.mst_sessionmaster where isActive = 1 AND CURDATE() between SessionStartDate and SessionEndDate";
		int sessionId = jdbcTemplate.queryForObject(currentSessionId, Integer.class);

		String userQuery = "SELECT UserID FROM mst_usermaster where UserName='"
				+ schoolManagementAndMediumInfo.getUserName() + "'";
		System.out.println(" query :- "+userQuery);
		int userId = jdbcTemplate.queryForObject(userQuery, Integer.class);

		schoolManagementAndMediumInfo.setUpdatedByUserID(userId);
		schoolManagementAndMediumInfo.setCreatedByUserID(userId);

		final String SCHOOL_MANAGEMENT_AND_MEDIUM_INFO_INSERT = "insert into trn_school_mng_med_info(SchoolID, SessionID,"
				+ "SchoolDistance_PS, SchoolDistance_UPS, SchoolDistance_SS, SchoolDistance_HSS, Is_Sch_approach_road, Taught_Mother_ToungePrimary,"
				+ "Medium_Instruction_1, Medium_Instruction_1_Other,Medium_Instruction_2, Medium_Instruction_2_Other,Medium_Instruction_3, Medium_Instruction_3_Other,"
				+ "Medium_Instruction_4, Medium_Instruction_4_Other, Lang_Taught_Primary_1,Lang_Taught_Primary_2,Lang_Taught_Primary_3, Pre_Voc_Course_Offered, Edu_Voc_Guide_Offered,"
				+ "Ele_AffiliationBoardID, Ele_AffiliationBoard_No,Ele_AffiliationBoard_Other, Sec_AffiliationBoardID, Sec_AffiliationBoard_No,Sec_AffiliationBoard_Other, HSec_AffiliationBoardID,"
				+ "HSec_AffiliationBoard_No,HSec_AffiliationBoard_Other, No_Inspect_Previous_Yr, No_Visit_Crc_Previous_Yr, No_Visit_Blo_Previous_Yr,CreatedByUserID,"
				+ "CreatedDate,UpdatedByUserID,UpdatedDate)"
				+ " values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?) "
				+ "ON DUPLICATE KEY UPDATE SchoolDistance_PS=VALUES(SchoolDistance_PS), "
				+ "SchoolDistance_UPS=VALUES(SchoolDistance_UPS), SchoolDistance_SS=VALUES(SchoolDistance_SS), "
				+ "SchoolDistance_HSS=VALUES(SchoolDistance_HSS), Is_Sch_approach_road=VALUES(Is_Sch_approach_road), "
				+ "Taught_Mother_ToungePrimary=VALUES(Taught_Mother_ToungePrimary), Medium_Instruction_1=VALUES(Medium_Instruction_1), "
				+ "Medium_Instruction_1_Other=VALUES(Medium_Instruction_1_Other), Medium_Instruction_2=VALUES(Medium_Instruction_2),Medium_Instruction_2_Other=VALUES(Medium_Instruction_2_Other), Medium_Instruction_3=VALUES(Medium_Instruction_3),Medium_Instruction_3_Other=VALUES(Medium_Instruction_3_Other),Medium_Instruction_4=VALUES(Medium_Instruction_4),Medium_Instruction_4_Other=VALUES(Medium_Instruction_4_Other), Lang_Taught_Primary_1=VALUES(Lang_Taught_Primary_1), Lang_Taught_Primary_2=VALUES(Lang_Taught_Primary_2), Lang_Taught_Primary_3=VALUES(Lang_Taught_Primary_3), "
				+ "Pre_Voc_Course_Offered=VALUES(Pre_Voc_Course_Offered), "
				+ "Edu_Voc_Guide_Offered=VALUES(Edu_Voc_Guide_Offered), Ele_AffiliationBoardID=VALUES(Ele_AffiliationBoardID), "
				+ "Ele_AffiliationBoard_No=VALUES(Ele_AffiliationBoard_No), Ele_AffiliationBoard_Other=VALUES(Ele_AffiliationBoard_Other), Sec_AffiliationBoardID=VALUES(Sec_AffiliationBoardID), "
				+ "Sec_AffiliationBoard_No=VALUES(Sec_AffiliationBoard_No), Sec_AffiliationBoard_Other=VALUES(Sec_AffiliationBoard_Other), HSec_AffiliationBoardID=VALUES(HSec_AffiliationBoardID), "
				+ "HSec_AffiliationBoard_No=VALUES(HSec_AffiliationBoard_No), HSec_AffiliationBoard_Other=VALUES(HSec_AffiliationBoard_Other), No_Inspect_Previous_Yr=VALUES(No_Inspect_Previous_Yr), "
				+ "No_Visit_Crc_Previous_Yr=VALUES(No_Visit_Crc_Previous_Yr), No_Visit_Blo_Previous_Yr=VALUES(No_Visit_Blo_Previous_Yr), "
				+ "UpdatedByUserID=VALUES(UpdatedByUserID), UpdatedDate=VALUES(UpdatedDate) ";

		return jdbcTemplate.update(SCHOOL_MANAGEMENT_AND_MEDIUM_INFO_INSERT,
				schoolManagementAndMediumInfo.getSchoolId(), sessionId,
				schoolManagementAndMediumInfo.getSchoolDistancePS(),
				schoolManagementAndMediumInfo.getSchoolDistanceUPS(),
				schoolManagementAndMediumInfo.getSchoolDistanceSS(),
				schoolManagementAndMediumInfo.getSchoolDistanceHSS(),
				schoolManagementAndMediumInfo.getSchoolApproachableByWeatherroads(),
				schoolManagementAndMediumInfo.getTaughtMotherTonguePrimary(),
				schoolManagementAndMediumInfo.getMediumInstruction1(),
				schoolManagementAndMediumInfo.getOtherLanguages1(),
				schoolManagementAndMediumInfo.getMediumInstruction2(),
				schoolManagementAndMediumInfo.getOtherLanguages2(),
				schoolManagementAndMediumInfo.getMediumInstruction3(),
				schoolManagementAndMediumInfo.getOtherLanguages3(),
				schoolManagementAndMediumInfo.getMediumInstruction4(),
				schoolManagementAndMediumInfo.getOtherLanguages4(),
				schoolManagementAndMediumInfo.getLangTaughtPrimary1(),
				schoolManagementAndMediumInfo.getLangTaughtPrimary2(),
				schoolManagementAndMediumInfo.getLangTaughtPrimary3(),
				schoolManagementAndMediumInfo.getPreVocCourseOffered(),
				schoolManagementAndMediumInfo.getEduVocGuideOffered(), schoolManagementAndMediumInfo.getEleAffBoardID(),
				schoolManagementAndMediumInfo.getEleAffBoardNum(), schoolManagementAndMediumInfo.getEleAffBoardOther(),
				schoolManagementAndMediumInfo.getSecAffBoardID(), schoolManagementAndMediumInfo.getSecAffBoardNum(),
				schoolManagementAndMediumInfo.getSecAffBoardOther(), schoolManagementAndMediumInfo.getHsecAffBoardID(),
				schoolManagementAndMediumInfo.getHsecAffBoardNum(),
				schoolManagementAndMediumInfo.getHsecAffBoardOther(),
				schoolManagementAndMediumInfo.getVisitForAcedmicInspections(),
				schoolManagementAndMediumInfo.getVisitsByCRCCoordinator(),
				schoolManagementAndMediumInfo.getVisitsByBRCBEO(), schoolManagementAndMediumInfo.getCreatedByUserID(),
				schoolManagementAndMediumInfo.getCreatedDate(), schoolManagementAndMediumInfo.getUpdatedByUserID(),
				schoolManagementAndMediumInfo.getUpdatedDate());

	}

	@Override
	public SchoolManagementAndMediumInfo fetchSchoolManagementAndMediumInfoBySchoolId(int schoolId) {
		String BASIC_SCHOOL_PROFILE_INFO_FETCH = "select * from trn_school_mng_med_info where SchoolID = ?";
		return jdbcTemplate.queryForObject(BASIC_SCHOOL_PROFILE_INFO_FETCH, new Object[] { schoolId },
				new SchoolManagementAndMediumInfoMapper());
	}

	@Override
	public List<SchoolManagementAndMediumInfo> fetchAllSchoolManagementAndMediumInfo() {
		return jdbcTemplate.query("Select * from trn_school_mng_med_info", new SchoolManagementAndMediumInfoMapper());
	}

	// ================End ManagementAndMediumInfo================================

	// ===============================================Start SchoolSplSmcInfo
	// ====================================
	@Override
	public int saveSchoolSplSmcInfo(SchoolSplSmcInfo trainingTleSmcInfo) {
		final String TRN_SCHOOL_SPL_SMC_INFO_INSERT = "insert into trn_school_spl_smc_info(SchoolID"
				+ "SessionID, Is_Smc, Smc_Tot_M, Smc_Tot_F, Smc_Parents_M,Sms_Parents_F, Smc_Lgb_M, Smc_Lgb_F"
				+ "Smc_Meetings_Previous_Yr,Is_Smc_Sdp_Prepared, Is_Smc_Bank_Account, Smc_Bank_Name, Smc_Bank_Branch"
				+ "Smc_Bank_Account, Smc_Bank_Ifsc, Smc_Bank_Ac_Name, Is_Spl_Trng_Any, Spl_Trg_Cy_Enrolled_B"
				+ "Spl_Trg_Cy_Enrolled_G, Spl_Trg_Py_Enrolled_B, Spl_Trg_Py_Enrolled_G, Spl_Trg_Py_Completed_B, Spl_Trg_Py_Completed_G"
				+ "Spl_Trg_Conducted_By, Spl_Trg_Place, Spl_Trg_Type, Is_Txt_Bk_Recd, Txt_Bk_Receive_Mnth, Txt_Bk_Receive_Yr"
				+ "Is_Free_Textbook_Av_Pri, Is_Free_Textbook_Av_Ups, Is_Tle_Rec_Pri, Is_Tle_Rec_Ups, Is_Play_Mat_Av_Pri"
				+ "Is_Play_Mat_Av_Ups, Is_Play_Mat_Av_Sec, Is_Play_Mat_Av_Hsec, CreatedByUserID, CreatedDate, UpdatedByUserID, UpdatedDate)"
				+ "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

		return jdbcTemplate.update(TRN_SCHOOL_SPL_SMC_INFO_INSERT, trainingTleSmcInfo.getSchoolId(),
				trainingTleSmcInfo.getSessionId(), trainingTleSmcInfo.getSmcTotalMale(),
				trainingTleSmcInfo.getSmcTotalFemale(), trainingTleSmcInfo.getSmcParentsMale(),
				trainingTleSmcInfo.getSmcParentsFemale(), trainingTleSmcInfo.getLocalGovtBodyMale(),
				trainingTleSmcInfo.getLocalGovtBodyFemale(), trainingTleSmcInfo.getSmcMeetingPreviousYr(),
				trainingTleSmcInfo.getSmcSchoolDevelopmentPlan(), trainingTleSmcInfo.getSmcBankAccount(),
				trainingTleSmcInfo.getSmcBankName(), trainingTleSmcInfo.getSmcBranch(),
				trainingTleSmcInfo.getSmcBankAccount(), trainingTleSmcInfo.getSmcBankIfsc(),
				trainingTleSmcInfo.getSmcBankAccountName(), trainingTleSmcInfo.getAttendingSpecialTraining(),
				trainingTleSmcInfo.getSpecialTrainingCurrentYrBoys(),
				trainingTleSmcInfo.getSpecialTrainingCurrentYrGirls(),
				trainingTleSmcInfo.getSpecialTrainingPreviousYrBoys(),
				trainingTleSmcInfo.getSpecialTrainingPreviousYrGirls(),
				trainingTleSmcInfo.getCompleteSplTrngPreviousYrBoys(),
				trainingTleSmcInfo.getCompleteSplTrngPreviousYrGirls(), trainingTleSmcInfo.getSplTrainingConductedBy(),
				trainingTleSmcInfo.getSplTrainingConductedIn(), trainingTleSmcInfo.getTypeOfTrainingConducted(),
				trainingTleSmcInfo.getFullTextbookSetRecieved(), trainingTleSmcInfo.getTextbookRecieveMonth(),
				trainingTleSmcInfo.getTextbookRecieveYear(), trainingTleSmcInfo.getFreeBooksAvaialbleToPrimary(),
				trainingTleSmcInfo.getFreeBooksAvailableToUprimary(), trainingTleSmcInfo.getTleAvailabilityPrimary(),
				trainingTleSmcInfo.getTleAvailabilityUrimary(),
				trainingTleSmcInfo.getPlaymtrlEqpmtAvailabilityPrinary(),
				trainingTleSmcInfo.getPlaymtrlEqpmtAvailabilityUprimary(),
				trainingTleSmcInfo.getPlaymtrlEqpmtAvailabilitySecondary(),
				trainingTleSmcInfo.getPlaymtrlEqpmtAvailabilityHsecondary(), trainingTleSmcInfo.getCreatedByUserId(),
				trainingTleSmcInfo.getCreatedDate(), trainingTleSmcInfo.getUpdatedByUserID(),
				trainingTleSmcInfo.getUpdatedDate());
	}

	@Override
	public int updateSchoolSplSmcInfo(SchoolSplSmcInfo trainingTleSmcInfo) {
		final String TRN_SCHOOL_SPL_SMC_INFO_INSERT = "update into trn_school_spl_smc_info (SchoolID=?"
				+ "SessionID=?, Is_Smc=?, Smc_Tot_M=?, Smc_Tot_F=?, Smc_Parents_M=?,Sms_Parents_F=?, Smc_Lgb_M=?, Smc_Lgb_F=?"
				+ "Smc_Meetings_Previous_Yr=?,Is_Smc_Sdp_Prepared=?, Is_Smc_Bank_Account=?, Smc_Bank_Name=?, Smc_Bank_Branch=?"
				+ "Smc_Bank_Account=?, Smc_Bank_Ifsc=?, Smc_Bank_Ac_Name=?, Is_Spl_Trng_Any=?, Spl_Trg_Cy_Enrolled_B=?"
				+ "Spl_Trg_Cy_Enrolled_G=?, Spl_Trg_Py_Enrolled_B=?, Spl_Trg_Py_Enrolled_G=?, Spl_Trg_Py_Completed_B=?, Spl_Trg_Py_Completed_G=?"
				+ "Spl_Trg_Conducted_By=?, Spl_Trg_Place=?, Spl_Trg_Type=?, Is_Txt_Bk_Recd=?, Txt_Bk_Receive_Mnth=?, Txt_Bk_Receive_Yr=?"
				+ "Is_Free_Textbook_Av_Pri=?, Is_Free_Textbook_Av_Ups=?, Is_Tle_Rec_Pri=?, Is_Tle_Rec_Ups=?, Is_Play_Mat_Av_Pri=?"
				+ "Is_Play_Mat_Av_Ups=?, Is_Play_Mat_Av_Sec=?, Is_Play_Mat_Av_Hsec=?, CreatedByUserID=?, CreatedDate=?, UpdatedByUserID=?, UpdatedDate=?)";

		return jdbcTemplate.update(TRN_SCHOOL_SPL_SMC_INFO_INSERT, trainingTleSmcInfo.getSchoolId(),
				trainingTleSmcInfo.getSessionId(), trainingTleSmcInfo.getSmcTotalMale(),
				trainingTleSmcInfo.getSmcTotalFemale(), trainingTleSmcInfo.getSmcParentsMale(),
				trainingTleSmcInfo.getSmcParentsFemale(), trainingTleSmcInfo.getLocalGovtBodyMale(),
				trainingTleSmcInfo.getLocalGovtBodyFemale(), trainingTleSmcInfo.getSmcMeetingPreviousYr(),
				trainingTleSmcInfo.getSmcSchoolDevelopmentPlan(), trainingTleSmcInfo.getSmcBankAccount(),
				trainingTleSmcInfo.getSmcBankName(), trainingTleSmcInfo.getSmcBranch(),
				trainingTleSmcInfo.getSmcBankAccount(), trainingTleSmcInfo.getSmcBankIfsc(),
				trainingTleSmcInfo.getSmcBankAccountName(), trainingTleSmcInfo.getAttendingSpecialTraining(),
				trainingTleSmcInfo.getSpecialTrainingCurrentYrBoys(),
				trainingTleSmcInfo.getSpecialTrainingCurrentYrGirls(),
				trainingTleSmcInfo.getSpecialTrainingPreviousYrBoys(),
				trainingTleSmcInfo.getSpecialTrainingPreviousYrGirls(),
				trainingTleSmcInfo.getCompleteSplTrngPreviousYrBoys(),
				trainingTleSmcInfo.getCompleteSplTrngPreviousYrGirls(), trainingTleSmcInfo.getSplTrainingConductedBy(),
				trainingTleSmcInfo.getSplTrainingConductedIn(), trainingTleSmcInfo.getTypeOfTrainingConducted(),
				trainingTleSmcInfo.getFullTextbookSetRecieved(), trainingTleSmcInfo.getTextbookRecieveMonth(),
				trainingTleSmcInfo.getTextbookRecieveYear(), trainingTleSmcInfo.getFreeBooksAvaialbleToPrimary(),
				trainingTleSmcInfo.getFreeBooksAvailableToUprimary(), trainingTleSmcInfo.getTleAvailabilityPrimary(),
				trainingTleSmcInfo.getTleAvailabilityUrimary(),
				trainingTleSmcInfo.getPlaymtrlEqpmtAvailabilityPrinary(),
				trainingTleSmcInfo.getPlaymtrlEqpmtAvailabilityUprimary(),
				trainingTleSmcInfo.getPlaymtrlEqpmtAvailabilitySecondary(),
				trainingTleSmcInfo.getPlaymtrlEqpmtAvailabilityHsecondary(), trainingTleSmcInfo.getCreatedByUserId(),
				trainingTleSmcInfo.getCreatedDate(), trainingTleSmcInfo.getUpdatedByUserID(),
				trainingTleSmcInfo.getUpdatedDate());

	}

	@Override
	public SchoolSplSmcInfo fetchTrainingTleSmcInfoBySchoolId(int SchoolID) {
		String TRN_SCHOOL_SPL_SMC_INFO_FETCH = "select * from trn_school_spl_smc_info where schoolID = ?";
		return jdbcTemplate.queryForObject(TRN_SCHOOL_SPL_SMC_INFO_FETCH, new Object[] { SchoolID },
				new SchoolSplSmcInfoMapper());
	}

	@Override
	public List<SchoolSplSmcInfo> fetchAllTrainingTleSmcInfo() {
		return jdbcTemplate.query("Select * from SchoolSplSmcInfo", new SchoolSplSmcInfoMapper());
	}

	// ===========================================END
	// SchoolSplSmcInfo======================================

	// =======================================SMDCCommitteeeInfo================================

	// Save if basic profile id is not in table otherwise update query will fire
	@Override
	public int saveOrUpdateSMDCCommittee(SMDCCommitteeInfo smdcCommitteeInfo) {
		String currentSessionId = "SELECT SessionID FROM udise_shaalakosh.mst_sessionmaster where isActive = 1 AND CURDATE() between SessionStartDate and SessionEndDate";
		int sessionId = jdbcTemplate.queryForObject(currentSessionId, Integer.class);

		String userQuery = "SELECT UserID FROM udise_shaalakosh.mst_usermaster where UserName='"
				+ smdcCommitteeInfo.getUserName() + "'";
		int userId = jdbcTemplate.queryForObject(userQuery, Integer.class);

		smdcCommitteeInfo.setUpdatedByUserID(userId);
		smdcCommitteeInfo.setCreatedByUserID(userId);

		final String SMDC_COMMITTEE_INFO_INSERT = "insert into trn_school_smdc_info(SchoolID,SessionID, "
				+ "Is_Smc_Smdc_Same, is_Smdc_Constituted, Smdc_Tot_M, Smdc_Tot_F, Smdc_Parents_M, Smdc_Parents_F,"
				+ "Smdc_Lgb_M, Smdc_Lgb_F, Smdc_Ebmc_M, Smdc_Ebmc_F, Smdc_Women_F,"
				+ "Smdc_Scst_M, Smdc_Scst_F, Smdc_Deo_M, Smdc_Deo_F, Smdc_Audit_M,"
				+ "Smdc_Audit_F, Smdc_Rmsa_F, Smdc_Rmsa_M, Smdc_Tch_M,Smdc_Tch_F,Smdc_Vp_M,Smdc_Vp_F,"
				+ "Smdc_P_M, Smdc_P_F, Smdc_Cp_M, Smdc_Cp_F,No_Smdc_Meeting,Is_Sch_Plan_Smdc,Is_Smdc_Bank_Account,"
				+ "Smdc_Bank_Name, Smdc_Bank_Branch, Smdc_Bank_Account, Smdc_Bank_Ac_Name,Smdc_Bank_Ifsc,IsSbc,IsAc,"
				+ "IsPta, No_PtaMeeting,CreatedByUserID,CreatedDate,UpdatedByUserID,UpdatedDate)"
				+ " values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?) "
				+ "ON DUPLICATE KEY UPDATE SessionID=VALUES(SessionID),Is_Smc_Smdc_Same=VALUES(Is_Smc_Smdc_Same), "
				+ "is_Smdc_Constituted=VALUES(is_Smdc_Constituted), Smdc_Tot_M=VALUES(Smdc_Tot_M), "
				+ "Smdc_Tot_F=VALUES(Smdc_Tot_F), Smdc_Parents_M=VALUES(Smdc_Parents_M), "
				+ "Smdc_Parents_F=VALUES(Smdc_Parents_F), Smdc_Lgb_M=VALUES(Smdc_Lgb_M), "
				+ "Smdc_Lgb_F=VALUES(Smdc_Lgb_F), Smdc_Ebmc_M=VALUES(Smdc_Ebmc_M), "
				+ "Smdc_Ebmc_F=VALUES(Smdc_Ebmc_F), Smdc_Women_F=VALUES(Smdc_Women_F),"
				+ " Smdc_Scst_M=VALUES(Smdc_Scst_M),Smdc_Scst_F=VALUES(Smdc_Scst_F), "
				+ " Smdc_Deo_M=VALUES(Smdc_Deo_M), Smdc_Deo_F=VALUES(Smdc_Deo_F),"
				+ "Smdc_Audit_M=VALUES(Smdc_Audit_M), Smdc_Audit_F=VALUES(Smdc_Audit_F), "
				+ "Smdc_Rmsa_F=VALUES(Smdc_Rmsa_F), Smdc_Rmsa_M=VALUES(Smdc_Rmsa_M), "
				+ "Smdc_Tch_M=VALUES(Smdc_Tch_M), Smdc_Tch_F=VALUES(Smdc_Tch_F), "
				+ "Smdc_Vp_M=VALUES(Smdc_Vp_M), Smdc_Vp_F=VALUES(Smdc_Vp_F), "
				+ "Smdc_P_M=VALUES(Smdc_P_M), Smdc_P_F=VALUES(Smdc_P_F), "
				+ "Smdc_Cp_M=VALUES(Smdc_Cp_M), Smdc_Cp_F=VALUES(Smdc_Cp_F), "
				+ "No_Smdc_Meeting=VALUES(No_Smdc_Meeting), Is_Sch_Plan_Smdc=VALUES(Is_Sch_Plan_Smdc), "
				+ "Is_Smdc_Bank_Account=VALUES(Is_Smdc_Bank_Account), Smdc_Bank_Name=VALUES(Smdc_Bank_Name), "
				+ "Smdc_Bank_Branch=VALUES(Smdc_Bank_Branch), Smdc_Bank_Account=VALUES(Smdc_Bank_Account), "
				+ "Smdc_Bank_Ac_Name=VALUES(Smdc_Bank_Ac_Name), Smdc_Bank_Ifsc=VALUES(Smdc_Bank_Ifsc), "
				+ "IsSbc=VALUES(IsSbc), IsAc=VALUES(IsAc), "
				+ "IsPta=VALUES(IsPta), No_PtaMeeting=VALUES(No_PtaMeeting), "
				+ "UpdatedByUserID=VALUES(UpdatedByUserID), UpdatedDate=VALUES(UpdatedDate) ";

		return jdbcTemplate.update(SMDC_COMMITTEE_INFO_INSERT, smdcCommitteeInfo.getSchoolId(), sessionId,
				smdcCommitteeInfo.getIsSmcSmdcSame(), smdcCommitteeInfo.getIsSmdcConstitued(),
				smdcCommitteeInfo.getTotalMemberMale(), smdcCommitteeInfo.getTotalMemberFemale(),
				smdcCommitteeInfo.getParentMale(), smdcCommitteeInfo.getParentFemale(), smdcCommitteeInfo.getLgbMale(),
				smdcCommitteeInfo.getLgbFemale(), smdcCommitteeInfo.getEbmcMale(), smdcCommitteeInfo.getEbmcFemale(),
				smdcCommitteeInfo.getWomenFemale(), smdcCommitteeInfo.getScstMale(), smdcCommitteeInfo.getScstFemale(),
				smdcCommitteeInfo.getDeoMale(), smdcCommitteeInfo.getDeoFemale(), smdcCommitteeInfo.getAuditMale(),
				smdcCommitteeInfo.getAuditFemale(), smdcCommitteeInfo.getRmsaFemale(), smdcCommitteeInfo.getRmsaMale(),
				smdcCommitteeInfo.getTeacherMale(), smdcCommitteeInfo.getTeacherFemale(), smdcCommitteeInfo.getVpMale(),
				smdcCommitteeInfo.getVpFemale(), smdcCommitteeInfo.getParentMale(), smdcCommitteeInfo.getParentFemale(),
				smdcCommitteeInfo.getChairPersonMale(), smdcCommitteeInfo.getChairPersonFemale(),
				smdcCommitteeInfo.getNoSmdcMeeting(), smdcCommitteeInfo.getIsSchoolImprovePlanSmdc(),
				smdcCommitteeInfo.getIsSmdcBankAccout(), smdcCommitteeInfo.getSmdcBankName(),
				smdcCommitteeInfo.getSmdcBankBranch(), smdcCommitteeInfo.getSmdcBankAccountNo(),
				smdcCommitteeInfo.getSmdcBankAccountName(), smdcCommitteeInfo.getSmdcBankIFSCCode(),
				smdcCommitteeInfo.getIsSchoolBuildingCommittee(), smdcCommitteeInfo.getIsSchoolAcademicCommittee(),
				smdcCommitteeInfo.getIsParentTeacherAssociation(), smdcCommitteeInfo.getNoOfPTAMeeting(),
				smdcCommitteeInfo.getCreatedByUserID(), smdcCommitteeInfo.getCreatedDate(),
				smdcCommitteeInfo.getUpdatedByUserID(), smdcCommitteeInfo.getUpdatedDate());
	}

	@Override
	public SMDCCommitteeInfo fetchSMDCCommitteeInfoBySchoolId(int schoolId) {
		String BASIC_SCHOOL_PROFILE_INFO_FETCH = "select * from trn_school_smdc_info where SchoolID = ?";
		return jdbcTemplate.queryForObject(BASIC_SCHOOL_PROFILE_INFO_FETCH, new Object[] { schoolId },
				new SMDCCommitteeInfoMapper());
	}

	@Override
	public List<SMDCCommitteeInfo> fetchAllSMDCCommitteeInfo() {
		return jdbcTemplate.query("Select * from trn_school_smdc_info", new SMDCCommitteeInfoMapper());
	}
	// ===================END SMDC CommitteeeInfo================================

}
