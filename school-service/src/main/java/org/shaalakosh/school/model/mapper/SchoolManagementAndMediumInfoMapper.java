package org.shaalakosh.school.model.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.shaalakosh.school.model.SchoolManagementAndMediumInfo;
import org.springframework.jdbc.core.RowMapper;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class SchoolManagementAndMediumInfoMapper implements RowMapper<SchoolManagementAndMediumInfo> {

	@Override
	public SchoolManagementAndMediumInfo mapRow(ResultSet resultSet, int arg1) throws SQLException {
				
		SchoolManagementAndMediumInfo schoolManagementAndMediumInfo = new SchoolManagementAndMediumInfo();
		schoolManagementAndMediumInfo.setSessionId(resultSet.getInt("SessionID"));
		schoolManagementAndMediumInfo.setSchoolId(resultSet.getInt("SchoolID"));
		
		schoolManagementAndMediumInfo.setSchoolDistancePS(resultSet.getString("SchoolDistance_PS"));
		schoolManagementAndMediumInfo.setSchoolDistanceUPS(resultSet.getString("SchoolDistance_UPS"));
		schoolManagementAndMediumInfo.setSchoolDistanceSS(resultSet.getString("SchoolDistance_SS"));
		schoolManagementAndMediumInfo.setSchoolDistanceHSS(resultSet.getString("SchoolDistance_HSS"));
		schoolManagementAndMediumInfo.setSchoolApproachableByWeatherroads(resultSet.getString("Is_Sch_approach_road"));
		
		
		schoolManagementAndMediumInfo.setTaughtMotherTonguePrimary(resultSet.getString("Taught_Mother_ToungePrimary"));
		schoolManagementAndMediumInfo.setMediumInstruction1(resultSet.getString("Medium_Instruction_1"));
		schoolManagementAndMediumInfo.setOtherLanguages1(resultSet.getString("Medium_Instruction_1_Other"));
		schoolManagementAndMediumInfo.setLangTaughtPrimary1(resultSet.getString("Lang_Taught_Primary_1"));
		schoolManagementAndMediumInfo.setPreVocCourseOffered(resultSet.getString("Pre_Voc_Course_Offered"));
		schoolManagementAndMediumInfo.setEduVocGuideOffered(resultSet.getString("Edu_Voc_Guide_Offered"));
		
		
		schoolManagementAndMediumInfo.setEleAffBoardID(resultSet.getString("Ele_AffiliationBoardID"));
		schoolManagementAndMediumInfo.setEleAffBoardNum(resultSet.getString("Ele_AffiliationBoard_No"));
		schoolManagementAndMediumInfo.setEleAffBoardOther(resultSet.getString("Ele_AffiliationBoard_Other"));
		schoolManagementAndMediumInfo.setSecAffBoardID(resultSet.getString("Sec_AffiliationBoardID"));
		schoolManagementAndMediumInfo.setSecAffBoardNum(resultSet.getString("Sec_AffiliationBoard_No"));
		schoolManagementAndMediumInfo.setSecAffBoardOther(resultSet.getString("Sec_AffiliationBoard_Other"));
		schoolManagementAndMediumInfo.setHsecAffBoardID(resultSet.getString("HSec_AffiliationBoardID"));
		schoolManagementAndMediumInfo.setHsecAffBoardNum(resultSet.getString("HSec_AffiliationBoard_No"));
		schoolManagementAndMediumInfo.setHsecAffBoardOther(resultSet.getString("HSec_AffiliationBoard_Other"));
				
		schoolManagementAndMediumInfo.setVisitForAcedmicInspections(resultSet.getString("No_Inspect_Previous_Yr"));
		schoolManagementAndMediumInfo.setVisitsByCRCCoordinator(resultSet.getString("No_Visit_Crc_Previous_Yr"));
		schoolManagementAndMediumInfo.setVisitsByBRCBEO(resultSet.getString("No_Visit_Blo_Previous_Yr"));				
		
		return schoolManagementAndMediumInfo;
	}

}
