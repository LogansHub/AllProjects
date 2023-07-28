package org.green.test.parameter;

import static org.junit.Assert.assertEquals;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class HardAssert 
{

	   WebDriver driver;
	  // SoftAssert s = new SoftAssert();
	@BeforeClass
	private void browserLanch() 
	{
		
         WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();
         driver.get("https://www.facebook.com/");
         
	}

	@Parameters("username")
	@Test(priority = 1)
	private void userNamebox(String s1) 
	{
	   
	  WebElement user = driver.findElement(By.id("email"));
      user.sendKeys(s1);
     // Assert.assertEquals(user.getAttribute("value"), "Logans");
    //  SoftAssert s = new SoftAssert();
   //   s.assertEquals(user.getAttribute("value"), "Logans");
      System.out.println( s1 + Thread.currentThread().getId());
     // s.assertAll();
	}
	@Parameters("password")
	@Test(priority = 2)
	private void passbox(String s2) 
	{
	
	   WebElement pass = driver.findElement(By.id("pass"));
	   pass.sendKeys(s2);
	   System.out.println(s2 + Thread.currentThread().getId());
	}
	
	@Test(priority = 3,enabled = false)
	private void logButton()
	{
	
         driver.findElement(By.xpath("//button[@type='submit']")).click();
         System.out.println(Thread.currentThread().getId());
	}
	
  
	
	   
	
	
	
}
