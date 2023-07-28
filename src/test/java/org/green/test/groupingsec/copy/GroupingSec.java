package org.green.test.groupingsec.copy;

import org.testng.annotations.Test;

public class GroupingSec 

{
   @Test(groups = {"Smoke Testing","Regression testing"})
	private void Classc() 
	{
		
        System.out.println("I am in G2classA");
	}
   @Test(groups = "sanitary testing")
	private void Classd() 
	{
	   System.out.println("I am in G2ClassB");

	}
   @Test(groups = "Smoke Testing")
	private void Classe() 
	{
		System.out.println("I am in G2Classc");

	}
}
