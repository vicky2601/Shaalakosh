package org.shaalakosh.school.controller;

import java.io.FileNotFoundException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;
import org.shaalakosh.school.JwtTokenParser;
import org.shaalakosh.school.bean.BasicSchoolProfileInfoBean;
import org.shaalakosh.school.bean.LocationAndEstablishmentInfoBean;
import org.shaalakosh.school.bean.SMDCCommitteeInfoBean;
import org.shaalakosh.school.bean.SchoolManagementAndMediumInfoBean;
import org.shaalakosh.school.bean.SchoolSplSmcInfoBean;
import org.shaalakosh.school.pojo.CustomReponseStatus;
import org.shaalakosh.school.pojo.ServiceResponse;
import org.shaalakosh.school.service.SchoolProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.StreamingResponseBody;

@RestController
@RequestMapping("/school_profile")
public class SchoolProfileController {

	@Autowired
	private SchoolProfileService schoolProfileService;

	/*
	 * @Autowired private OauthFeignClient oauthFeignClient;
	 */

	/*
	 * @Autowired private MasterService masterService;
	 */

	@RequestMapping(value = "/saveBasicSchoolProfileInfo", method = RequestMethod.POST)
	public CustomReponseStatus saveBasicSchoolProfileInfo(
			@RequestBody BasicSchoolProfileInfoBean basicSchoolProfileInfoBean) {
		return schoolProfileService.saveBasicSchoolProfileInfo(basicSchoolProfileInfoBean);
	}

	/* Fetch by id or if id is 0 it give all data */
	@RequestMapping(value = "/fetchBasicSchoolProfileInfoByProfileId/{profileId}", method = RequestMethod.GET)
	public ServiceResponse fetchBasicSchoolProfileInfoByProfileId(@PathVariable String profileId) {
		return schoolProfileService.fetchBasicSchoolProfileInfoBySchoolId(profileId);
	}

	@RequestMapping(value = "/saveLocationAndEstablishmentInfo", method = RequestMethod.POST)
	public CustomReponseStatus saveLocationAndEstablishmentInfo(
			@ModelAttribute LocationAndEstablishmentInfoBean locationAndEstablishmentInfoBean) {
		return schoolProfileService.saveLocationAndEstablishmentInfo(locationAndEstablishmentInfoBean);
	}

	@RequestMapping(value = "/fetchLocationAndEstablishmentInfoByBasicSchoolProfileId/{id}", method = RequestMethod.GET)
	public ServiceResponse fetchLocationAndEstablishmentInfoByBasicSchoolProfileId(@PathVariable String id) {
		return schoolProfileService.fetchLocationAndEstablishmentInfoByBasicSchoolProfileId(id);
	}

	@RequestMapping(value = "/downloadSchoolImage/{basicSchoolProfileId}", method = RequestMethod.GET)
	public StreamingResponseBody downloadSchoolImage(HttpServletResponse response,
			@PathVariable String basicSchoolProfileId) throws FileNotFoundException {
		return schoolProfileService.downloadSchoolImage(response, basicSchoolProfileId);
	}

	@RequestMapping(value = "/saveSchoolManagementAndMediumInfo", method = RequestMethod.POST)
	public CustomReponseStatus saveSchoolManagementAndMedium(
			@RequestBody SchoolManagementAndMediumInfoBean schoolManagementAndMediumInfoBean,
			HttpServletRequest request) {

		final String authHeader = request.getHeader("authorization");
		final String token = authHeader.substring(7);
		System.out.println("token :- " + token);
		JSONObject mapToken = null;
		try {
			mapToken = JwtTokenParser.parseToken(token);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String username = (String) mapToken.get("user_name");
		System.out.println(username);
		// UserMaster userMaster = oauthFeignClient.getUserDetail(username);
		schoolManagementAndMediumInfoBean.setCreatedByUserID(username);
		return schoolProfileService.saveSchoolManagementAndMediumInfo(schoolManagementAndMediumInfoBean);
	}

	/* Fetch by School profile id or if id is 0 it give all data */
	@RequestMapping(value = "/fetchSchoolManagementAndMediumBySchoolId/{schoolId}", method = RequestMethod.GET)
	public ServiceResponse fetchSchoolManagementAndMediumByProfileId(@PathVariable String schoolId,
			HttpServletRequest request) {
		System.out.println(request.getRemoteAddr());
		return schoolProfileService.fetchSchoolManagementAndMediumInfoBySchoolId(schoolId);
	}

	@RequestMapping(value = "/saveSmdcCommitteeInfo", method = RequestMethod.POST)
	public CustomReponseStatus saveSmdcCommittee(@RequestBody SMDCCommitteeInfoBean smdcCommitteeInfoBean,
			HttpServletRequest request) {
		final String authHeader = request.getHeader("authorization");
		final String token = authHeader.substring(7);
		System.out.println("token :- " + token);
		JSONObject mapToken = null;
		try {
			mapToken = JwtTokenParser.parseToken(token);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String username = (String) mapToken.get("user_name");
		System.out.println(username);
		// UserMaster userMaster = oauthFeignClient.getUserDetail(username);
		smdcCommitteeInfoBean.setCreatedByUser(username);
		return schoolProfileService.saveSMDCCommitteeInfo(smdcCommitteeInfoBean);
	}

	/* Fetch by School profile id or if id is 0 it give all data */
	@RequestMapping(value = "/fetchSmdcCommitteeBySchoolId/{schoolId}", method = RequestMethod.GET)
	public ServiceResponse fetchSmdcCommitteeByProfileId(@PathVariable String schoolId, HttpServletRequest request) {
		System.out.println(request.getRemoteAddr());
		return schoolProfileService.fetchSMDCCommitteeInfoBySchoolId(schoolId);
	}

	// training tle school id
	// Save
	@RequestMapping(value = "/saveSchoolSplSmcInfo", method = RequestMethod.POST)
	public CustomReponseStatus saveSchoolSplSmcInfo(@RequestBody SchoolSplSmcInfoBean schoolSplSmcInfoBean) {
		return schoolProfileService.saveSchoolSplSmcInfo(schoolSplSmcInfoBean);
	}

	// Fetch
	@RequestMapping(value = "/fetchTrainingTleSmcInfoBySchoolId/{SchoolID}}", method = RequestMethod.GET)
	public ServiceResponse fetchTrainingTleSmcInfoBySchoolId(@PathVariable String SchoolID,
			HttpServletRequest request) {
		System.out.println(request.getRemoteAddr());
		return schoolProfileService.fetchTrainingTleSmcInfoBySchoolId(SchoolID);
	}
}
