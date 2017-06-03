package com.tutk.kalayvsaas.v3.jenkins;

import static org.junit.Assert.*;

import org.junit.Test;

public class ForgotPassword_Junit {
	ForgotPassword_TestCase testcase = new ForgotPassword_TestCase();

	@Test
	public void EmailBlank() {
		assertTrue(testcase.EmailBlank());
	}

	@Test
	public void InvalidEmail() {
		assertTrue(testcase.InvalidEmail());
	}

	@Test
	public void ForgotPwd() {
		assertTrue(testcase.ForgotPwd());
	}

}
