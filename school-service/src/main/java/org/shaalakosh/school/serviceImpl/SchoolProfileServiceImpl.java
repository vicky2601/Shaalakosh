package org.shaalakosh.school.serviceImpl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FilenameUtils;
import org.shaalakosh.school.DAOService.SchoolProfileDAOService;
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
import org.shaalakosh.school.pojo.ServiceResponse;
import org.shaalakosh.school.service.SchoolProfileService;
import org.shaalakosh.school.utility.CommonUtility;
import org.shaalakosh.school.utility.CommonValidation;
import org.shaalakosh.school.utility.SchoolProfileUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.method.annotation.StreamingResponseBody;

@Service(value = "schoolProfileService")
public class SchoolProfileServiceImpl implements SchoolProfileService {

	@Autowired
	private SchoolProfileDAOService schoolProfileDAOService;

	@Autowired
	private Environment environment;

	@Autowired
	private ServletContext servletContext;

	@Override
	public CustomReponseStatus saveBasicSchoolProfileInfo(BasicSchoolProfileInfoBean basicSchoolProfileInfoBean) {
		CustomReponseStatus responseStatus = null;
		try {
			BasicSchoolProfileInfo basicSchoolProfileInfo = SchoolProfileUtility
					.convertBasicTeacherModelToBean(basicSchoolProfileInfoBean);
			if (basicSchoolProfileInfo.getSchoolId() == 0) {
				basicSchoolProfileInfo.setSchoolId(240000001);
				int status = schoolProfileDAOService.saveBasicSchoolProfileInfo(basicSchoolProfileInfo);
				if (status == 1) {
					responseStatus = new CustomReponseStatus(StatusMaster.SUCCESS.getResponseId(),
							StatusMaster.SUCCESS.getResponseCode(), StatusMaster.SUCCESS.getResponseMessage(),
							StatusMaster.SUCCESS.getResponseDescription());
				} else {
					responseStatus = new CustomReponseStatus(StatusMaster.FAILED.getResponseId(),
							StatusMaster.FAILED.getResponseCode(), StatusMaster.FAILED.getResponseMessage(),
							StatusMaster.FAILED.getResponseDescription());
				}
			} else {
				int status = schoolProfileDAOService.updateBasicSchoolProfileInfo(basicSchoolProfileInfo);
				if (status == 1) {
					responseStatus = new CustomReponseStatus(StatusMaster.SUCCESS.getResponseId(),
							StatusMaster.SUCCESS.getResponseCode(), StatusMaster.SUCCESS.getResponseMessage(),
							StatusMaster.SUCCESS.getResponseDescription());
				} else {
					responseStatus = new CustomReponseStatus(StatusMaster.FAILED.getResponseId(),
							StatusMaster.FAILED.getResponseCode(), StatusMaster.FAILED.getResponseMessage(),
							StatusMaster.FAILED.getResponseDescription());
				}
			}
		} catch (Exception e) {
			responseStatus = new CustomReponseStatus(StatusMaster.FAILED.getResponseId(),
					StatusMaster.FAILED.getResponseCode(), StatusMaster.FAILED.getResponseMessage(),
					StatusMaster.FAILED.getResponseDescription());
			e.printStackTrace();
		}
		return responseStatus;
	}

	@Override
	public ServiceResponse fetchBasicSchoolProfileInfoBySchoolId(String schoolId) {
		ServiceResponse serviceResponse = new ServiceResponse();
		LinkedHashMap<Object, Object> response = new LinkedHashMap<>();
		CustomReponseStatus responseStatus = null;

		if (!schoolId.equalsIgnoreCase("0")) {
			if (CommonValidation.isIntegerInput(schoolId)) {
				try {
					BasicSchoolProfileInfo basicSchoolProfileInfo = schoolProfileDAOService
							.fetchBasicSchoolProfileInfoBySchoolId(Integer.parseInt(schoolId));
					responseStatus = new CustomReponseStatus(StatusMaster.SUCCESS.getResponseId(),
							StatusMaster.SUCCESS.getResponseCode(), StatusMaster.SUCCESS.getResponseMessage(),
							StatusMaster.SUCCESS.getResponseDescription());
					response.put("customResponse", responseStatus);
					response.put("AllData", basicSchoolProfileInfo);

				} catch (Exception e) {
					responseStatus = new CustomReponseStatus(StatusMaster.FAILED.getResponseId(),
							StatusMaster.FAILED.getResponseCode(), StatusMaster.FAILED.getResponseMessage(),
							StatusMaster.FAILED.getResponseDescription());
					response.put("customResponse", responseStatus);
				}

			} else {
				responseStatus = new CustomReponseStatus(StatusMaster.FAILED.getResponseId(),
						StatusMaster.FAILED.getResponseCode(), StatusMaster.FAILED.getResponseMessage(),
						StatusMaster.FAILED.getResponseDescription());
				response.put("customResponse", responseStatus);
			}
		} else {
			try {
				List<BasicSchoolProfileInfo> basicSchoolProfileInfoList = schoolProfileDAOService
						.fetchAllBasicSchoolProfileInfo();
				responseStatus = new CustomReponseStatus(StatusMaster.SUCCESS.getResponseId(),
						StatusMaster.SUCCESS.getResponseCode(), StatusMaster.SUCCESS.getResponseMessage(),
						StatusMaster.SUCCESS.getResponseDescription());
				response.put("customResponse", responseStatus);
				response.put("totalSize", basicSchoolProfileInfoList.size());
				response.put("allData", basicSchoolProfileInfoList);

			} catch (Exception e) {
				responseStatus = new CustomReponseStatus(StatusMaster.FAILED.getResponseId(),
						StatusMaster.FAILED.getResponseCode(), StatusMaster.FAILED.getResponseMessage(),
						StatusMaster.FAILED.getResponseDescription());
				response.put("customResponse", responseStatus);
			}
		}
		serviceResponse.setServiceResponse(response);
		return serviceResponse;
	}

	@Override
	public CustomReponseStatus saveLocationAndEstablishmentInfo(
			LocationAndEstablishmentInfoBean locationAndEstablishmentInfoBean) {
		CustomReponseStatus responseStatus = null;
		try {
			LocationAndEstablishmentInfo locationAndEstablishmentInfo = SchoolProfileUtility
					.convertLocationEntityModelToBean(locationAndEstablishmentInfoBean);
			MultipartFile multipartFile = locationAndEstablishmentInfoBean.getImage();
			String url = environment.getProperty("local.upload.location")
					+ locationAndEstablishmentInfo.getBasicSchoolProfileId() + "."
					+ FilenameUtils.getExtension(multipartFile.getOriginalFilename());
			locationAndEstablishmentInfo.setImageName(locationAndEstablishmentInfo.getBasicSchoolProfileId() + "."
					+ FilenameUtils.getExtension(multipartFile.getOriginalFilename()));
			CustomReponseStatus imageCustomResponse = SchoolProfileUtility.imageValidation(multipartFile);
			if (imageCustomResponse.getResponseId() == 1) {
				if (locationAndEstablishmentInfo.getLocationAndEstablishmentId() == 0) {
					int status = schoolProfileDAOService.saveLocationAndEstablishmentInfo(locationAndEstablishmentInfo);
					if (status == 1) {
						responseStatus = new CustomReponseStatus(StatusMaster.SUCCESS.getResponseId(),
								StatusMaster.SUCCESS.getResponseCode(), StatusMaster.SUCCESS.getResponseMessage(),
								StatusMaster.SUCCESS.getResponseDescription());
						multipartFile.transferTo(new File(url));
					} else {
						responseStatus = new CustomReponseStatus(StatusMaster.FAILED.getResponseId(),
								StatusMaster.FAILED.getResponseCode(), StatusMaster.FAILED.getResponseMessage(),
								StatusMaster.FAILED.getResponseDescription());
					}
				} else {
					int status = schoolProfileDAOService
							.updateLocationAndEstablishmentInfo(locationAndEstablishmentInfo);
					if (status == 1) {
						responseStatus = new CustomReponseStatus(StatusMaster.SUCCESS.getResponseId(),
								StatusMaster.SUCCESS.getResponseCode(), StatusMaster.SUCCESS.getResponseMessage(),
								StatusMaster.SUCCESS.getResponseDescription());
					} else {
						responseStatus = new CustomReponseStatus(StatusMaster.FAILED.getResponseId(),
								StatusMaster.FAILED.getResponseCode(), StatusMaster.FAILED.getResponseMessage(),
								StatusMaster.FAILED.getResponseDescription());
					}
				}
			} else {
				responseStatus = imageCustomResponse;
			}

		} catch (DuplicateKeyException e) {
			if (e.getMessage().contains("basic_school_profile")) {
				responseStatus = new CustomReponseStatus(StatusMaster.DUPLICATE_BASIC_PROFILE_ID.getResponseId(),
						StatusMaster.DUPLICATE_BASIC_PROFILE_ID.getResponseCode(),
						StatusMaster.DUPLICATE_BASIC_PROFILE_ID.getResponseMessage(),
						StatusMaster.DUPLICATE_BASIC_PROFILE_ID.getResponseDescription());
			} else {
				responseStatus = new CustomReponseStatus(StatusMaster.DUPLICATE_EXCEPTION.getResponseId(),
						StatusMaster.DUPLICATE_EXCEPTION.getResponseCode(),
						StatusMaster.DUPLICATE_EXCEPTION.getResponseMessage(),
						StatusMaster.DUPLICATE_EXCEPTION.getResponseDescription());
			}
			e.printStackTrace();
		} catch (Exception e) {
			responseStatus = new CustomReponseStatus(StatusMaster.FAILED.getResponseId(),
					StatusMaster.FAILED.getResponseCode(), StatusMaster.FAILED.getResponseMessage(),
					StatusMaster.FAILED.getResponseDescription());
			e.printStackTrace();
		}
		return responseStatus;
	}

	@Override
	public ServiceResponse fetchLocationAndEstablishmentInfoByBasicSchoolProfileId(String id) {
		ServiceResponse serviceResponse = new ServiceResponse();
		LinkedHashMap<Object, Object> response = new LinkedHashMap<>();
		CustomReponseStatus responseStatus = null;

		try {
			LocationAndEstablishmentInfo locationAndEstablishmentInfo = schoolProfileDAOService
					.fetchLocationAndEstablishmentInfoByBasicSchoolProfileId(Integer.parseInt(id));
			responseStatus = new CustomReponseStatus(StatusMaster.SUCCESS.getResponseId(),
					StatusMaster.SUCCESS.getResponseCode(), StatusMaster.SUCCESS.getResponseMessage(),
					StatusMaster.SUCCESS.getResponseDescription());
			response.put("customResponse", responseStatus);
			response.put("AllData", locationAndEstablishmentInfo);

		} catch (EmptyResultDataAccessException e) {
			responseStatus = new CustomReponseStatus(StatusMaster.SUCCESS.getResponseId(),
					StatusMaster.SUCCESS.getResponseCode(), StatusMaster.SUCCESS.getResponseMessage(),
					StatusMaster.SUCCESS.getResponseDescription());
			response.put("customResponse", responseStatus);
			response.put("AllData", null);
			e.printStackTrace();
		} catch (Exception e) {
			responseStatus = new CustomReponseStatus(StatusMaster.FAILED.getResponseId(),
					StatusMaster.FAILED.getResponseCode(), StatusMaster.FAILED.getResponseMessage(),
					StatusMaster.FAILED.getResponseDescription());
			response.put("customResponse", responseStatus);
			e.printStackTrace();
		}

		serviceResponse.setServiceResponse(response);
		return serviceResponse;
	}

	@SuppressWarnings("resource")
	@Override
	public StreamingResponseBody downloadSchoolImage(HttpServletResponse response, String basicSchoolProfileId)
			throws FileNotFoundException {
		LocationAndEstablishmentInfo locationAndEstablishmentInfo = schoolProfileDAOService
				.fetchLocationAndEstablishmentInfoByBasicSchoolProfileId(Integer.parseInt(basicSchoolProfileId));
		String fileName = environment.getProperty("local.upload.location")
				+ locationAndEstablishmentInfo.getImageName();
		String fileType = null;
		try {
			fileType = fileName.split("\\.")[1];
		} catch (Exception ex) {
			fileType = fileName.split("\\.")[0];
			ex.printStackTrace();
		}

		InputStream inputStream = new FileInputStream(new File(fileName));
		MediaType mediaType = CommonUtility.getMediaTypeForFileName(servletContext, fileName);
		System.out.println("the media type is " + mediaType);

		response.setContentType(mediaType.toString());
		response.setHeader("Content-Disposition", "attachment; filename=\"eoiFile." + fileType + "\"");

		return outputStream -> {
			int nRead;
			byte[] data = new byte[1024];
			while ((nRead = inputStream.read(data, 0, data.length)) != -1) {
				outputStream.write(data, 0, nRead);
			}
		};
	}

	@Override
	public CustomReponseStatus saveSchoolManagementAndMediumInfo(
			SchoolManagementAndMediumInfoBean managementAndMediumInfoBean) {
		CustomReponseStatus responseStatus = null;
		try {
			SchoolManagementAndMediumInfo basicSchoolProfileInfo = SchoolProfileUtility
					.convertBeanToSchoolManagementAndMediumModel(managementAndMediumInfoBean);
			int status = schoolProfileDAOService.saveOrUpdateSchoolManagementAndMediumInfo(basicSchoolProfileInfo);
			System.out.println("Status :- " + status);
			if (status == 1 || status == 2) {
				responseStatus = new CustomReponseStatus(StatusMaster.SUCCESS.getResponseId(),
						StatusMaster.SUCCESS.getResponseCode(), StatusMaster.SUCCESS.getResponseMessage(),
						StatusMaster.SUCCESS.getResponseDescription());
			} else {
				responseStatus = new CustomReponseStatus(StatusMaster.FAILED.getResponseId(),
						StatusMaster.FAILED.getResponseCode(), StatusMaster.FAILED.getResponseMessage(),
						StatusMaster.FAILED.getResponseDescription());
			}

		} catch (Exception e) {
			responseStatus = new CustomReponseStatus(StatusMaster.FAILED.getResponseId(),
					StatusMaster.FAILED.getResponseCode(), StatusMaster.FAILED.getResponseMessage(),
					StatusMaster.FAILED.getResponseDescription());
			e.printStackTrace();
		}
		return responseStatus;
	}

	@Override
	public ServiceResponse fetchSchoolManagementAndMediumInfoBySchoolId(String schoolId) {
		ServiceResponse serviceResponse = new ServiceResponse();
		LinkedHashMap<Object, Object> response = new LinkedHashMap<>();
		CustomReponseStatus responseStatus = null;

		if (!schoolId.equalsIgnoreCase("0")) {
			if (CommonValidation.isIntegerInput(schoolId)) {
				try {
					SchoolManagementAndMediumInfo schoolManagementAndMediumInfo = schoolProfileDAOService
							.fetchSchoolManagementAndMediumInfoBySchoolId(Integer.parseInt(schoolId));
					responseStatus = new CustomReponseStatus(StatusMaster.SUCCESS.getResponseId(),
							StatusMaster.SUCCESS.getResponseCode(), StatusMaster.SUCCESS.getResponseMessage(),
							StatusMaster.SUCCESS.getResponseDescription());
					response.put("customResponse", responseStatus);
					response.put("AllData", schoolManagementAndMediumInfo);

				} catch (Exception e) {
					responseStatus = new CustomReponseStatus(StatusMaster.FAILED.getResponseId(),
							StatusMaster.FAILED.getResponseCode(), StatusMaster.FAILED.getResponseMessage(),
							StatusMaster.FAILED.getResponseDescription());
					response.put("customResponse", responseStatus);
				}

			} else {
				responseStatus = new CustomReponseStatus(StatusMaster.FAILED.getResponseId(),
						StatusMaster.FAILED.getResponseCode(), StatusMaster.FAILED.getResponseMessage(),
						StatusMaster.FAILED.getResponseDescription());
				response.put("customResponse", responseStatus);
			}
		} else {
			try {
				List<SchoolManagementAndMediumInfo> schoolManagementAndMediumInfoList = schoolProfileDAOService
						.fetchAllSchoolManagementAndMediumInfo();
				responseStatus = new CustomReponseStatus(StatusMaster.SUCCESS.getResponseId(),
						StatusMaster.SUCCESS.getResponseCode(), StatusMaster.SUCCESS.getResponseMessage(),
						StatusMaster.SUCCESS.getResponseDescription());
				response.put("customResponse", responseStatus);
				response.put("totalSize", schoolManagementAndMediumInfoList.size());
				response.put("allData", schoolManagementAndMediumInfoList);

			} catch (Exception e) {
				responseStatus = new CustomReponseStatus(StatusMaster.FAILED.getResponseId(),
						StatusMaster.FAILED.getResponseCode(), StatusMaster.FAILED.getResponseMessage(),
						StatusMaster.FAILED.getResponseDescription());
				response.put("customResponse", responseStatus);
			}
		}
		serviceResponse.setServiceResponse(response);
		return serviceResponse;
	}

	@Override
	public CustomReponseStatus saveSMDCCommitteeInfo(SMDCCommitteeInfoBean smdcCommitteeInfoBean) {
		CustomReponseStatus responseStatus = null;
		try {
			SMDCCommitteeInfo smdcCommitteeInfo = SchoolProfileUtility
					.convertSMDCCommitteeInfoBeanToSMDCCommitteeInfoEntity(smdcCommitteeInfoBean);
			int status = schoolProfileDAOService.saveOrUpdateSMDCCommittee(smdcCommitteeInfo);
			System.out.println("Status :- " + status);
			if (status == 1 || status == 2) {
				responseStatus = new CustomReponseStatus(StatusMaster.SUCCESS.getResponseId(),
						StatusMaster.SUCCESS.getResponseCode(), StatusMaster.SUCCESS.getResponseMessage(),
						StatusMaster.SUCCESS.getResponseDescription());
			} else {
				responseStatus = new CustomReponseStatus(StatusMaster.FAILED.getResponseId(),
						StatusMaster.FAILED.getResponseCode(), StatusMaster.FAILED.getResponseMessage(),
						StatusMaster.FAILED.getResponseDescription());
			}

		} catch (Exception e) {
			responseStatus = new CustomReponseStatus(StatusMaster.FAILED.getResponseId(),
					StatusMaster.FAILED.getResponseCode(), StatusMaster.FAILED.getResponseMessage(),
					StatusMaster.FAILED.getResponseDescription());
			e.printStackTrace();
		}
		return responseStatus;
	}

	@Override
	public ServiceResponse fetchSMDCCommitteeInfoBySchoolId(String schoolId) {
		ServiceResponse serviceResponse = new ServiceResponse();
		LinkedHashMap<Object, Object> response = new LinkedHashMap<>();
		CustomReponseStatus responseStatus = null;
		if (!schoolId.equalsIgnoreCase("0")) {
			if (CommonValidation.isIntegerInput(schoolId)) {
				try {
					SMDCCommitteeInfo smdcCommitteeInfo = schoolProfileDAOService
							.fetchSMDCCommitteeInfoBySchoolId(Integer.parseInt(schoolId));
					responseStatus = new CustomReponseStatus(StatusMaster.SUCCESS.getResponseId(),
							StatusMaster.SUCCESS.getResponseCode(), StatusMaster.SUCCESS.getResponseMessage(),
							StatusMaster.SUCCESS.getResponseDescription());
					response.put("customResponse", responseStatus);
					response.put("AllData", smdcCommitteeInfo);

				} catch (Exception e) {
					responseStatus = new CustomReponseStatus(StatusMaster.FAILED.getResponseId(),
							StatusMaster.FAILED.getResponseCode(), StatusMaster.FAILED.getResponseMessage(),
							StatusMaster.FAILED.getResponseDescription());
					response.put("customResponse", responseStatus);
				}

			} else {
				responseStatus = new CustomReponseStatus(StatusMaster.FAILED.getResponseId(),
						StatusMaster.FAILED.getResponseCode(), StatusMaster.FAILED.getResponseMessage(),
						StatusMaster.FAILED.getResponseDescription());
				response.put("customResponse", responseStatus);
			}
		} else {
			try {
				List<SMDCCommitteeInfo> smdcCommitteeInfoList = schoolProfileDAOService.fetchAllSMDCCommitteeInfo();
				responseStatus = new CustomReponseStatus(StatusMaster.SUCCESS.getResponseId(),
						StatusMaster.SUCCESS.getResponseCode(), StatusMaster.SUCCESS.getResponseMessage(),
						StatusMaster.SUCCESS.getResponseDescription());
				response.put("customResponse", responseStatus);
				response.put("totalSize", smdcCommitteeInfoList.size());
				response.put("allData", smdcCommitteeInfoList);

			} catch (Exception e) {
				responseStatus = new CustomReponseStatus(StatusMaster.FAILED.getResponseId(),
						StatusMaster.FAILED.getResponseCode(), StatusMaster.FAILED.getResponseMessage(),
						StatusMaster.FAILED.getResponseDescription());
				response.put("customResponse", responseStatus);
			}
		}
		serviceResponse.setServiceResponse(response);
		return serviceResponse;
	}

	
	@Override
	public CustomReponseStatus saveSchoolSplSmcInfo(SchoolSplSmcInfoBean trnSchoolSplSmcInfoBean) {
		CustomReponseStatus responseStatus = null;
		try {
			SchoolSplSmcInfo SchoolSplSmcInfo = SchoolProfileUtility
					.convertSchoolSplSmcInfoBeanToSchoolSplSmcInfoEntity(trnSchoolSplSmcInfoBean);
			SchoolSplSmcInfo SchoolSplSmcInfo1 = schoolProfileDAOService.fetchTrainingTleSmcInfoBySchoolId(SchoolSplSmcInfo.getSchoolId());
			if (SchoolSplSmcInfo1 == null ) {
				int status = schoolProfileDAOService.saveSchoolSplSmcInfo(SchoolSplSmcInfo);
				System.out.println("Status :- " + status);
				if (status == 1 ) {
					responseStatus = new CustomReponseStatus(StatusMaster.SUCCESS.getResponseId(),
							StatusMaster.SUCCESS.getResponseCode(), StatusMaster.SUCCESS.getResponseMessage(),
							StatusMaster.SUCCESS.getResponseDescription());
				} else {
					responseStatus = new CustomReponseStatus(StatusMaster.FAILED.getResponseId(),
							StatusMaster.FAILED.getResponseCode(), StatusMaster.FAILED.getResponseMessage(),
							StatusMaster.FAILED.getResponseDescription());
				}
			} else {
				int status = schoolProfileDAOService.updateSchoolSplSmcInfo(SchoolSplSmcInfo);
				if (status == 1) {
					responseStatus = new CustomReponseStatus(StatusMaster.SUCCESS.getResponseId(),
							StatusMaster.SUCCESS.getResponseCode(), StatusMaster.SUCCESS.getResponseMessage(),
							StatusMaster.SUCCESS.getResponseDescription());
				} else {
					responseStatus = new CustomReponseStatus(StatusMaster.FAILED.getResponseId(),
							StatusMaster.FAILED.getResponseCode(), StatusMaster.FAILED.getResponseMessage(),
							StatusMaster.FAILED.getResponseDescription());
				}
			}
		} catch (Exception e) {
			responseStatus = new CustomReponseStatus(StatusMaster.FAILED.getResponseId(),
					StatusMaster.FAILED.getResponseCode(), StatusMaster.FAILED.getResponseMessage(),
					StatusMaster.FAILED.getResponseDescription());
		}
		return responseStatus;
	}

	// ================================================================================================================
	@Override
	public ServiceResponse fetchTrainingTleSmcInfoBySchoolId(String SchoolID) {
		ServiceResponse serviceResponse = new ServiceResponse();
		LinkedHashMap<Object, Object> response = new LinkedHashMap<Object, Object>();
		CustomReponseStatus responseStatus = null;
		if (!SchoolID.equalsIgnoreCase("0")) {
			if (CommonValidation.isIntegerInput(SchoolID)) {
				try {
					SchoolSplSmcInfo SchoolSplSmcInfo = schoolProfileDAOService
							.fetchTrainingTleSmcInfoBySchoolId(Integer.parseInt(SchoolID));
					responseStatus = new CustomReponseStatus(StatusMaster.SUCCESS.getResponseId(),
							StatusMaster.SUCCESS.getResponseCode(), StatusMaster.SUCCESS.getResponseMessage(),
							StatusMaster.SUCCESS.getResponseDescription());
					response.put("customResponse", responseStatus);
					response.put("AllData", SchoolSplSmcInfo);

				} catch (Exception e) {
					responseStatus = new CustomReponseStatus(StatusMaster.FAILED.getResponseId(),
							StatusMaster.FAILED.getResponseCode(), StatusMaster.FAILED.getResponseMessage(),
							StatusMaster.FAILED.getResponseDescription());
					response.put("customResponse", responseStatus);
				}

			} else {
				responseStatus = new CustomReponseStatus(StatusMaster.FAILED.getResponseId(),
						StatusMaster.FAILED.getResponseCode(), StatusMaster.FAILED.getResponseMessage(),
						StatusMaster.FAILED.getResponseDescription());
				response.put("customResponse", responseStatus);
			}

		} else {
			try {
				List<SchoolSplSmcInfo> SchoolSplSmcInfoList = schoolProfileDAOService.fetchAllTrainingTleSmcInfo();
				responseStatus = new CustomReponseStatus(StatusMaster.SUCCESS.getResponseId(),
						StatusMaster.SUCCESS.getResponseCode(), StatusMaster.SUCCESS.getResponseMessage(),
						StatusMaster.SUCCESS.getResponseDescription());
				response.put("customResponse", responseStatus);
				response.put("totalSize", SchoolSplSmcInfoList.size());
				response.put("allData", SchoolSplSmcInfoList);

			} catch (Exception e) {
				responseStatus = new CustomReponseStatus(StatusMaster.FAILED.getResponseId(),
						StatusMaster.FAILED.getResponseCode(), StatusMaster.FAILED.getResponseMessage(),
						StatusMaster.FAILED.getResponseDescription());
				response.put("customResponse", responseStatus);
			}
		}
		serviceResponse.setServiceResponse(response);
		return serviceResponse;
	}
	
}
