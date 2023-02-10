package com.ds.pagelayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class exchangepage {
	
	public exchangepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath="//a[normalize-space()='Buy']")
	private WebElement buy_btn1;
	
	@FindBy(xpath="//input[@name='input-Qunatity']")
	private WebElement quantity_txtbox;
	
	@FindBy(xpath="//button[normalize-space()='Buy']")
	private WebElement buy_btn2;
	
	@FindBy(xpath="//div[text()='Order Created successfully']")
	private WebElement order1;
	
	@FindBy(xpath="//div[contains(text(),'Order Created Successfully')]")
	private WebElement order2;
	
	
	@FindBy(xpath="//label[text()='Intraday']")
	private WebElement Intraday_btn;
	
	public void ClickOnBuyButton1()
	{
		buy_btn1.click();
	}
	
	public void enterQuantity(String count)
	{
		quantity_txtbox.click();
		quantity_txtbox.sendKeys(count);
	}
	
	public void ClickOnBuyButton2()
	{
		buy_btn2.click();
	}
	
	public String OrderStatus2() 
	{
		String msg=order2.getText();
		return msg;
	}
	
	public String OrderStatus() 
	{
		String msg=order1.getText();
		return msg;
	}
	
	
	public void ClickOnIntradayButton()
	{
		Intraday_btn.click();
	}
	
}
