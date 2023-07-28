package org.edu.test.mod;

public class ReversePlindr 

{
	public static void main(String[] args) 
	{
	
		String s = "SSSS";
		char c;
		 String s2 = "";
		 
		for (int i =s.length()-1; i>=0; i--)
		{
			 c = s.charAt(i);
		     s2 = s2 + c ;
		
		}
		   System.out.println(s2);
		   
		   if(s2.equals(s))
		   {
			  
			   System.out.println("yes its palindrome");
		   }
		   else
		   {
			  
			   System.out.println("Not a  palindrome");
		   }
		   
		
	    			
		
	}
	
}
