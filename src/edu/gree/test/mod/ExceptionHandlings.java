package edu.gree.test.mod;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlings 
{
	 
    
    private void division()
    {
    	Scanner s = new Scanner(System.in);
    	System.out.println("Enter the numbers for division");
		int a = s.nextInt();
		    try {
		int b = s.nextInt();
		s.close();
		int f = a / b ;
		System.out.println(f);
		        } catch( ArithmeticException e)
		    
		               {
		    	System.out.println("please enter correct number");
		    	division();
		    	
		                }catch( Exception ee)
		    
                             {
 	                System.out.println("please enter correct only numbers");
 	                division();
                             }finally
                             {
                            	  System.out.println("Leave all");
                             }
    }
	  
	public static void main(String[] args) 
	{
		
		
		ExceptionHandlings  e = new ExceptionHandlings();
		e.division();
				
	}}
	
	
	
	

