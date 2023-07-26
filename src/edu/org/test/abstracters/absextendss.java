package edu.org.test.abstracters;

public class absextendss extends  abs
{

	  @Override
	public void odd() {
		System.out.println("The odd number abstract is 2");
		
	}
	  @Override
	public void even() {
		
		  System.out.println("The even  number abstract is 4");
	}
	  
	public static void main(String[] args) 
	{
		absextendss a = new absextendss();
		a.odd();
		a.even();
		a.prime();
		
	}
	
	
}
