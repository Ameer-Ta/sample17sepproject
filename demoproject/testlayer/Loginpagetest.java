package com.ds.testlayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ds.pagelayer.Loginpage;
import com.ds.testbase.Testbase;
import com.ds.utilities.Utilclass;

public class Loginpagetest extends Testbase{
	@Test
	public void verifyLoginWithCorrectCrds() throws InterruptedException
	{
		String expected_output= "https://www.apps.dalalstreet.ai/dashboard";
		
		Loginpage login_pge= new Loginpage(driver);
		Utilclass util_url=new Utilclass();
		login_pge.enterEmailAddress("apple2701@gmail.com");
		login_pge.enterpassword("ameer@241");
		login_pge.clickOnLoginBtn();
		
		Thread.sleep(3000);
		

		Assert.assertEquals(util_url.getWebpageUrl(), expected_output);
	}

}
