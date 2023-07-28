 package org.green.test.Junit;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
/*
@RunWith(Suite.class)
@Suite.SuiteClasses({JunitClassOne.class,JUnitClassTwo.class})
public class ParellelExecuting 
{
    public static void main(String[] args) 
    {
	
    	Result runClasses = JUnitCore.runClasses(JunitClassOne.class, JUnitClassTwo.class);
    	int runCount = runClasses.getRunCount();
    	System.out.println(runCount);
    	int failureCount = runClasses.getFailureCount();
    	System.out.println(failureCount);
    	int ignoreCount = runClasses.getIgnoreCount();
    	System.out.println(ignoreCount);
    	int passCount = runCount - failureCount;
    	System.out.println(passCount);
    	List<Failure> failures = runClasses.getFailures();
    	for (Failure failure : failures) {
			System.out.println(failure);
    		
    	}	}
    */
     
public class ParellelExecuting 
    {
	     public static void main(String[] args) {
			
		
    	 WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.facebook.com/");
         String currentUrl = driver.getCurrentUrl();
         boolean booleanresult = currentUrl.contains("facebook");
         Assert.assertTrue(booleanresult);
         WebElement findElement = driver.findElement(By.id("email"));
         findElement.sendKeys("logan");
         WebElement findElement2 = driver.findElement(By.id("pass"));
         findElement2.sendKeys("kumar");
         assertEquals("kumar", findElement2.getAttribute("value"));
         WebElement findElement3 = driver.findElement(By.xpath("//*[@name='login']"));
         findElement3.click();
	     } 
	}
    	
    	
    	
    	
    	
    	
	
	
	

