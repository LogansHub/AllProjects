package edu.gree.test.mod2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlin 


{
	   int a,b,c ,d;
          public void ariExpec() 
          {
        	  
      
		   Scanner s =  new Scanner(System.in);
		   System.out.println("Enter the Numbers");
		    
		         try {
		        	 a = s.nextInt();  
		       
		    b = s.nextInt();
		    c = a / b ;
		   
		    
		         } catch ( ArithmeticException | InputMismatchException hey )
		              
		                  {
		        	      System.out.println(hey.getMessage());  
		        	        
		                System.out.println("Please enter other than zero");	  
		                ariExpec();
		                  }
		   
		    
    	   System.out.println(c);
    	   s.close();
          }
    	  
           
	
	      public static void main(String[] args)
	      {
	    	  ExceptionHandlin  o = new ExceptionHandlin();
	    	  o.ariExpec();    }}
	    	  
	    	  
	    	  
	    	  
		
	

