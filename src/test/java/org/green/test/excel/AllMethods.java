package org.green.test.excel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AllMethods
{
	 
    public static void main(String[] args)
   {
       
	/* WebDriverManager.chromedriver().setup();
	 WebDriver driver = new ChromeDriver();
	*/
		 
	 BaseClass b = new BaseClass();
	 
	 WebDriver driver = b.launchbrowser();
	
	// driver.get("https://www.facebook.com/");
	 
	  b.webUrl("https://www.facebook.com/");
	 
	 
	// String currentUrl = driver.getCurrent();
	 String currentPageUrl = b.currentPageUrl();
	 System.out.println(currentPageUrl);
	 
	// String title = driver.getTitle();
	 String currentPageTitle = b.CurrentPageTitle();
	 System.out.println(currentPageTitle);
	 
	// driver.manage().window().maximize();
	  b.windowMaximize();
	 
	 
    //driver.navigate().to("https://www.facebook.com/");
	// driver.navigate().forward();
	// driver.navigate().back();
	//navigate().refresh();
	 
	// driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	 b.ImplicityWait();
	 
	// driver.switchTo().alert();
	 
	 //driver.switchTo().window("//https://www.facebook.com/");
	 
	// driver.switchTo().frame(0);
	 
     // driver.close();
      
      //driver.quit();
	 
	 WebElement webElemen = driver.findElement(By.id("email"));
	 
	// webElemen.sendKeys("logan");
	 
	 b.elementKeys(webElemen,"logan");
	 
	// webElemen.click();
	 
	 b.buttonCliks(webElemen);
	 
	 //String text = webElemen.getText();
	 
	 String texts = b.webElementsTexts(webElemen);
	 
	 System.out.println(texts);  
	   
	 //webElemen.clear();  
	   
	   b.elementsClears(webElemen);
	   
	   b.elementsVisible(webElemen);
	   System.out.println(b.elementsVisible(webElemen));
	   
	   b.buttonSelected(webElemen);
	   System.out.println(b.buttonSelected(webElemen));
	   
	   b.elementsEnabled(webElemen);
	   System.out.println(b.elementsEnabled(webElemen));
	   
	   b.elementsAtributeName(webElemen,"value");
	   System.out.println(b.elementsAtributeName(webElemen,"value"));
	   
	   
	   
   }
	
}
