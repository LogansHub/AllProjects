


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HooksClasstwo   extends StepDefinitionsFb
{
	
  @Before
  public  void excutuion() 
  {
	

	
  }
  @After
  public  void endingexcetion(Scenario s) 
  {
     
     TakesScreenshot t = (TakesScreenshot)driver;
      byte[] bs = t.getScreenshotAs(OutputType.BYTES);
	  s.embed(bs, "image/png");
      
  }
	
	
	
	
	
	
	
	
	
	
}
