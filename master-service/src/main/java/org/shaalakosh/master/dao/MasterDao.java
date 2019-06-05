package org.shaalakosh.master.dao;

import java.util.List;

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

public interface MasterDao {

	List<State> getAllStates();

	List<District> getDistrictsByState(int stateID);

	List<Block> getBlocksByDistrict(int districtID);

	List<Cluster> getClustersByBlock(int blockID);

	List<School> getSchoolByCluster(int clusterID);

	List<MenuSectionMaster> getAllSections();

	// List<User> getAllUsers();
	List<UserMaster> getAllUsers();

	List<Menu> getAllMenu();
	
	List<SchoolCategory> getAllSchoolCategories();
	
	List<SchoolCategoryType> getAllSchoolCategoryTypes();
	
	List<SchoolManagementDetails> getSchoolManagementDetails();
	
	List<ResidentialSchoolType> getResidentialSchooltype();
	
	List<MinorityCommunity> getMinorityCommunities();
	
	List<MediumOfInstruction> getMediumOfInstruction();
	
	List<BlockResourceCentre> getBlockResourceCentre();
	
	List<Role> getAllRoles();
	
}
