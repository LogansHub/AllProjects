package com.stepdefinition;

import com.baseclass.LibGlobal;
import com.pojo.LoginPojo;
import com.pojo.SearchHotelPojo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionvalid extends LibGlobal
{



@Given("User launch Adactinhotel Web Application")
public void user_launch_Adactinhotel_Web_Application()
{
	
	lanchbrowser();
	maximizebrowser(); 
}

@When("User entres valid username and valid password")
public void user_entres_valid_username_and_valid_password() 
{
	LoginPojo lp = new LoginPojo();
	sendvalues(lp.getUsrname(),"Logankumar"); 
	sendvalues(lp.getUsrname(),"Logankumar");
}

@When("User clicks Login Button")
public void user_clicks_Login_Button() throws InterruptedException
{
	LoginPojo lp = new LoginPojo();
	buttunclick(lp.getLoginbtn());
	Thread.sleep(5000);
}

@Then("user verify Home page is displayed")
public void user_verify_Home_page_is_displayed()
{
	SearchHotelPojo sp = new SearchHotelPojo();
	String text = sp.getWelecometxt().getText();
	 boolean result = text.contains("Welcome");
	 System.out.println("is in home page" + "   "  + result);
	 
}

@Then("user click valid location,hotelname,roomtype,roomnumber,checkindate,checkoutdate,adultsandchlidcountperroom")
public void user_click_valid_location_hotelname_roomtype_roomnumber_checkindate_checkoutdate_adultsandchlidcountperroom() 
{

	
}

@Then("user click search button")
public void user_click_search_button() {
   
}

@Then("user  verify price page is displayed")
public void user_verify_price_page_is_displayed() {
   
} 

@When("user selects select radio button")
public void user_selects_select_radio_button() {
    
}

@When("user click contine button")
public void user_click_contine_button() {
  
}

@Then("user  verify booking page is displayed")
public void user_verify_booking_page_is_displayed() {
   
}

@When("user enters valid first name and last name")
public void user_enters_valid_first_name_and_last_name() {
   
}

@When("user enters valid billing address")
public void user_enters_valid_billing_address() {
    
}

@When("user enters  valid credit card number")
public void user_enters_valid_credit_card_number() {
    
}

@When("user click Credit Card Type")
public void user_click_Credit_Card_Type() {
  
}

@When("user clicks valid Expiry month,Expiry year")
public void user_clicks_valid_Expiry_month_Expiry_year() {
   
}

@When("user enters valid cvv number")
public void user_enters_valid_cvv_number() {
   
}

@When("user select book now button")
public void user_select_book_now_button() {
   
}

@Then("user should get order number")
public void user_should_get_order_number() {
   
}


}
