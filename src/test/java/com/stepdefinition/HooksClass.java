package com.stepdefinition;



import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.baseclass.LibGlobal;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass extends LibGlobal
{

  @Before
  public void excutuion() 
  {
	
	  lanchbrowser();
	  maximizebrowser();
	  System.out.println("Hooks class executed");
  }
  @After
  public void screenshot(Scenario sn) 
  {
      if(sn.isFailed())
      {
	  TakesScreenshot tk = (TakesScreenshot)driver;
	  byte[] bs = tk.getScreenshotAs(OutputType.BYTES);
	  sn.embed(bs, "image/png");  
      }
  }
 
      
  }
	
	
	
	
	
	
	
	
	
	

