package org.green.test.dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Datas 
{
 
  @DataProvider(name = "bookdata") 
  public Object[][] Datas()
  {
    Object obj[][] = new Object[][]{{"Logankumar","LoganKumar"},{"15-09-2022","16-09-2022"},{"Logan","kumar"},{"Coimbatore-638111","111111"},{"111","yes"}}; 
	  return obj;
	  
  }
  
  
  
}
