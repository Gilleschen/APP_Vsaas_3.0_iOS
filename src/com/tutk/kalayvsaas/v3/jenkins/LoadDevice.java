package com.tutk.kalayvsaas.v3.jenkins;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LoadDevice {

	public ArrayList<String> DeviceList = new ArrayList<String>();
	public ArrayList<String> deviceName = new ArrayList<String>();
	// public ArrayList<String> platformVersion = new ArrayList<String>();

	public LoadDevice() {
		FileReader fr = null;
		try {
			fr = new FileReader("C:\\device.txt");

		} catch (FileNotFoundException e) {
			System.out.println("找不到C:\\device.txt");
			;
		}

		BufferedReader br = new BufferedReader(fr);
		String line;
		String[] DeviceList;

		try {
			while ((line = br.readLine()) != null) {
				deviceName = new ArrayList<String>();
				// platformVersion = new ArrayList<String>();
				DeviceList = line.split(",");

				if (DeviceList.length != 0) {
					for (int i = 0; i < DeviceList.length; i++) {

						deviceName.add(DeviceList[i]);
					}
					System.out.println("測試設備(UDID)");
					for (int i = 0; i < DeviceList.length; i++) {
						System.out.println("UDID:" + deviceName.get(i));
						// Sysem.out.println(platformVersion.get(i));
					}

				} else {
					System.out.println("C:\\device.txt內容資訊有誤");
				}
			}
		} catch (IOException e) {
			;
		}

	}

	public static void main(String[] args) {

	}
}