package org.shaalakosh.master.service;

import org.shaalakosh.master.pojo.ServiceResponse;

public interface MasterService {
	ServiceResponse getAllStates();

	ServiceResponse getDistrictsByState(int stateID);

	ServiceResponse getBlocksByDistrict(int districtID);

	ServiceResponse getClustersByBlock(int blockID);

	ServiceResponse getSchoolByCluster(int clusterID);

	ServiceResponse getAllUsers();

	ServiceResponse getAllSections();

	ServiceResponse getAllMenu();

	ServiceResponse getAllMasters();
	
	ServiceResponse getAllSchoolCategories();
	
	ServiceResponse getAllSchoolCategoryTypes();
	
	ServiceResponse getSchoolManagementDetails();
	
	ServiceResponse getResidentialSchooltype();
	
	ServiceResponse getMinorityCommunities();
	
	ServiceResponse getMediumOfInstruction();
	
	ServiceResponse getBlockResourceCentre();
	
	ServiceResponse getAllRoles();
	

}
