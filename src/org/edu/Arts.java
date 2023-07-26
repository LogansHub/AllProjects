package org.edu;

public class Arts extends Education 
{

	private void bsc() 
	{
		
        System.out.println("This   is    bsc");
	}
	

	private void bEd() 
	{
		
        System.out.println("This   is    bEd");
	}
	

	private void bA() 
	{
		
        System.out.println("This   is    bA");
	}
	private void bBA() 
	{
		
        System.out.println("This   is    bBA");
	}
	@Override
	public void ug() 
	{
		
		System.out.println("This is  not ug");
	}
	
	@Override
	public void pg() {
		
		System.out.println("This is not  pg");
}
	public static void main(String[] args)
	{
		Arts  a  = new Arts();
		a.bA();
		a.bBA();
		a.bEd();
		a.bsc();
		a.ug();
		a.pg();
	}}	
		
		

	 
	
	
	
	
	
	
	







