

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinitionsInval {
	WebDriver driver;

	@Given("User launch Adactinhotel Web Application")
	public void user_launch_Adactinhotel_Web_Application() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/BookingConfirm.php");
		driver.manage().window().maximize();
		Thread.sleep(5000);

	}

	@When("User entres valid username and valid password")
	public void user_entres_valid_username_and_valid_password() {

		driver.findElement(By.id("username")).sendKeys("Logankumar");
		driver.findElement(By.id("password")).sendKeys("Logankumar");
	}

	@When("User clicks Login Button")
	public void user_clicks_Login_Button() throws InterruptedException {
		driver.findElement(By.id("login")).click();
		Thread.sleep(3000);
	}

	@Then("user verify Home page is displayed")
	public void user_verify_Home_page_is_displayed() {
		String text = driver.findElement(By.xpath("//td[text()='Welcome to Adactin Group of Hotels']")).getText();
		boolean result = text.contains("Welcome");
		System.out.println("is in home page" + result);
	}

	@Then("user click valid location,hotelname,roomtype,roomnumber,checkindate,checkoutdate,adultsandchlidcountperroom")
	public void user_click_valid_location_hotelname_roomtype_roomnumber_checkindate_checkoutdate_adultsandchlidcountperroom() {
		WebElement loc = driver.findElement(By.id("location"));
		Select s = new Select(loc);
		s.selectByValue("London");
		WebElement hote = driver.findElement(By.id("hotels"));
		Select s2 = new Select(hote);
		s2.selectByValue("Hotel Sunshine");
		WebElement room = driver.findElement(By.id("room_type"));
		Select s3 = new Select(room);
		s3.selectByValue("Super Deluxe");
		WebElement roomno = driver.findElement(By.id("room_nos"));
		Select s4 = new Select(roomno);
		s4.selectByValue("5");
		driver.findElement(By.id("datepick_in")).sendKeys("17-09-2022");
		driver.findElement(By.id("datepick_out")).sendKeys("16-09-2022");
		WebElement adltsnum = driver.findElement(By.id("adult_room"));
		Select s5 = new Select(adltsnum);
		s5.selectByValue("2");
		WebElement childnum = driver.findElement(By.id("child_room"));
		Select s6 = new Select(childnum);
		s6.selectByValue("3");

	}

	@Then("user click search button")
	public void user_click_search_button() throws InterruptedException {
		driver.findElement(By.id("Submit")).click();
		Thread.sleep(5000);
	}

	@Then("user  verify price page is displayed")
	public void user_verify_price_page_is_displayed() {
		String text = driver.findElement(By.xpath("//td[text()='Select Hotel ']")).getText();
		boolean result = text.contains("Select");
		System.out.println("is in price page" + result);

	}

	@When("user selects select radio button")
	public void user_selects_select_radio_button() {
		driver.findElement(By.id("radiobutton_0")).click();
	}

	@When("user click contine button")
	public void user_click_contine_button() {
		driver.findElement(By.id("continue")).click();
	}

	@Then("user  verify booking page is displayed")
	public void user_verify_booking_page_is_displayed() {
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		String text = driver.findElement(By.xpath("//td[text()='Book A Hotel ']")).getText();
		boolean result = text.contains("Book A Hotel");
		System.out.println("is in payment page" + result);

	}

	@When("user click Credit Card Type")
	public void user_click_Credit_Card_Type() {
		WebElement cctype = driver.findElement(By.id("cc_type"));
		Select s = new Select(cctype);
		s.selectByValue("MAST");

	}

	@When("user clicks Expiry month,Expiry year")
	public void user_clicks_Expiry_month_Expiry_year() {
		WebElement expmonth = driver.findElement(By.id("cc_exp_month"));
		Select s = new Select(expmonth);
		s.selectByValue("9");
		WebElement expyear = driver.findElement(By.id("cc_exp_year"));
		Select s1 = new Select(expyear);
		s1.selectByValue("2022");

	}

	@When("user enter {string} and {string} and{string} and{string} and {string}")
	public void user_enter_and_and_and_and(String string, String string2, String string3, String string4,
			String string5) {

		driver.findElement(By.id("first_name")).sendKeys(string);
		driver.findElement(By.id("last_name")).sendKeys(string2);
		driver.findElement(By.xpath("//textarea[@rows='4']")).sendKeys(string3);
		driver.findElement(By.xpath("(//input[@type='text'])[13]")).sendKeys(string4);
		driver.findElement(By.xpath("(//input[@type='text'])[14]")).sendKeys(string5);
	}

	@When("user select book now button")
	public void user_select_book_now_button() {
		driver.findElement(By.id("book_now")).click();

	}

	@Then("user should get order number")
	public void user_should_get_order_number() {
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		WebElement ordernm = driver.findElement(By.id("order_no"));
		String valueorder = ordernm.getAttribute("value");
		System.out.println("oreder completed and num is " + valueorder);

	}

}