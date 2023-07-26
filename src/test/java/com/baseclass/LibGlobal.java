package com.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pojo.Loginpojo;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LibGlobal 
{

	public static WebDriver driver;
	
	public static WebDriver launchbrowser() 
	{
	     WebDriverManager.chromedriver().setup();
	     driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://www.coggles.com/");
	     return driver;
	}
	public static void sendValue(WebElement element,String str) 
	{
		
	    element.sendKeys(str);
    }
	public static void click(WebElement element) 
	{
		element.click();
	}
	
	public static String gettingText(WebElement element) 
	{
		String text = element.getText();
		return text;
    
	}
	public static boolean isDispl(WebElement element) 
	{
		boolean displayed = element.isDisplayed();
		return displayed;

	}
	public static  String getWebTitle() 
	{
		 String title = driver.getTitle();
		 return title;

	}
	public static void clear(WebElement element) 
	{
		element.clear();

	}
	public static  void refresh() 
	{
	
         driver.navigate().refresh();
	}
	
	
	
	
	
	
}
