package org.shaalakosh.master.model;

import java.util.Date;

public class State{
	private int stateID;
	private String stateCode;
	private String udisestatecode;
	private String ladstatecode;
	private boolean isdefaultState;
	private int createdByUserId;
	private Date createdDate;
	private int updatedByUserId;
	private Date updatedDate;
	private boolean isActive;
	public Integer getStateID() {
		return stateID;
	}
	public void setStateID(Integer stateID) {
		this.stateID = stateID;
	}
	public String getStateCode() {
		return stateCode;
	}
	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}
	public String getUdisestatecode() {
		return udisestatecode;
	}
	public void setUdisestatecode(String udisestatecode) {
		this.udisestatecode = udisestatecode;
	}
	public String getLadstatecode() {
		return ladstatecode;
	}
	public void setLadstatecode(String ladstatecode) {
		this.ladstatecode = ladstatecode;
	}
	public boolean isIsdefaultState() {
		return isdefaultState;
	}
	public void setIsdefaultState(boolean isdefaultState) {
		this.isdefaultState = isdefaultState;
	}
	public Integer getCreatedByUserId() {
		return createdByUserId;
	}
	public void setCreatedByUserId(Integer createdByUserId) {
		this.createdByUserId = createdByUserId;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Integer getUpdatedByUserId() {
		return updatedByUserId;
	}
	public void setUpdatedByUserId(Integer updatedByUserId) {
		this.updatedByUserId = updatedByUserId;
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
		return "State [stateID=" + stateID + ", stateCode=" + stateCode + ", udisestatecode=" + udisestatecode
				+ ", ladstatecode=" + ladstatecode + ", isdefaultState=" + isdefaultState + ", createdByUserId="
				+ createdByUserId + ", createdDate=" + createdDate + ", updatedByUserId=" + updatedByUserId
				+ ", updatedDate=" + updatedDate + ", isActive=" + isActive + "]";
	}
	
	
}
