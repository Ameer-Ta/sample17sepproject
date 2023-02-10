package com.ds.pagelayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class transactionpage {

	private WebDriver driver;
	public transactionpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	
	public void getData()
	{
		String data = driver.findElement(By.xpath("(//td[contains(text(),'Intraday')])[1]")).getText();
		System.out.println(data);
	}
	
	public void getAllData()
	{
		for(int i=1;i<=8;i++)
		{
			for(int j=1;j<=9;j++)
			{
				String data1=driver.findElement(By.xpath("//table/tbody/tr[4]/td[1]")).getText();
				System.out.println(data1);
			}
		}
	}
	
}
