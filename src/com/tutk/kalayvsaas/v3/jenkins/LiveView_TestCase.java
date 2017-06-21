package com.tutk.kalayvsaas.v3.jenkins;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidKeyCode;

public class LiveView_TestCase {

	method method = new method();
	String element[] = new String[method.app.driver.length];

	public boolean Listener() {
		boolean resultelement[] = new boolean[method.app.driver.length];
		String methodname = Thread.currentThread().getStackTrace()[1].getMethodName();
		for (int i = 0; i < method.app.driver.length; i++) {
			resultelement[i] = false;
			
			method.app.driver[i].rotate(ScreenOrientation.PORTRAIT);
			//method.wait[i].until(ExpectedConditions.elementToBeClickable(By.id(method.app.def.tv)));
			for (int j = 0; j < method.app.def.iterative; j++) {
				try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				method.app.driver[i].findElement(By.xpath(method.app.def.btnListener)).click();
				try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				method.app.driver[i].findElement(By.xpath(method.app.def.btnMute)).click();
			}
			resultelement[i] = true;
			method.app.driver[i].findElement(By.xpath(method.app.def.back)).click();
		}

		method.QuitDriver();
		return method.result(resultelement, methodname);
	}

	public boolean Speaker() {

		boolean resultelement[] = new boolean[method.app.driver.length];
		String methodname = Thread.currentThread().getStackTrace()[1].getMethodName();
		for (int i = 0; i < method.app.driver.length; i++) {
			resultelement[i] = false;
			
			method.app.driver[i].rotate(ScreenOrientation.PORTRAIT);
			//method.wait[i].until(ExpectedConditions.elementToBeClickable(By.id(method.app.def.tv)));
			
			for (int j = 0; j < method.app.def.iterative; j++) {
				try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				 method.app.driver[i].findElement(By.xpath(method.app.def.btnSpeaker)).click();
				
			}
			resultelement[i] = true;
			method.app.driver[i].findElement(By.xpath(method.app.def.back)).click();;
		}
		method.QuitDriver();
		return method.result(resultelement, methodname);
	}
	
	public boolean Recording() {

		boolean resultelement[] = new boolean[method.app.driver.length];
		String methodname = Thread.currentThread().getStackTrace()[1].getMethodName();
		for (int i = 0; i < method.app.driver.length; i++) {
			resultelement[i] = false;
			
			method.app.driver[i].rotate(ScreenOrientation.PORTRAIT);
			//method.wait[i].until(ExpectedConditions.elementToBeClickable(By.id(method.app.def.tv)));
			//method.wait[i].until(ExpectedConditions.elementToBeClickable(By.xpath(method.app.def.btnRecording)));
			method.app.driver[i].findElement(By.xpath(method.app.def.btnRecording)).click();
			for (int j = 0; j < method.app.def.iterative; j++) {
			
				try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				method.app.driver[i].findElement(By.xpath(method.app.def.btnListener)).click();
				try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				method.app.driver[i].findElement(By.xpath(method.app.def.btnMute)).click();
			}
			method.app.driver[i].findElement(By.xpath(method.app.def.btnStopRecordin)).click();
			
			resultelement[i] = true;
			method.app.driver[i].findElement(By.xpath(method.app.def.back)).click();;
		}
		method.QuitDriver();
		return method.result(resultelement, methodname);
	}
	/*
	public boolean Snapshot() {

		boolean resultelement[] = new boolean[method.app.driver.length];
		String methodname = Thread.currentThread().getStackTrace()[1].getMethodName();
		for (int i = 0; i < method.app.driver.length; i++) {
			resultelement[i] = false;
			// TouchAction t = new TouchAction(app.driver[i]);
			method.app.driver[i].rotate(ScreenOrientation.PORTRAIT);
			method.wait[i].until(ExpectedConditions.elementToBeClickable(By.id(method.app.def.tv)));

			for (int j = 0; j < method.app.def.iterative; j++) {

				// t.tap(app.driver[i].findElement(By.id(def.btnSnapshot))).perform();
				method.app.driver[i].findElement(By.id(method.app.def.btnSnapshot)).click();
			}
			resultelement[i] = true;
			method.app.driver[i].pressKeyCode(AndroidKeyCode.BACK);
		}
		method.QuitDriver();
		return method.result(resultelement, methodname);
	}

	public boolean Brightness() {
		boolean resultelement[] = new boolean[method.app.driver.length];
		Random rand = new Random();
		String methodname = Thread.currentThread().getStackTrace()[1].getMethodName();
		String btnlist[] = { method.app.def.btnLowest, method.app.def.btnLow, method.app.def.btnMid,
				method.app.def.btnHigh, method.app.def.btnHighest };
		// EnterLiveview();
		for (int i = 0; i < method.app.driver.length; i++) {

			resultelement[i] = false;
			method.app.driver[i].rotate(ScreenOrientation.PORTRAIT);
			method.wait[i].until(ExpectedConditions.elementToBeClickable(By.id(method.app.def.tv)));
			method.app.driver[i].findElement(By.id(method.app.def.btnBrightness)).click();
			method.wait[i].until(ExpectedConditions.elementToBeClickable(By.id(method.app.def.btnLowest)));

			for (int j = 0; j < btnlist.length; j++) {

				method.app.driver[i].findElement(By.id(btnlist[j])).click();
			}

			System.out.println("MethodName：" + this.getClass().getName() + "." + methodname);

			for (int j = 0; j < method.app.def.iterative; j++) {
				String e = btnlist[rand.nextInt(btnlist.length)];
				method.app.driver[i].findElement(By.id(e)).click();
				System.out.println(
						"DeviceName： " + method.app.cap[i].getCapability("deviceName") + " Step " + (j + 1) + " " + e);
			}
			method.app.driver[i].pressKeyCode(AndroidKeyCode.BACK);
			method.app.driver[i].pressKeyCode(AndroidKeyCode.BACK);
			resultelement[i] = true;
		}
		method.QuitDriver();
		return method.result(resultelement, methodname);
	}

	public boolean Contrast() {
		boolean resultelement[] = new boolean[method.app.driver.length];
		Random rand = new Random();
		String methodname = Thread.currentThread().getStackTrace()[1].getMethodName();
		String btnlist[] = { method.app.def.btnLowest, method.app.def.btnLow, method.app.def.btnMid,
				method.app.def.btnHigh, method.app.def.btnHighest };
		// EnterLiveview();
		for (int i = 0; i < method.app.driver.length; i++) {

			resultelement[i] = false;
			method.app.driver[i].rotate(ScreenOrientation.PORTRAIT);
			method.wait[i].until(ExpectedConditions.elementToBeClickable(By.id(method.app.def.tv)));
			method.app.driver[i].findElement(By.id(method.app.def.btnContrast)).click();
			method.wait[i].until(ExpectedConditions.elementToBeClickable(By.id(method.app.def.btnLowest)));

			for (int j = 0; j < btnlist.length; j++) {

				method.app.driver[i].findElement(By.id(btnlist[j])).click();
			}

			System.out.println("MethodName：" + this.getClass().getName() + "." + methodname);

			for (int j = 0; j < method.app.def.iterative; j++) {
				String e = btnlist[rand.nextInt(btnlist.length)];
				method.app.driver[i].findElement(By.id(e)).click();
				System.out.println(
						"DeviceName： " + method.app.cap[i].getCapability("deviceName") + " Step " + (j + 1) + " " + e);
			}
			method.app.driver[i].pressKeyCode(AndroidKeyCode.BACK);
			method.app.driver[i].pressKeyCode(AndroidKeyCode.BACK);
			resultelement[i] = true;
		}
		method.QuitDriver();
		return method.result(resultelement, methodname);
	}

	public boolean Cloud() {

		boolean resultelement[] = new boolean[method.app.driver.length];
		String methodname = Thread.currentThread().getStackTrace()[1].getMethodName();
		String nocloud[] = { "新增雲端錄影", "新增云端录像", "Add Cloud Recording" };
		String cloud[] = { "錄影回播", "录像回放", "Playback" };
		int k;// 1代表true;0代表false
		for (int i = 0; i < method.app.driver.length; i++) {
			k = 0;
			resultelement[i] = false;
			method.app.driver[i].rotate(ScreenOrientation.PORTRAIT);
			method.wait[i].until(ExpectedConditions.elementToBeClickable(By.id(method.app.def.tv)));
			String e = method.app.driver[i].findElement(By.id(method.app.def.tv)).getText();

			for (int j = 0; j < nocloud.length; j++) {
				if (e.equals(nocloud[j]) == true) {
					for (int w = 0; w < method.app.def.iterative; w++) {
						method.app.driver[i].findElement(By.id(method.app.def.tv)).click();
						method.wait[i].until(ExpectedConditions.elementToBeClickable(By.id(method.app.def.btnClose)));
						method.app.driver[i].findElement(By.id(method.app.def.btnClose)).click();
						method.wait[i].until(ExpectedConditions.elementToBeClickable(By.id(method.app.def.tv)));
					}
					k = 1;
					break;
				}

				if (e.equals(cloud[j]) == true) {
					for (int w = 0; w < method.app.def.iterative; w++) {
						method.app.driver[i].findElement(By.id(method.app.def.tv)).click();
						method.wait[i].until(ExpectedConditions.elementToBeClickable(By.id(method.app.def.tv)));
					}
					k = 1;
					break;
				}

			}
			if (k == 1) {
				resultelement[i] = true;
			} else {
				resultelement[i] = false;
			}
			method.app.driver[i].pressKeyCode(AndroidKeyCode.BACK);
		}
		method.QuitDriver();
		return method.result(resultelement, methodname);
	}

	public boolean LandScape_Listener() {
		boolean resultelement[] = new boolean[method.app.driver.length];
		String methodname = Thread.currentThread().getStackTrace()[1].getMethodName();
		for (int i = 0; i < method.app.driver.length; i++) {
			resultelement[i] = false;
			TouchAction t = new TouchAction(method.app.driver[i]);
			// wait[i].until(ExpectedConditions.elementToBeClickable(By.id(def.tv)));
			method.app.driver[i].rotate(ScreenOrientation.LANDSCAPE);
			for (int j = 0; j < method.app.def.iterative; j++) {
				t.press(method.app.driver[i].findElement(By.id(method.app.def.btnListener))).perform();
				t.release().perform();
			}
			resultelement[i] = true;
			method.app.driver[i].pressKeyCode(AndroidKeyCode.BACK);
		}
		method.QuitDriver();
		return method.result(resultelement, methodname);
	}

	public boolean LandScape_Speaker() {

		boolean resultelement[] = new boolean[method.app.driver.length];
		String methodname = Thread.currentThread().getStackTrace()[1].getMethodName();
		for (int i = 0; i < method.app.driver.length; i++) {
			resultelement[i] = false;
			// TouchAction t = new TouchAction(app.driver[i]);
			// Wait_Element(def.tv, i, methodname);
			// wait[i].until(ExpectedConditions.elementToBeClickable(By.id(def.tv)));
			method.app.driver[i].rotate(ScreenOrientation.LANDSCAPE);

			WebElement e = method.app.driver[i].findElement(By.id(method.app.def.btnSpeaker));
			for (int j = 0; j < method.app.def.iterative; j++) {
				// multiTouch.add(t.tap(e)).add(t2.tap(e2)).perform();
				e.click();
				// app.driver[i].findElement(By.id(def.btnListener)).click();
				// t.tap(app.driver[i].findElement(By.id(def.btnListener))).perform();
				// t.press(e).perform();
				// t.release().perform();
			}
			resultelement[i] = true;
			method.app.driver[i].pressKeyCode(AndroidKeyCode.BACK);
		}
		method.QuitDriver();
		return method.result(resultelement, methodname);
	}

	public boolean LandScape_Recording() {

		boolean resultelement[] = new boolean[method.app.driver.length];
		String methodname = Thread.currentThread().getStackTrace()[1].getMethodName();
		// EnterLiveview();

		for (int i = 0; i < method.app.driver.length; i++) {
			resultelement[i] = false;
			// TouchAction t = new TouchAction(app.driver[i]);
			// wait[i].until(ExpectedConditions.elementToBeClickable(By.id(def.tv)));
			// t.tap(app.driver[i].findElement(By.id(def.btnRecording))).perform();
			method.app.driver[i].rotate(ScreenOrientation.LANDSCAPE);
			method.app.driver[i].findElement(By.id(method.app.def.btnRecording)).click();
			for (int j = 0; j < method.app.def.iterative; j++) {
				// t.tap(app.driver[i].findElement(By.id(def.btnListener))).perform();
				method.app.driver[i].findElement(By.id(method.app.def.btnListener)).click();

			}
			method.app.driver[i].findElement(By.id(method.app.def.btnRecording)).click();
			// t.tap(app.driver[i].findElement(By.id(def.btnRecording))).perform();
			resultelement[i] = true;
			method.app.driver[i].pressKeyCode(AndroidKeyCode.BACK);
		}
		method.QuitDriver();
		return method.result(resultelement, methodname);
	}

	public boolean LandScape_Snapshot() {

		boolean resultelement[] = new boolean[method.app.driver.length];
		String methodname = Thread.currentThread().getStackTrace()[1].getMethodName();
		for (int i = 0; i < method.app.driver.length; i++) {
			resultelement[i] = false;
			// TouchAction t = new TouchAction(app.driver[i]);
			// wait[i].until(ExpectedConditions.elementToBeClickable(By.id(def.tv)));
			method.app.driver[i].rotate(ScreenOrientation.LANDSCAPE);
			for (int j = 0; j < method.app.def.iterative; j++) {

				// t.tap(app.driver[i].findElement(By.id(def.btnSnapshot))).perform();
				method.app.driver[i].findElement(By.id(method.app.def.btnSnapshot)).click();
			}
			resultelement[i] = true;
			method.app.driver[i].pressKeyCode(AndroidKeyCode.BACK);
		}
		method.QuitDriver();
		return method.result(resultelement, methodname);
	}

	public boolean LandScape_Brightness() {
		boolean resultelement[] = new boolean[method.app.driver.length];
		Random rand = new Random();
		String methodname = Thread.currentThread().getStackTrace()[1].getMethodName();
		String btnlist[] = { method.app.def.btnLowest, method.app.def.btnLow, method.app.def.btnMid,
				method.app.def.btnHigh, method.app.def.btnHighest };

		for (int i = 0; i < method.app.driver.length; i++) {

			resultelement[i] = false;
			// wait[i].until(ExpectedConditions.elementToBeClickable(By.id(def.tv)));
			method.app.driver[i].rotate(ScreenOrientation.LANDSCAPE);
			method.app.driver[i].findElement(By.id(method.app.def.btnBrightness)).click();
			method.wait[i].until(ExpectedConditions.elementToBeClickable(By.id(method.app.def.btnLowest)));

			for (int j = 0; j < btnlist.length; j++) {

				method.app.driver[i].findElement(By.id(btnlist[j])).click();
			}

			System.out.println("MethodName：" + this.getClass().getName() + "." + methodname);

			for (int j = 0; j < method.app.def.iterative; j++) {
				String e = btnlist[rand.nextInt(btnlist.length)];
				method.app.driver[i].findElement(By.id(e)).click();
				System.out.println(
						"DeviceName： " + method.app.cap[i].getCapability("deviceName") + " Step " + (j + 1) + " " + e);
			}

			resultelement[i] = true;
			method.app.driver[i].pressKeyCode(AndroidKeyCode.BACK);
			method.app.driver[i].pressKeyCode(AndroidKeyCode.BACK);
		}
		method.QuitDriver();
		return method.result(resultelement, methodname);
	}

	public boolean LandScape_Contrast() {
		boolean resultelement[] = new boolean[method.app.driver.length];
		Random rand = new Random();
		String methodname = Thread.currentThread().getStackTrace()[1].getMethodName();
		String btnlist[] = { method.app.def.btnLowest, method.app.def.btnLow, method.app.def.btnMid,
				method.app.def.btnHigh, method.app.def.btnHighest };
		for (int i = 0; i < method.app.driver.length; i++) {

			resultelement[i] = false;
			// wait[i].until(ExpectedConditions.elementToBeClickable(By.id(def.tv)));
			method.app.driver[i].rotate(ScreenOrientation.LANDSCAPE);
			method.app.driver[i].findElement(By.id(method.app.def.btnContrast)).click();
			method.wait[i].until(ExpectedConditions.elementToBeClickable(By.id(method.app.def.btnLowest)));

			for (int j = 0; j < btnlist.length; j++) {

				method.app.driver[i].findElement(By.id(btnlist[j])).click();
			}

			System.out.println("MethodName：" + this.getClass().getName() + "." + methodname);

			for (int j = 0; j < method.app.def.iterative; j++) {
				String e = btnlist[rand.nextInt(btnlist.length)];
				method.app.driver[i].findElement(By.id(e)).click();
				System.out.println(
						"DeviceName： " + method.app.cap[i].getCapability("deviceName") + " Step " + (j + 1) + " " + e);
			}

			resultelement[i] = true;
			method.app.driver[i].pressKeyCode(AndroidKeyCode.BACK);
			method.app.driver[i].pressKeyCode(AndroidKeyCode.BACK);
		}
		method.QuitDriver();
		return method.result(resultelement, methodname);
	}
*/
	void EnterLiveview() {

		String methodname = Thread.currentThread().getStackTrace()[1].getMethodName();
		for (int i = 0; i < method.app.driver.length; i++) {

			method.Wait_Element_ByXpath(method.app.def.tvConnection, i, methodname);
			List<WebElement> tvConnection = method.app.driver[i].findElements(By.xpath(method.app.def.tvConnection));

			for (int j = 0; j < tvConnection.size(); j++) {

				WebElement targetEle = tvConnection.get(j);

				if (targetEle.getText().contains("已連線") == true || targetEle.getText().contains("Online") == true
						|| targetEle.getText().contains("在线") == true) {
					try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						;
					}
					targetEle.click();
					break;
				} else {
					try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						;
					}
					j = 0;
					tvConnection.clear();
					tvConnection = method.app.driver[i].findElementsById(method.app.def.tvConnection);
				}

			}
		}

	}
}
