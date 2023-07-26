package edu.org.test.string;


import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Length 
{

	public static void main(String[] args) 
	{
		  int b = 10;
		     List<Integer> l = new LinkedList<Integer>();
		     Scanner s = new Scanner(System.in);
		     System.out.println("Enter the legth of elements you need");
		     int ad = s.nextInt();
		 for (int i = 0; i <ad; i++)
		 {
		 	 int adl = s.nextInt();
			 l.add(adl);
		 }
		  Integer[] a = new Integer[l.size()] ;
		    a  = l.toArray(a);
		    for (int i = 0; i < a.length; i++) 
		    {
			   if(a[i]== b)
			   {
				   System.out.println(i);
			   }
			   else
			   {
				  System.out.println("Its not duplicate"); 
			   }
		    }
	
		
	}
}	
		 
		
	

