package com.ds.pagelayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class signuppage {


	public signuppage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


	@FindBy(xpath="//a[normalize-space()='Signup now']")
	private WebElement signup_btn;	

	@FindBy(xpath="//input[@id='formrow-firstname-Input']")
	private WebElement firstname_text;	

	@FindBy(xpath="//input[@id='formrow-lastname-Input']")
	private WebElement lastname_text;	

	@FindBy(xpath="//input[@name=\"email\"]")
	private WebElement email_textbox;

	@FindBy(xpath="//input[@name=\"password\"]")
	private WebElement password_textbox;

	@FindBy(xpath="//input[@id='customControlInline']")
	private WebElement radio_btn;

	@FindBy(xpath="//div[@class='mt-3 d-grid']")
	private WebElement submit_btn;

	public void clickOnsignupBtn()
	{
		signup_btn.click();
	}
	public void enterfirstname(String firstname)
	{
		firstname_text.sendKeys(firstname);

	}
	public void enterlastname(String lastname)
	{
		lastname_text.sendKeys(lastname);

	}
	public void enterEmailAddress(String email)
	{
		email_textbox.sendKeys(email);
	}

	public void enterpassword(String password)
	{
		password_textbox.sendKeys(password);
	}

	public void clickOnradioBtn()
	{
		radio_btn.click();
	}

	public void ClickOnSubmitBtn()
	{
		submit_btn.click();;
	}
}



