package com.tutk.kalayvsaas.v3.jenkins;


import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import com.experitest.appium.SeeTestCapabilityType;
import com.experitest.appium.SeeTestIOSDriver;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class DeviceInformation {

	Definition def = new Definition();
	public SeeTestIOSDriver driver[] = new SeeTestIOSDriver[def.DeviceUDID.size()];
	public DesiredCapabilities cap[] = new DesiredCapabilities[def.DeviceUDID.size()];

	public DeviceInformation() {
		for (int i = 0; i < def.DeviceUDID.size(); i++) {
			cap[i] = new DesiredCapabilities();
		}
		for (int i = 0; i < def.DeviceUDID.size(); i++) {

			cap[i].setCapability(MobileCapabilityType.UDID, def.DeviceUDID.get(i));
			cap[i].setCapability(IOSMobileCapabilityType.BUNDLE_ID, def.BundleID);
			cap[i].setCapability(SeeTestCapabilityType.WAIT_FOR_DEVICE_TIMEOUT_MILLIS, def.sec * 1000);
			cap[i].setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 30);
			
			
			cap[i].setCapability(SeeTestCapabilityType.REPORT_FORMAT, "html");
			cap[i].setCapability(SeeTestCapabilityType.TEST_NAME, "Vsaas 3.0 iOS Test Report");
			cap[i].setCapability(SeeTestCapabilityType.REPORT_DIRECTORY, "c:\\reports\\"); 
			
			// cap[i].setCapability(SeeTestCapabilityType.REPORT_FORMAT,
			// "html");
			// cap[i].setCapability(SeeTestCapabilityType.TEST_NAME, "My First
			// Test");
			// cap[i].setCapability(SeeTestCapabilityType.REPORT_DIRECTORY,
			// "c:\\reports\\");

			try {
				driver[i] = new SeeTestIOSDriver<>(new URL("http://localhost" + ":" + def.port), cap[i]);
			} catch (MalformedURLException e) {
				;
			}

		}
	}

	public static void main(String[] args) {

	}

}
