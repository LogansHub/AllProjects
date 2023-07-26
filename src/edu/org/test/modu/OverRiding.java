package edu.org.test.modu;

public class OverRiding extends OverLoading

{

	@Override
	public void add(char c) 
	{
		System.out.println("This is overided");
	}
	@Override
	public void add(int a) 
	{
		System.out.println("This is overided");
	}
	
	@Override
	public void add(char d, int j) {
		System.out.println("This is overided");
	}
	@Override
	public void add(int j, char d) {
		System.out.println("This is overided");
	}
	@Override
	public void add(String d) {
		
		System.out.println("This is overided");
	}
	
	public static void main(String[] args)
	{
		OverRiding s = new OverRiding();
		s.add('y');
		s.add(1000);
		s.add("Logan");
		s.add('z', 55);
		s.add(600, 'Q'); 
		
	}
}

