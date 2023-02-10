package com.ds.pagelayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {



	

	public Loginpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath="//input[@name=\"email\"]")
	private WebElement email_textbox;
	
	@FindBy(xpath="//input[@name=\"password\"]")
	private WebElement password_textbox;
	
	@FindBy(xpath="//div[@class='mt-3 d-grid']")
	private WebElement lgn_btn;
	
	
	
	
	
	
	
	public void enterEmailAddress(String email)
	{
		email_textbox.sendKeys(email);
	}
	
	public void enterpassword(String password)
	{
		password_textbox.sendKeys(password);
	}
	
	public void clickOnLoginBtn()
	{
		lgn_btn.click();
	}
	
	
}
