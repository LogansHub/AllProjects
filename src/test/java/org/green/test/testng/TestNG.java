package org.green.test.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG 
{

	@BeforeClass
	private void lanchbrowser() 
	{
		System.out.println("I will lanch browser");

	}
	@BeforeMethod
	private void StartTime() 
	{
		
        System.out.println("I am in Start Time");
	}
	@Test(invocationCount = 2)
	private void test1() 
	{
		System.out.println("I am in Test1");

	}
	@Test(enabled = false)
	private void test2() 
	{
		
        System.out.println(" I am in Test2");
	}
	@Test(priority = 0,dataProvider = "google")
	private void test3(String str1,String str2) 
	{
		
		System.out.println(str1);
		System.out.println(str2);
        System.out.println(" I am in Test3");
	}
	@Test(priority = 10)
	private void test4()
	{
		  System.out.println(" I am in Test4 ");

	}
	@Test(priority = -10)  
	private void test5()
	{
		  System.out.println(" I am in Test5 ");

	}
	@DataProvider(name = "google")
	private String[][] Datas() 
	{
	     
		String str[][] =  new String[2][2];
		str[0][0] = "Hai";
		str[0][1] = "Haii";
	    str[1][0] = "bye";	
	    str[1][1] = "byee";
	    return  str;
		
         
	}
	@AfterMethod
	private void EndTime() 
	{
		
       System.out.println("I am in EndTime");
	}
	@AfterClass
	private void EndBrowser()
	{
		System.out.println("I am in Endbrowser");

	}
	
	
	
}
