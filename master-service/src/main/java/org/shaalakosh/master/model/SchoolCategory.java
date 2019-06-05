package org.shaalakosh.master.model;

import java.util.Date;

public class SchoolCategory {
	
	private int schoolCategoryID;
	
	private String schoolCategoryName;
	
	private int lowestClassID;
	
	private int highestClassID;
	
	private int createdByUserID;
	
	private Date createdDate;
	
	private int updatedByUserID;
	
	private Date updatedDate;
	
	private boolean isActive;

	public int getSchoolCategoryID() {
		return schoolCategoryID;
	}

	public void setSchoolCategoryID(int schoolCategoryID) {
		this.schoolCategoryID = schoolCategoryID;
	}

	public String getSchoolCategoryName() {
		return schoolCategoryName;
	}

	public void setSchoolCategoryName(String schoolCategoryName) {
		this.schoolCategoryName = schoolCategoryName;
	}

	public int getLowestClassID() {
		return lowestClassID;
	}

	public void setLowestClassID(int lowestClassID) {
		this.lowestClassID = lowestClassID;
	}

	public int getHighestClassID() {
		return highestClassID;
	}

	public void setHighestClassID(int highestClassID) {
		this.highestClassID = highestClassID;
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
	
	

}
