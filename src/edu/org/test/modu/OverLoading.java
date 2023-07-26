package edu.org.test.modu;

public class OverLoading
{

	 public void add(int a)
	 {
		
	 System.out.println(a);
	 }
	 public void add(String d)
	 {
		 
		 System.out.println(d);
	 }
	 public void add(char c)
	{
		System.out.println(c);

	}
	 public void add(int j ,char d )
	{
	  System.out.println(j + "   " + "and" + "   " + d);

	}
	 public void add(char d , int j ) 
	{
		System.out.println(d + "   "+ "and" + "   "+ j);

	}
	public static void main(String[] args) 
	{
		OverLoading o = new OverLoading();
		o.add(5);
		o.add("Logan");
		o.add('y');
		o.add(5,'h');
		o.add('v',10);
		
	}}

	
	
	
	
	
	
	
	

