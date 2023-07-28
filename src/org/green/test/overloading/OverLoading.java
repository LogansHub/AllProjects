package org.green.test.overloading;

import java.util.Scanner;

public class OverLoading
{

	public void add(int a)
	{
	
       System.out.println("The addition number is " + a);
	}
	
	public void add(float faa,String saa)
	
	{
		System.out.println("The float and string is " + faa + saa);

	}
	private void add(String sa, float fa)
	{
	
        System.out.println("The string and float number is " + sa + fa);
		
	}
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter  the integer number");
		int a = s.nextInt();
		OverLoading o = new OverLoading();
		o.add(a);
		
		System.out.println("Enter the float and String  Number");
		float faa = s.nextFloat();
		String saa = s.next();
		o.add(faa, saa);
		
		
		
		System.out.println("Enter the string and float  Number");
		String fa = s.next();
		float sa = s.nextFloat();
		o.add(sa, fa);  
	}}
		
		

	
	
	

