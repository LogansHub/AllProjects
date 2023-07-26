package com.stepdefinition;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.baseclass.LibGlobal;
import com.pojo.BookingPagePojo;
import com.pojo.LoginPojo;
import com.pojo.PricePagePojo;
import com.pojo.SearchHotelPojo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionvalid extends LibGlobal
{
@Given("User launch Adactinhotel Web Application")
public void user_launch_Adactinhotel_Web_Application()
{
	   
	 
	
}

@When("User entres valid username and valid password")
public void user_entres_valid_username_and_valid_password() 
{
	LoginPojo lp = new LoginPojo();
	sendvalues(lp.getUsrname(),"Logankumar"); 
	sendvalues(lp.getPasswrd(),"Logankumar");
}

@When("User clicks Login Button")
public void user_clicks_Login_Button()
{
	LoginPojo lp = new LoginPojo();
	buttunclick(lp.getLoginbtn());
	
}

@Then("user verify Home page is displayed")
public void user_verify_Home_page_is_displayed() throws InterruptedException
{
	Thread.sleep(5000);
	
	
	SearchHotelPojo sp = new SearchHotelPojo();
	String text = sp.getWelecometxt().getText();
	 boolean result = text.contains("Welcome");
	 System.out.println("is in home page" + "   "  + result);
	
	 
	 
	 
}

@Then("user click valid location,hotelname,roomtype,roomnumber,checkindate,checkoutdate,adultsandchlidcountperroom")
public void user_click_valid_location_hotelname_roomtype_roomnumber_checkindate_checkoutdate_adultsandchlidcountperroom() 
{
	SearchHotelPojo sh = new SearchHotelPojo();
	select(sh.getLocat(),"London");
	select(sh.getHotel(),"Hotel Sunshine");
	select(sh.getRoomty(),"Super Deluxe");
	select(sh.getRoomnu(),"5");
	sh.getDatecheckin().sendKeys("19-09-2022");
	sh.getDatecheckout().sendKeys("20-09-2022");
	select(sh.getAdultcount(),"2");
	select(sh.getChildcount(),"3");
}	  

@Then("user click search button")
public void user_click_search_button() throws InterruptedException 
{
	SearchHotelPojo sh = new SearchHotelPojo();
	buttunclick(sh.getSubmitbtn());
	
}

@Then("user  verify price page is displayed")
public void user_verify_price_page_is_displayed() throws InterruptedException
{
	Thread.sleep(5000);
	PricePagePojo pr = new PricePagePojo();
	WebElement pricetxt = pr.getPricetxt();
	String text = pricetxt.getText();
	boolean result = text.contains("Select");
	System.out.println("is in price page" + "    " + result);
	
} 

@When("user selects select radio button")
public void user_selects_select_radio_button()
{
	PricePagePojo pr = new PricePagePojo();
	pr.getRadiobtn().click();
	
	
}

@When("user click contine button")
public void user_click_contine_button()
{
	PricePagePojo pr = new PricePagePojo();
	pr.getCtnuebtn().click();
	
}

@Then("user  verify booking page is displayed")
public void user_verify_booking_page_is_displayed() throws InterruptedException 
{
   Thread.sleep(5000);
   BookingPagePojo bk =new BookingPagePojo();
   String text = bk.getBookpagetxt().getText();
   boolean result = text.contains("Book A Hotel");
   System.out.println("is in payment page" + "    " +  result);
   
	
}

@When("user enters valid first name and last name")
public void user_enters_valid_first_name_and_last_name() 
{
	 BookingPagePojo bk =new BookingPagePojo();
	 sendvalues(bk.getFirstnme(),"Logan");
	 sendvalues(bk.getLastname(),"kumar");
	
	
}

@When("user enters valid billing address")
public void user_enters_valid_billing_address() 
{
	 BookingPagePojo bk =new BookingPagePojo();
	 sendvalues(bk.getAdress(),"Coimbatore");
	
}

@When("user enters  valid credit card number")
public void user_enters_valid_credit_card_number()
{
	 BookingPagePojo bk =new BookingPagePojo();
	 bk.getCreditcarddetails().sendKeys("1234567891012151"); 
}

@When("user click Credit Card Type")
public void user_click_Credit_Card_Type() {
	 BookingPagePojo bk =new BookingPagePojo();
	 select(bk.getCctype(),"MAST");
  
}

@When("user clicks valid Expiry month,Expiry year")
public void user_clicks_valid_Expiry_month_Expiry_year()
{
	 BookingPagePojo bk =new BookingPagePojo();
	 select(bk.getExpyear(),"2022");
	 select(bk.getExpmonth(),"9");
}

@When("user enters valid cvv number")
public void user_enters_valid_cvv_number() {
	BookingPagePojo bk =new BookingPagePojo();
	sendvalues(bk.getCvvnum(),"123");
   
}

@When("user select book now button")
public void user_select_book_now_button() {
	BookingPagePojo bk =new BookingPagePojo();
	buttunclick(bk.getBookbtn());
	Assert.assertTrue(false);
	
}

@Then("user should get order number")
public void user_should_get_order_number() throws InterruptedException {
	Thread.sleep(7000);
	WebElement  ordernm = driver.findElement(By.id("order_no"));
    String valueorder = ordernm.getAttribute("value");
	System.out.println("oreder completed and num is " + valueorder);
   
}


}
