package org.green.test.condition;

import java.util.Scanner;

 public class OddEven
 {
 public static void main(String[] args)
   { 
	 
    
	       int a;
	  
	       do 
		
	{ 
		
		
	     Scanner s = new Scanner(System.in);
	     System.out.println("Enter number  to find out odd or even numbers");
	      a = s.nextInt();	 
    	
    	  if(a % 2 == 0)
          {
          	System.out.println("Yes its even number");
          }
    	  else
    	  {
    		  System.out.println("No its not  even number");
    	  }
    	  
	      } while( a % 2 != 0);
    	  
	   
   }  } 
	     
        
	

