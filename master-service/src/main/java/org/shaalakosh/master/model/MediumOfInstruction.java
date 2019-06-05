package org.shaalakosh.master.model;

public class MediumOfInstruction {
	
	private int instructionID;
	
	private String instructionCode;
	
	private String instructionDesc;
	
	private boolean isActive;

	public int getInstructionID() {
		return instructionID;
	}

	public void setInstructionID(int instructionID) {
		this.instructionID = instructionID;
	}

	public String getInstructionCode() {
		return instructionCode;
	}

	public void setInstructionCode(String instructionCode) {
		this.instructionCode = instructionCode;
	}

	public String getInstructionDesc() {
		return instructionDesc;
	}

	public void setInstructionDesc(String instructionDesc) {
		this.instructionDesc = instructionDesc;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
	

}
