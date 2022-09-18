package com.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.LibGlobal;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPojo extends LibGlobal
{
	
	public LoginPojo()
	{
		 PageFactory.initElements(driver, this);
	}
	@FindBy(id = "username")
	private WebElement usrname;
	@FindBy(id = "password")
	private WebElement passwrd;
	@FindBy( id = "login")
	private WebElement loginbtn;
	
	public WebElement getUsrname() {
		return usrname;
	}
	public WebElement getPasswrd() {
		return passwrd;
	}
	public WebElement getLoginbtn() {
		return loginbtn;
	}
	
	
	
	
	
	
	
	
   
   
   
	
}
