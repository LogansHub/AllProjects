package org.green.test.table;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable 
{
public static void main(String[] args) throws InterruptedException
{
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://cosmocode.io/automation-practice-webtable/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    
	        WebElement table = driver.findElement(By.xpath("//table[@id='countries']"));
	        JavascriptExecutor js = (JavascriptExecutor)driver; 
		     js.executeScript("arguments[0].scrollIntoView(true)",table);
	        List<WebElement> country = table.findElements(By.xpath("//td[@style='width: 134.667px;']"));
	        for (WebElement cnty : country)
	       {
			 
	       String tex = cnty.getText();
	       if(tex.equalsIgnoreCase("Afghanistan") || tex.equalsIgnoreCase("Albania")||tex.equals("Algeria") ||tex.equalsIgnoreCase("Andorra"))
	      {
	        	 driver.findElement(By.xpath("//strong[text()='Afghanistan']//parent::td//parent::tr/td/input")).click();                   	 
	        	                    	 
	    	   
           }
	    /*   else if(tex.equals("Angola"))
	       {
	    	   driver.findElement(By.xpath("//strong[text()='Angola']//parent::td//parent::tr/td[@style='width: 116.667px;']")).click();
	    	   Thread.sleep(3000);
	    	   driver.findElement(By.xpath("//strong[text()='Angola']//parent::td//parent::tr/td[@style='width: 116.667px;']")).click();
	    	   
	     */  }
	        	
	        	
			}

}

