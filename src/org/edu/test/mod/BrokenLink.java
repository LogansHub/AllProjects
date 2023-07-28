package org.edu.test.mod;


import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLink 
{

	public static void main(String[] args) throws IOException, InterruptedException 
	{
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
	    List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total number of links" + links.size());
		 Set<String> s = new HashSet();
		 int brokenlink=0;
		for (WebElement link : links) 
			
		{
		      String attribute = link.getAttribute("href");	  
		      URL u = new URL(attribute);
		      URLConnection openConnection = u.openConnection();
		     
		      HttpURLConnection ht = (HttpURLConnection)openConnection;
		      
		      ht.connect();
		      int responseCode = ht.getResponseCode();
		      if(responseCode!=200)
		      {
		    	  brokenlink++;
		    	 s.add(attribute);
		      }	  
		    	 
		}
		System.out.println("Broken link count is "+ brokenlink );	
		for (String dup : s)
		{
		
		  System.out.println(dup);       	
		 	
		}
	}
}	
			
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

