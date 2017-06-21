package com.tutk.kalayvsaas.v3.jenkins;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LiveView_Junit {
	LiveView_TestCase testcase = new LiveView_TestCase();

	@Before
	public void setUp() throws Exception {
		testcase.EnterLiveview();
	}

	//@Test
	public void Listener() {
		assertTrue(testcase.Listener());
	}

	//@Test
	public void Speaker() {
		assertTrue(testcase.Speaker());
	}
	
	@Test
	public void Recording() {
		assertTrue(testcase.Recording());
	}
	/*
	@Test
	public void Snapshot() {
		assertTrue(testcase.Snapshot());
	}

	@Test
	public void Brightness() {
		assertTrue(testcase.Brightness());
	}

	@Test
	public void Contrast() {
		assertTrue(testcase.Contrast());
	}

	@Test
	public void Cloud() {
		assertTrue(testcase.Cloud());
	}

	@Test
	public void LandScape_Listener() {
		assertTrue(testcase.LandScape_Listener());
	}

	@Test
	public void LandScape_Speaker() {
		assertTrue(testcase.LandScape_Speaker());
	}

	@Test
	public void LandScape_Recording() {
		assertTrue(testcase.LandScape_Recording());
	}

	@Test
	public void LandScape_Snapshot() {
		assertTrue(testcase.LandScape_Snapshot());
	}

	@Test
	public void LandScape_Brightness() {
		assertTrue(testcase.LandScape_Brightness());
	}

	@Test
	public void LandScape_Contrast() {
		assertTrue(testcase.LandScape_Contrast());
	}
*/
}
