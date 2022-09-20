package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Features\\FaceBook.feature",glue= "com.stepdefinition",dryRun=false,
plugin = {"pretty","junit:target\\report.xml","html:target","json:target\\reports.json"},monochrome=true)

public class TestRunner 
{
	
	
	
	
	
	

}
