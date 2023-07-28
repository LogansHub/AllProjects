package org.green.test.allanotations;

import java.io.IOException;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;

public class MainProgram
{
     
     public static void main(String[] args) throws IOException, InterruptedException
     {
    	BaseClasses b = new BaseClasses();
    	WebDriver driver = b.lauchbrowser();
    	b.loadurl("https://www.facebook.com/");
    	b.waitingTime();
    	System.out.println(b.currentPageUrl());
    	System.out.println(b.currentPageTitle());
    	PomPageFactory pf = new PomPageFactory(driver);
    	//pf.logins();
    	b.SendValues(pf.getUsername(),b.getExcelData("C:\\Users\\LOGAN\\Desktop\\TestData.xlsx","TestSheet",1,0) );
    	System.out.println(pf.getPassword());
    	b.SendValues(pf.getPassword(),b.getExcelData("C:\\Users\\LOGAN\\Desktop\\TestData.xlsx","TestSheet",1,0) );
    	b.button(pf.getButton());
    	b.closeBrowser();
	}
	
}
