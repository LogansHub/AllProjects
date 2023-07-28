package org.green.test.multilevelinher;

public class ClassC extends ClassB
{

public static void main(String[] args)
{
		
	
		System.out.println("Enter the Prime number ");
		int primeNumber = 1;
		System.out.println("The enterd Prime number is " + primeNumber);
        ClassC cMethod = new ClassC();
        cMethod.aMethod();
        cMethod.bMethod();
        
}}

