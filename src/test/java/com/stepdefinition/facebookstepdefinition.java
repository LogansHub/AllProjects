package com.stepdefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class facebookstepdefinition
{
	public static WebDriver driver;
@Given("user lanch browser")
public void user_lanch_browser() throws InterruptedException
{
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://www.facebook.com/login/");
	driver.manage().window().maximize();
	Thread.sleep(5000);
}

@Then("user verify Error message is displayed")
public void user_verify_Error_message_is_displayed()
{
    
	System.out.println("verifying error message");
}

@When("user enters  invalid username and invalid password")
public void user_enters_invalid_username_and_invalid_password(io.cucumber.datatable.DataTable d) 
{
      List<Map<String,String>> asMaps = d.asMaps();
       Map<String, String> map = asMaps.get(1);
    
     

      driver.findElement(By.id("email")).sendKeys(map.get("username"));
      driver.findElement(By.id("pass")).sendKeys(map.get("password"));
	
}

@When("user clicks login button")
public void user_clicks_login_button() 
{
    
	driver.findElement(By.id("loginbutton")).click();
}


}
