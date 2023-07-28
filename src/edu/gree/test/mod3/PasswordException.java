package edu.gree.test.mod3;

public class PasswordException extends RuntimeException
{

	 public  void checkingPassword(String  pass) throws PasswordException
	 {
		
		   if(pass.length() < 8)
		   {
			   throw new PasswordException();
			   
		   }
         
		   else
		   {
			   
			   
			   System.out.println(pass + "is having strong security" );
		   }
		   
	}
	 
	
}
