 package org.green.test.allanotations;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class PomPageFactory extends BaseClasses
{
	   WebDriver driver;
	   
	public PomPageFactory(WebDriver driver)
	{
		this.driver=driver;
	   PageFactory.initElements(driver,this);
		
	}
	@FindBys({@FindBy(id="email"),@FindBy(xpath="//*[@name='email']")})
	private WebElement username;
	
	@FindAll({@FindBy(id="pass"),@FindBy(name="pass")})
	private WebElement password;
	
	@CacheLookup
	@FindBy(xpath="//*[@name='login']")
	private WebElement button;
	
	public WebElement getUsername() {
		return username;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getButton() {
		return button;
	}
	
 /*	public void logins() 
	{
		SendValues(getUsername(),getExcelData("‪C:\\Users\\LOGAN\\Desktop\\TestData.xlsx","TestSheet",1,0));
		SendValues(getPassword(),getExcelData("‪C:\\Users\\LOGAN\\Desktop\\TestData.xlsx","TestSheet",2,0));
		button(getButton());
	}
	*/
	
}	
	
	
	
	

