package org.shaalakosh.school.model;

import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.annotation.JsonIgnore;

// table name "location_and_establishment_information"
public class LocationAndEstablishmentInfo {

	private int locationAndEstablishmentId;
	private int basicSchoolProfileId; // basic_school_profile_id
	private double lattitude; // lattitude
	private double longitude; // longitude
	private int nameOfTheABMT; // name_of_adm_rb_mn_tl
	private int schoolLocationId; // school_location_id

	private int villageName; // village_name
	private int gramPanchayat; // gram_panchayat
	private String habitation; // habitation
	private int municipalityName; // municipality_name
	private int wardNumber; // ward_number
	private String mohalla; // mohalla
	private int assemblyConstName; // assembly_const_name
	private int parliamentryConstName; // parliamentry_const_name
	private String cityName; // city_name
	private int respondantName; // respondant_name
	private int stdCode; // std_code
	private int schoolTelephone1; // school_telephone1
	private int respMobile; // resp_mobile
	private int schoolStdCode; // school_std_code
	private int schoolTelephone2; // school_telephone2
	private String schoolWebsite; // school_website
	private String school_email; // school_email
	private int schoolEstablishmentYear; // school_establishment_yr
	private int EleRecognitionYear; // ele_recognition_yr
	private int secEstablishmentYear; // sec_establishment_yr
	private int hrSecRecognitionYear; // hr_sec_recognition_yr
	private int upgradeUpYear; // upgrade_up_yr
	private int upgradeSecYear; // upgrade_sec_yr
	private int upgradeHRSecYear; // upgrade_hr_sec_yr

	@JsonIgnore
	private MultipartFile multipartFile;

	private String imageName; // image_name

	public int getLocationAndEstablishmentId() {
		return locationAndEstablishmentId;
	}

	public void setLocationAndEstablishmentId(int locationAndEstablishmentId) {
		this.locationAndEstablishmentId = locationAndEstablishmentId;
	}

	public int getBasicSchoolProfileId() {
		return basicSchoolProfileId;
	}

	public void setBasicSchoolProfileId(int basicSchoolProfileId) {
		this.basicSchoolProfileId = basicSchoolProfileId;
	}

	public double getLattitude() {
		return lattitude;
	}

	public void setLattitude(double lattitude) {
		this.lattitude = lattitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public int getNameOfTheABMT() {
		return nameOfTheABMT;
	}

	public void setNameOfTheABMT(int nameOfTheABMT) {
		this.nameOfTheABMT = nameOfTheABMT;
	}

	public int getSchoolLocationId() {
		return schoolLocationId;
	}

	public void setSchoolLocationId(int schoolLocationId) {
		this.schoolLocationId = schoolLocationId;
	}

	public int getVillageName() {
		return villageName;
	}

	public void setVillageName(int villageName) {
		this.villageName = villageName;
	}

	public int getGramPanchayat() {
		return gramPanchayat;
	}

	public void setGramPanchayat(int gramPanchayat) {
		this.gramPanchayat = gramPanchayat;
	}

	public String getHabitation() {
		return habitation;
	}

	public void setHabitation(String habitation) {
		this.habitation = habitation;
	}

	public int getMunicipalityName() {
		return municipalityName;
	}

	public void setMunicipalityName(int municipalityName) {
		this.municipalityName = municipalityName;
	}

	public int getWardNumber() {
		return wardNumber;
	}

	public void setWardNumber(int wardNumber) {
		this.wardNumber = wardNumber;
	}

	public String getMohalla() {
		return mohalla;
	}

	public void setMohalla(String mohalla) {
		this.mohalla = mohalla;
	}

	public int getAssemblyConstName() {
		return assemblyConstName;
	}

	public void setAssemblyConstName(int assemblyConstName) {
		this.assemblyConstName = assemblyConstName;
	}

	public int getParliamentryConstName() {
		return parliamentryConstName;
	}

	public void setParliamentryConstName(int parliamentryConstName) {
		this.parliamentryConstName = parliamentryConstName;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public int getRespondantName() {
		return respondantName;
	}

	public void setRespondantName(int respondantName) {
		this.respondantName = respondantName;
	}

	public int getStdCode() {
		return stdCode;
	}

	public void setStdCode(int stdCode) {
		this.stdCode = stdCode;
	}

	public int getSchoolTelephone1() {
		return schoolTelephone1;
	}

	public void setSchoolTelephone1(int schoolTelephone1) {
		this.schoolTelephone1 = schoolTelephone1;
	}

	public int getRespMobile() {
		return respMobile;
	}

	public void setRespMobile(int respMobile) {
		this.respMobile = respMobile;
	}

	public int getSchoolStdCode() {
		return schoolStdCode;
	}

	public void setSchoolStdCode(int schoolStdCode) {
		this.schoolStdCode = schoolStdCode;
	}

	public int getSchoolTelephone2() {
		return schoolTelephone2;
	}

	public void setSchoolTelephone2(int schoolTelephone2) {
		this.schoolTelephone2 = schoolTelephone2;
	}

	public String getSchoolWebsite() {
		return schoolWebsite;
	}

	public void setSchoolWebsite(String schoolWebsite) {
		this.schoolWebsite = schoolWebsite;
	}

	public String getSchool_email() {
		return school_email;
	}

	public void setSchool_email(String school_email) {
		this.school_email = school_email;
	}

	public int getSchoolEstablishmentYear() {
		return schoolEstablishmentYear;
	}

	public void setSchoolEstablishmentYear(int schoolEstablishmentYear) {
		this.schoolEstablishmentYear = schoolEstablishmentYear;
	}

	public int getEleRecognitionYear() {
		return EleRecognitionYear;
	}

	public void setEleRecognitionYear(int eleRecognitionYear) {
		EleRecognitionYear = eleRecognitionYear;
	}

	public int getSecEstablishmentYear() {
		return secEstablishmentYear;
	}

	public void setSecEstablishmentYear(int secEstablishmentYear) {
		this.secEstablishmentYear = secEstablishmentYear;
	}

	public int getHrSecRecognitionYear() {
		return hrSecRecognitionYear;
	}

	public void setHrSecRecognitionYear(int hrSecRecognitionYear) {
		this.hrSecRecognitionYear = hrSecRecognitionYear;
	}

	public int getUpgradeUpYear() {
		return upgradeUpYear;
	}

	public void setUpgradeUpYear(int upgradeUpYear) {
		this.upgradeUpYear = upgradeUpYear;
	}

	public int getUpgradeSecYear() {
		return upgradeSecYear;
	}

	public void setUpgradeSecYear(int upgradeSecYear) {
		this.upgradeSecYear = upgradeSecYear;
	}

	public int getUpgradeHRSecYear() {
		return upgradeHRSecYear;
	}

	public void setUpgradeHRSecYear(int upgradeHRSecYear) {
		this.upgradeHRSecYear = upgradeHRSecYear;
	}

	public MultipartFile getMultipartFile() {
		return multipartFile;
	}

	public void setMultipartFile(MultipartFile multipartFile) {
		this.multipartFile = multipartFile;
	}

	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

}
