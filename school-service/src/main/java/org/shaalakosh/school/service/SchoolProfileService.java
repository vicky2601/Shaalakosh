package org.shaalakosh.school.service;

import java.io.FileNotFoundException;

import javax.servlet.http.HttpServletResponse;

import org.shaalakosh.school.bean.BasicSchoolProfileInfoBean;
import org.shaalakosh.school.bean.LocationAndEstablishmentInfoBean;
import org.shaalakosh.school.bean.SMDCCommitteeInfoBean;
import org.shaalakosh.school.bean.SchoolManagementAndMediumInfoBean;
import org.shaalakosh.school.bean.SchoolSplSmcInfoBean;
import org.shaalakosh.school.pojo.CustomReponseStatus;
import org.shaalakosh.school.pojo.ServiceResponse;
import org.springframework.web.servlet.mvc.method.annotation.StreamingResponseBody;

public interface SchoolProfileService {

	CustomReponseStatus saveBasicSchoolProfileInfo(BasicSchoolProfileInfoBean basicSchoolProfileInfoBean);

	ServiceResponse fetchBasicSchoolProfileInfoBySchoolId(String schoolId);

	CustomReponseStatus saveLocationAndEstablishmentInfo(
			LocationAndEstablishmentInfoBean locationAndEstablishmentInfoBean);

	ServiceResponse fetchLocationAndEstablishmentInfoByBasicSchoolProfileId(String id);

	// School Management and Medium
	CustomReponseStatus saveSchoolManagementAndMediumInfo(SchoolManagementAndMediumInfoBean schoolManagementAndMediumInfoBean);

	ServiceResponse fetchSchoolManagementAndMediumInfoBySchoolId(String schoolId);
	// end

	CustomReponseStatus saveSchoolSplSmcInfo(SchoolSplSmcInfoBean SchoolSplSmcInfoBean);

	ServiceResponse fetchTrainingTleSmcInfoBySchoolId(String schoolID);

	
	// SMDC Committee
	CustomReponseStatus saveSMDCCommitteeInfo(SMDCCommitteeInfoBean smdcCommitteeInfoBean);

	ServiceResponse fetchSMDCCommitteeInfoBySchoolId(String schoolId);
	// end

	StreamingResponseBody downloadSchoolImage(HttpServletResponse response, String basicSchoolProfileId)
			throws FileNotFoundException;

}
