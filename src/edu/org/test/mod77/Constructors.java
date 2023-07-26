package edu.org.test.mod77;

public class Constructors 
{
   int a;
   int b;
	public Constructors(int c, int d) 
	{
		this.a = c;
		this.b = d;
		
	}
	private void object()
	{
	
       System.out.println(a);
       System.out.println(b);
     
	}
	
	
	
	public static void main(String[] args)
	{
		Constructors obj1 = new Constructors(50,50);
		obj1.object();
		Constructors obj2 = new Constructors(100,100);
		obj2.object();
		System.out.println(obj1.a);
		System.out.println(obj2.a);
	}
}
