package edu.org.test.mod77;

public class ConsTwo extends ConsOne
{

	public ConsTwo() 
	{
	
		
	  System.out.println(" I am chlid class Constructor");	
		
	}	
	public ConsTwo( float marks)
	{
		 
		 System.out.println(" I am chlid class Constructor and  " + marks);	
	}
	public ConsTwo( String  adress)
	{     
		super("Old Adress");
		 
		System.out.println(" I am chlid class Constructor and  " + adress);	
	}
	
		public static void main(String[] args) 
	{
			ConsTwo obj = new ConsTwo("New Address");
			
		
		
	}}
	
		
	

