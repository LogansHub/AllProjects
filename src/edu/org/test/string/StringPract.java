package edu.org.test.string;

import java.util.Scanner;


public class StringPract
{
	
    

    public static void main(String[] args)
   
   {
 
    /*	String str;
        int upper = 0;
        int lower = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the any strings mix of caps and small");
         str = s.next();
         
        for (int i = 0; i < str.length(); i++)
        {
			
        	 char ch = str.charAt(i);
        	if(ch >= 'A' && ch <= 'Z')
        	{
        		upper++;
        	}
        	
        	else if (ch >= 'a' && ch <= 'z' )
        	{
        		lower++ ;
        	}
        	
        
		}
	
	
    	System.out.println(str + "contains " + upper + "letters");
    	System.out.println(str + "contains " + lower + "letters");
   }}

  */
   
    	
         String s = new String("Welcome to java class ");
         
           int indexOf = s.indexOf(" ");
           
           System.out.println(s.substring(0, 7+1));
           System.out.println(s.subSequence(8, 10+1));
           System.out.println(s.subSequence(11, 15+1));
           
           System.out.println(s.substring(15+1));
	  
	
   }     }   
	     
   

