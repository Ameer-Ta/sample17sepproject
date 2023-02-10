package com.ds.testlayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ds.pagelayer.Loginpage;
import com.ds.pagelayer.dashboardpage;
import com.ds.testbase.Testbase;
import com.ds.utilities.Utilclass;

public class Logoutfunctionality extends Testbase {
	@Test
	public void verifyLoginWithCorrectCrds() throws InterruptedException
	{
		String expected_output= "https://www.apps.dalalstreet.ai/logout";
		
		Loginpage login_pge= new Loginpage(driver);
		dashboardpage dash_obj = new dashboardpage(driver);
		Utilclass util_url=new Utilclass();
		Thread.sleep(3000);

		login_pge.enterEmailAddress("apple2701@gmail.com");
		login_pge.enterpassword("ameer@241");
		login_pge.clickOnLoginBtn();
		
		Thread.sleep(3000);
		dash_obj.ClickOnDropdown();
		dash_obj.ClickOnpoweroff();

		Assert.assertEquals(util_url.getWebpageUrl(), expected_output);
}
}
