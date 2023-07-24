

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

public class StepsDefinitionAll extends LibGlobal
{
@Given("User launch Adactinhotel Web Application")
public void user_launch_Adactinhotel_Web_Application() throws InterruptedException {
	        lanchbrowser(); 	
	        maximizebrowser();
	        Thread.sleep(7000);
}
@When("User entres valid username and valid password")
public void user_entres_valid_username_and_valid_password() {
	LoginPojo lp = new LoginPojo();
	sendvalues(lp.getUsrname(),"Logankumar"); 
	sendvalues(lp.getPasswrd(),"Logankumar");   
}
@When("User clicks Login Button")
public void user_clicks_Login_Button() {
	LoginPojo lp = new LoginPojo();
	buttunclick(lp.getLoginbtn());  
}
@Then("user verify Home page is displayed")
public void user_verify_Home_page_is_displayed() throws InterruptedException {
	Thread.sleep(5000);
	SearchHotelPojo sp = new SearchHotelPojo();
	String text = sp.getWelecometxt().getText();
	 boolean result = text.contains("Welcome");
	 System.out.println("is in home page" + "   "  + result);  
}
@Then("user click valid location,hotelname,roomtype,roomnumber,checkindate,checkoutdate,adultsandchlidcountperroom")
public void user_click_valid_location_hotelname_roomtype_roomnumber_checkindate_checkoutdate_adultsandchlidcountperroom() {
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
public void user_click_search_button() {
	SearchHotelPojo sh = new SearchHotelPojo();
	buttunclick(sh.getSubmitbtn());    
}
@Then("user  verify price page is displayed")
public void user_verify_price_page_is_displayed() throws InterruptedException {
	Thread.sleep(5000);
	PricePagePojo pr = new PricePagePojo();
	WebElement pricetxt = pr.getPricetxt();
	String text = pricetxt.getText();
	boolean result = text.contains("Select");
	System.out.println("is in price page" + "    " + result);   
}
@When("user selects select radio button")
public void user_selects_select_radio_button() {
	PricePagePojo pr = new PricePagePojo();
	pr.getRadiobtn().click();
}
@When("user click contine button")
public void user_click_contine_button() {
	PricePagePojo pr = new PricePagePojo();
	pr.getCtnuebtn().click(); 
}
@Then("user  verify booking page is displayed")
public void user_verify_booking_page_is_displayed() throws InterruptedException {
	   Thread.sleep(5000);
	   BookingPagePojo bk =new BookingPagePojo();
	   String text = bk.getBookpagetxt().getText();
	   boolean result = text.contains("Book A Hotel");
	   System.out.println("is in payment page" + "    " +  result);  
}
@When("user enters valid {string} and {string} and {string} and {string} and {string}")
public void user_enters_valid_and_and_and_and(String firstname, String lastname, String billingaddress, String ccnum, String cvvnumber) {
	 BookingPagePojo bk =new BookingPagePojo();
	 sendvalues(bk.getFirstnme(),firstname);
	 sendvalues(bk.getLastname(),lastname);
	 sendvalues(bk.getAdress(),billingaddress);
	 bk.getCreditcarddetails().sendKeys(ccnum); 
	 sendvalues(bk.getCvvnum(),cvvnumber);	
}
@When("user click Credit Card Type")
public void user_click_Credit_Card_Type() {
	 BookingPagePojo bk =new BookingPagePojo();
	 select(bk.getCctype(),"MAST");   
}
@When("user clicks valid Expiry month,Expiry year")
public void user_clicks_valid_Expiry_month_Expiry_year() {
	 BookingPagePojo bk =new BookingPagePojo();
	 select(bk.getExpyear(),"2022");
	 select(bk.getExpmonth(),"9");
}
@When("user select book now button")
public void user_select_book_now_button() {
	BookingPagePojo bk =new BookingPagePojo();
	buttunclick(bk.getBookbtn());
}
@Then("user should get order number")
public void user_should_get_order_number() throws InterruptedException {
	Thread.sleep(7000);
	WebElement  ordernm = driver.findElement(By.id("order_no"));
    String valueorder = ordernm.getAttribute("value");
	System.out.println("order completed and order num  is " + valueorder); 
}
}

	
	
	

