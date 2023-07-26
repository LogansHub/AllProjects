package com.baseclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LibGlobal
{

	public static WebDriver driver;
	public  void launchbrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	public static void lanchurl()
	{
		driver.navigate().to("https://www.flipkart.com/");
	}
	public static void  maximizebrowser()
	{
		driver.manage().window().maximize();
	}
	public static void waitscript()
	{
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	public static void sendvalue(WebElement element,String str)
	{
	   element.sendKeys(str);
	}
	public static void displayed(WebElement element)
	{
		element.isDisplayed();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
