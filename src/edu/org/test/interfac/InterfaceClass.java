package edu.org.test.interfac;

public class InterfaceClass implements Interfaces

{
		
	 @Override
	public void even() {
		System.out.println("The even number is 4");
		
	}
	 @Override
	public void odd() {
			System.out.println("The odd number is 3");	
	}
	@Override
	public void prime() {
		System.out.println("The prime number is 3");	
		
	}
	 
	 public static void main(String[] args)
	 {
		 InterfaceClass h = new InterfaceClass();
		 h.even();
		 h.odd();
		 h.prime();
		 
	 }
}	 
	 
	 
	 
	 
	 
	 
	 
 

