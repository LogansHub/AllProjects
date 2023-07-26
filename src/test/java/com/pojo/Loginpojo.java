package com.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.LibGlobal;

public class Loginpojo extends LibGlobal
{

	public Loginpojo() 
	{
	
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//*[@class='responsiveAccountHeader_accountIcon'])[1]")
	private WebElement account;
	@FindBy(xpath="(//a[@class='sc-dwLEzm gitNBF sc-TRNrF dHknop sc-iqGgem cwdQpR'])[2]")
	private WebElement google;
	@FindBy(xpath="//*[@class='wLBAL']")
	private WebElement mail;
	
	public WebElement getMail() {
		return mail;
	}
	public WebElement getAccount() {
		return account;
	}
	public WebElement getGoogle() {
		return google;
	}
	
	
	
	
	
}
