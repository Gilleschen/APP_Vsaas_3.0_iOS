package com.tutk.kalayvsaas.v3.jenkins;

import org.openqa.selenium.By;

public class Login_TestCase {
	method method = new method();
	String element[] = new String[method.app.driver.length];
	LoadStringTable st = new LoadStringTable();

	public boolean WrongEmail() {

		String methodname = this.getClass().getName() + "." + Thread.currentThread().getStackTrace()[1].getMethodName();

		for (int i = 0; i < method.app.driver.length; i++) {

			//method.Wait_Element_ByXpath(method.app.def.id_password, i, methodname);
			method.app.driver[i].findElement(By.xpath(method.app.def.id_password)).click();
			method.app.driver[i].findElement(By.xpath(method.app.def.id_password)).sendKeys("888888Ii");
			method.app.driver[i].findElement(By.xpath(method.app.def.id_email)).click();
			method.app.driver[i].findElement(By.xpath(method.app.def.id_email)).sendKeys("qoojhih7@gmail.co");
			method.hidekeyboard(i);
			method.app.driver[i].findElement(By.xpath(method.app.def.btn_LogIn)).click();
			element[i] = method.app.driver[i].findElement(By.xpath(method.app.def.Login_WrongPssword_msg))
					.getAttribute("text");

		}
		//method.QuitDriver();
		return method.result(element, st.LoadStingTable("Login", 0), methodname);
	}

	public boolean WrongPassword() {
		String methodname = this.getClass().getName() + "." + Thread.currentThread().getStackTrace()[1].getMethodName();
		for (int i = 0; i < method.app.driver.length; i++) {
			//method.Wait_Element_ByXpath(method.app.def.id_password, i, methodname);
			method.app.driver[i].findElement(By.xpath(method.app.def.id_password)).click();
			method.app.driver[i].findElement(By.xpath(method.app.def.id_password)).sendKeys("888888rr");
			method.app.driver[i].findElement(By.xpath(method.app.def.id_email)).click();
			method.app.driver[i].findElement(By.xpath(method.app.def.id_email)).sendKeys("qoojhih7@gmail.com");
			method.hidekeyboard(i);
			method.app.driver[i].findElement(By.xpath(method.app.def.btn_LogIn)).click();
			element[i] = method.app.driver[i].findElement(By.xpath(method.app.def.Login_WrongPssword_msg))
					.getAttribute("text");
		}
		//method.QuitDriver();
		return method.result(element, st.LoadStingTable("Login", 1), methodname);
	}

	public boolean EmailBlank() {
		String methodname = this.getClass().getName() + "." + Thread.currentThread().getStackTrace()[1].getMethodName();

		for (int i = 0; i < method.app.driver.length; i++) {
			//method.Wait_Element_ByXpath(method.app.def.id_password, i, methodname);
			method.app.driver[i].findElement(By.xpath(method.app.def.id_password)).click();
			method.app.driver[i].findElement(By.xpath(method.app.def.id_password)).sendKeys("888888rr");
			method.hidekeyboard(i);
			method.app.driver[i].findElement(By.xpath(method.app.def.btn_LogIn)).click();
			element[i] = method.app.driver[i].findElement(By.xpath(method.app.def.Login_Error_msg_email))
					.getAttribute("text");
		}
		//method.QuitDriver();

		return method.result(element, st.LoadStingTable("Login", 2), methodname);
	}
	public boolean PasswordBlank() {
		String methodname=Thread.currentThread().getStackTrace()[1].getMethodName();
		for (int i = 0; i < method.app.driver.length; i++) {
			//method.Wait_Element_ByXpath(method.app.def.id_password, i, methodname);
			method.app.driver[i].findElement(By.xpath(method.app.def.id_email)).click();
			method.app.driver[i].findElement(By.xpath(method.app.def.id_email)).sendKeys("qoojhih7@gmail.com");
			method.hidekeyboard(i);
			method.app.driver[i].findElement(By.xpath(method.app.def.btn_LogIn)).click();
			element[i] = method.app.driver[i].findElement(By.xpath(method.app.def.Login_Error_msg_password))
					.getAttribute("text");
		}
		//method.QuitDriver();
		
		return method.result(element, st.LoadStingTable("Login", 3), methodname);
	}

	public boolean Login() {
		String methodname = this.getClass().getName() + "." + Thread.currentThread().getStackTrace()[1].getMethodName();

		for (int i = 0; i < method.app.driver.length; i++) {
			//method.Wait_Element_ByXpath(method.app.def.id_password, i, methodname);
			method.app.driver[i].findElement(By.xpath(method.app.def.id_password)).click();
			method.app.driver[i].findElement(By.xpath(method.app.def.id_password)).sendKeys("888888Ii");
			method.app.driver[i].findElement(By.xpath(method.app.def.id_email)).click();
			method.app.driver[i].findElement(By.xpath(method.app.def.id_email)).sendKeys("qoojhih7@gmail.com");
			method.hidekeyboard(i);
			method.app.driver[i].findElement(By.xpath(method.app.def.btn_LogIn)).click();
			//method.Wait_Element_ByXpath(method.app.def.btn_AddDevice, i, methodname);
			method.app.driver[i].findElement(By.xpath(method.app.def.btn_AddDevice)).click();
			element[i] = method.app.driver[i].findElement(By.xpath(method.app.def.btn_QRCode)).getText();

		}
		//method.QuitDriver();
		return method.result(element, st.LoadStingTable("Login", 4), methodname);
	}

}
