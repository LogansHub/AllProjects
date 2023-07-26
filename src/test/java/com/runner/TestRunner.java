package com.runner;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Features\\flipkart.feature",
glue="com.stepDefiniton")

public class TestRunner 
{

	
}
