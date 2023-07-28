package org.green.test.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class TestngPractise 
{
   WebDriver driver;
	
	@BeforeClass
	private void lanchweb() 
	{
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
	}
	@BeforeMethod
	private void startTime() 
	{
	System.out.println("Test Case Start Time");	
	}
	@Test(priority= -9,groups="credentials",timeOut= 2,expectedExceptions= ArithmeticException.class)
	private void username()	
	{
		driver.findElement(By.id("email")).sendKeys("logan");
	}
	@Test(invocationCount =1,priority= 0,groups="credentials")
	private void password()
	{
	    WebElement passfindElement = driver.findElement(By.id("pass")); 
	  // Assert.assertEquals("pass", passfindElement.getAttribute("value"));

	}
	@Test(priority= 10,dependsOnMethods="password")
	private void btn() 
	{
	  driver.findElement(By.id("loginbutton")).click();

	}
	@AfterMethod
	private void EndTime()
	{
	System.out.println("Test Case End Time");	

	}
	@AfterClass(enabled=false)
	private void browserquit()
	{
	System.out.println("End Time for Browser");

	}
	
	
	
}
