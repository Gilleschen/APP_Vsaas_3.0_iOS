package com.tutk.kalayvsaas.v3.jenkins;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class method {

	DeviceInformation app = new DeviceInformation();
	WebDriverWait[] wait = new WebDriverWait[app.driver.length];
	boolean resultelement[] = new boolean[app.driver.length];

	public method() {

		for (int i = 0; i < app.driver.length; i++) {
			wait[i] = new WebDriverWait(app.driver[i], app.def.sec);
		}
	}

	public boolean result(String[] element, ArrayList<String> arrayList, String methodname) {
		boolean result = false;
		for (int i = 0; i < app.driver.length; i++) {
			for (int j = 0; j < arrayList.size(); j++) {
				if (element[i].equals(arrayList.get(j)) == true) {
					resultelement[i] = true;
					result = true;
					break;
				} else {
					resultelement[i] = false;
					result = false;
				}
			}
		}
		for (int i = 0; i < app.driver.length; i++) {
			if (resultelement[i] == false) {
				System.out.println("[Error log] " + "MethodName:" + methodname);
				System.out.println("[Error log] " + "Device Information:" + app.cap[i]);
				System.out.println("[Error log ]" + "Expect Result:" + arrayList.toString());
				ScreenShoot(i, methodname);
				sleep(4);//wait for screenshoot
			}
			QuitDriver();
		}
		return result;
	}

	public boolean result(boolean[] resultelement, String methodname) {

		boolean result = false;
		for (int i = 0; i < app.driver.length; i++) {

			if (resultelement[i] == true) {
				result = true;
				break;
			} else {
				result = false;
			}

		}
		for (int i = 0; i < app.driver.length; i++) {
			if (resultelement[i] == false) {
				System.out.println("MethodName¡G" + this.getClass().getName() + "." + methodname);
				System.out.println("Device Information¡G" + app.cap[i]);
			}
		}
		return result;
	}

	public void ScreenShoot(int i, String methodname) {
		Calendar date = Calendar.getInstance();
		String month = Integer.toString(date.get(Calendar.MONTH) + 1);
		String day = Integer.toString(date.get(Calendar.DAY_OF_MONTH));
		String hour = Integer.toString(date.get(Calendar.HOUR_OF_DAY));
		String min = Integer.toString(date.get(Calendar.MINUTE));
		String sec = Integer.toString(date.get(Calendar.SECOND));

		File screenShotFile = (File) app.driver[i].getScreenshotAs(OutputType.FILE);

		try {
			FileUtils.copyFile(screenShotFile, new File(methodname + "_" + month + day + hour + min + sec + ".jpg"));
			System.out.println("[Error log] " + "ScreenShoot Successfully!! (CaseName+Month+Day+Hour+Minus+Second)");
		} catch (IOException e) {
			;
		}

	}

	public void Wait_Element_ById(String element, int i, String methodname) {
		try {

			wait[i].until(ExpectedConditions.presenceOfElementLocated(By.id(element)));
			wait[i].until(ExpectedConditions.elementToBeClickable((By.id(element))));
		} catch (Exception ex) {
			System.out.println("MethodName:" + this.getClass().getName() + "." + methodname);
			System.out.println("Not found " + element);
		}
	}

	public void Wait_Element_ByXpath(String element, int i, String methodname) {
		try {

			wait[i].until(ExpectedConditions.presenceOfElementLocated(By.xpath(element)));
			wait[i].until(ExpectedConditions.elementToBeClickable((By.xpath(element))));
		} catch (Exception ex) {
			System.out.println("MethodName:" + this.getClass().getName() + "." + methodname);
			System.out.println("Not found " + element);
		}
	}

	public void sleep(int s) {
		try {
			Thread.sleep(s * 1000);
		} catch (InterruptedException e) {
			;
		}
	}

	public void hidekeyboard(int i) {

		try {
			app.driver[i].hideKeyboard();
		} catch (Exception ex) {
			;
		}

	}

	public void QuitDriver() {

		for (int i = 0; i < app.driver.length; i++) {
			app.driver[i].quit();
		}
	}

	public void CreateAccount_initialize(int i, String email, String nickname, String pwd1, String pwd2,
			boolean terms) {

		app.driver[i].findElement(By.xpath(app.def.SignUp)).click();
		if (terms) {
			app.driver[i].findElement(By.xpath(app.def.CheckTermofUse)).click();
		}
		app.driver[i].findElement(By.xpath(app.def.id_username)).click();
		app.driver[i].findElement(By.xpath(app.def.id_username)).sendKeys(nickname);
		app.driver[i].findElement(By.xpath(app.def.id_Confirmpassword)).click();
		app.driver[i].findElement(By.xpath(app.def.id_Confirmpassword)).sendKeys(pwd2);
		app.driver[i].findElement(By.xpath(app.def.id_password)).click();
		app.driver[i].findElement(By.xpath(app.def.id_password)).sendKeys(pwd1);
		app.driver[i].findElement(By.xpath(app.def.id_email)).click();
		app.driver[i].findElement(By.xpath(app.def.id_email)).sendKeys(email);
		hidekeyboard(i);

		app.driver[i].findElement(By.xpath(app.def.Submit)).click();

	}

	public void CreateAccount_forCreateAccount_initialize(int i) {

		Calendar date = Calendar.getInstance();
		Random rand = new Random();
		String items[] = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R",
				"S", "T", "U", "V", "W", "X", "Y", "Z" };

		String day = Integer.toString(date.get(Calendar.DAY_OF_MONTH));
		String hour = Integer.toString(date.get(Calendar.HOUR_OF_DAY));
		String min = Integer.toString(date.get(Calendar.MINUTE));
		String sec = Integer.toString(date.get(Calendar.SECOND));
		String x = "";
		for (int j = 0; j <= 4; j++) {
			x = new String(x) + new String(items[rand.nextInt(items.length)]);
		}
		app.driver[i].findElement(By.xpath(app.def.SignUp)).click();
		app.driver[i].findElement(By.xpath(app.def.id_username)).sendKeys(x);
		app.driver[i].findElement(By.xpath(app.def.id_Confirmpassword)).sendKeys("888888ii");
		app.driver[i].findElement(By.xpath(app.def.id_password)).sendKeys("888888ii");
		app.driver[i].findElement(By.xpath(app.def.id_email)).sendKeys(day + hour + min + sec + x + "@sina.com");
		hidekeyboard(i);
		app.driver[i].findElement(By.xpath(app.def.CheckTermofUse)).click();
		app.driver[i].findElement(By.xpath(app.def.Submit)).click();

	}

	public String CreateAnNewEmail() {
		Calendar date = Calendar.getInstance();
		Random rand = new Random();
		String items[] = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R",
				"S", "T", "U", "V", "W", "X", "Y", "Z" };

		String day = Integer.toString(date.get(Calendar.DAY_OF_MONTH));
		String hour = Integer.toString(date.get(Calendar.HOUR_OF_DAY));
		String min = Integer.toString(date.get(Calendar.MINUTE));
		String sec = Integer.toString(date.get(Calendar.SECOND));
		String x = "";
		for (int j = 0; j <= 4; j++) {
			x = new String(x) + new String(items[rand.nextInt(items.length)]);
		}
		return day + hour + min + sec + x + "@sina.com";
	}

}
