package org.edu.test.mod;

import java.util.Iterator;

public class FindAlphaNumSpcl
{

	public static void main(String[] args) 
	{
	
		String s = "Welcome@123";
		int uppercount =0, lowercount =0, digitcount =0, spclcount =0;
		String upper="",lower="", digit="", spcl="";
		for (int i = s.length()-1; i >= 0; i--) 
		{
			char c = s.charAt(i);
			if(Character.isUpperCase(c)) 
					{
				
				      upper= upper + c;
				      uppercount++;
				     }
			else if(Character.isLowerCase(c))
			{
				
				  lower = lower + c;	
				  lowercount++;
			}
			else if(Character.isDigit(c))
			{
				  digit = digit + c;
				  digitcount++;
			}
			else
			{
				spcl = spcl + c;
				spclcount++;
			}
		
		}
		System.out.println("Total upper case is " + uppercount + " and upper is" + "  "+ upper );
		System.out.println("Total lower case is " + lowercount + " and lower is" + "  "+ lower );
		System.out.println("Total  digit case is " + digitcount + " and digit is" + " " + digit );
		System.out.println("Total special case is " + spclcount + " and spcl is" +" " +  spcl );
		
	}	
}	
		
		
		
		
		
		
	

