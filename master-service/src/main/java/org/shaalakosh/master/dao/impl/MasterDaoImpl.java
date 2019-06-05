package org.shaalakosh.master.dao.impl;

import java.util.List;

import org.shaalakosh.master.dao.MasterDao;
import org.shaalakosh.master.model.SchoolCategoryType;
import org.shaalakosh.master.model.SchoolManagementDetails;
import org.shaalakosh.master.entity.mapper.BlockMapper;
import org.shaalakosh.master.entity.mapper.BlockResourceCentreMapper;
import org.shaalakosh.master.entity.mapper.ClusterMapper;
import org.shaalakosh.master.entity.mapper.DistrictMapper;
import org.shaalakosh.master.entity.mapper.MediumOfInstructionMapper;
import org.shaalakosh.master.entity.mapper.MenuMapper;
import org.shaalakosh.master.entity.mapper.MenuSectionMasterMapper;
import org.shaalakosh.master.entity.mapper.MinorityCommunityMapper;
import org.shaalakosh.master.entity.mapper.ResidentialSchoolTypeMapper;
import org.shaalakosh.master.entity.mapper.RoleMapper;
import org.shaalakosh.master.entity.mapper.SchoolCategoryMapper;
import org.shaalakosh.master.entity.mapper.SchoolCategoryTypeMapper;
import org.shaalakosh.master.entity.mapper.SchoolManagementDetailMapper;
import org.shaalakosh.master.entity.mapper.SchoolMapper;
import org.shaalakosh.master.entity.mapper.StateMapper;
import org.shaalakosh.master.entity.mapper.UserMapper;
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
import org.shaalakosh.master.model.State;
import org.shaalakosh.master.model.UserMaster;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("MasterDao")
public class MasterDaoImpl implements MasterDao {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public List<State> getAllStates() {
		return jdbcTemplate.query("Select * from mst_state", new StateMapper());
	}

	@Override
	public List<District> getDistrictsByState(int stateID) {
		try {
			return jdbcTemplate.query("Select * from mst_district where StateID = ? and IsActive=1",
					new Object[] { stateID }, new DistrictMapper());
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<Block> getBlocksByDistrict(int districtID) {
		try {
			return jdbcTemplate.query("Select * from mst_block where DistrictID = ? and IsActive=1",
					new Object[] { districtID }, new BlockMapper());
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<Cluster> getClustersByBlock(int blockID) {
		try {
			return jdbcTemplate.query("Select * from mst_cluster where BlockID = ? and IsActive=1",
					new Object[] { blockID }, new ClusterMapper());
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<School> getSchoolByCluster(int clusterID) {
		try {
			return jdbcTemplate.query("Select * from mst_school where ClusterID = ? and IsActive=1",
					new Object[] { clusterID }, new SchoolMapper());
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<UserMaster> getAllUsers() {
		return jdbcTemplate.query("Select * from mst_usermaster", new UserMapper());
	}

	@Override
	public List<MenuSectionMaster> getAllSections() {
		return jdbcTemplate.query("Select * from mst_MenuSectionMaster", new MenuSectionMasterMapper());
	}

	@Override
	public List<Menu> getAllMenu() {
		return jdbcTemplate.query("Select * from mst_Menu", new MenuMapper());
	}

	@Override
	public List<SchoolCategory> getAllSchoolCategories() {
		return jdbcTemplate.query("Select * from mst_schoolcategory", new SchoolCategoryMapper());
	}

	@Override
	public List<SchoolCategoryType> getAllSchoolCategoryTypes() {
		return jdbcTemplate.query("Select * from mst_schoolcategorytype", new SchoolCategoryTypeMapper());
	}
	
	@Override
	public List<SchoolManagementDetails> getSchoolManagementDetails() {
		return jdbcTemplate.query("Select * from mst_schoolmanagementdetails ", new SchoolManagementDetailMapper());
	}

	@Override
	public List<ResidentialSchoolType> getResidentialSchooltype() {
		return jdbcTemplate.query("Select * from mst_residentialschooltype", new ResidentialSchoolTypeMapper());
	}

	@Override
	public List<MinorityCommunity> getMinorityCommunities() {
		return jdbcTemplate.query("Select * from mst_minoritycommunity", new MinorityCommunityMapper());
	}

	@Override
	public List<MediumOfInstruction> getMediumOfInstruction() {
		return jdbcTemplate.query("Select * from mst_mediumofinstruction", new MediumOfInstructionMapper());
	}

	@Override
	public List<BlockResourceCentre> getBlockResourceCentre() {
		return jdbcTemplate.query("Select * from mst_blockresourcecentre", new BlockResourceCentreMapper());
	}

	@Override
	public List<Role> getAllRoles() {
		return jdbcTemplate.query("Select * from mst_role ", new RoleMapper());
	}

}
