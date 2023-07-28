package edu.gree.test.mod3;



public class CustomisedException 
{

	public static void main(String[] args)
	{  
		
	
		PasswordException c = new PasswordException();
		try 
		{
		c.checkingPassword("loganku");
		
		} catch (PasswordException lee)
		{
			 lee.printStackTrace();
			System.out.println("you gave less thna 8 length passowrd");
		}
		
		
		
	
	}		
		
		
	
	
	
	
	
}
