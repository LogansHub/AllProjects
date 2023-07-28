package org.green.test.crossbrowser;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowsers
{
	WebDriver driver ;
    @Parameters("webname")
	@Test
	private void browserLanch(String webs) 
	{
	 
		if(webs.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(webs.equalsIgnoreCase("firefox"))
		{
			
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else
		{
			System.out.println("browser not launched");
			
		}
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
}
