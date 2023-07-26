package edu.org.test.userdefexcep;

import java.util.Scanner;

public class userdefexcepti 
 
{
	 public static void main(String[] args) 
	 { 
	  PassException  l = new PassException();
      String str;
	  Scanner s = new Scanner(System.in);
	  System.out.println("Enter the password");
	  try  {
		 
	  str = s.nextLine();
	  l.pass(str); 
	      } catch ( PassException ya)
	  {
		  
		  System.out.println("You pass strength  is not enough");
	  }	  
	    finally
	    {
	    	System.out.println("try one more time ");
	    }
		  
	 }
	
	 
		  
	 }		
	       
	 
		
	

	
	 
		
	
		  
	 
	

