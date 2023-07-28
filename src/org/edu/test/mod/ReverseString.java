package org.edu.test.mod;

public class ReverseString
{

	public static void main(String[] args) 
	{
	
	    String s = "malayalam";
	    String rev ="";
	    for (int i = s.length()-1; i >=  0 ; i--) 
	    {
			char c = s.charAt(i);
			rev = rev + c;	
		}
		if(s.equals(rev))
		{
			System.out.println("yes its palindrome");
		}
		else
		{
			System.out.println("No its not palindrome");
		}
	
	}
	 	
}
