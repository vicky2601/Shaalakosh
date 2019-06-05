package org.shaalakosh.master.service.impl;

import java.util.LinkedHashMap;
import java.util.List;

import org.shaalakosh.master.dao.MasterDao;
import org.shaalakosh.master.model.Block;
import org.shaalakosh.master.model.BlockResourceCentre;
import org.shaalakosh.master.model.Cluster;
import org.shaalakosh.master.model.District;
import org.shaalakosh.master.model.MediumOfInstruction;
import org.shaalakosh.master.model.Menu;
import org.shaalakosh.master.model.MenuSectionMaster;
import org.shaalakosh.master.model.MinorityCommunity;
import org.shaalakosh.master.model.ResidentialSchoolType;
import org.shaalakosh.master.model.Role;
import org.shaalakosh.master.model.School;
import org.shaalakosh.master.model.SchoolCategory;
import org.shaalakosh.master.model.SchoolCategoryType;
import org.shaalakosh.master.model.SchoolManagementDetails;
import org.shaalakosh.master.model.State;
import org.shaalakosh.master.model.UserMaster;
import org.shaalakosh.master.pojo.CustomReponseStatus;
import org.shaalakosh.master.pojo.ServiceResponse;
import org.shaalakosh.master.service.MasterService;
import org.shaalakosh.school.constants.StatusMaster;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MasterServiceImpl implements MasterService {

	@Autowired
	private MasterDao masterdao;

	@Override
	public ServiceResponse getAllStates() {
		ServiceResponse serviceResponse = new ServiceResponse();
		LinkedHashMap<Object, Object> response = new LinkedHashMap<>();
		CustomReponseStatus responseStatus = null;
		try {
			List<State> states = masterdao.getAllStates();
			responseStatus = new CustomReponseStatus(StatusMaster.SUCCESS.getResponseId(),
					StatusMaster.SUCCESS.getResponseCode(), StatusMaster.SUCCESS.getResponseMessage(),
					StatusMaster.SUCCESS.getResponseDescription());
			response.put("customResponse", responseStatus);
			response.put("totalSize", states.size());
			response.put("AllData", states);

		} catch (Exception e) {
			responseStatus = new CustomReponseStatus(StatusMaster.SUCCESS.getResponseId(),
					StatusMaster.SUCCESS.getResponseCode(), StatusMaster.SUCCESS.getResponseMessage(),
					StatusMaster.SUCCESS.getResponseDescription());
			response.put("customResponse", responseStatus);
			e.printStackTrace();
		}
		serviceResponse.setServiceResponse(response);
		return serviceResponse;
	}

	@Override
	public ServiceResponse getDistrictsByState(int stateID) {
		ServiceResponse serviceResponse = new ServiceResponse();
		LinkedHashMap<Object, Object> response = new LinkedHashMap<>();
		CustomReponseStatus responseStatus = null;

		if (!(stateID == 0)) {
			try {
				List<District> districts = masterdao.getDistrictsByState(stateID);
				responseStatus = new CustomReponseStatus(StatusMaster.SUCCESS.getResponseId(),
						StatusMaster.SUCCESS.getResponseCode(), StatusMaster.SUCCESS.getResponseMessage(),
						StatusMaster.SUCCESS.getResponseDescription());
				response.put("customResponse", responseStatus);
				response.put("AllData", districts);

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
		serviceResponse.setServiceResponse(response);
		return serviceResponse;
	}

	@Override
	public ServiceResponse getBlocksByDistrict(int districtID) {
		ServiceResponse serviceResponse = new ServiceResponse();
		LinkedHashMap<Object, Object> response = new LinkedHashMap<>();
		CustomReponseStatus responseStatus = null;

		if (!(districtID == 0)) {
			try {
				List<Block> blocks = masterdao.getBlocksByDistrict(districtID);
				responseStatus = new CustomReponseStatus(StatusMaster.SUCCESS.getResponseId(),
						StatusMaster.SUCCESS.getResponseCode(), StatusMaster.SUCCESS.getResponseMessage(),
						StatusMaster.SUCCESS.getResponseDescription());
				response.put("customResponse", responseStatus);
				response.put("AllData", blocks);

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
		serviceResponse.setServiceResponse(response);
		return serviceResponse;
	}

	@Override
	public ServiceResponse getClustersByBlock(int blockID) {
		ServiceResponse serviceResponse = new ServiceResponse();
		LinkedHashMap<Object, Object> response = new LinkedHashMap<>();
		CustomReponseStatus responseStatus = null;

		if (!(blockID == 0)) {
			try {
				List<Cluster> clusters = masterdao.getClustersByBlock(blockID);
				responseStatus = new CustomReponseStatus(StatusMaster.SUCCESS.getResponseId(),
						StatusMaster.SUCCESS.getResponseCode(), StatusMaster.SUCCESS.getResponseMessage(),
						StatusMaster.SUCCESS.getResponseDescription());
				response.put("customResponse", responseStatus);
				response.put("AllData", clusters);

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
		serviceResponse.setServiceResponse(response);
		return serviceResponse;
	}

	@Override
	public ServiceResponse getSchoolByCluster(int clusterID) {
		ServiceResponse serviceResponse = new ServiceResponse();
		LinkedHashMap<Object, Object> response = new LinkedHashMap<>();
		CustomReponseStatus responseStatus = null;

		if (!(clusterID == 0)) {
			try {
				List<School> schools = masterdao.getSchoolByCluster(clusterID);
				responseStatus = new CustomReponseStatus(StatusMaster.SUCCESS.getResponseId(),
						StatusMaster.SUCCESS.getResponseCode(), StatusMaster.SUCCESS.getResponseMessage(),
						StatusMaster.SUCCESS.getResponseDescription());
				response.put("customResponse", responseStatus);
				response.put("AllData", schools);

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
		serviceResponse.setServiceResponse(response);
		return serviceResponse;
	}

	@Override
	public ServiceResponse getAllUsers() {
		ServiceResponse serviceResponse = new ServiceResponse();
		LinkedHashMap<Object, Object> response = new LinkedHashMap<>();
		CustomReponseStatus responseStatus = null;
		try {
			List<UserMaster> users = masterdao.getAllUsers();
			responseStatus = new CustomReponseStatus(StatusMaster.SUCCESS.getResponseId(),
					StatusMaster.SUCCESS.getResponseCode(), StatusMaster.SUCCESS.getResponseMessage(),
					StatusMaster.SUCCESS.getResponseDescription());
			response.put("customResponse", responseStatus);
			response.put("totalSize", users.size());
			response.put("AllData", users);

		} catch (Exception e) {
			responseStatus = new CustomReponseStatus(StatusMaster.SUCCESS.getResponseId(),
					StatusMaster.SUCCESS.getResponseCode(), StatusMaster.SUCCESS.getResponseMessage(),
					StatusMaster.SUCCESS.getResponseDescription());
			response.put("customResponse", responseStatus);
			e.printStackTrace();
		}
		serviceResponse.setServiceResponse(response);
		return serviceResponse;
	}

	@Override
	public ServiceResponse getAllSections() {
		ServiceResponse serviceResponse = new ServiceResponse();
		LinkedHashMap<Object, Object> response = new LinkedHashMap<>();
		CustomReponseStatus responseStatus = null;
		try {
			List<MenuSectionMaster> sections = masterdao.getAllSections();
			responseStatus = new CustomReponseStatus(StatusMaster.SUCCESS.getResponseId(),
					StatusMaster.SUCCESS.getResponseCode(), StatusMaster.SUCCESS.getResponseMessage(),
					StatusMaster.SUCCESS.getResponseDescription());
			response.put("customResponse", responseStatus);
			response.put("totalSize", sections.size());
			response.put("AllData", sections);

		} catch (Exception e) {
			responseStatus = new CustomReponseStatus(StatusMaster.SUCCESS.getResponseId(),
					StatusMaster.SUCCESS.getResponseCode(), StatusMaster.SUCCESS.getResponseMessage(),
					StatusMaster.SUCCESS.getResponseDescription());
			response.put("customResponse", responseStatus);
			e.printStackTrace();
		}
		serviceResponse.setServiceResponse(response);
		return serviceResponse;
	}

	@Override
	public ServiceResponse getAllMenu() {
		ServiceResponse serviceResponse = new ServiceResponse();
		LinkedHashMap<Object, Object> response = new LinkedHashMap<>();
		CustomReponseStatus responseStatus = null;
		try {
			List<Menu> menu = masterdao.getAllMenu();
			responseStatus = new CustomReponseStatus(StatusMaster.SUCCESS.getResponseId(),
					StatusMaster.SUCCESS.getResponseCode(), StatusMaster.SUCCESS.getResponseMessage(),
					StatusMaster.SUCCESS.getResponseDescription());
			response.put("customResponse", responseStatus);
			response.put("totalSize", menu.size());
			response.put("AllData", menu);

		} catch (Exception e) {
			responseStatus = new CustomReponseStatus(StatusMaster.SUCCESS.getResponseId(),
					StatusMaster.SUCCESS.getResponseCode(), StatusMaster.SUCCESS.getResponseMessage(),
					StatusMaster.SUCCESS.getResponseDescription());
			response.put("customResponse", responseStatus);
			e.printStackTrace();
		}
		serviceResponse.setServiceResponse(response);
		return serviceResponse;
	}

	public ServiceResponse getAllMasters() {
		ServiceResponse serviceResponse = new ServiceResponse();
		LinkedHashMap<Object, Object> response = new LinkedHashMap<>();
		LinkedHashMap<String, Object> allMasters = new LinkedHashMap<>();
		CustomReponseStatus responseStatus = null;
		try {
			/*List<UserMaster> userlist = masterdao.getAllUsers();
			List<Menu> menulist = masterdao.getAllMenu();
			List<MenuSectionMaster> sectionlist = masterdao.getAllSections();*/
			responseStatus = new CustomReponseStatus(StatusMaster.SUCCESS.getResponseId(),
					StatusMaster.SUCCESS.getResponseCode(), StatusMaster.SUCCESS.getResponseMessage(),
					StatusMaster.SUCCESS.getResponseDescription());
			allMasters.put("user", this.getAllUsers().getServiceResponse().get("AllData"));
			allMasters.put("menu", this.getAllMenu().getServiceResponse().get("AllData"));
			allMasters.put("section", this.getAllSections().getServiceResponse().get("AllData"));
			allMasters.put("state", this.getAllStates().getServiceResponse().get("AllData"));
			allMasters.put("schoolCategories", this.getAllSchoolCategories().getServiceResponse().get("AllData"));
			allMasters.put("schoolCategoryType", this.getAllSchoolCategoryTypes().getServiceResponse().get("AllData"));
			allMasters.put("schoolManagementDetails", this.getSchoolManagementDetails().getServiceResponse().get("AllData"));
			allMasters.put("residentialSchoolType", this.getResidentialSchooltype().getServiceResponse().get("AllData"));
			allMasters.put("minorityCommunities", this.getMinorityCommunities().getServiceResponse().get("AllData"));
			allMasters.put("mediumOfInstruction", this.getMediumOfInstruction().getServiceResponse().get("AllData"));
			allMasters.put("blockResourceCentre", this.getBlockResourceCentre().getServiceResponse().get("AllData"));
			allMasters.put("roles", this.getAllRoles().getServiceResponse().get("AllData"));
			response.put("customResponse", responseStatus);
			response.put("allMasters", allMasters);

		} catch (Exception e) {
			responseStatus = new CustomReponseStatus(StatusMaster.FAILED.getResponseId(),
					StatusMaster.FAILED.getResponseCode(), StatusMaster.FAILED.getResponseMessage(),
					StatusMaster.FAILED.getResponseDescription());
			response.put("customResponse", responseStatus);
		}

		serviceResponse.setServiceResponse(response);
		return serviceResponse;
	}

	@Override
	public ServiceResponse getAllSchoolCategories() {
		ServiceResponse serviceResponse = new ServiceResponse();
		LinkedHashMap<Object, Object> response = new LinkedHashMap<>();
		CustomReponseStatus responseStatus = null;
		try {
			List<SchoolCategory> schoolCategory = masterdao.getAllSchoolCategories();
			responseStatus = new CustomReponseStatus(StatusMaster.SUCCESS.getResponseId(),
					StatusMaster.SUCCESS.getResponseCode(), StatusMaster.SUCCESS.getResponseMessage(),
					StatusMaster.SUCCESS.getResponseDescription());
			response.put("customResponse", responseStatus);
			response.put("totalSize", schoolCategory.size());
			response.put("AllData", schoolCategory);

		} catch (Exception e) {
			responseStatus = new CustomReponseStatus(StatusMaster.SUCCESS.getResponseId(),
					StatusMaster.SUCCESS.getResponseCode(), StatusMaster.SUCCESS.getResponseMessage(),
					StatusMaster.SUCCESS.getResponseDescription());
			response.put("customResponse", responseStatus);
			e.printStackTrace();
		}
		serviceResponse.setServiceResponse(response);
		return serviceResponse;
	}

	@Override
	public ServiceResponse getAllSchoolCategoryTypes() {
		ServiceResponse serviceResponse = new ServiceResponse();
		LinkedHashMap<Object, Object> response = new LinkedHashMap<>();
		CustomReponseStatus responseStatus = null;
		try {
			List<SchoolCategoryType> schoolCategoryType = masterdao.getAllSchoolCategoryTypes();
			responseStatus = new CustomReponseStatus(StatusMaster.SUCCESS.getResponseId(),
					StatusMaster.SUCCESS.getResponseCode(), StatusMaster.SUCCESS.getResponseMessage(),
					StatusMaster.SUCCESS.getResponseDescription());
			response.put("customResponse", responseStatus);
			response.put("totalSize", schoolCategoryType.size());
			response.put("AllData", schoolCategoryType);

		} catch (Exception e) {
			responseStatus = new CustomReponseStatus(StatusMaster.SUCCESS.getResponseId(),
					StatusMaster.SUCCESS.getResponseCode(), StatusMaster.SUCCESS.getResponseMessage(),
					StatusMaster.SUCCESS.getResponseDescription());
			response.put("customResponse", responseStatus);
			e.printStackTrace();
		}
		serviceResponse.setServiceResponse(response);
		return serviceResponse;
	}

	@Override
	public ServiceResponse getSchoolManagementDetails() {
		ServiceResponse serviceResponse = new ServiceResponse();
		LinkedHashMap<Object, Object> response = new LinkedHashMap<>();
		CustomReponseStatus responseStatus = null;
		try {
			List<SchoolManagementDetails> schoolManagementDetails = masterdao.getSchoolManagementDetails();
			responseStatus = new CustomReponseStatus(StatusMaster.SUCCESS.getResponseId(),
					StatusMaster.SUCCESS.getResponseCode(), StatusMaster.SUCCESS.getResponseMessage(),
					StatusMaster.SUCCESS.getResponseDescription());
			response.put("customResponse", responseStatus);
			response.put("totalSize", schoolManagementDetails.size());
			response.put("AllData", schoolManagementDetails);

		} catch (Exception e) {
			responseStatus = new CustomReponseStatus(StatusMaster.SUCCESS.getResponseId(),
					StatusMaster.SUCCESS.getResponseCode(), StatusMaster.SUCCESS.getResponseMessage(),
					StatusMaster.SUCCESS.getResponseDescription());
			response.put("customResponse", responseStatus);
			e.printStackTrace();
		}
		serviceResponse.setServiceResponse(response);
		return serviceResponse;
	}

	@Override
	public ServiceResponse getResidentialSchooltype() {
		ServiceResponse serviceResponse = new ServiceResponse();
		LinkedHashMap<Object, Object> response = new LinkedHashMap<>();
		CustomReponseStatus responseStatus = null;
		try {
			List<ResidentialSchoolType> residentialSchooltype = masterdao.getResidentialSchooltype();
			responseStatus = new CustomReponseStatus(StatusMaster.SUCCESS.getResponseId(),
					StatusMaster.SUCCESS.getResponseCode(), StatusMaster.SUCCESS.getResponseMessage(),
					StatusMaster.SUCCESS.getResponseDescription());
			response.put("customResponse", responseStatus);
			response.put("totalSize", residentialSchooltype.size());
			response.put("AllData", residentialSchooltype);

		} catch (Exception e) {
			responseStatus = new CustomReponseStatus(StatusMaster.SUCCESS.getResponseId(),
					StatusMaster.SUCCESS.getResponseCode(), StatusMaster.SUCCESS.getResponseMessage(),
					StatusMaster.SUCCESS.getResponseDescription());
			response.put("customResponse", responseStatus);
			e.printStackTrace();
		}
		serviceResponse.setServiceResponse(response);
		return serviceResponse;
	}

	@Override
	public ServiceResponse getMinorityCommunities() {
		ServiceResponse serviceResponse = new ServiceResponse();
		LinkedHashMap<Object, Object> response = new LinkedHashMap<>();
		CustomReponseStatus responseStatus = null;
		try {
			List<MinorityCommunity> minorityCommunities = masterdao.getMinorityCommunities();
			responseStatus = new CustomReponseStatus(StatusMaster.SUCCESS.getResponseId(),
					StatusMaster.SUCCESS.getResponseCode(), StatusMaster.SUCCESS.getResponseMessage(),
					StatusMaster.SUCCESS.getResponseDescription());
			response.put("customResponse", responseStatus);
			response.put("totalSize", minorityCommunities.size());
			response.put("AllData", minorityCommunities);

		} catch (Exception e) {
			responseStatus = new CustomReponseStatus(StatusMaster.SUCCESS.getResponseId(),
					StatusMaster.SUCCESS.getResponseCode(), StatusMaster.SUCCESS.getResponseMessage(),
					StatusMaster.SUCCESS.getResponseDescription());
			response.put("customResponse", responseStatus);
			e.printStackTrace();
		}
		serviceResponse.setServiceResponse(response);
		return serviceResponse;
	}

	@Override
	public ServiceResponse getMediumOfInstruction() {
		ServiceResponse serviceResponse = new ServiceResponse();
		LinkedHashMap<Object, Object> response = new LinkedHashMap<>();
		CustomReponseStatus responseStatus = null;
		try {
			List<MediumOfInstruction> mediumOfInstructions = masterdao.getMediumOfInstruction();
			responseStatus = new CustomReponseStatus(StatusMaster.SUCCESS.getResponseId(),
					StatusMaster.SUCCESS.getResponseCode(), StatusMaster.SUCCESS.getResponseMessage(),
					StatusMaster.SUCCESS.getResponseDescription());
			response.put("customResponse", responseStatus);
			response.put("totalSize", mediumOfInstructions.size());
			response.put("AllData", mediumOfInstructions);

		} catch (Exception e) {
			responseStatus = new CustomReponseStatus(StatusMaster.SUCCESS.getResponseId(),
					StatusMaster.SUCCESS.getResponseCode(), StatusMaster.SUCCESS.getResponseMessage(),
					StatusMaster.SUCCESS.getResponseDescription());
			response.put("customResponse", responseStatus);
			e.printStackTrace();
		}
		serviceResponse.setServiceResponse(response);
		return serviceResponse;
	}

	@Override
	public ServiceResponse getBlockResourceCentre() {
		ServiceResponse serviceResponse = new ServiceResponse();
		LinkedHashMap<Object, Object> response = new LinkedHashMap<>();
		CustomReponseStatus responseStatus = null;
		try {
			List<BlockResourceCentre> blockResourceCentres = masterdao.getBlockResourceCentre();
			responseStatus = new CustomReponseStatus(StatusMaster.SUCCESS.getResponseId(),
					StatusMaster.SUCCESS.getResponseCode(), StatusMaster.SUCCESS.getResponseMessage(),
					StatusMaster.SUCCESS.getResponseDescription());
			response.put("customResponse", responseStatus);
			response.put("totalSize", blockResourceCentres.size());
			response.put("AllData", blockResourceCentres);

		} catch (Exception e) {
			responseStatus = new CustomReponseStatus(StatusMaster.SUCCESS.getResponseId(),
					StatusMaster.SUCCESS.getResponseCode(), StatusMaster.SUCCESS.getResponseMessage(),
					StatusMaster.SUCCESS.getResponseDescription());
			response.put("customResponse", responseStatus);
			e.printStackTrace();
		}
		serviceResponse.setServiceResponse(response);
		return serviceResponse;
	}

	@Override
	public ServiceResponse getAllRoles() {
		ServiceResponse serviceResponse = new ServiceResponse();
		LinkedHashMap<Object, Object> response = new LinkedHashMap<>();
		CustomReponseStatus responseStatus = null;
		try {
			List<Role> roles = masterdao.getAllRoles();
			responseStatus = new CustomReponseStatus(StatusMaster.SUCCESS.getResponseId(),
					StatusMaster.SUCCESS.getResponseCode(), StatusMaster.SUCCESS.getResponseMessage(),
					StatusMaster.SUCCESS.getResponseDescription());
			response.put("customResponse", responseStatus);
			response.put("totalSize", roles.size());
			response.put("AllData", roles);

		} catch (Exception e) {
			responseStatus = new CustomReponseStatus(StatusMaster.SUCCESS.getResponseId(),
					StatusMaster.SUCCESS.getResponseCode(), StatusMaster.SUCCESS.getResponseMessage(),
					StatusMaster.SUCCESS.getResponseDescription());
			response.put("customResponse", responseStatus);
			e.printStackTrace();
		}
		serviceResponse.setServiceResponse(response);
		return serviceResponse;
	}

}
