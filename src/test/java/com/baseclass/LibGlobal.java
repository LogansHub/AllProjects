package com.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LibGlobal 
{
	public static WebDriver driver;
		public void lanchbrowser() 
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://adactinhotelapp.com/BookHotel.php");
		}	
		public void maximizebrowser() 
		{
		   driver.manage().window().maximize();

		}	
		public void sendvalues(WebElement element,String str) 
	    {
			element.sendKeys(str);
	      
		}
		public void buttunclick(WebElement element) 
		{
		    	element.click();
		}
		public void select(WebElement element,String value) 
		{
			Select s = new Select(element);
			s.selectByValue(value);
		}	
              
		
	    
	

}
