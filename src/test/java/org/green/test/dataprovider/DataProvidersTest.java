package org.green.test.dataprovider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProvidersTest 
{
    WebDriver driver; 
	@BeforeClass
	private void launch() 
	{
	   WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	   driver.get("http://adactinhotelapp.com/BookHotel.php");
	  
	}
	@Test(dataProvider = "bookdata")
	public  void details(String usr,String psr)
	{	
	   driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	   WebElement usernam = driver.findElement(By.id("username"));
	   usernam.sendKeys(usr);
	   WebElement pass = driver.findElement(By.id("password"));
	   pass.sendKeys(psr);
	   driver.findElement(By.id("login")).click();
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
       WebElement checkindate = driver.findElement(By.id("datepick_in"));
       checkindate.sendKeys("15-09-2022");
       WebElement checkoutdate = driver.findElement(By.id("datepick_out"));
       checkoutdate.sendKeys("16-09-2022");
       WebElement adltsnum = driver.findElement(By.id("adult_room"));
       Select s5 = new Select(adltsnum);
       s5.selectByValue("2");
       WebElement  childnum= driver.findElement(By.id("child_room"));
       Select s6 = new Select(childnum);
       s6.selectByValue("3");
       driver.findElement(By.id("Submit")).click();
       driver.findElement(By.id("radiobutton_0")).click();
       driver.findElement(By.id("continue")).click();
	}
	 @Test(dataProvider = "names")
	 public void firstandlast(String firstname,String lastname) throws InterruptedException 
	 {
		
       WebElement firstnames = driver.findElement(By.id("first_name"));
       firstnames.sendKeys(firstname);
       WebElement lastnames = driver.findElement(By.id("last_name"));
       lastnames.sendKeys(lastname);
       lastnames.sendKeys(Keys.TAB,"Coimbatore" + Keys.TAB,"1234567891012345" + Keys.TAB,"MAST" +Keys.TAB,"April" + Keys.TAB,"2022"+ Keys.TAB,"123");
       WebElement bookbtn = driver.findElement(By.id("book_now"));
       bookbtn.click();
       Thread.sleep(3000);
       WebElement ordernum = driver.findElement(By.id("order_no"));
       System.out.println(ordernum.getText());
     
	 } 
	/* @Test(dataProvider = "addscv")
	 public void addrsandccnum(String address, String ccnum) 
	 {
		
       WebElement billingadress = driver.findElement(By.id("address"));
       billingadress.sendKeys(address);
       WebElement creditcardnum = driver.findElement(By.id("cc_num"));
       creditcardnum.sendKeys(ccnum);
	 }
	   
	  @Test(dataProvider = "cv")
	  public void cvnum(String cv) 
	  {
	   
       WebElement cardtype = driver.findElement(By.id("cc_type"));
       Select s = new Select(cardtype);
       s.selectByValue("MAST");
       WebElement expiredate = driver.findElement(By.id("cc_exp_month"));
       Select s1 = new Select(expiredate);
       s1.selectByValue("9");
       WebElement expireyear = driver.findElement(By.id("cc_exp_year"));  
       Select s2 = new Select(expireyear);
       s2.selectByValue("2022");
       WebElement cvnum = driver.findElement(By.id("cc_cvv"));
       Select s3 = new Select(cvnum);
       s3.selectByValue("2022");
       cvnum.sendKeys(cv);
       WebElement bookbtn = driver.findElement(By.id("book_now"));
       bookbtn.click();
	  }
	 */ 
	  @DataProvider(name = "bookdata") 
	  public Object[][] Datab()
	  {
	    Object obj[][] = new Object[][] {{"Logankumar","Logankumar"},{"lok","gok"}}; 
		  return obj;
		  
	  }

	  @DataProvider(name = "names") 
	  public Object[][] Data()
	  {
	    Object obj[][] = new Object[][] {{"Logan","kumar"}}; 
		  return obj;
		  
	  }
	  @DataProvider(name = "addscv") 
	  public Object[][] Data1()
	  {
	    Object obj[][] = new Object[][]{{"Coimbatore","111111"}};
		  return obj;
		  
	  }
	    @DataProvider(name = "cv") 
		  public Object[][] Data2()
		  {
		    Object obj[][] = new Object[][]{{"123"}}; 
			  return obj;
			  
		  }
	 
	
	
	
}
