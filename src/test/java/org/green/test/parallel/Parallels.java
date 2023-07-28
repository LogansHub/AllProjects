package org.green.test.parallel;

import org.testng.annotations.Test;

public class Parallels 
{

	@Test
	private void test1()
	{
	   System.out.println("p1" + Thread.currentThread().getId());	

	}
	@Test
	private void test2()
	{
	   System.out.println("p1" + Thread.currentThread().getId());	

	}
	@Test
	private void test3()
	{
	   System.out.println("p1" + Thread.currentThread().getId());	

	}	
	@Test
	private void test4()
	{
	   System.out.println("p1" + Thread.currentThread().getId());	

	}
	@Test
	private void test5()
	{
	   System.out.println("p1" + Thread.currentThread().getId());	

	}
	
	
	
}
