package org.edu.test.mod;

public class SumOfNum
{
   public static void main(String[] args) 
   {
	
	   int  a = 12345,temp = 0;
	   int sum = 0;
	   while(a > 0)
	   {
		   
		   temp = a%10;
		   sum = sum + temp;
		   a= a/10;  
	   }
	  
	  System.out.println(sum);
	  
   }
	
	
}
