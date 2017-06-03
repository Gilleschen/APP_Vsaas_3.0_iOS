package com.tutk.kalayvsaas.v3.jenkins;

import static org.junit.Assert.*;

import org.junit.Test;

public class Login_Junit {
	Login_TestCase testcase = new Login_TestCase();

	
	public void Login_Z() {
		assertTrue(testcase.Login());
	}
	
	@Test
	public void WrongEmail(){
		assertTrue(testcase.WrongEmail());
	}
	
	@Test
	public void WrongPassword(){
		assertTrue(testcase.WrongPassword());
	}
	
	@Test
	public void EmailBlank(){
		assertTrue(testcase.EmailBlank());
	}
	
	@Test
	public void PasswordBlank(){
		assertTrue(testcase.PasswordBlank());
	}
}
