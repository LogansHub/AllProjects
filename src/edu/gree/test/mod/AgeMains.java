package edu.gree.test.mod;


public class AgeMains 

{

	public static void main(String[] args)
	
	{
	
		

		
		ExceptionAge agee = new ExceptionAge();
		try {
		agee.AgeCheck(0);
		    }catch (Exception eee)
		{
		    	System.out.println(eee.getMessage());
		    	System.out.println("Please change inpt");
		}
		
	
	
}}
