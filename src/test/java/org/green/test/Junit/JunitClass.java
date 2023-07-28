package org.green.test.Junit;

import java.sql.Driver;

import org.green.test.allanotations.BaseClasses;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JunitClass 
{
	
	 static WebDriver driver; 
	 
	@BeforeClass
	public static void launchbrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	
	@Before
	public void beforeStatement()
	{
		System.out.println("Test Case Execution Statred");
	}

	@Test
	public void test1()
	{
		System.out.println("test2");
		//WebElement findElement = driver.findElement(By.id("email"));
		//findElement.sendKeys("logan");
		
	}
	@Test
	public void test2()
	{
		System.out.println("test1");
		//WebElement findElement = driver.findElement(By.id("pass"));
		//findElement.sendKeys("kumar");
		
	}
	
	@Test
	public void test3()
	{
		System.out.println("test3");
		//WebElement btn = driver.findElement(By.xpath("//*[@name='login']"));
		//btn.click();
	}
	
	@After
	public void afterStatement()
	{
		System.out.println("Test Case Execution ended");
	}
	
	//@AfterClass
	public static void quitBrowser()
	{
	 driver.close();
	}
	
	

}
