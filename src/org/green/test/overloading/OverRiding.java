package org.green.test.overloading;

import java.util.Scanner;

public class OverRiding extends OverLoading
{
	@Override
	public void add(float faa, String saa) {
		
		super.add(faa, saa);
	}
	
	@Override
	public void add(int a) {
		super.add(a);
	}
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the float and String  Number");
		float faa = s.nextFloat();
		String saa = s.next();
		OverRiding o = new OverRiding();
		o.add(faa, saa);

		System.out.println("Enter  the integer number");
		int a = s.nextInt();
		o.add(a);
		
}}
	
	
	









  