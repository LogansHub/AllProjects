package edu.org.test.encap;

public class Encapsulated 
{

	public static void main(String[] args)
	{
		
		 PrivateDatas  s1 = new  PrivateDatas() ;
		 s1.setName("Logan");
		 s1.setNumber(967735354);
		 s1.setA(100);
		 String name = s1.getName();
		 long numbe = s1.getNumber();
		 int inte = s1.getA();
		 System.out.println(name);
		 System.out.println(numbe);
		 System.out.println(inte);
		 
		 PrivateDatas  s2 = new  PrivateDatas() ;
		 s2.setName("NewLogan");
		 s2.setNumber(557735354);
		 s2.setA(500);
		 String names = s2.getName();
		 long number = s2.getNumber();
		 int inter = s2.getA();
		 System.out.println(names);
		 System.out.println(number);
		 System.out.println(inter);
		 
		 
		 
		 
		 
	}
}
