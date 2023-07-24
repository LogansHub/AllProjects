

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.baseclass.LibGlobal;
import com.pojo.HomePage;
import com.pojo.Loginpojo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CogglesStepDef extends LibGlobal
{
   
@Given("User launch  browser")
public void user_launch_browser() 
{
	LibGlobal.launchbrowser();
	
}

@When("User enters valid user name and valid password")
public void user_enters_valid_user_name_and_valid_password() 
{
	Loginpojo lp = new Loginpojo();
	LibGlobal.click(lp.getAccount());
	   
}

@When("User clicks Login Button")
public void user_clicks_Login_Button() 
{
	Loginpojo lp = new Loginpojo();
	LibGlobal.click(lp.getGoogle());
	LibGlobal.click(lp.getMail());
}

@When("User Checks Home page is Displayed")
public void user_Checks_Home_page_is_Displayed() 
{
	HomePage hp = new HomePage();
	String wel = LibGlobal.gettingText(hp.getWelcome());
	boolean contains = wel.contains("LOGAN");
	System.out.println("is is homepage" + "  " + contains );
}

@When("User clicks Search button without value")
public void user_clicks_Search_button_without_value()
{
	HomePage hp = new HomePage();
	LibGlobal.click(hp.getSearchbtn());
	
	
}

@Then("User Verify some of the  products displayed by default")
public void user_Verify_some_of_the_products_displayed_by_default()
{
	HomePage hp = new HomePage();
	boolean displ = LibGlobal.isDispl(hp.getFilter());
	System.out.println("is result came for no input" + " " + displ);	
}

@When("User clicks Search box")
public void user_clicks_Search_box()
{
	HomePage hp = new HomePage();
	LibGlobal.click(hp.getSearchbox());
	
}

@When("User enters invalid  search keyword  {string}")
public void user_enters_invalid_search_keyword(String string)
{
	HomePage hp = new HomePage();
	LibGlobal.sendValue(hp.getSearchbox(), string);
	
	
}

@When("User clicks Search button")
public void user_clicks_Search_button()
{
	HomePage hp = new HomePage();
	LibGlobal.click(hp.getSearchbtn());
	
}

@Then("user verify Suggestion text is Displayed")
public void user_verify_Suggestion_text_is_Displayed()
{
	HomePage hp = new HomePage();
	String gettingText = LibGlobal.gettingText(hp.getErrormsg());
	
	
}

@When("User Clicks Search  box")
public void user_Clicks_Search_box()
{
	HomePage hp = new HomePage();
	LibGlobal.click(hp.getSearchbox());
	
}

@When("User enters valid keyword {string}")
public void user_enters_valid_keyword(String string) 
{
	HomePage hp = new HomePage();
	LibGlobal.click(hp.getSearchbox());
	LibGlobal.sendValue(hp.getSearchbox(),string);
	
	
}

@When("user clicks search button")
public void user_clicks_search_button() 
{
	HomePage hp = new HomePage();
	LibGlobal.click(hp.getSearchbtn());
    
}

@Then("user verify product page is dispalyed")
public void user_verify_product_page_is_dispalyed() 
{
	HomePage hp = new HomePage();
	boolean displ = LibGlobal.isDispl(hp.getFilter());
	System.out.println("is result came for valid  input" + " " + displ);
	
}
@When("User Clicks Search  box  for prev searches")
public void user_Clicks_Search_box_for_prev_searches()
{
	HomePage hp = new HomePage();
	LibGlobal.click(hp.getSearchbox());
	
	
}

@When("User enters valid keyword")
public void user_enters_valid_keyword()
{
	HomePage hp = new HomePage();
	LibGlobal.click(hp.getSearchbox());
	LibGlobal.sendValue(hp.getSearchbox(),"coat");
}

@Then("user should able to get suggestions based on previous searches")
public void user_should_able_to_get_suggestions_based_on_previous_searches()
{
	HomePage hp = new HomePage();
	boolean displ = LibGlobal.isDispl(hp.getSuggestionbox());
	System.out.println("is suggestion displayed" + "  " + displ );
	
	
}
@When("User Clicks Search  box for title verification")
public void user_Clicks_Search_box_for_title_verification()
{
	HomePage hp = new HomePage();
	LibGlobal.click(hp.getSearchbox());
	
}

@When("User enters valid keyword for titile verification")
public void user_enters_valid_keyword_for_titile_verification() 
{
	HomePage hp = new HomePage();
	LibGlobal.sendValue(hp.getSearchbox(),"tshirt");
	LibGlobal.click(hp.getSearchbtn());	
}


@Then("user verify Search Result webpage title contains search keyword")
public void user_verify_Search_Result_webpage_title_contains_search_keyword()
{
	String webTitle = LibGlobal.getWebTitle();
	boolean contains = webTitle.contains("shirt");
	System.out.println("is webtitile contains searched keyword " + "  " + contains);
	
}

@When("User Clicks Search  box for relevent")
public void user_Clicks_Search_box_for_relevent() 
{
	HomePage hp = new HomePage();
	LibGlobal.click(hp.getSearchbox());
	
}

@When("User enters valid keyword for relevent search")
public void user_enters_valid_keyword_for_relevent_search()
{   HomePage hp = new HomePage();
	LibGlobal.sendValue(hp.getSearchbox(),"tshirt");
	LibGlobal.click(hp.getSearchbtn());
	
}

@Then("user verify Search results are relevant")
public void user_verify_Search_results_are_relevant() 
{
    for(int i=0;i<=59;i++)
    {
    	WebElement element = driver.findElement(By.xpath("(//h3[@class='productBlock_productName'])[i]"));
    	String gettingText = LibGlobal.gettingText(element);
    	boolean equalsIgnoreCase = gettingText.equalsIgnoreCase("shirt");
    	System.out.println("is search result contains shirt keyword" + "  " + equalsIgnoreCase);
    	
    }
	
	
}
@When("User Clicks Search  box for pagi")
public void user_Clicks_Search_box_for_pagi() 
{
	HomePage hp = new HomePage();
	LibGlobal.click(hp.getSearchbox());
	
}

@When("User enters valid keyword  for pagi")
public void user_enters_valid_keyword_for_pagi()
{
	HomePage hp = new HomePage();
	LibGlobal.sendValue(hp.getSearchbox(),"tshirt");
	LibGlobal.click(hp.getSearchbtn());
}

@Then("user verify Search results are paginated")
public void user_verify_Search_results_are_paginated() throws InterruptedException
{
	int pagenums =0 ;
	 for(int i=0;i<=19;i++)
	 {
		 WebElement pagenum = driver.findElement(By.xpath("(//a[@data-page-number='i'])[2]"));
		 LibGlobal.click(pagenum);
		 Thread.sleep(3000);
		 pagenums++;
		 
	 }
	System.out.println("is results paginated" + "  " + pagenums);
}
@When("User Clicks Search  box for sorting meachanism")
public void user_Clicks_Search_box_for_sorting_meachanism() 
{
	HomePage hp = new HomePage();
	LibGlobal.click(hp.getSearchbox());
	
}

@When("User enters valid keyword for sorting")
public void user_enters_valid_keyword_for_sorting()
{
	HomePage hp = new HomePage();
	LibGlobal.sendValue(hp.getSearchbox(),"tshirt");
	LibGlobal.click(hp.getSearchbtn());

}

@Then("user verify Search results page contains sorting mechanism.")
public void user_verify_Search_results_page_contains_sorting_mechanism()
{
	HomePage hp = new HomePage();
	boolean displ = LibGlobal.isDispl(hp.getFilter());
	System.out.println("is filter  came for valid  input" + " " + displ);
	
}
@When("User Clicks Search  box for again search")
public void user_Clicks_Search_box_for_again_search() 
{
	HomePage hp = new HomePage();
	LibGlobal.click(hp.getSearchbox());
	
}

@When("User enters valid keyword for search functionality")
public void user_enters_valid_keyword_for_search_functionality() 
{
	HomePage hp = new HomePage();
	LibGlobal.sendValue(hp.getSearchbox(),"tshirt");
	LibGlobal.click(hp.getSearchbtn());
	
}
@When("user should get product page")
public void user_should_get_product_page()
{

	HomePage hp = new HomePage();
	boolean displ = LibGlobal.isDispl(hp.getFilter());
	System.out.println("is filter  came for valid  input" + " " + displ);
	
	
}
@Then("user should able to search again on the page itself")
public void user_should_able_to_search_again_on_the_page_itself()
{
	HomePage hp = new HomePage();
	LibGlobal.clear(hp.getSearchboxagain());
	LibGlobal.sendValue(hp.getSearchboxagain(), "tshirt");
	boolean displ = LibGlobal.isDispl(hp.getFilter());
	System.out.println("is filter  came  again for again search on product page" + " " + displ);
	
}
@When("User Clicks Search  box for refresh")
public void user_Clicks_Search_box_for_refresh() 
{
	HomePage hp = new HomePage();
	LibGlobal.click(hp.getSearchbox());
	
}

@When("User enters valid keyword for refresh")
public void user_enters_valid_keyword_for_refresh() throws InterruptedException 
{
	HomePage hp = new HomePage();
	LibGlobal.sendValue(hp.getSearchbox(),"tshirt");
	LibGlobal.click(hp.getSearchbtn());
	Thread.sleep(5000);
	
	
}

@Then("user should able to refresh and get the same result")
public void user_should_able_to_refresh_and_get_the_same_result()
{
	LibGlobal.refresh();
	HomePage hp = new HomePage();
	boolean displ = LibGlobal.isDispl(hp.getFilter());
	System.out.println("is same result  came for valid  input" + " " + displ);	
}

@When("User clicks search box")
public void user_clicks_search_box()
{
	HomePage hp = new HomePage();
	LibGlobal.click(hp.getSearchbox());
	
	
}

@When("User click search button")
public void user_click_search_button() 
{
	HomePage hp = new HomePage();
	LibGlobal.sendValue(hp.getSearchbox(),"tshirt");
	LibGlobal.click(hp.getSearchbtn());
	
}

@When("user verify Product page is displayed")
public void user_verify_Product_page_is_displayed() 
{
	HomePage hp = new HomePage();
	boolean displ = LibGlobal.isDispl(hp.getFilter());
	System.out.println("is prodct page is  displayed" + " " + displ);
}

@When("user clicks particular product")
public void user_clicks_particular_product() 
{
	HomePage hp = new HomePage();
	LibGlobal.click(hp.getImgclick());
	
}

@When("user verify product details page is displayed")
public void user_verify_product_details_page_is_displayed()
{
	HomePage hp = new HomePage();
	LibGlobal.isDispl(hp.getDescription());
	
}

@When("user clicks size and quantity")
public void user_clicks_size_and_quantity()
{
	HomePage hp = new HomePage();
	LibGlobal.click(hp.getSizeclick());
	
}

@When("user cliks Add to Bag functionality")
public void user_cliks_Add_to_Bag_functionality() 
{
	HomePage hp = new HomePage();
	LibGlobal.click(hp.getAddbag());
	
}

@When("user clicks View basket button")
public void user_clicks_View_basket_button() 
{
	HomePage hp = new HomePage();
	LibGlobal.click(hp.getViewbasket());
	
}

@Then("user verify checkout page is displayed")
public void user_verify_checkout_page_is_displayed()
{
	HomePage hp = new HomePage();
	LibGlobal.click(hp.getCheckout());
	
}


	
}
