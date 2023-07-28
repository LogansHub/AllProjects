package org.green.test.mainbasepom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PageSource 
{
	
public static void main(String[] args)
{
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();

	driver.get("https://www.facebook.com/");
	
	String pageSource = driver.getPageSource();
	
	boolean contains = pageSource.contains("Facebook helps you connect and share with the people in your life");
	
	System.out.println(contains);
	
	System.out.println(pageSource);
	
	
	
	
}




}
