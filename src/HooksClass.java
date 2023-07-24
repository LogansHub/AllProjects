

import com.baseclass.LibGlobal;

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
  public void endingexcetion() 
  {

    System.out.println("Hooks class Excetion ended");
    
	  
  }
	
	
	
	
	
	
	
	
	
	
}
