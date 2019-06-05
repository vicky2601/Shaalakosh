package org.shaalakosh.master.model;

public class SchoolCategoryType {
	
	private int schoolCategoryTypeID;
	
	private String schoolCategoryTypeName;
	
	private boolean isActive;

	public int getSchoolCategoryTypeID() {
		return schoolCategoryTypeID;
	}

	public void setSchoolCategoryTypeID(int schoolCategoryTypeID) {
		this.schoolCategoryTypeID = schoolCategoryTypeID;
	}

	public String getSchoolCategoryTypeName() {
		return schoolCategoryTypeName;
	}

	public void setSchoolCategoryTypeName(String schoolCategoryTypeName) {
		this.schoolCategoryTypeName = schoolCategoryTypeName;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
	

}
