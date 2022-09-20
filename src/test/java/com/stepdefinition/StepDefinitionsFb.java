package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinitionsFb 
{
   WebDriver driver; 
@Given("user lanch browser")
public void user_lanch_browser() {
	
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
   
}

@Then("user verify Error message is displayed")
public void user_verify_Error_message_is_displayed() {
	
	WebElement frgtps = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
	String text = frgtps.getText();
	System.out.println(text);
	System.out.println("Error msg");
}
@When("user enters  invalid username {string}")
public void user_enters_invalid_username(String username) throws InterruptedException {
	  Thread.sleep(7000);
	driver.findElement(By.id("email")).sendKeys(username);
}

@When("user enters invalid  password {string}")
public void user_enters_invalid_password(String password) {
    
	driver.findElement(By.id("pass")).sendKeys(password);
}



@When("user clicks login button")
public void user_clicks_login_button() throws InterruptedException 
{

	driver.findElement(By.name("login")).click();
	Thread.sleep(7000);
}


	
}
