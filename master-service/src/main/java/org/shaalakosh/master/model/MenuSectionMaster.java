package org.shaalakosh.master.model;

public class MenuSectionMaster{
	private int menuSectionID;
	private String menuSection;
	private int menuID;
	private boolean isActive;
	public int getMenuSectionID() {
		return menuSectionID;
	}
	public void setMenuSectionID(int menuSectionID) {
		this.menuSectionID = menuSectionID;
	}
	public String getMenuSection() {
		return menuSection;
	}
	public void setMenuSection(String menuSection) {
		this.menuSection = menuSection;
	}
	public int getMenuID() {
		return menuID;
	}
	public void setMenuID(int menuID) {
		this.menuID = menuID;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	@Override
	public String toString() {
		return "MenuSectionMaster [menuSectionID=" + menuSectionID + ", menuSection=" + menuSection + ", menuID="
				+ menuID + ", isActive=" + isActive + "]";
	}
	
	

}
