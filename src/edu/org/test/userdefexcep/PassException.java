package edu.org.test.userdefexcep;

public class PassException extends RuntimeException
{

	public void pass(String password) throws PassException
	{
		
           if(password.length() < 9)
           
           {
        	   throw new PassException();
           }
	 
	       else
	        {
	    	 System.out.println("You have entered strong passowrd");
	        }
	}      
}
	
