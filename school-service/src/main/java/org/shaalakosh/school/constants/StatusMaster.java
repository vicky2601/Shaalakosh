package org.shaalakosh.school.constants;

public enum StatusMaster {

	SUCCESS(1, 200, "Success", "Successfully Done"), FAILED(2, 500, "Failed",
			"Fail to Execute"), DUPLICATE_BASIC_PROFILE_ID(3, 500, "Basic Profile Duplicate",
					"Eligible Basic Profile Id"), DUPLICATE_EXCEPTION(4, 500, "Duplicate Value",
							"Please Check Duplicate Value Given"), EXCEED_FILE_SIZE(5, 500, "Image Error",
									"File Size More Then 100Kb"), IMAGE_EXTENSTION(6, 500, "Image Error",
											"JPG/JPEG Format Allowed");

	private long responseId;
	private long responseCode;
	private String responseMessage;
	private String responseDescription;

	StatusMaster(long responseId, long responseCode, String responseMessage, String responseDescription) {
		this.responseId = responseId;
		this.responseCode = responseCode;
		this.responseMessage = responseMessage;
		this.responseDescription = responseDescription;
	}

	public long getResponseId() {
		return responseId;
	}

	public void setResponseId(long responseId) {
		this.responseId = responseId;
	}

	public long getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(long responseCode) {
		this.responseCode = responseCode;
	}

	public String getResponseMessage() {
		return responseMessage;
	}

	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}

	public String getResponseDescription() {
		return responseDescription;
	}

	public void setResponseDescription(String responseDescription) {
		this.responseDescription = responseDescription;
	}
}
