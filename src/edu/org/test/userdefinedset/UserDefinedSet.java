package edu.org.test.userdefinedset;

import java.util.LinkedHashSet;
import java.util.Set;

public class UserDefinedSet 
{

	public static void main(String[] args) 
	{
		 
		Set<UserDefinedSetImplemen> s = new LinkedHashSet<UserDefinedSetImplemen>();
		UserDefinedSetImplemen obj1 = new UserDefinedSetImplemen();
		obj1.setStudent("logan");
		obj1.setMarks(100);
		obj1.setAddress("vellakovil");
		obj1.setTotal(500);
		String student = obj1.getStudent();
		int marks = obj1.getMarks();
		String address = obj1.getAddress();
		int total = obj1.getTotal();
		System.out.println(student);
		System.out.println(marks);
		System.out.println(address);
		System.out.println(total);


		
		
		
		
		
		
		
		UserDefinedSetImplemen obj2 = new UserDefinedSetImplemen();
		obj2.setStudent("kumar");
		obj2.setMarks(200);
		obj2.setAddress("moolanur");
		obj2.setTotal(1000);
		String student2 = obj2.getStudent();
		int marks2 = obj2.getMarks();
		String address2 = obj2.getAddress();
		int total2 = obj2.getTotal();
		System.out.println(student2);
		System.out.println(marks2);
		System.out.println(address2);
		System.out.println(total2);
		
		
		s.add(obj1);
		s.add(obj2);
		for (UserDefinedSetImplemen use : s) 
		{
		   use.getAddress();
		   use.getMarks();
		   use.getStudent();
		   use.getTotal();
			
		}
		
		
	}
}
