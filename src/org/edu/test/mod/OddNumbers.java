package org.edu.test.mod;

public class OddNumbers 
{

	public static void main(String[] args) 
	{
		 int count =0;
		 int sum=0;
		for(int i =1;i<=100;i++)
			if(i%2==1)
			{
				
				sum= sum + i;
				System.out.println(i);
				count++;
			}
		
		System.out.println("Total odd number count is " + count );
		System.out.println("sum of total number is " + sum);
	}
}
