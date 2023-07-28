package org.green.test.mainbasepom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class ActualCode 
{
    public static void main(String[] args) throws InterruptedException 
    {
		
     baseClasses b = new baseClasses();   
	 WebDriver driver = b.lanchBrowser();
     b.loadurl("https://www.facebook.com/"); 
     Thread.sleep(3000);
	 String currentPageurls = b.currentUrl();
	 System.out.println(currentPageurls);
	 String currentPageTitles = b.currentTitle();
	 System.out.println(currentPageTitles);
	 LoginPage lp = new  LoginPage();
	 lp.findWebElements("logan","kumar");
     	 
    }}	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
 

 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 

