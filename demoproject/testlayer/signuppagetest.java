package com.ds.testlayer;

import org.testng.annotations.Test;

import com.ds.pagelayer.signuppage;
import com.ds.testbase.Testbase;

public class signuppagetest extends Testbase {

	@Test
	public void verifySignUpWithCorrectCrds()
	{
		signuppage signup_pge=new signuppage(driver);
		signup_pge.clickOnsignupBtn();
		signup_pge.enterfirstname("ameer");
		signup_pge.enterlastname("mohammad");
		signup_pge.enterEmailAddress("apple2701@gmail.com");
		signup_pge.enterpassword("ameer@241");
		signup_pge.clickOnradioBtn();
		signup_pge.ClickOnSubmitBtn();
	}
	
}
