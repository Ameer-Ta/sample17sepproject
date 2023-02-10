package com.ds.testlayer;

import org.testng.annotations.Test;

import com.ds.pagelayer.Loginpage;
import com.ds.pagelayer.dashboardpage;
import com.ds.pagelayer.exchangepage;
import com.ds.pagelayer.wipronsepage;
import com.ds.testbase.Testbase;

public class sellfunctionality extends Testbase {

	@Test
	public void VerifySellFunctionality() throws InterruptedException
	{
		Loginpage login_pge= new Loginpage(driver);
		dashboardpage dash_obj = new dashboardpage(driver);
		//exchangepage exchange_obj=new exchangepage(driver);
		wipronsepage nse_obj=new wipronsepage(driver);
		login_pge.enterEmailAddress("apple2701@gmail.com");
		login_pge.enterpassword("ameer@241");
		login_pge.clickOnLoginBtn();
		dash_obj.entercompanyname("wipro");
		Thread.sleep(3000);

		dash_obj.ClickOnoption();
		Thread.sleep(3000);

		//exchange_obj.ClickOnBuyButton1();
		//exchange_obj.enterQuantity("2");
		//exchange_obj.ClickOnBuyButton2();
		//Thread.sleep(3000);
		nse_obj.ClickOnBuyButton1();
		nse_obj.enterQuantity("2");
		nse_obj.ClickOnBuyButton2();
		
		
	}	
}
