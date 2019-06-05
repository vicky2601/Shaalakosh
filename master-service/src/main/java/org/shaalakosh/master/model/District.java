package org.shaalakosh.master.model;

import java.util.Date;

public class District {
	private int districtID;
	private String districtCode;
	private String districtName;
	private String udiseDistrictCode;
	private String lgdDistrictCode;
	private int stateID;
	private String stateCode;
	private int createdByUserID;
	private Date createdDate;
	private int UpdatedByUserID;
	private Date updatedDate;
	private boolean isActive;
	public int getDistrictID() {
		return districtID;
	}
	public void setDistrictID(int districtID) {
		this.districtID = districtID;
	}
	public String getDistrictName() {
		return districtName;
	}
	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}
	public String getUdiseDistrictCode() {
		return udiseDistrictCode;
	}
	public void setUdiseDistrictCode(String udiseDistrictCode) {
		this.udiseDistrictCode = udiseDistrictCode;
	}
	public String getLgdDistrictCode() {
		return lgdDistrictCode;
	}
	public void setLgdDistrictCode(String lgdDistrictCode) {
		this.lgdDistrictCode = lgdDistrictCode;
	}
	public int getStateID() {
		return stateID;
	}
	public void setStateID(int stateID) {
		this.stateID = stateID;
	}
	public String getStateCode() {
		return stateCode;
	}
	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}
	public int getCreatedByUserID() {
		return createdByUserID;
	}
	public void setCreatedByUserID(int createdByUserID) {
		this.createdByUserID = createdByUserID;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public int getUpdatedByUserID() {
		return UpdatedByUserID;
	}
	public void setUpdatedByUserID(int updatedByUserID) {
		UpdatedByUserID = updatedByUserID;
	}
	public Date getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public String getDistrictCode() {
		return districtCode;
	}
	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}
	@Override
	public String toString() {
		return "District [districtID=" + districtID + ", districtName=" + districtName + ", udiseDistrictCode="
				+ udiseDistrictCode + ", lgdDistrictCode=" + lgdDistrictCode + ", stateID=" + stateID + ", stateCode="
				+ stateCode + ", createdByUserID=" + createdByUserID + ", createdDate=" + createdDate
				+ ", UpdatedByUserID=" + UpdatedByUserID + ", updatedDate=" + updatedDate + ", isActive=" + isActive
				+ "]";
	}
	
	
	

}
