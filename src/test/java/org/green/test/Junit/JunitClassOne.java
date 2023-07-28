 package org.green.test.Junit;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class JunitClassOne
{

	@Test
	public void classesOne()
	{
		Assert.assertTrue(true);
	}
	@Test
	public void classessOne()
	{
		Assert.assertTrue(false);
	}
    @Ignore
    @Test
    public void classesssOne()
    {
    	System.out.println("I am in Classone Methodthree");
    }
	
}
