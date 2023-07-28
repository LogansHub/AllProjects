package org.green.test.parallel;

import org.testng.annotations.Test;

public class Parallels2 
{

	
	private void test6()
	{
	   System.out.println("p2" + Thread.currentThread().getId());	

	}
	@Test
	private void test7()
	{
	   System.out.println("p2" + Thread.currentThread().getId());	

	}	
	@Test
	private void test8()
	{
	   System.out.println("p2" + Thread.currentThread().getId());	

	}
	@Test
	private void test9()
	{
	   System.out.println("p2" + Thread.currentThread().getId());	

	}
	
	
	
}
