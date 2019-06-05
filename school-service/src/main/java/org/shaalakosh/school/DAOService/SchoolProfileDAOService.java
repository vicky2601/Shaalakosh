package org.shaalakosh.school.DAOService;

import java.util.List;

import org.shaalakosh.school.model.BasicSchoolProfileInfo;
import org.shaalakosh.school.model.LocationAndEstablishmentInfo;
import org.shaalakosh.school.model.SMDCCommitteeInfo;
import org.shaalakosh.school.model.SchoolManagementAndMediumInfo;
import org.shaalakosh.school.model.SchoolSplSmcInfo;

public interface SchoolProfileDAOService {

	int saveBasicSchoolProfileInfo(BasicSchoolProfileInfo basicSchoolProfileInfo);

	BasicSchoolProfileInfo fetchBasicSchoolProfileInfoBySchoolId(int schoolId);

	List<BasicSchoolProfileInfo> fetchAllBasicSchoolProfileInfo();

	int updateBasicSchoolProfileInfo(BasicSchoolProfileInfo basicSchoolProfileInfo);

	int saveLocationAndEstablishmentInfo(LocationAndEstablishmentInfo locationAndEstablishmentInfo);

	int updateLocationAndEstablishmentInfo(LocationAndEstablishmentInfo locationAndEstablishmentInfo);

	LocationAndEstablishmentInfo fetchLocationAndEstablishmentInfoById(int id);

	LocationAndEstablishmentInfo fetchLocationAndEstablishmentInfoByBasicSchoolProfileId(int basicSchoolProfileId);

	List<LocationAndEstablishmentInfo> fetchAllLocationAndEstablishmentInfo();

	// School Management and medium
	int saveOrUpdateSchoolManagementAndMediumInfo(SchoolManagementAndMediumInfo schoolManagementAndMediumInfo);

	SchoolManagementAndMediumInfo fetchSchoolManagementAndMediumInfoBySchoolId(int schoolId);

	List<SchoolManagementAndMediumInfo> fetchAllSchoolManagementAndMediumInfo();

	// end
	// trn School Spl Smc information
	int saveSchoolSplSmcInfo(SchoolSplSmcInfo trainingTleSmcInfo);

	int updateSchoolSplSmcInfo(SchoolSplSmcInfo trainingTleSmcInfo);

	SchoolSplSmcInfo fetchTrainingTleSmcInfoBySchoolId(int SchoolId);

	List<SchoolSplSmcInfo> fetchAllTrainingTleSmcInfo();
	// end

	// School SMDC Committee
	int saveOrUpdateSMDCCommittee(SMDCCommitteeInfo smdcCommitteeInfo);

	SMDCCommitteeInfo fetchSMDCCommitteeInfoBySchoolId(int schoolId);

	List<SMDCCommitteeInfo> fetchAllSMDCCommitteeInfo();
	// end
	

}
