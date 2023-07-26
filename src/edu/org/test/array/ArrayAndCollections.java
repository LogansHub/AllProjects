package edu.org.test.array;

public class ArrayAndCollections
{

	public static void main(String[] args) 
	
	{
	     int b = 0;
		int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		for (int i = 0; i <a.length; i++) 
		{
		
		  b = b + a[i];
		}
		
		System.out.println(b);
		int len = a.length;
		System.out.println(len);
		int avg = b % len ;
		System.out.println(avg);
		
	}
	
	
}
