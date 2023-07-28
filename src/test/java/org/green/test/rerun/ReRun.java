package org.green.test.rerun;

import org.junit.Assert;
import org.testng.annotations.Test;

public class ReRun 
{   
	@Test
    public void Manual()
    {
		System.out.println("yes"); 
        Assert.assertTrue(false);	
       
	}
}
