package org.shaalakosh.school.model.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.shaalakosh.school.model.LocationAndEstablishmentInfo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.RowMapper;

public class LocationAndEstablishmentInfoMapper implements RowMapper<LocationAndEstablishmentInfo> {

	@Value("${local.upload.location}")
	private String uploadLocation;

	@Override
	public LocationAndEstablishmentInfo mapRow(ResultSet resultSet, int arg1) throws SQLException {
		LocationAndEstablishmentInfo locationAndEstablishmentInfo = new LocationAndEstablishmentInfo();
		locationAndEstablishmentInfo.setLocationAndEstablishmentId(resultSet.getInt("location_id"));
		locationAndEstablishmentInfo.setBasicSchoolProfileId(resultSet.getInt("basic_school_profile_id"));
		locationAndEstablishmentInfo.setLongitude(resultSet.getInt("lattitude"));
		locationAndEstablishmentInfo.setLattitude(resultSet.getInt("longitude"));
		locationAndEstablishmentInfo.setNameOfTheABMT(resultSet.getInt("name_of_adm_rb_mn_tl"));
		locationAndEstablishmentInfo.setSchoolLocationId(resultSet.getInt("school_location_id"));
		locationAndEstablishmentInfo.setVillageName(resultSet.getInt("village_name"));
		locationAndEstablishmentInfo.setGramPanchayat(resultSet.getInt("gram_panchayat"));
		locationAndEstablishmentInfo.setHabitation(resultSet.getString("habitation"));
		locationAndEstablishmentInfo.setMunicipalityName(resultSet.getInt("municipality_name"));
		locationAndEstablishmentInfo.setWardNumber(resultSet.getInt("ward_number"));
		locationAndEstablishmentInfo.setMohalla(resultSet.getString("mohalla"));
		locationAndEstablishmentInfo.setAssemblyConstName(resultSet.getInt("assembly_const_name"));
		locationAndEstablishmentInfo.setParliamentryConstName(resultSet.getInt("parliamentry_const_name"));
		locationAndEstablishmentInfo.setCityName(resultSet.getString("city_name"));
		locationAndEstablishmentInfo.setRespondantName(resultSet.getInt("respondant_name"));
		locationAndEstablishmentInfo.setStdCode(resultSet.getInt("std_code"));
		locationAndEstablishmentInfo.setSchoolTelephone1(resultSet.getInt("school_telephone1"));
		locationAndEstablishmentInfo.setRespMobile(resultSet.getInt("resp_mobile"));
		locationAndEstablishmentInfo.setSchoolStdCode(resultSet.getInt("school_std_code"));
		locationAndEstablishmentInfo.setSchoolTelephone2(resultSet.getInt("school_telephone2"));
		locationAndEstablishmentInfo.setSchoolWebsite(resultSet.getString("school_website"));
		locationAndEstablishmentInfo.setSchool_email(resultSet.getString("school_email"));
		locationAndEstablishmentInfo.setSchoolEstablishmentYear(resultSet.getInt("school_establishment_yr"));
		locationAndEstablishmentInfo.setEleRecognitionYear(resultSet.getInt("ele_recognition_yr"));
		locationAndEstablishmentInfo.setSecEstablishmentYear(resultSet.getInt("sec_establishment_yr"));
		locationAndEstablishmentInfo.setHrSecRecognitionYear(resultSet.getInt("sec_establishment_yr"));
		locationAndEstablishmentInfo.setUpgradeUpYear(resultSet.getInt("upgrade_up_yr"));
		locationAndEstablishmentInfo.setUpgradeSecYear(resultSet.getInt("upgrade_sec_yr"));
		locationAndEstablishmentInfo.setUpgradeHRSecYear(resultSet.getInt("upgrade_hr_sec_yr"));
		locationAndEstablishmentInfo.setImageName(resultSet.getString("image_name"));
		return locationAndEstablishmentInfo;
	}

}
