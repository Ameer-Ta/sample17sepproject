package com.ds.pagelayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class dashboardpage {
	
	public dashboardpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath="//body/div[@id='root']/div[@id='layout-wrapper']/header[@id='page-topbar']/div/div/form/div/input[1]")
	private WebElement search_textbox;
	
	@FindBy(xpath="(//div[@class='m-4 card'])[2]")
	private WebElement select_option;
	
	
	@FindBy(xpath="//button[@id='page-header-user-dropdown']//i[1]")
	private WebElement profile_dropdown;
	
	
	@FindBy(xpath="//span[normalize-space()='Power Off']")
	private WebElement poweroff_btn;
	
	@FindBy(xpath="//a[normalize-space()='Transactions']")
	private WebElement transaction_link;
	
	public void entercompanyname(String company_name)
	{
		search_textbox.sendKeys(company_name);
	}
	
	public void ClickOnoption()
	{
	select_option.click();
	}
	
	public void ClickOnDropdown()
	{
		profile_dropdown.click();
	}
	public void ClickOnpoweroff()
	{
		poweroff_btn.click();
	}
	
	public void ClickOnTransactionlink()
	{
		transaction_link.click();
	}
	
	
}
