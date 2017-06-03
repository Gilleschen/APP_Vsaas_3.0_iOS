package com.tutk.kalayvsaas.v3.jenkins;

import static org.junit.Assert.*;

import org.junit.Test;

public class CreateAccount_Junit {

	CreateAccount_TestCase testcase = new CreateAccount_TestCase();

	@Test
	public void CreateAccount() {
		assertTrue(testcase.CreateAccount());
	}

	@Test
	public void InvaliedEmail() {
		assertTrue(testcase.InvaliedEmail());
	}

	@Test
	public void ExistedAccount() {
		assertTrue(testcase.ExistedAccount());
	}

	@Test
	public void EmailBlank() {
		assertTrue(testcase.EmailBlank());
	}

	@Test
	public void ConfirmPwdBlank() {
		assertTrue(testcase.ConfirmPwdBlank());
	}

	@Test
	public void NewPwdBlank() {
		assertTrue(testcase.NewPwdBlank());
	}

	@Test
	public void NewPwdAndConfirmPwdNotMatch() {
		assertTrue(testcase.NewPwdAndConfirmPwdNotMatch());
	}

	@Test
	public void NicknameBlank() {
		assertTrue(testcase.NicknameBlank());
	}

	@Test
	public void DonotCheckTermsofUser() {
		assertTrue(testcase.DonotCheckTermsofUser());
	}

	@Test
	public void WrongPwdRule() {
		assertTrue(testcase.WrongPwdRule());
	}
}
