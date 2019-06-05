package org.shaalakosh.master.model;

import java.util.Date;

public class Menu {
	private int menuID;
	private String menuCode;
	private String menu;
	private int menuTypeID;
	private int rootID;
	private int levelID;
	private int documentID;
	private int parentID;
	private String targetURL;
	private int sortOrder;
	private Date createdDate;
	private String IconUrl;
	private boolean isActive;
	public int getMenuID() {
		return menuID;
	}
	public void setMenuID(int menuID) {
		this.menuID = menuID;
	}
	public String getMenuCode() {
		return menuCode;
	}
	public void setMenuCode(String menuCode) {
		this.menuCode = menuCode;
	}
	public String getMenu() {
		return menu;
	}
	public void setMenu(String menu) {
		this.menu = menu;
	}
	public int getMenuTypeID() {
		return menuTypeID;
	}
	public void setMenuTypeID(int menuTypeID) {
		this.menuTypeID = menuTypeID;
	}
	public int getRootID() {
		return rootID;
	}
	public void setRootID(int rootID) {
		this.rootID = rootID;
	}
	public int getLevelID() {
		return levelID;
	}
	public void setLevelID(int levelID) {
		this.levelID = levelID;
	}
	public int getDocumentID() {
		return documentID;
	}
	public void setDocumentID(int documentID) {
		this.documentID = documentID;
	}
	public int getParentID() {
		return parentID;
	}
	public void setParentID(int parentID) {
		this.parentID = parentID;
	}
	public String getTargetURL() {
		return targetURL;
	}
	public void setTargetURL(String targetURL) {
		this.targetURL = targetURL;
	}
	public int getSortOrder() {
		return sortOrder;
	}
	public void setSortOrder(int sortOrder) {
		this.sortOrder = sortOrder;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public String getIconUrl() {
		return IconUrl;
	}
	public void setIconUrl(String iconUrl) {
		IconUrl = iconUrl;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	@Override
	public String toString() {
		return "Menu [menuID=" + menuID + ", menuCode=" + menuCode + ", menu=" + menu + ", menuTypeID=" + menuTypeID
				+ ", rootID=" + rootID + ", levelID=" + levelID + ", documentID=" + documentID + ", parentID="
				+ parentID + ", targetURL=" + targetURL + ", sortOrder=" + sortOrder + ", createdDate=" + createdDate
				+ ", IconUrl=" + IconUrl + ", isActive=" + isActive + "]";
	}
	

}
