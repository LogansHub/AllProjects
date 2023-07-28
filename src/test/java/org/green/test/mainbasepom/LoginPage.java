package org.green.test.mainbasepom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends baseClasses 
{

	public LoginPage()
	{
	   PageFactory.initElements(driver,this);
		
	}
       @FindBy(id="email")
       private  WebElement usernameField;
       @FindBy(id="pass")
       private  WebElement passwordField;
       @FindBy(xpath="//button[@name='login']")
	   private  WebElement buttonClick;
	   
	public WebElement getUsernameField() {
		return usernameField;
	}
	public WebElement getPasswordField() {
		return passwordField;
	}
	public WebElement getButtonClick() {
		return buttonClick;
	}
	public  void findWebElements(String uservalues,String passvalues)   
	{
	   insertText(getUsernameField(), uservalues);
	   insertText(getPasswordField(), passvalues);
	   buttonclick(getButtonClick());
		
	}
       
}      
       
       
       
       
     

	
	
	
	
