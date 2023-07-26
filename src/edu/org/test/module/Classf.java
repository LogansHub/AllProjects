package edu.org.test.module;

import java.util.Scanner;

class Classf  extends ClassA
{
	 
	        
	      public   void sub()
	       {
	    	  int h,g,k;
	  		 System.out.println("Please enter numbers for sub");
	  		 Scanner l = new Scanner(System.in);
	  		  h = l.nextInt();
	  		  g = l.nextInt();
	  		  l.close();
	  		  k = h - g;
	  		
			 
			 System.out.println("Subract Numbers is " + "   "+ k);   
		
	       }
	 
	 
	     
	      public static  void main(String[] args) 
	      {
			 Classf  obj = new Classf();
			 obj.add();
			 obj.sub();
	      }	 
	     
			
	
	
}
