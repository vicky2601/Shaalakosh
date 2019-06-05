package org.shaalakosh.master.model;

import java.util.Date;

public class Block {
	private int blockID;
	private String blockCode;
	private String blockName;
	private String UdiseBlockCode;
	private String lgdBlockCode;
	private int districtID;
	private String districtCode;
	private int stateID;
	private String stateCode;
	private int createdByUserID;
	private Date createdDate;
	private int updatedByUserID;
	private Date updatedDate;
	private boolean isActive;
	public int getBlockID() {
		return blockID;
	}
	public void setBlockID(int blockID) {
		this.blockID = blockID;
	}
	public String getBlockCode() {
		return blockCode;
	}
	public void setBlockCode(String blockCode) {
		this.blockCode = blockCode;
	}
	public String getBlockName() {
		return blockName;
	}
	public void setBlockName(String blockName) {
		this.blockName = blockName;
	}
	public String getUdiseBlockCode() {
		return UdiseBlockCode;
	}
	public void setUdiseBlockCode(String udiseBlockCode) {
		UdiseBlockCode = udiseBlockCode;
	}
	public String getLgdBlockCode() {
		return lgdBlockCode;
	}
	public void setLgdBlockCode(String lgdBlockCode) {
		this.lgdBlockCode = lgdBlockCode;
	}
	public int getDistrictID() {
		return districtID;
	}
	public void setDistrictID(int districtID) {
		this.districtID = districtID;
	}
	public String getDistrictCode() {
		return districtCode;
	}
	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
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
		return updatedByUserID;
	}
	public void setUpdatedByUserID(int updatedByUserID) {
		this.updatedByUserID = updatedByUserID;
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
	@Override
	public String toString() {
		return "Block [blockID=" + blockID + ", blockCode=" + blockCode + ", blockName=" + blockName
				+ ", UdiseBlockCode=" + UdiseBlockCode + ", lgdBlockCode=" + lgdBlockCode + ", districtID=" + districtID
				+ ", districtCode=" + districtCode + ", stateID=" + stateID + ", stateCode=" + stateCode
				+ ", createdByUserID=" + createdByUserID + ", createdDate=" + createdDate + ", updatedByUserID="
				+ updatedByUserID + ", updatedDate=" + updatedDate + ", isActive=" + isActive + "]";
	}
	

}
