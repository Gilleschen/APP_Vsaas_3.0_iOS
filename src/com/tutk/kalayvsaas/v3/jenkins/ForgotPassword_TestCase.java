package com.tutk.kalayvsaas.v3.jenkins;

import org.openqa.selenium.By;

public class ForgotPassword_TestCase {

	method method = new method();
	String element[] = new String[method.app.driver.length];
	LoadStringTable st = new LoadStringTable();

	public boolean EmailBlank() {

		String methodname = this.getClass().getName() + "." + Thread.currentThread().getStackTrace()[1].getMethodName();

		for (int i = 0; i < method.app.driver.length; i++) {
			//method.Wait_Element_ByXpath(method.app.def.btn_Forgotpassword, i, methodname);
			method.app.driver[i].findElement(By.xpath(method.app.def.btn_Forgotpassword)).click();
			method.app.driver[i].findElement(By.xpath(method.app.def.ForgotPwd_submit)).click();
			element[i] = method.app.driver[i].findElement(By.xpath(method.app.def.ForgotPwd_Error_msg))
					.getAttribute("text");

		}
		//method.QuitDriver();
		return method.result(element, st.LoadStingTable("ForgotPassword", 0), methodname);
	}

	public boolean InvalidEmail() {
		String methodname = this.getClass().getName() + "." + Thread.currentThread().getStackTrace()[1].getMethodName();

		for (int i = 0; i < method.app.driver.length; i++) {

			//method.Wait_Element_ByXpath(method.app.def.btn_Forgotpassword, i, methodname);
			method.app.driver[i].findElement(By.xpath(method.app.def.btn_Forgotpassword)).click();
			//method.Wait_Element_ByXpath(method.app.def.ForgotPwd_submit, i, methodname);
			method.app.driver[i].findElement(By.xpath(method.app.def.id_email)).click();
			method.app.driver[i].findElement(By.xpath(method.app.def.id_email)).sendKeys("qoojhih123@gmail.com");
			method.hidekeyboard(i);
			method.app.driver[i].findElement(By.xpath(method.app.def.ForgotPwd_submit)).click();
			element[i] = method.app.driver[i].findElement(By.xpath(method.app.def.ForgotPwd_Error_msg_inval))
					.getAttribute("text");

		}
		//method.QuitDriver();

		return method.result(element, st.LoadStingTable("ForgotPassword", 1), methodname);
	}

	public boolean ForgotPwd() {
		String methodname = this.getClass().getName() + "." + Thread.currentThread().getStackTrace()[1].getMethodName();

		for (int i = 0; i < method.app.driver.length; i++) {
			//method.Wait_Element_ByXpath(method.app.def.btn_Forgotpassword, i, methodname);
			method.app.driver[i].findElement(By.xpath(method.app.def.btn_Forgotpassword)).click();
			//method.Wait_Element_ByXpath(method.app.def.ForgotPwd_submit, i, methodname);
			method.app.driver[i].findElement(By.xpath(method.app.def.id_email)).click();
			method.app.driver[i].findElement(By.xpath(method.app.def.id_email)).sendKeys("qoojhih7@gmail.com");
			method.hidekeyboard(i);
			method.app.driver[i].findElement(By.xpath(method.app.def.ForgotPwd_submit)).click();
			//method.Wait_Element_ByXpath(method.app.def.ForgotPwd_Success_msg, i, methodname);
			element[i] = method.app.driver[i].findElement(By.xpath(method.app.def.ForgotPwd_Success_msg))
					.getAttribute("text");
		}

		return method.result(element, st.LoadStingTable("ForgotPassword", 2), methodname);
	}

}
