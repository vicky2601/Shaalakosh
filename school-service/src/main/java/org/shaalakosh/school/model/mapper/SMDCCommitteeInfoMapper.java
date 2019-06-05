package org.shaalakosh.school.model.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.shaalakosh.school.model.SMDCCommitteeInfo;
import org.springframework.jdbc.core.RowMapper;

public class SMDCCommitteeInfoMapper implements RowMapper<SMDCCommitteeInfo> {

	@Override
	public SMDCCommitteeInfo mapRow(ResultSet resultSet, int arg1) throws SQLException {
				
		SMDCCommitteeInfo smdcCommitteeInfo = new SMDCCommitteeInfo();
		
		smdcCommitteeInfo.setSchoolId(resultSet.getInt("SchoolID"));
		smdcCommitteeInfo.setSessionId(resultSet.getInt("SessionID"));
		smdcCommitteeInfo.setIsSmcSmdcSame(resultSet.getInt("Is_Smc_Smdc_Same"));
		smdcCommitteeInfo.setIsSmdcConstitued(resultSet.getInt("is_Smdc_Constituted"));
		smdcCommitteeInfo.setTotalMemberMale(resultSet.getInt("Smdc_Tot_M"));
		smdcCommitteeInfo.setTotalMemberFemale(resultSet.getInt("Smdc_Tot_F"));
		smdcCommitteeInfo.setParentMale(resultSet.getInt("Smdc_Parents_M"));			
		smdcCommitteeInfo.setParentFemale(resultSet.getInt("Smdc_Parents_F"));
		smdcCommitteeInfo.setLgbMale(resultSet.getInt("Smdc_Lgb_M"));
		smdcCommitteeInfo.setLgbFemale(resultSet.getInt("Smdc_Lgb_F"));
		smdcCommitteeInfo.setEbmcMale(resultSet.getInt("Smdc_Ebmc_M"));
		smdcCommitteeInfo.setEbmcFemale(resultSet.getInt("Smdc_Ebmc_F"));
		smdcCommitteeInfo.setWomenFemale(resultSet.getInt("Smdc_Women_F"));			
		smdcCommitteeInfo.setScstMale(resultSet.getInt("Smdc_Scst_M"));
		smdcCommitteeInfo.setScstFemale(resultSet.getInt("Smdc_Scst_F"));
		smdcCommitteeInfo.setDeoMale(resultSet.getInt("Smdc_Deo_M"));
		smdcCommitteeInfo.setDeoFemale(resultSet.getInt("Smdc_Deo_F"));
		smdcCommitteeInfo.setAuditMale(resultSet.getInt("Smdc_Audit_M"));
		smdcCommitteeInfo.setAuditFemale(resultSet.getInt("Smdc_Audit_F"));		
		smdcCommitteeInfo.setRmsaFemale(resultSet.getInt("Smdc_Rmsa_F"));
		smdcCommitteeInfo.setRmsaMale(resultSet.getInt("Smdc_Rmsa_M"));
		smdcCommitteeInfo.setTeacherMale(resultSet.getInt("Smdc_Tch_M"));
		smdcCommitteeInfo.setTeacherFemale(resultSet.getInt("Smdc_Tch_F"));
		smdcCommitteeInfo.setVpMale(resultSet.getInt("Smdc_Vp_M"));
		smdcCommitteeInfo.setVpFemale(resultSet.getInt("Smdc_Vp_F"));
		smdcCommitteeInfo.setPrincipalMale(resultSet.getInt("Smdc_P_M"));
		smdcCommitteeInfo.setPrincipaleFemale(resultSet.getInt("Smdc_P_F"));
		smdcCommitteeInfo.setChairPersonMale(resultSet.getInt("Smdc_Cp_M"));
		smdcCommitteeInfo.setChairPersonFemale(resultSet.getInt("Smdc_Cp_F"));
		smdcCommitteeInfo.setNoSmdcMeeting(resultSet.getInt("No_Smdc_Meeting"));
		smdcCommitteeInfo.setIsSchoolImprovePlanSmdc(resultSet.getInt("Is_Sch_Plan_Smdc"));
		smdcCommitteeInfo.setIsSmdcBankAccout(resultSet.getInt("Is_Smdc_Bank_Account"));
		smdcCommitteeInfo.setSmdcBankName(resultSet.getString("Smdc_Bank_Name"));
		smdcCommitteeInfo.setSmdcBankBranch(resultSet.getString("Smdc_Bank_Branch"));
		smdcCommitteeInfo.setSmdcBankAccountNo(resultSet.getInt("Smdc_Bank_Account"));
		smdcCommitteeInfo.setSmdcBankAccountName(resultSet.getString("Smdc_Bank_Ac_Name"));
		smdcCommitteeInfo.setSmdcBankIFSCCode(resultSet.getString("Smdc_Bank_Ifsc"));
		smdcCommitteeInfo.setIsSchoolBuildingCommittee(resultSet.getInt("IsSbc"));
		smdcCommitteeInfo.setIsSchoolAcademicCommittee(resultSet.getInt("IsAc"));
		smdcCommitteeInfo.setIsParentTeacherAssociation(resultSet.getInt("IsPta"));
		smdcCommitteeInfo.setNoOfPTAMeeting(resultSet.getInt("No_PtaMeeting"));
			
		return smdcCommitteeInfo;
	}

}
