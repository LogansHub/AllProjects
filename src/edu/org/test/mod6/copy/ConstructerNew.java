package edu.org.test.mod6.copy;

import edu.org.test.mod5.Construct;

public class  ConstructerNew extends Construct 
{

	public  ConstructerNew()
	{
	
		System.out.println("I am a child defualt constructor");
	}
	
	public ConstructerNew(int a )
	{
		 
		System.out.println("I am a child arg constructor" + "   "  +  a); 
		
	}
	
	public ConstructerNew(String b )
	{
		System.out.println("I am a child arg constructor" + "   " +  b);
	}
	
	public static void main(String[] args)
	{
		ConstructerNew  s = new ConstructerNew("Logan");
		
	
		
		
	}}
	
	
	
	
	



  