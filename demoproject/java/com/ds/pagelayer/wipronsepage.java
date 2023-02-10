package com.ds.pagelayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class wipronsepage {
	
	public wipronsepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath="//a[normalize-space()='Sell']")
	private WebElement sell_btn1;
	
	@FindBy(xpath="//input[@id='quantity']")
	private WebElement quantity_txtbox;
	
	@FindBy(xpath="//button[normalize-space()='Sell']")
	private WebElement sell_btn2;
	
	
	public void ClickOnBuyButton1()
	{
		sell_btn1.click();
	}
	
	public void enterQuantity(String count)
	{
		quantity_txtbox.click();
		quantity_txtbox.sendKeys(count);
	}
	
	public void ClickOnBuyButton2()
	{
	sell_btn2.click();
	}
}
