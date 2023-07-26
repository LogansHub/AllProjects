package edu.org.test.mutipleinheritance;

public class MultipleInherit  implements InterfaceTwo

{

	@Override
	public void add() {
		
		System.out.println("The add number is 6");
	}
	 
	@Override
	public void mul() {
		System.out.println("The mul number is 7");
		
	}
	@Override
	public void even() {
		
		System.out.println("The even number is 8");
	}
	
	@Override
	public void odd() {
		System.out.println("The odd number is 7");
		
	}
	
	
	public static void main(String[] args)
	{
		MultipleInherit m = new MultipleInherit();
		m.add();
		m.mul();
		m.even();
		m.odd();
		
	}
}
