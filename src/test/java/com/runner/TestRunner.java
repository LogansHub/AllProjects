package com.runner;



import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.report.ReportJVM;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Features\\adactinhotelappbooking.feature",
glue= "com.stepdefinition",dryRun=true,plugin= {"pretty","junit:target\\junitreport.xml","html:target",
		"json:target\\jsonreport.json","rerun:src\\test\\resources\\Failed.txt"},tags= {"@smoke or @regression"},monochrome=true)

public class TestRunner 
{
	@AfterClass
	public static void generatejvm() 
	{
		
		ReportJVM.getGeneratedReport(System.getProperty("user.dir") +"\\target\\jsonreport.json");

	}
	
	
} 
	
	   

	
	
	
	
	
	


