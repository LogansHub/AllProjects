package org.green.test.mainbasepom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseClasses 
{
       static WebDriver driver; 
	public WebDriver lanchBrowser() 
	{
	    WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        return driver;
	}   
	public void loadurl(String url)
	{
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	public String currentUrl()
	{
		String currentUrls = driver.getCurrentUrl();
		return currentUrls;
	}	
		
	public String currentTitle()
	{
		String currentPageTitles = driver.getTitle();
		return currentPageTitles;
		
	}
	
	public  void insertText(WebElement wb,String values)
	{
		wb.sendKeys(values);
	}
	
	public  void buttonclick(WebElement elecl)
	{
		elecl.click();
	}
	
	
	
	
	
	
	
}
