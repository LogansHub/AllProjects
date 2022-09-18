package edu.green.test.loop;

import java.util.Scanner;

public class JumpLoops 
{

	public static void main(String[] args)
	{
		 	int integer; 
		  	
		 
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number other than to check is it Prime or not ");
		 integer = s.nextInt();
		     int  count = 0;
		  for (int i =1;i<= integer;i++)
		 {
			   
		        if (integer % i == 0)	 
		        {
		           
		        	count++;
		        } }
		          if(count == 2)
		        {	 
			     System.out.println("The entered number is " + integer + " is  prime number");
		         System.out.println("we got prime number break it");
		        
		       } 
		          else  
		          {
		        	  System.out.println("Its not a prime number");
		          }
			 
		 
		
	}}
	

