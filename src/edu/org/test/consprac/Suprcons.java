package edu.org.test.consprac;

public class Suprcons extends Constru 
{

	public Suprcons(long o)
	
	{
		this(100.5f);
		System.out.println(o +"the long number");
	}
	public Suprcons(float k)
	
	{
		 super(5);
		System.out.println(k +  "the long number");
	}
	
	public static void main(String[] args) 
	{
		Suprcons m = new Suprcons(8768989999l);
		
	}
}
