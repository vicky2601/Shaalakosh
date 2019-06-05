package org.shaalakosh.school.utility;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FilenameUtils;
import org.shaalakosh.school.bean.BasicSchoolProfileInfoBean;
import org.shaalakosh.school.bean.LocationAndEstablishmentInfoBean;
import org.shaalakosh.school.bean.SMDCCommitteeInfoBean;
import org.shaalakosh.school.bean.SchoolManagementAndMediumInfoBean;
import org.shaalakosh.school.bean.SchoolSplSmcInfoBean;
import org.shaalakosh.school.constants.StatusMaster;
import org.shaalakosh.school.model.BasicSchoolProfileInfo;
import org.shaalakosh.school.model.LocationAndEstablishmentInfo;
import org.shaalakosh.school.model.SMDCCommitteeInfo;
import org.shaalakosh.school.model.SchoolManagementAndMediumInfo;
import org.shaalakosh.school.model.SchoolSplSmcInfo;
import org.shaalakosh.school.pojo.CustomReponseStatus;
import org.springframework.web.multipart.MultipartFile;

public class SchoolProfileUtility {

	public static BasicSchoolProfileInfo convertBasicTeacherModelToBean(
			BasicSchoolProfileInfoBean basicSchoolProfileInfoBean) {
		BasicSchoolProfileInfo basicSchoolProfileInfo = new BasicSchoolProfileInfo();

		if (!basicSchoolProfileInfoBean.getSchoolId().isEmpty()) {
			basicSchoolProfileInfo.setSchoolId(Integer.parseInt(basicSchoolProfileInfoBean.getSchoolId()));
		}
		basicSchoolProfileInfo.setUdiseSchoolCode(basicSchoolProfileInfoBean.getUdiseSchoolCode());
		basicSchoolProfileInfo.setStateId(Integer.parseInt(basicSchoolProfileInfoBean.getStateId()));
		basicSchoolProfileInfo.setDistrictId(Integer.parseInt(basicSchoolProfileInfoBean.getDistrictId()));
		basicSchoolProfileInfo.setBlockId(Integer.parseInt(basicSchoolProfileInfoBean.getBlockId()));
		basicSchoolProfileInfo.setSchoolName(basicSchoolProfileInfoBean.getSchoolName());
		basicSchoolProfileInfo.setSchoolAddress(basicSchoolProfileInfoBean.getSchoolAddress());
		basicSchoolProfileInfo.setPincode(Integer.parseInt(basicSchoolProfileInfoBean.getPincode()));
		basicSchoolProfileInfo
				.setBlockResourcentreId(Integer.parseInt(basicSchoolProfileInfoBean.getBlockResourcentreId()));
		basicSchoolProfileInfo
				.setClusterResourceCentreId(Integer.parseInt(basicSchoolProfileInfoBean.getClusterResourceCentreId()));
		basicSchoolProfileInfo
				.setSchoolCategoryCodeId(Integer.parseInt(basicSchoolProfileInfoBean.getSchoolCategoryCodeId()));
		basicSchoolProfileInfo.setLowestClassId(Integer.parseInt(basicSchoolProfileInfoBean.getLowestClass()));
		basicSchoolProfileInfo.setHighestClassId(Integer.parseInt(basicSchoolProfileInfoBean.getHighestClass()));
		basicSchoolProfileInfo.setSchoolTypeId(Integer.parseInt(basicSchoolProfileInfoBean.getSchoolTypeId()));
		basicSchoolProfileInfo
				.setManagementOfTheSchoolId(Integer.parseInt(basicSchoolProfileInfoBean.getManagementOfTheSchoolId()));
		basicSchoolProfileInfo.setMonthOfAcademicYearStart(basicSchoolProfileInfoBean.getMonthOfAcademicYearStart());
		basicSchoolProfileInfo.setIsThisAResidentialSchool(
				Integer.parseInt(basicSchoolProfileInfoBean.getIsThisAResidentialSchool()));
		basicSchoolProfileInfo.setTypeOfResidentialSchoolId(
				Integer.parseInt(basicSchoolProfileInfoBean.getTypeOfResidentialSchoolId()));
		basicSchoolProfileInfo.setIsThisAMinorityManagedSchool(
				Integer.parseInt(basicSchoolProfileInfoBean.getIsThisAMinorityManagedSchool()));
		basicSchoolProfileInfo
				.setTypeOfSchoolCommunityId(Integer.parseInt(basicSchoolProfileInfoBean.getTypeOfSchoolCommunityId()));
		basicSchoolProfileInfo.setIsThisASpecialSchoolForCWSN(
				Integer.parseInt(basicSchoolProfileInfoBean.getIsThisASpecialSchoolForCWSN()));
		basicSchoolProfileInfo
				.setIsThisAShiftschool(Integer.parseInt(basicSchoolProfileInfoBean.getIsThisAShiftschool()));
		basicSchoolProfileInfo.setCreateBy(Integer.parseInt(basicSchoolProfileInfoBean.getCreateBy()));
		basicSchoolProfileInfo.setUpdatedBy(Integer.parseInt(basicSchoolProfileInfoBean.getUpdatedBy()));
		basicSchoolProfileInfo.setCreateDateTime(CommonUtility.getCurrentDateTime());
		basicSchoolProfileInfo.setUpdatedDateTime(CommonUtility.getCurrentDateTime());

		/*
		 * basicSchoolProfileInfo.setSchoolCode(basicSchoolProfileInfoBean.getSchoolCode
		 * ()); basicSchoolProfileInfo.setSessionID(Integer.parseInt(
		 * basicSchoolProfileInfoBean.getSessionID()));
		 * basicSchoolProfileInfo.setClusterID(Integer.parseInt(
		 * basicSchoolProfileInfoBean.getClusterID()));
		 * basicSchoolProfileInfo.setClusterCode(basicSchoolProfileInfoBean.
		 * getClusterCode());
		 * basicSchoolProfileInfo.setUdiseClusterCode(basicSchoolProfileInfoBean.
		 * getUdiseClusterCode());
		 * basicSchoolProfileInfo.setBlockCode(basicSchoolProfileInfoBean.getBlockCode()
		 * ); basicSchoolProfileInfo.setUdiseBlockCode(basicSchoolProfileInfoBean.
		 * getUdiseBlockCode());
		 * basicSchoolProfileInfo.setDistrictCode(basicSchoolProfileInfoBean.
		 * getDistrictCode());
		 * basicSchoolProfileInfo.setUdiseDistrictCode(basicSchoolProfileInfoBean.
		 * getUdiseDistrictCode());
		 * basicSchoolProfileInfo.setStateCode(basicSchoolProfileInfoBean.getStateCode()
		 * ); basicSchoolProfileInfo.setUdiseStateCode(basicSchoolProfileInfoBean.
		 * getUdiseStateCode());
		 * basicSchoolProfileInfo.setMergedSchoolID(Integer.parseInt(
		 * basicSchoolProfileInfoBean.getMergedSchoolID()));
		 * basicSchoolProfileInfo.setMergedSchoolCode(basicSchoolProfileInfoBean.
		 * getMergedSchoolCode());
		 * basicSchoolProfileInfo.setMergedClosedYear(Integer.parseInt(
		 * basicSchoolProfileInfoBean.getMergedClosedYear()));
		 * basicSchoolProfileInfo.setMergedSessionID(Integer.parseInt(
		 * basicSchoolProfileInfoBean.getMergedSessionID()));
		 * basicSchoolProfileInfo.setMergedSessionCode(basicSchoolProfileInfoBean.
		 * getMergedSessionCode());
		 * basicSchoolProfileInfo.setMergedRemarks(basicSchoolProfileInfoBean.
		 * getMergedRemarks()); basicSchoolProfileInfo
		 * .setLgd_District_Code(Integer.parseInt(basicSchoolProfileInfoBean.
		 * getLgd_District_Code())); basicSchoolProfileInfo
		 * .setLgd_SubDistrict_Code(Integer.parseInt(basicSchoolProfileInfoBean.
		 * getLgd_SubDistrict_Code()));
		 * basicSchoolProfileInfo.setLgd_Ward_Code(Integer.parseInt(
		 * basicSchoolProfileInfoBean.getLgd_Ward_Code())); basicSchoolProfileInfo
		 * .setLgd_LocalBody_Code(Integer.parseInt(basicSchoolProfileInfoBean.
		 * getLgd_LocalBody_Code())); basicSchoolProfileInfo
		 * .setRev_District_Code(Integer.parseInt(basicSchoolProfileInfoBean.
		 * getRev_District_Code())); basicSchoolProfileInfo
		 * .setRev_SubDistrict_Code(Integer.parseInt(basicSchoolProfileInfoBean.
		 * getRev_SubDistrict_Code()));
		 * basicSchoolProfileInfo.setRev_Block_Code(Integer.parseInt(
		 * basicSchoolProfileInfoBean.getRev_Block_Code()));
		 * basicSchoolProfileInfo.setRev_Village_Code(Integer.parseInt(
		 * basicSchoolProfileInfoBean.getRev_Village_Code()));
		 * basicSchoolProfileInfo.setStatus(basicSchoolProfileInfoBean.getStatus());
		 */
		return basicSchoolProfileInfo;
	}

	public static LocationAndEstablishmentInfo convertLocationEntityModelToBean(
			LocationAndEstablishmentInfoBean locationAndEstablishmentInfoBean) {
		LocationAndEstablishmentInfo locationAndEstablishmentInfo = new LocationAndEstablishmentInfo();

		if (CommonValidation.isIntegerInput(locationAndEstablishmentInfoBean.getLocationAndEstablishmentId())) {
			locationAndEstablishmentInfo.setLocationAndEstablishmentId(
					Integer.parseInt(locationAndEstablishmentInfoBean.getLocationAndEstablishmentId()));
		}

		locationAndEstablishmentInfo
				.setBasicSchoolProfileId(Integer.parseInt(locationAndEstablishmentInfoBean.getBasicSchoolProfileId()));
		locationAndEstablishmentInfo.setLongitude(Double.parseDouble(locationAndEstablishmentInfoBean.getLattitude()));
		locationAndEstablishmentInfo.setLattitude(Double.parseDouble(locationAndEstablishmentInfoBean.getLattitude()));
		locationAndEstablishmentInfo
				.setNameOfTheABMT(Integer.parseInt(locationAndEstablishmentInfoBean.getNameOfTheABMT()));
		locationAndEstablishmentInfo
				.setSchoolLocationId(Integer.parseInt(locationAndEstablishmentInfoBean.getSchoolLocationId()));
		locationAndEstablishmentInfo
				.setVillageName(Integer.parseInt(locationAndEstablishmentInfoBean.getVillageName()));
		locationAndEstablishmentInfo
				.setGramPanchayat(Integer.parseInt(locationAndEstablishmentInfoBean.getGramPanchayatj()));
		locationAndEstablishmentInfo.setHabitation(locationAndEstablishmentInfoBean.getHabitation());
		locationAndEstablishmentInfo
				.setMunicipalityName(Integer.parseInt(locationAndEstablishmentInfoBean.getMunicipalityName()));
		locationAndEstablishmentInfo.setWardNumber(Integer.parseInt(locationAndEstablishmentInfoBean.getWardNumber()));
		locationAndEstablishmentInfo.setMohalla(locationAndEstablishmentInfoBean.getMohalla());
		locationAndEstablishmentInfo
				.setAssemblyConstName(Integer.parseInt(locationAndEstablishmentInfoBean.getAssemblyConstName()));
		locationAndEstablishmentInfo.setParliamentryConstName(
				Integer.parseInt(locationAndEstablishmentInfoBean.getParliamentryConstName()));
		locationAndEstablishmentInfo.setCityName(locationAndEstablishmentInfoBean.getCityName());
		locationAndEstablishmentInfo
				.setRespondantName(Integer.parseInt(locationAndEstablishmentInfoBean.getRespondantName()));
		locationAndEstablishmentInfo.setStdCode(Integer.parseInt(locationAndEstablishmentInfoBean.getStdCode()));
		locationAndEstablishmentInfo
				.setSchoolTelephone1(Integer.parseInt(locationAndEstablishmentInfoBean.getSchoolTelephone1()));
		locationAndEstablishmentInfo.setRespMobile(Integer.parseInt(locationAndEstablishmentInfoBean.getRespMobile()));
		locationAndEstablishmentInfo
				.setSchoolStdCode(Integer.parseInt(locationAndEstablishmentInfoBean.getSchoolStdCode()));
		locationAndEstablishmentInfo
				.setSchoolTelephone2(Integer.parseInt(locationAndEstablishmentInfoBean.getSchoolTelephone2()));
		locationAndEstablishmentInfo.setSchoolWebsite(locationAndEstablishmentInfoBean.getSchoolWebsite());
		locationAndEstablishmentInfo.setSchool_email(locationAndEstablishmentInfoBean.getSchool_email());
		locationAndEstablishmentInfo.setSchoolEstablishmentYear(
				Integer.parseInt(locationAndEstablishmentInfoBean.getSchoolEstablishmentYear()));
		locationAndEstablishmentInfo
				.setEleRecognitionYear(Integer.parseInt(locationAndEstablishmentInfoBean.getEleRecognitionYear()));
		locationAndEstablishmentInfo
				.setSecEstablishmentYear(Integer.parseInt(locationAndEstablishmentInfoBean.getSecEstablishmentYear()));
		locationAndEstablishmentInfo
				.setHrSecRecognitionYear(Integer.parseInt(locationAndEstablishmentInfoBean.getHrSecRecognitionYear()));
		locationAndEstablishmentInfo
				.setUpgradeUpYear(Integer.parseInt(locationAndEstablishmentInfoBean.getUpgradeUpYear()));
		locationAndEstablishmentInfo
				.setUpgradeSecYear(Integer.parseInt(locationAndEstablishmentInfoBean.getUpgradeSecYear()));
		locationAndEstablishmentInfo
				.setUpgradeHRSecYear(Integer.parseInt(locationAndEstablishmentInfoBean.getUpgradeHRSecYear()));
		return locationAndEstablishmentInfo;
	}

	public static SchoolManagementAndMediumInfo convertBeanToSchoolManagementAndMediumModel(
			SchoolManagementAndMediumInfoBean schoolManagementAndMediumInfoBean) {

		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		SchoolManagementAndMediumInfo schoolManagementAndMediumInfo = new SchoolManagementAndMediumInfo();
		/*
		 * if (!schoolManagementAndMediumInfoBean.getSchoolManagementId().isEmpty()) {
		 * schoolManagementAndMediumInfo
		 * .setSchoolManagementId(Integer.parseInt(schoolManagementAndMediumInfoBean.
		 * getSchoolManagementId())); }
		 */
		System.out.println(schoolManagementAndMediumInfoBean);
		schoolManagementAndMediumInfo.setSchoolId(Integer.parseInt(schoolManagementAndMediumInfoBean.getSchoolId()));

		schoolManagementAndMediumInfo.setSchoolDistancePS(schoolManagementAndMediumInfoBean.getSchoolDistancePS());
		schoolManagementAndMediumInfo.setSchoolDistanceUPS(schoolManagementAndMediumInfoBean.getSchoolDistanceUPS());
		schoolManagementAndMediumInfo.setSchoolDistanceSS(schoolManagementAndMediumInfoBean.getSchoolDistanceSS());
		schoolManagementAndMediumInfo.setSchoolDistanceHSS(schoolManagementAndMediumInfoBean.getSchoolDistanceHSS());
		schoolManagementAndMediumInfo.setSchoolApproachableByWeatherroads(
				schoolManagementAndMediumInfoBean.getSchoolApproachableByWeatherroads());

		schoolManagementAndMediumInfo
				.setTaughtMotherTonguePrimary(schoolManagementAndMediumInfoBean.getTaughtMotherTonguePrimary());
		schoolManagementAndMediumInfo.setMediumInstruction1(schoolManagementAndMediumInfoBean.getMediumInstruction1());
		schoolManagementAndMediumInfo.setOtherLanguages1(schoolManagementAndMediumInfoBean.getOtherLanguages1());
		schoolManagementAndMediumInfo.setMediumInstruction2(schoolManagementAndMediumInfoBean.getMediumInstruction2());
		schoolManagementAndMediumInfo.setOtherLanguages2(schoolManagementAndMediumInfoBean.getOtherLanguages2());
		schoolManagementAndMediumInfo.setMediumInstruction3(schoolManagementAndMediumInfoBean.getMediumInstruction3());
		schoolManagementAndMediumInfo.setOtherLanguages3(schoolManagementAndMediumInfoBean.getOtherLanguages3());
		schoolManagementAndMediumInfo.setMediumInstruction4(schoolManagementAndMediumInfoBean.getMediumInstruction4());
		schoolManagementAndMediumInfo.setOtherLanguages4(schoolManagementAndMediumInfoBean.getOtherLanguages4());
		schoolManagementAndMediumInfo.setLangTaughtPrimary1(schoolManagementAndMediumInfoBean.getLangTaughtPrimary1());
		schoolManagementAndMediumInfo.setLangTaughtPrimary2(schoolManagementAndMediumInfoBean.getLangTaughtPrimary2());
		schoolManagementAndMediumInfo.setLangTaughtPrimary3(schoolManagementAndMediumInfoBean.getLangTaughtPrimary3());
		schoolManagementAndMediumInfo
				.setPreVocCourseOffered(schoolManagementAndMediumInfoBean.getPreVocCourseOffered());
		schoolManagementAndMediumInfo.setEduVocGuideOffered(schoolManagementAndMediumInfoBean.getEduVocGuideOffered());

		schoolManagementAndMediumInfo.setEleAffBoardID(schoolManagementAndMediumInfoBean.getEleAffBoardID());
		schoolManagementAndMediumInfo.setEleAffBoardNum(schoolManagementAndMediumInfoBean.getEleAffBoardNum());
		schoolManagementAndMediumInfo.setEleAffBoardOther(schoolManagementAndMediumInfoBean.getEleAffBoardOther());
		schoolManagementAndMediumInfo.setSecAffBoardID(schoolManagementAndMediumInfoBean.getSecAffBoardID());
		schoolManagementAndMediumInfo.setSecAffBoardNum(schoolManagementAndMediumInfoBean.getSecAffBoardNum());
		schoolManagementAndMediumInfo.setSecAffBoardOther(schoolManagementAndMediumInfoBean.getSecAffBoardOther());
		schoolManagementAndMediumInfo.setHsecAffBoardID(schoolManagementAndMediumInfoBean.getHsecAffBoardID());
		schoolManagementAndMediumInfo.setHsecAffBoardNum(schoolManagementAndMediumInfoBean.getHsecAffBoardNum());
		schoolManagementAndMediumInfo.setHsecAffBoardOther(schoolManagementAndMediumInfoBean.getHsecAffBoardOther());
		schoolManagementAndMediumInfo
				.setVisitForAcedmicInspections(schoolManagementAndMediumInfoBean.getVisitForAcedmicInspections());
		schoolManagementAndMediumInfo
				.setVisitsByCRCCoordinator(schoolManagementAndMediumInfoBean.getVisitsByCRCCoordinator());
		schoolManagementAndMediumInfo.setVisitsByBRCBEO(schoolManagementAndMediumInfoBean.getVisitsByBRCBEO());

		schoolManagementAndMediumInfo.setCreatedByUserID(1);
		schoolManagementAndMediumInfo.setCreatedDate(df.format(new Date()));
		schoolManagementAndMediumInfo.setUpdatedByUserID(1);
		schoolManagementAndMediumInfo.setUpdatedDate(df.format(new Date()));
		schoolManagementAndMediumInfo.setUserName(schoolManagementAndMediumInfoBean.getCreatedByUserID());

		return schoolManagementAndMediumInfo;
	}

	public static SMDCCommitteeInfo convertSMDCCommitteeInfoBeanToSMDCCommitteeInfoEntity(
			SMDCCommitteeInfoBean smdcCommitteeInfoBean) {

		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		SMDCCommitteeInfo smdcCommitteeInfo = new SMDCCommitteeInfo();
		/*
		 * if (!smdcCommitteeInfoBean.getSmdcId().isEmpty()) {
		 * smdcCommitteeInfo.setSmdcId(Integer.parseInt(smdcCommitteeInfoBean.getSmdcId(
		 * ))); }
		 */
		smdcCommitteeInfo.setSchoolId(Integer.parseInt(smdcCommitteeInfoBean.getSchoolId()));
		// smdcCommitteeInfo.setSessionId(Integer.parseInt(smdcCommitteeInfoBean.getSessionId()));
		smdcCommitteeInfo.setIsSmcSmdcSame(Integer.parseInt(smdcCommitteeInfoBean.getIsSmcSmdcSame()));
		smdcCommitteeInfo.setIsSmdcConstitued(Integer.parseInt(smdcCommitteeInfoBean.getIsSmdcConstitued()));
		smdcCommitteeInfo.setTotalMemberMale(Integer.parseInt(smdcCommitteeInfoBean.getTotalMemberMale()));
		smdcCommitteeInfo.setTotalMemberFemale(Integer.parseInt(smdcCommitteeInfoBean.getTotalMemberFemale()));
		smdcCommitteeInfo.setParentMale(Integer.parseInt(smdcCommitteeInfoBean.getParentMale()));
		smdcCommitteeInfo.setParentFemale(Integer.parseInt(smdcCommitteeInfoBean.getParentFemale()));
		smdcCommitteeInfo.setLgbMale(Integer.parseInt(smdcCommitteeInfoBean.getLgbMale()));
		smdcCommitteeInfo.setLgbFemale(Integer.parseInt(smdcCommitteeInfoBean.getLgbFemale()));
		smdcCommitteeInfo.setEbmcMale(Integer.parseInt(smdcCommitteeInfoBean.getEbmcMale()));
		smdcCommitteeInfo.setEbmcFemale(Integer.parseInt(smdcCommitteeInfoBean.getEbmcFemale()));
		smdcCommitteeInfo.setWomenFemale(Integer.parseInt(smdcCommitteeInfoBean.getWomenFemale()));
		smdcCommitteeInfo.setScstMale(Integer.parseInt(smdcCommitteeInfoBean.getScstMale()));
		smdcCommitteeInfo.setScstFemale(Integer.parseInt(smdcCommitteeInfoBean.getScstFemale()));
		smdcCommitteeInfo.setDeoMale(Integer.parseInt(smdcCommitteeInfoBean.getDeoMale()));
		smdcCommitteeInfo.setDeoFemale(Integer.parseInt(smdcCommitteeInfoBean.getDeoFemale()));
		smdcCommitteeInfo.setAuditMale(Integer.parseInt(smdcCommitteeInfoBean.getAuditMale()));
		smdcCommitteeInfo.setAuditFemale(Integer.parseInt(smdcCommitteeInfoBean.getAuditFemale()));
		smdcCommitteeInfo.setRmsaFemale(Integer.parseInt(smdcCommitteeInfoBean.getRmsaFemale()));
		smdcCommitteeInfo.setRmsaMale(Integer.parseInt(smdcCommitteeInfoBean.getRmsaMale()));
		smdcCommitteeInfo.setTeacherMale(Integer.parseInt(smdcCommitteeInfoBean.getTeacherMale()));
		smdcCommitteeInfo.setTeacherFemale(Integer.parseInt(smdcCommitteeInfoBean.getTeacherFemale()));
		smdcCommitteeInfo.setVpMale(Integer.parseInt(smdcCommitteeInfoBean.getVpMale()));
		smdcCommitteeInfo.setVpFemale(Integer.parseInt(smdcCommitteeInfoBean.getVpFemale()));
		smdcCommitteeInfo.setPrincipalMale(Integer.parseInt(smdcCommitteeInfoBean.getPrincipalMale()));
		smdcCommitteeInfo.setPrincipaleFemale(Integer.parseInt(smdcCommitteeInfoBean.getPrincipaleFemale()));
		smdcCommitteeInfo.setChairPersonMale(Integer.parseInt(smdcCommitteeInfoBean.getChairPersonMale()));
		smdcCommitteeInfo.setChairPersonFemale(Integer.parseInt(smdcCommitteeInfoBean.getChairPersonFemale()));
		smdcCommitteeInfo.setNoSmdcMeeting(Integer.parseInt(smdcCommitteeInfoBean.getNoSmdcMeeting()));
		smdcCommitteeInfo
				.setIsSchoolImprovePlanSmdc(Integer.parseInt(smdcCommitteeInfoBean.getIsSchoolImprovePlanSmdc()));
		smdcCommitteeInfo.setIsSmdcBankAccout(Integer.parseInt(smdcCommitteeInfoBean.getIsSmdcBankAccout()));
		smdcCommitteeInfo.setSmdcBankName(smdcCommitteeInfoBean.getSmdcBankName());
		smdcCommitteeInfo.setSmdcBankBranch(smdcCommitteeInfoBean.getSmdcBankBranch());
		smdcCommitteeInfo.setSmdcBankAccountNo(Integer.parseInt(smdcCommitteeInfoBean.getSmdcBankAccountNo()));
		smdcCommitteeInfo.setSmdcBankAccountName(smdcCommitteeInfoBean.getSmdcBankAccountName());
		smdcCommitteeInfo.setSmdcBankIFSCCode(smdcCommitteeInfoBean.getSmdcBankIFSCCode());
		smdcCommitteeInfo
				.setIsSchoolBuildingCommittee(Integer.parseInt(smdcCommitteeInfoBean.getIsSchoolBuildingCommittee()));
		smdcCommitteeInfo
				.setIsSchoolAcademicCommittee(Integer.parseInt(smdcCommitteeInfoBean.getIsSchoolAcademicCommittee()));
		smdcCommitteeInfo
				.setIsParentTeacherAssociation(Integer.parseInt(smdcCommitteeInfoBean.getIsParentTeacherAssociation()));
		smdcCommitteeInfo.setNoOfPTAMeeting(Integer.parseInt(smdcCommitteeInfoBean.getNoOfPTAMeeting()));

		// smdcCommitteeInfo.setCreatedByUserID(smdcCommitteeInfoBean.getCreatedByUserID());
		smdcCommitteeInfo.setCreatedDate(df.format(new Date()));
		// smdcCommitteeInfo.setUpdatedByUserID(smdcCommitteeInfoBean.getUpdatedByUserID());
		smdcCommitteeInfo.setUserName(smdcCommitteeInfoBean.getCreatedByUser());
		smdcCommitteeInfo.setUpdatedDate(df.format(new Date()));

		return smdcCommitteeInfo;
	}

	public static CustomReponseStatus imageValidation(MultipartFile multipartFile) {
		CustomReponseStatus customReponseStatus = null;
		long fileSize = multipartFile.getSize() / 1024;
		String fileExtention = FilenameUtils.getExtension(multipartFile.getOriginalFilename());
		if (fileExtention.equals("jpeg")) {
			fileExtention = "jpg";
		}
		if (fileSize > 100) {
			customReponseStatus = new CustomReponseStatus(StatusMaster.EXCEED_FILE_SIZE.getResponseId(),
					StatusMaster.EXCEED_FILE_SIZE.getResponseCode(), StatusMaster.EXCEED_FILE_SIZE.getResponseMessage(),
					StatusMaster.EXCEED_FILE_SIZE.getResponseDescription());
		} else if (!fileExtention.equalsIgnoreCase("jpg")) {
			customReponseStatus = new CustomReponseStatus(StatusMaster.IMAGE_EXTENSTION.getResponseId(),
					StatusMaster.IMAGE_EXTENSTION.getResponseCode(), StatusMaster.IMAGE_EXTENSTION.getResponseMessage(),
					StatusMaster.IMAGE_EXTENSTION.getResponseDescription());
		} else {
			customReponseStatus = new CustomReponseStatus(StatusMaster.SUCCESS.getResponseId(),
					StatusMaster.SUCCESS.getResponseCode(), StatusMaster.SUCCESS.getResponseMessage(),
					StatusMaster.SUCCESS.getResponseDescription());
		}
		return customReponseStatus;
	}

	// SchoolSplSmcInfo
	public static SchoolSplSmcInfo convertSchoolSplSmcInfoBeanToSchoolSplSmcInfoEntity(
			SchoolSplSmcInfoBean SchoolSplSmcInfoBean) {
		// TODO Auto-generated method stub
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		SchoolSplSmcInfo schoolSplSmcInfo = new SchoolSplSmcInfo();

		schoolSplSmcInfo.setSchoolId(Integer.parseInt(SchoolSplSmcInfoBean.getSchoolId()));
		schoolSplSmcInfo.setSessionId(Integer.parseInt(SchoolSplSmcInfoBean.getSessionId()));
		schoolSplSmcInfo.setSmcConstituency(Integer.parseInt(SchoolSplSmcInfoBean.getSmcConstituency()));
		schoolSplSmcInfo.setSmcTotalMale(Integer.parseInt(SchoolSplSmcInfoBean.getSmcTotalMale()));
		schoolSplSmcInfo.setSmcTotalFemale(Integer.parseInt(SchoolSplSmcInfoBean.getSmcTotalFemale()));
		schoolSplSmcInfo.setSmcParentsMale(Integer.parseInt(SchoolSplSmcInfoBean.getSmcParentsMale()));
		schoolSplSmcInfo.setSmcParentsFemale(Integer.parseInt(SchoolSplSmcInfoBean.getSmcParentsFemale()));
		schoolSplSmcInfo.setLocalGovtBodyMale(Integer.parseInt(SchoolSplSmcInfoBean.getLocalGovtBodyMale()));
		schoolSplSmcInfo.setLocalGovtBodyFemale(Integer.parseInt(SchoolSplSmcInfoBean.getLocalGovtBodyFemale()));
		schoolSplSmcInfo.setSmcMeetingPreviousYr(Integer.parseInt(SchoolSplSmcInfoBean.getSmcMeetingPreviousYr()));
		schoolSplSmcInfo
				.setSmcSchoolDevelopmentPlan(Integer.parseInt(SchoolSplSmcInfoBean.getSmcSchoolDevelopmentPlan()));
		schoolSplSmcInfo.setIsSmcBankAccount(Integer.parseInt(SchoolSplSmcInfoBean.getIsSmcBankAccount()));
		schoolSplSmcInfo.setSmcBankName(SchoolSplSmcInfoBean.getSmcBankName());
		schoolSplSmcInfo.setSmcBranch(SchoolSplSmcInfoBean.getSmcBranch());
		schoolSplSmcInfo.setSmcBankAccount(SchoolSplSmcInfoBean.getSmcBankAccount());
		schoolSplSmcInfo.setSmcBankIfsc(SchoolSplSmcInfoBean.getSmcBankIfsc());
		schoolSplSmcInfo.setSmcBankAccountName(SchoolSplSmcInfoBean.getSmcBankAccountName());
		schoolSplSmcInfo
				.setAttendingSpecialTraining(Integer.parseInt(SchoolSplSmcInfoBean.getAttendingSpecialTraining()));
		schoolSplSmcInfo.setSpecialTrainingCurrentYrBoys(
				Integer.parseInt(SchoolSplSmcInfoBean.getSpecialTrainingCurrentYrBoys()));
		schoolSplSmcInfo.setSpecialTrainingCurrentYrGirls(
				Integer.parseInt(SchoolSplSmcInfoBean.getSpecialTrainingCurrentYrGirls()));
		schoolSplSmcInfo.setSpecialTrainingPreviousYrBoys(
				Integer.parseInt(SchoolSplSmcInfoBean.getSpecialTrainingPreviousYrBoys()));
		schoolSplSmcInfo.setSpecialTrainingPreviousYrGirls(
				Integer.parseInt(SchoolSplSmcInfoBean.getSpecialTrainingPreviousYrGirls()));
		schoolSplSmcInfo.setCompleteSplTrngPreviousYrBoys(
				Integer.parseInt(SchoolSplSmcInfoBean.getCompleteSplTrngPreviousYrBoys()));
		schoolSplSmcInfo.setCompleteSplTrngPreviousYrGirls(
				Integer.parseInt(SchoolSplSmcInfoBean.getCompleteSplTrngPreviousYrGirls()));
		schoolSplSmcInfo.setSplTrainingConductedBy(Integer.parseInt(SchoolSplSmcInfoBean.getSplTrainingConductedBy()));
		schoolSplSmcInfo.setSplTrainingConductedIn(Integer.parseInt(SchoolSplSmcInfoBean.getSplTrainingConductedIn()));
		schoolSplSmcInfo
				.setTypeOfTrainingConducted(Integer.parseInt(SchoolSplSmcInfoBean.getTypeOfTrainingConducted()));
		schoolSplSmcInfo
				.setFullTextbookSetRecieved(Integer.parseInt(SchoolSplSmcInfoBean.getFullTextbookSetRecieved()));
		schoolSplSmcInfo.setTextbookRecieveMonth(Integer.parseInt(SchoolSplSmcInfoBean.getTextbookRecieveYear()));
		schoolSplSmcInfo.setFreeBooksAvaialbleToPrimary(
				Integer.parseInt(SchoolSplSmcInfoBean.getFreeBooksAvaialbleToPrimary()));
		schoolSplSmcInfo.setFreeBooksAvailableToUprimary(
				Integer.parseInt(SchoolSplSmcInfoBean.getFreeBooksAvailableToUprimary()));
		schoolSplSmcInfo.setTleAvailabilityPrimary(Integer.parseInt(SchoolSplSmcInfoBean.getTleAvailabilityPrimary()));
		schoolSplSmcInfo.setTleAvailabilityUrimary(Integer.parseInt(SchoolSplSmcInfoBean.getTleAvailabilityUrimary()));
		schoolSplSmcInfo.setPlaymtrlEqpmtAvailabilityPrinary(
				Integer.parseInt(SchoolSplSmcInfoBean.getPlaymtrlEqpmtAvailabilityPrinary()));
		schoolSplSmcInfo.setPlaymtrlEqpmtAvailabilityUprimary(
				Integer.parseInt(SchoolSplSmcInfoBean.getPlaymtrlEqpmtAvailabilityUprimary()));
		schoolSplSmcInfo.setPlaymtrlEqpmtAvailabilitySecondary(
				Integer.parseInt(SchoolSplSmcInfoBean.getPlaymtrlEqpmtAvailabilitySecondary()));
		schoolSplSmcInfo.setPlaymtrlEqpmtAvailabilityHsecondary(
				Integer.parseInt(SchoolSplSmcInfoBean.getPlaymtrlEqpmtAvailabilityHsecondary()));
		schoolSplSmcInfo.setCreatedByUserId(Integer.parseInt(SchoolSplSmcInfoBean.getCreatedByUserId()));
		schoolSplSmcInfo.setCreatedDate(SchoolSplSmcInfoBean.getCreatedDate());
		schoolSplSmcInfo.setUpdatedByUserID(Integer.parseInt(SchoolSplSmcInfoBean.getUpdatedByUserID()));
		schoolSplSmcInfo.setUpdatedDate(SchoolSplSmcInfoBean.getUpdatedDate());

		return schoolSplSmcInfo;
	}
}
