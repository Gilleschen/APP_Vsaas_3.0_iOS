package com.tutk.kalayvsaas.v3.jenkins;

import org.openqa.selenium.By;

public class CreateAccount_TestCase {

	method method = new method();
	String element[] = new String[method.app.driver.length];
	LoadStringTable st = new LoadStringTable();

	public boolean CreateAccount() {
		String methodname = this.getClass().getName() + "." + Thread.currentThread().getStackTrace()[1].getMethodName();
		for (int i = 0; i < method.app.driver.length; i++) {
			method.Wait_Element_ByXpath(method.app.def.SignUp, i, methodname);
			method.CreateAccount_initialize(i, method.CreateAnNewEmail(), "Gilles", "888888iiI", "888888iiI", true);
			method.Wait_Element_ByXpath(method.app.def.CreateAccount_ResendEmail, i, methodname);
			element[i] = method.app.driver[i].findElement(By.xpath(method.app.def.CreateAccount_ResendEmail))
					.getAttribute("text");
		}
		method.QuitDriver();
		return method.result(element, st.LoadStingTable("CreateAccount_ExpectResult", 0), methodname);

	}

	public boolean InvaliedEmail() {
		String methodname = this.getClass().getName() + "." + Thread.currentThread().getStackTrace()[1].getMethodName();
		for (int i = 0; i < method.app.driver.length; i++) {
			method.Wait_Element_ByXpath(method.app.def.SignUp, i, methodname);
			method.CreateAccount_initialize(i, "jhih_chensina.com", "abc", "888888iiI", "888888iiI", true);
			element[i] = method.app.driver[i].findElement(By.xpath(method.app.def.CreateAccount_invalied_msg))
					.getAttribute("text");
		}
		method.QuitDriver();
		return method.result(element, st.LoadStingTable("CreateAccount_ExpectResult", 1), methodname);
	}

	public boolean ExistedAccount() {
		String methodname = this.getClass().getName() + "." + Thread.currentThread().getStackTrace()[1].getMethodName();
		for (int i = 0; i < method.app.driver.length; i++) {

			method.Wait_Element_ByXpath(method.app.def.SignUp, i, methodname);
			method.CreateAccount_initialize(i, "qoojhih7@gmail.com", "Gilles", "888888iiI", "888888iiI", true);
			element[i] = method.app.driver[i].findElement(By.xpath(method.app.def.CreateAccount_ExstedAccount_msg))
					.getAttribute("text");

		}

		//method.QuitDriver();
		return method.result(element, st.LoadStingTable("CreateAccount_ExpectResult", 2), methodname);
	}

	public boolean EmailBlank() {
		String methodname = this.getClass().getName() + "." + Thread.currentThread().getStackTrace()[1].getMethodName();

		for (int i = 0; i < method.app.driver.length; i++) {
			method.Wait_Element_ByXpath(method.app.def.SignUp, i, methodname);
			method.CreateAccount_initialize(i, "", "abc", "888888iiI", "888888iiI", true);
			element[i] = method.app.driver[i].findElement(By.xpath(method.app.def.CreateAccount_email_error_msg))
					.getAttribute("text");
		}
		//method.QuitDriver();
		return method.result(element, st.LoadStingTable("CreateAccount_ExpectResult", 3), methodname);
	}

	public boolean ConfirmPwdBlank() {
		String methodname = this.getClass().getName() + "." + Thread.currentThread().getStackTrace()[1].getMethodName();
		for (int i = 0; i < method.app.driver.length; i++) {
			method.Wait_Element_ByXpath(method.app.def.SignUp, i, methodname);
			method.CreateAccount_initialize(i, method.CreateAnNewEmail(), "abc", "888888iiI", "", true);
			element[i] = method.app.driver[i].findElement(By.xpath(method.app.def.CreateAccount_pwd2_error_msg))
					.getAttribute("text");
		}

		//method.QuitDriver();
		return method.result(element, st.LoadStingTable("CreateAccount_ExpectResult", 4), methodname);

	}

	public boolean NewPwdBlank() {
		String methodname = this.getClass().getName() + "." + Thread.currentThread().getStackTrace()[1].getMethodName();

		for (int i = 0; i < method.app.driver.length; i++) {
			method.Wait_Element_ByXpath(method.app.def.SignUp, i, methodname);
			method.CreateAccount_initialize(i, method.CreateAnNewEmail(), "abc", "", "888888iiI", true);
			element[i] = method.app.driver[i].findElement(By.xpath(method.app.def.CreateAccount_pwd1_error_msg))
					.getAttribute("text");
		}
		//method.QuitDriver();
		return method.result(element, st.LoadStingTable("CreateAccount_ExpectResult", 5), methodname);
	}

	public boolean NewPwdAndConfirmPwdNotMatch() {
		String methodname = this.getClass().getName() + "." + Thread.currentThread().getStackTrace()[1].getMethodName();
		for (int i = 0; i < method.app.driver.length; i++) {
			method.Wait_Element_ByXpath(method.app.def.SignUp, i, methodname);
			method.CreateAccount_initialize(i, method.CreateAnNewEmail(), "abc", "888888Aa", "888888iiI", true);
			element[i] = method.app.driver[i]
					.findElement(By.xpath(method.app.def.CreateAccount_pwd1andpwd2notmatch_msg)).getAttribute("text");
		}
		//method.QuitDriver();
		return method.result(element, st.LoadStingTable("CreateAccount_ExpectResult", 6), methodname);
	}

	public boolean NicknameBlank() {
		String methodname = this.getClass().getName() + "." + Thread.currentThread().getStackTrace()[1].getMethodName();
		for (int i = 0; i < method.app.driver.length; i++) {
			method.Wait_Element_ByXpath(method.app.def.SignUp, i, methodname);
			method.CreateAccount_initialize(i, method.CreateAnNewEmail(), "", "888888iiI", "888888iiI", true);
			element[i] = method.app.driver[i].findElement(By.xpath(method.app.def.CreateAccount_nickname_error_msg))
					.getAttribute("text");
		}
		//method.QuitDriver();
		return method.result(element, st.LoadStingTable("CreateAccount_ExpectResult", 7), methodname);

	}

	public boolean DonotCheckTermsofUser() {

		String methodname = this.getClass().getName() + "." + Thread.currentThread().getStackTrace()[1].getMethodName();
		for (int i = 0; i < method.app.driver.length; i++) {
			method.Wait_Element_ByXpath(method.app.def.SignUp, i, methodname);
			method.CreateAccount_initialize(i, method.CreateAnNewEmail(), "abc", "888888iiI", "888888iiI", false);
			element[i] = method.app.driver[i].findElement(By.xpath(method.app.def.TermsOfUse)).getAttribute("text");
		}
		//method.QuitDriver();
		return method.result(element, st.LoadStingTable("CreateAccount_ExpectResult", 8), methodname);
	}

	public boolean WrongPwdRule() {

		String methodname = this.getClass().getName() + "." + Thread.currentThread().getStackTrace()[1].getMethodName();
		for (int i = 0; i < method.app.driver.length; i++) {
			method.Wait_Element_ByXpath(method.app.def.SignUp, i, methodname);
			method.CreateAccount_initialize(i, method.CreateAnNewEmail(), "abc", "8888ii", "8888ii", true);
			element[i] = method.app.driver[i].findElement(By.xpath(method.app.def.CreateAccount_WrongPwdRule_msg))
					.getAttribute("text");
		}
		//method.QuitDriver();
		return method.result(element, st.LoadStingTable("CreateAccount_ExpectResult_ExpectResult", 9), methodname);

	}

}
