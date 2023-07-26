package com.stepDefiniton;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.baseclass.LibGlobal;
import com.pojo.HomePagePojo;
import com.pojo.ProductDetailsPagePojo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FlipkartStepDefinition extends LibGlobal
{


@Given("user launches browser")
public void user_launches_browser() throws AWTException
{
	launchbrowser();
	maximizebrowser();
	lanchurl();
	waitscript();
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_ESCAPE);
}

@Then("user verify search functionality is displayed")
public void user_verify_search_functionality_is_displayed() 
{
	HomePagePojo h = new HomePagePojo();
	WebElement search = h.getSearch();
	boolean displayed = search.isDisplayed();
	System.out.println("is search functionality is present is" + displayed);
	
}


@When("user clicks search button")
public void user_clicks_search_button() 
{
	HomePagePojo h = new HomePagePojo();
	WebElement searchbutton = h.getSearchbutton();
	searchbutton.click();
}

@Then("user verify relevant search results are present")
public void user_verify_relevant_search_results_are_present() 
{
	ProductDetailsPagePojo pd = new ProductDetailsPagePojo();
	WebElement product = pd.getProduct();
	boolean displayed = product.isDisplayed();
	System.out.println("is search product is present " + displayed);
	
	
}

@When("user clicks on the desired product")
public void user_clicks_on_the_desired_product() 
{
	ProductDetailsPagePojo pd = new ProductDetailsPagePojo();
	WebElement product = pd.getProduct();
	product.click();
	
}

@Then("user verify  add to cart page is displayed")
public void user_verify_add_to_cart_page_is_displayed()
{
	waitscript();
	String parentid = driver.getWindowHandle();
	Set<String> windowHandles = driver.getWindowHandles();
    for (String string : windowHandles) 
    {
	    if(!(string.equals(parentid)))
	    		{		
    	driver.switchTo().window(string);
	    		}
	}
	
}

@When("user clicks on the add to cart")
public void user_clicks_on_the_add_to_cart() 
{
	waitscript();
	ProductDetailsPagePojo pd = new ProductDetailsPagePojo();
	WebElement cart = pd.getCart();
	cart.click();
		
}

@When("user clicks place order button")
public void user_clicks_place_order_button() 
{
	waitscript();
	ProductDetailsPagePojo pd = new ProductDetailsPagePojo();
	WebElement placeorder = pd.getPlaceorder();
	try {
	placeorder.click();
	}catch (Exception e)
	{
		WebElement pl = driver.findElement(By.xpath("//span[text()='Place Order']//parent::button"));
		pl.click();
	}
}

@Then("user verify payment page is displayed")
public void user_verify_payment_page_is_displayed() 
{
	ProductDetailsPagePojo pd = new ProductDetailsPagePojo();
    WebElement adrresspayment  = pd.getAddress();
    boolean displayed = adrresspayment.isDisplayed();
    System.out.println("is payemnt page is " + displayed);
	
}

@When("user clicks address option")
public void user_clicks_address_option()
{
	ProductDetailsPagePojo pd = new ProductDetailsPagePojo();
	pd.getAddress().click();
	pd.getDeliverbtn().click();
	pd.getContinuebtn().click();
	pd.getAccptbtn();
}
    


@When("user clicks payment option")
public void user_clicks_payment_option()
{
	ProductDetailsPagePojo pd = new ProductDetailsPagePojo();
	pd.getNetbnking().click();
	driver.navigate().back();
	
}

@Then("user removes the selected product from the cart")
public void user_removes_the_selected_product_from_the_cart() 
{
	ProductDetailsPagePojo pd = new ProductDetailsPagePojo();
	pd.getRemovebtn().click();
	String text = pd.getCartempty().getText();
	System.out.println(text);
	
}
@When("user sends valid keyword")
public void user_sends_valid_keyword() 
{
	HomePagePojo h = new HomePagePojo();
	h.getSearch().sendKeys("SAMSUNG Galaxy F23 5G (Copper Blush, 128 GB)  (6 GB RAM)");
	h.getSearchbutton().click();
		
}
  
	
}


	

