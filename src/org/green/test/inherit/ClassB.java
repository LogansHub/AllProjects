package org.green.test.inherit;

import java.util.Scanner;

public class ClassB extends ClassA
{

	public static void main(String[] args)
	{
		
		System.out.println("I am in class b and i will find even number");
		Scanner b = new Scanner(System.in);
		int evenNumber = b.nextInt();
		ClassB classbVariable = new ClassB();
		System.out.println("The Entered even variable is " + evenNumber );
		classbVariable.classMethod();
		
	} }


