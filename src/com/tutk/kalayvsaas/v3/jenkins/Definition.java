package com.tutk.kalayvsaas.v3.jenkins;

import java.util.ArrayList;

public class Definition {
	LoadDevice infor = new LoadDevice();
	String BundleID = "com.tutk.kalayvsaas.v3.jenkins";// BundleID
	// String DeviceUDID[] = {"6ec48c2b29860bdb425b09a1f78468fc0691bdf6"};
	ArrayList<String> DeviceUDID = infor.deviceName;// DeviceUDID
	int port = 8889;// Appium studio port number
	int sec = 60;// 等待時間
	int iterative = 2;// LiveView功能測試次數

	String id_email = "//*[@placeholder='Email']";
	String id_password = "//*[@placeholder='Password']";
	String id_username = "//*[@placeholder='Name']";
	String id_Confirmpassword = "//*[@placeholder='Confirm Password']";
	String btn_LogIn = "//*[@class='UIAButton']";
	String CheckTermofUse = "//*[@XCElementType='XCUIElementTypeSwitch']";

	String Login_Error_msg_email = "//*[@name='Please enter your email']";
	String Login_Error_msg_password = "//*[@name='Please enter your password']";
	String Login_WrongPssword_msg = "//*[@name='Email or Password is not correct']";
	String btn_Forgotpassword = "//*[@name='Forgot Password?']";
	String ForgotPwd_Error_msg = "//*[@name='Please enter your email']";
	String ForgotPwd_Error_msg_inval = "//*[@name='The email is not valid']";
	String ForgotPwd_submit = "//*[@name='OK']";
	String ForgotPwd_Success_msg = "//*[@name=concat('We', \"'\", 've send you an email to reset your password.')]";
	String SignUp = "//*[@name='Sign Up']";
	String TermsOfUse = "//*[@text=concat('Please check ', \"'\", 'I agree to the Terms of Use', \"'\", ' to sign up')]";
	String CreateAccount_nickname_error_msg = "//*[@text='Please enter your name']";
	String CreateAccount_pwd1_error_msg = "//*[@text='Please enter your password']";// NewPwd
	String CreateAccount_pwd2_error_msg = "//*[@text='Password and Confirm Password do not match']";// ConfirmPwd
	String CreateAccount_email_error_msg = "//*[@text='Please enter your email']";
	String CreateAccount_pwd1andpwd2notmatch_msg = "//*[@name='Password and Confirm Password do not match']";
	String CreateAccount_ExstedAccount_msg = "//*[@name='The account has already existed']";
	String CreateAccount_invalied_msg = "//*[@text='The email is not valid']";
	String CreateAccount_WrongPwdRule_msg = "//*[@name='Please make sure your password contains 8 to 20 characters, at least 1 uppercase letter, 1 lowercase letter, and 1 number.']";
	String CreateAccount_ResendEmail = "//*[@name='Resend Email']";
	String Submit = "//*[@text='Submit']";

	String btn_AddDevice = "//*[@name='Add']";
	String btn_QRCode = "//*[@name='QR Code']";

	// 瀑布流
	String tvConnection = "//*[@name='Online']";

	// LiveView
	String back = "//*[@name='btn back n']";
	String btnListener = "//*[@name='btn tb mute n']";
	String btnMute = "//*[@name='btn tb sound n']";
	String btnSpeaker = "//*[@name='btn tb talking n']";
	String btnRecording = "//*[@name='btn tb record n']";
	String btnStopRecordin = "//*[@name='btn tb record h']";

}
