package org.shaalakosh.master.model;

public class UserMaster {
	private int UserID;
	private String UserName;
	private String Password;
	private String Name;
	private String Mobile;
	private String Email;
	private int UserGroupID;
	private int LevelID;
	private String Remarks;
	private int IsActive;
	private int IsFirstAttempt;
	
	public int getUserID() {
		return UserID;
	}
	public void setUserID(int userID) {
		UserID = userID;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getMobile() {
		return Mobile;
	}
	public void setMobile(String mobile) {
		Mobile = mobile;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public int getUserGroupID() {
		return UserGroupID;
	}
	public void setUserGroupID(int userGroupID) {
		UserGroupID = userGroupID;
	}
	public int getLevelID() {
		return LevelID;
	}
	public void setLevelID(int levelID) {
		LevelID = levelID;
	}
	public String getRemarks() {
		return Remarks;
	}
	public void setRemarks(String remarks) {
		Remarks = remarks;
	}
	public int getIsActive() {
		return IsActive;
	}
	public void setIsActive(int isActive) {
		IsActive = isActive;
	}
	public int getIsFirstAttempt() {
		return IsFirstAttempt;
	}
	public void setIsFirstAttempt(int isFirstAttempt) {
		IsFirstAttempt = isFirstAttempt;
	}
	
	@Override
	public String toString() {
		return "UserMaster [UserID=" + UserID + ", UserName=" + UserName + ", Password=" + Password + ", Name=" + Name
				+ ", Mobile=" + Mobile + ", Email=" + Email + ", UserGroupID=" + UserGroupID + ", LevelID=" + LevelID
				+ ", Remarks=" + Remarks + ", IsActive=" + IsActive + ", IsFirstAttempt=" + IsFirstAttempt + "]";
	}
	

}
