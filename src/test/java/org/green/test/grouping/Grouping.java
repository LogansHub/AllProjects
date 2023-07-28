 package org.green.test.grouping;

import org.testng.annotations.Test;

public class Grouping 

{
   @Test(groups= {"Smoke Testing","retesting"})
   
	private void ClassA() 
	{
		
        System.out.println("I am in classA");
	}
   @Test(groups= "sanitary testing")
	private void ClassB() 
	{
	   System.out.println("I am in ClassB");

	}
   @Test(groups = "Smoke Testing")
	private void ClassC() 
	{
		System.out.println("I am in Classc");

	}
}
