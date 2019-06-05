package org.shaalakosh.master.controller;

import org.shaalakosh.master.pojo.ServiceResponse;
import org.shaalakosh.master.service.MasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost", maxAge = 3600)
@RestController
public class MasterController {
		@Autowired
		private MasterService masterService;

		@RequestMapping(value="/state", method = RequestMethod.GET)
	    public ServiceResponse getAllStates(){
			System.out.println("comingg...");
	        return masterService.getAllStates();
	    }
		@GetMapping("district/{stateID}")
		public ServiceResponse  getDistrictsByState(@PathVariable("stateID")Integer stateID){ 
			return masterService.getDistrictsByState(stateID);
		}
		
		@GetMapping("block/{districtID}")
		public ServiceResponse  getBlocksByDistrict(@PathVariable("districtID")Integer districtID){
			return masterService.getBlocksByDistrict(districtID);
		}

		
		@GetMapping("cluster/{blockID}")
		public ServiceResponse  getClustersByBlock(@PathVariable("blockID")Integer blockID){
			return masterService.getClustersByBlock(blockID);
		}
		
		@GetMapping("school/{clusterID}")
		public ServiceResponse  getSchoolByCluster(@PathVariable("clusterID")Integer clusterID){
			return  masterService.getSchoolByCluster(clusterID);
		}
		
		@RequestMapping(value="/section", method = RequestMethod.GET)
	    public ServiceResponse getAllSection(){
			System.out.println("comingg...");
	        return masterService.getAllSections();
	    }
		
		@RequestMapping(value = "/userdetails", method = RequestMethod.GET)
		public ServiceResponse getAllUsers() {
			System.out.println("comingg...");
			return masterService.getAllUsers();
		   
		}
		@RequestMapping(value = "/menu", method = RequestMethod.GET)
		public ServiceResponse getAllMenu() {
			System.out.println("comingg...");
			return masterService.getAllMenu(); 
		}
		@RequestMapping(value = "/getAllMasters", method = RequestMethod.GET)
		public ServiceResponse getAllMasters() {
			System.out.println("comingg...");
			return masterService.getAllMasters();
		}
		
		@RequestMapping(value = "/schoolCategory", method = RequestMethod.GET)
		public ServiceResponse getAllSchoolCategories() {
			System.out.println("getAllSchoolCategories...");
			return masterService.getAllSchoolCategories(); 
		}
		
		@RequestMapping(value = "/schoolCategoryType", method = RequestMethod.GET)
		public ServiceResponse getAllSchoolCategoryTypes() {
			System.out.println("getAllSchoolCategoryType...");
			return masterService.getAllSchoolCategoryTypes(); 
		}
		
		@RequestMapping(value = "/schoolManagementDetails", method = RequestMethod.GET)
		public ServiceResponse getSchoolManagementDetails() {
			System.out.println("getSchoolManagementDetails...");
			return masterService.getSchoolManagementDetails(); 
		}
		
		@RequestMapping(value = "/residentialSchoolType", method = RequestMethod.GET)
		public ServiceResponse getResidentialSchooltype() {
			System.out.println("getResidentialSchooltype...");
			return masterService.getResidentialSchooltype(); 
		}
		
		@RequestMapping(value = "/minorityCommunity", method = RequestMethod.GET)
		public ServiceResponse getMinorityCommunities() {
			System.out.println("getMinorityCommunities...");
			return masterService.getMinorityCommunities(); 
		}
		
		@RequestMapping(value = "/mediumOfInstruction", method = RequestMethod.GET)
		public ServiceResponse getMediumOfInstruction() {
			System.out.println("getMediumOfInstruction...");
			return masterService.getMediumOfInstruction(); 
		}
		
		@RequestMapping(value = "/blockResourceCentre", method = RequestMethod.GET)
		public ServiceResponse getBlockResourceCentre() {
			System.out.println("getBlockResourceCentre...");
			return masterService.getBlockResourceCentre(); 
		}
		
		@RequestMapping(value = "/role", method = RequestMethod.GET)
		public ServiceResponse getAllRoles() {
			System.out.println("getAllRoles...");
			return masterService.getAllRoles(); 
		}
		
}	
				
