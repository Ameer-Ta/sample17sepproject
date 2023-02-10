package com.ds.testlayer;

import org.testng.annotations.Test;

import com.ds.pagelayer.Loginpage;
import com.ds.pagelayer.dashboardpage;
import com.ds.pagelayer.transactionpage;
import com.ds.testbase.Testbase;


public class transactionpagetest extends Testbase {




	@Test
	public void gettransactionpage() throws InterruptedException
	{
		Loginpage login_pge= new Loginpage(driver);
		dashboardpage dash_obj = new dashboardpage(driver);
		transactionpage trans_obj=new transactionpage(driver);
		login_pge.enterEmailAddress("apple2701@gmail.com");
		login_pge.enterpassword("ameer@241");
		login_pge.clickOnLoginBtn();
		Thread.sleep(3000);
		dash_obj.ClickOnTransactionlink();
		trans_obj.getData();
		trans_obj.getAllData();
		
	}


	
	
}
