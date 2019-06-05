package org.shaalakosh.auth.constant;

public enum StatusMaster {

	SUCCESS(1, 200, "Success", "Successfully Done"), FAILED(2, 500, "Failed",
			"Failed"), TEACHER_EDUCATION_PROFILE_CREATION_SUCCESS(3, 200, "Success",
					"Teacher Education Profile Created Successfully"), TEACHER_EDUCATION_PROFILE_CREATION_FAILED(4, 500,
							"Bad Request",
							"Failed to Create Teacher Education Profile"), TEACHER_PROFESSIONAL_PROFILE_CREATION_SUCCESS(
									5, 200, "Success",
									"Teacher Professional Profile Created Successfully"), TEACHER_PROFESSIONAL_PROFILE_CREATION_FAILED(
											6, 500, "Bad Request",
											"Failed to Create Teacher Professional Profile"), TEACHER_BASIC_PROFILE_CREATION_SUCCESS(
													7, 200, "Success",
													"Teacher Basic Profile Created Successfully"), TEACHER_BASIC_PROFILE_CREATION_FAILED(
															8, 500, "Bad Request",
															"Failed to Create Teacher Basic Profile"), USER_CREATION_SUCCESS(
																	9, 200, "Success",
																	"User Created Successfully"), USER_CREATION_FAILED(
																			10, 500, "Bad Request",
																			"Failed to Create User"), USER_PASSWORD_CHANGED_SUCCESS(
																					11, 200, "Success",
																					"Password changed Successfully"), USER_PASSWORD_CHANGED_FAILED(
																							12, 500, "Bad Request",
																							"Failed to Create User"), USER_DOES_NOT_EXIST(
																									13, 500,
																									"Bad Request",
																									"User Doesn't Exist"), INVALID_USER(
																											14, 500,
																											"Bad Request",
																											"Inavlid UserName or Password"), TEACHER_BASIC_PROFILE_IS_EMPTY_MOBILE(
																													15,
																													500,
																													"Bad Request",
																													"Mobile Number Should Not Be Null"), TEACHER_BASIC_PROFILE_IS_EMPTY_EMAIL(
																															16,
																															500,
																															"Bad Request",
																															"Email Id  Should Not Be Null"), TEACHER_BASIC_PROFILE_IS_EMPTY_AADHAR(
																																	17,
																																	500,
																																	"Bad Request",
																																	"Aadhar Number Should Not Be Null"), INVALID_REQUEST(
																																			18,
																																			500,
																																			"Bad Request",
																																			"Inavlid Request"), AADHAR_DUPLICATE(
																																					19,
																																					501,
																																					"Duplicate",
																																					"Aadhar Number already exist"), AADHAR_UNIQUE(
																																							20,
																																							200,
																																							"Unique",
																																							"Unique AadharNumber"), MOBILE_DUPLICATE(
																																									21,
																																									501,
																																									"Duplicate",
																																									"Mobile Number already exist"), MOBILE_UNIQUE(
																																											22,
																																											200,
																																											"Unique",
																																											"Unique Mobile"), EMAIL_DUPLICATE(
																																													23,
																																													501,
																																													"Duplicate",
																																													"Email Id already exist"), EMAIL_UNIQUE(
																																															24,
																																															200,
																																															"Unique",
																																															"Unique Email"), TEACHER_BASIC_PROFILE_UPDATION_SUCCESS(
																																																	25,
																																																	200,
																																																	"Success",
																																																	"Teacher Basic Profile Updated Successfully"), TEACHER_BASIC_PROFILE_UPDATION_FAILED(
																																																			26,
																																																			500,
																																																			"Bad Request",
																																																			"Failed to Update Teacher Basic Profile"), TEACHER_SCHOOL_UDISE_CODE_FAILED(
																																																					27,
																																																					500,
																																																					"Failed",
																																																					"Teacher Udise code cannot be null"), INVALID_USER_NAME_PASSWORD(
																																																							28,
																																																							401,
																																																							"Bad Credentials",
																																																							"Invalid Username or Password"), MOBILE_NUMBER_DOES_NOT_EXIST(
																																																									29,
																																																									500,
																																																									"Bad Request",
																																																									"Mobile Number Doesn't Exist"), AADHAR__NUMBER_DOES_NOT_EXIST(
																																																											30,
																																																											500,
																																																											"Bad Request",
																																																											"Aadhar Number Doesn't Exist"), TEACHER_NAME_DOES_NOT_EXIST(
																																																													31,
																																																													500,
																																																													"Bad Request",

																																																													"Teacher Name Doesn't Exist"), TEACHER_PROFILE_SUBMITED_SUCCESS(
																																																															32,
																																																															200,
																																																															"Success",
																																																															"Teacher Profile Submited Successfully"), TEACHER_PROFILE_SUBMITION_FAILED(
																																																																	33,
																																																																	500,
																																																																	"Failed",
																																																																	"Teacher Profile Failed To Submit"),

	SCHOOL_UDISE_CODE_DOES_NOT_EXIST(34, 500, "Data Not Avaialble", "Inavlid Udise Code"), INVALID_TEACHER_PROFILE_ID(
			35, 500, "Data Not Avaialble", "Inavlid TeacherProfile Code"), INVALID_STATUS(35, 500, "Bad Input",
					"Inavlid Request"), USER_PERSONAL_NAME_REQUIRED(36, 500, "Bad Input",
							"User First and last Name Required to Create User"), USER_NAME_REQUIRED(37, 500,
									"Bad Input", "User Name Required"), USER_PASSWORD_REQUIRED(38, 500, "Bad Input",
											"User Password Required"), USER_ROLE_REQUIRED(39, 500, "Bad Input",
													"User Role Required"), USER_PHONE_NUMBER_REQUIRED(40, 500,
															"Bad Input",
															"User Phone Number Required"), USER_ROLE_TYPE_REQUIRED(41,
																	500, "Bad Input",
																	"User Role Type Required"), USER_EMAIL_REQUIRED(42,
																			500, "Bad Input",
																			"User Email Id Required"), USER_NAME_UNIQUE(
																					43, 500, "Bad Input",
																					"User Name Should Be Unique"), DUPLICATE_PHONE_NUMBER(
																							44, 500, "Bad Input",
																							"User Mobile Number Already Existed"), INVALID_MOBILE_NUMBER(
																									45, 500,
																									"Bad Input",
																									"Invalid Mobile Number"), INVALID_EMAIL_ID(
																											46, 500,
																											"Bad Input",
																											"Invalid Email Address"), SUCCESS_PROGRESS(
																													47,
																													200,
																													"SUCCESS",
																													"Everything Working Fine"), DUPLICATE_EMAIL_ADDRESS(
																															48,
																															500,
																															"Bad Input",
																															"User Email Address Already Existed"), INTEGER_VALUE(
																																	49,
																																	500,
																																	"Bad Input",
																																	"Integer Value Required"), CREATED_BY_ERROR(
																																			50,
																																			500,
																																			"Bad Input",
																																			"Created By Integer Value Required"), UPDATED_BY_ERROR(
																																					51,
																																					500,
																																					"Bad Input",
																																					"Updated By Integer Value Required"), USER_UPDATION_SUCCESS(
																																							52,
																																							200,
																																							"Success",
																																							"User Updated Successfully"), USER_UPDATION_FAILED(
																																									53,
																																									500,
																																									"Bad Request",
																																									"Failed to Update User"), INVALID_TEACHER_NAME(
																																											54,
																																											500,
																																											"Bad Request",
																																											"Inavlid Teacher Name"), INVALID_GENDER_ID(
																																													55,
																																													500,
																																													"Bad Request",
																																													"Inavlid Gender Id"), INVALID_DATE_OF_BIRTH(
																																															56,
																																															500,
																																															"Bad Request",
																																															"Inavlid Date Of Birth"), INVALID_SOCIAL_CATEGORY(
																																																	57,
																																																	500,
																																																	"Bad Request",
																																																	"Inavlid Social Category"), INVALID_TEACHER_TYPE_ID(
																																																			58,
																																																			500,
																																																			"Bad Request",
																																																			"Inavlid Teacher Type Id"), INVALID_APPOINTMENT_NATURE_ID(
																																																					59,
																																																					500,
																																																					"Bad Request",
																																																					"Inavlid Appointment Nature Id"), INVALID_SERVICE_JOINING_DATE(
																																																							60,
																																																							500,
																																																							"Bad Request",
																																																							"Inavlid Appointment Nature Id"), INCOMPLETE_DATA(
																																																									61,
																																																									500,
																																																									"Bad Request",
																																																									"Incomplete Data"), COMPLETE_DATA(
																																																											62,
																																																											200,
																																																											"Success",
																																																											"Complete Data"), CHANGE_USER_STATUS_SUCCESS(
																																																													63,
																																																													200,
																																																													"Success",
																																																													"User status Change Successfully"), CHANGE_USER_STATUS_FAIL(
																																																															64,
																																																															500,
																																																															"Bed Request",
																																																															"User status Unsuccessfull"), REQUIRED_USER_ID(
																																																																	65,
																																																																	500,
																																																																	"Bed Input",
																																																																	"Required User Id"), REQUIRED_USER_STATUS(
																																																																			66,
																																																																			500,
																																																																			"Bad Input",
																																																																			"Required User Status"), INVALID_USER_ID(
																																																																					66,
																																																																					500,
																																																																					"Bad Input",
																																																																					"Request Failed"), INVALID_STATUS_TYPE(
																																																																							66,
																																																																							500,
																																																																							"Bad Input",
																																																																							"Request Failed"), TEACHER_PROFILE_DELETION_SUCCESS(
																																																																									63,
																																																																									200,
																																																																									"Success",
																																																																									"Teacher Profile Deleted Successfully"), TEACHER_PROFILE_DELETION_FAILED(
																																																																											64,
																																																																											500,
																																																																											"Bad Request",
																																																																											"Failed To Delete Teacher Profile"), TEACHER_PROFILE_UPDATION_SUCCESS(
																																																																													65,
																																																																													200,
																																																																													"Success",
																																																																													"Teacher Profile Updated Successfully"), TEACHER_PROFILE_UPDATION_FAILED(
																																																																															66,
																																																																															500,
																																																																															"Bad Request",
																																																																															"Failed To Updat Teacher Profile"), TEACHER_EDUCATION_PROFILE_UPDATION_SUCCESS(
																																																																																	67,
																																																																																	200,
																																																																																	"Success",
																																																																																	"Teacher Education Profile Updated Successfully"), TEACHER_EDUCATION_PROFILE_UPDATION__FAILED(
																																																																																			68,
																																																																																			500,
																																																																																			"Bad Request",
																																																																																			"Failed to Update Teacher Education Profile"), TEACHER_PROFESSIONAL_PROFILE_UPDATION_SUCCESS(
																																																																																					69,
																																																																																					200,
																																																																																					"Success",
																																																																																					"Teacher Professional Profile Updated Successfully"), TEACHER_PROFESSIONAL_PROFILE_UPDATION__FAILED(
																																																																																							70,
																																																																																							500,
																																																																																							"Bad Request",
																																																																																							"Failed to Update Teacher Professional Profile"), STATE_CONFIGURATION_CREATION_SUCCESS(
																																																																																									77,
																																																																																									200,
																																																																																									"Success",
																																																																																									"State Configuration Created Successfully"), STATE_CONFIGURATION_CREATION_FAILED(
																																																																																											72,
																																																																																											500,
																																																																																											"Bad Request",
																																																																																											"Failed to Create State Configuration"), STATE_CONFIGURATION_UPDATION_SUCCESS(
																																																																																													78,
																																																																																													200,
																																																																																													"Success",
																																																																																													"State Configuration Updation Successfully"), STATE_CONFIGURATION_UPDATION_FAILED(
																																																																																															73,
																																																																																															500,
																																																																																															"Bad Request",
																																																																																															" Failed to Update State Configuration"), VALID_AADHAR(
																																																																																																	79,
																																																																																																	200,
																																																																																																	"success",
																																																																																																	"Valid Aadhar Number"), INVALID_AADHAR(
																																																																																																			80,
																																																																																																			500,
																																																																																																			"Bad Request",
																																																																																																			"Invalid Aadhar Number"), APPROVAL_SUCCESS(
																																																																																																					81,
																																																																																																					200,
																																																																																																					"Success",
																																																																																																					"Teacher’s profile approved successfully"), REJECT_SUCCESS(
																																																																																																							82,
																																																																																																							200,
																																																																																																							"Success",
																																																																																																							"Teacher’s Profile Rejected Successfully"), OTP_SEND_SUCCESS(
																																																																																																									83,
																																																																																																									200,
																																																																																																									"Success",
																																																																																																									"Otp Send SuccessFully"), OTP_SEND_FAIL(
																																																																																																											84,
																																																																																																											500,
																																																																																																											"Bad Request",
																																																																																																											" Failed To Send Otp"), USER_ALREADY_EXIST(
																																																																																																													85,
																																																																																																													500,
																																																																																																													"Bad Request",
																																																																																																													"User Already Exist"), PROFILE_INFORMATION_DOESNOT_EXIST(
																																																																																																															86,
																																																																																																															500,
																																																																																																															"Bad Request",
																																																																																																															"Your profile information does not exist in system OR your mobile number inaccurately recorder in the system. Please contact your school administrator/principal for resolution.")
	,EMAIL_SEND_SUCCESSFULLY(1, 200, "Email Send Successfully", "Email sent. Follow instructions in email to verify your email id"
			+ ""),INVALID_PASSWORD(3, 500, "Invalid Password", "Required 1 Uppercase and 1 Lowercase character, 1 number and min 8 Length"
							+ ""), BLOCKED_USER(4, 500, "Unthorised User",
									"Blocked User" + ""), UNBLOCK_USER(5, 200, "Successfull",
											"Unblock User Successfully" + ""), FAIL_TO_UNBLOCK_USER(5, 200, "Fail",
													"Fail to Unblock User" + "");

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
