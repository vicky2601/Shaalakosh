package org.shaalakosh.master.model;

public class SchoolManagementDetails {
	
	private int schoolManagementID;
	
	private String schoolManagementDesc	;
	
	private boolean isActive;

	public int getSchoolManagementID() {
		return schoolManagementID;
	}

	public void setSchoolManagementID(int schoolManagementID) {
		this.schoolManagementID = schoolManagementID;
	}

	public String getSchoolManagementDesc() {
		return schoolManagementDesc;
	}

	public void setSchoolManagementDesc(String schoolManagementDesc) {
		this.schoolManagementDesc = schoolManagementDesc;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
	

}
