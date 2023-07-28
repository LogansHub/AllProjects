package org.green.test.links;

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

public class BrokenImages 
{

	 public static void main(String[] args) throws IOException, InterruptedException
{
		 
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/"); 
		Thread.sleep(7000);
		List<WebElement> images = driver.findElements(By.tagName("img"));
		System.out.println(images.size());
		Set<String> s = new HashSet();
		int brokenimage = 0;
		for (WebElement image : images)
		{
		
			String attribute = image.getAttribute("src");
			URL u = new URL(attribute);
			URLConnection openConnection = u.openConnection();
			HttpURLConnection connection = (HttpURLConnection)openConnection;
			connection.connect();
			int responseCode = connection.getResponseCode();
			if(responseCode!=200)
			{
				
				s.add(attribute);
				brokenimage++;
				
			}
		   for (String brokenim : s)
		   {
			   System.out.println(brokenimage);
			   System.out.println(brokenim);
		   }
				
}			
			
			
		
		 
		
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		
	


}
	
	
	
	
}
