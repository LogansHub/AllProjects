package org.green.test.excel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass 
{
    static WebDriver driver;
    
	 public WebDriver launchbrowser() 
	 {
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 return driver;
	 }   
	 public void webUrl(String urls) 
	 {
		 driver = new ChromeDriver();
		driver.get(urls);
		

	 } 
	 public String currentPageUrl() 
	 {
		String currentUrl = driver.getCurrentUrl();
        return currentUrl;
	 }
	 
	 public String CurrentPageTitle() 
	 {
		String title = driver.getTitle();
		return title;
     }
	 public void windowMaximize() 
	 {
		driver.manage().window().maximize();

	 }
	 public void ImplicityWait() 
	 {
	     driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

	 }
	 public void elementKeys(WebElement webElemen,String Keyvalue) 
	 {
		 webElemen.sendKeys(Keyvalue);

	 }
	 public void buttonCliks(WebElement webElemen)
	 {
	    
		 webElemen.click();
	 }
	 public String webElementsTexts(WebElement webElemen) 
	   {
	      	
		 String text = webElemen.getText();
		 return text;
	   }
	 public void elementsClears(WebElement webElemen) 
	  {
		 
		 webElemen.clear();
	  }
	 public Boolean elementsVisible(WebElement webElemen) 
	 {
		
		 boolean displayed = webElemen.isDisplayed();
		 return displayed;
     }
	 
	 public Boolean buttonSelected(WebElement webElemen)
	 {
		 boolean selected = webElemen.isSelected();
		 return selected;
       
	 }
	 
	 public boolean elementsEnabled(WebElement webElemen) 
	 {
		 boolean enabled = webElemen.isEnabled();
		 return enabled;

	 }
	 public String elementsAtributeName(WebElement webElemen,String Value) 
	 {
		 String attribute = webElemen.getAttribute(Value);
		 return attribute;

	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
