package org.emp;

public class Employee
{
	
	private void empId()
	{
		
		System.out.println("91420101");
	}

	private void empName()
	{
		
		System.out.println("Logan");

	}
	private void empDob() 
	{
		System.out.println("19/04/1996");

	}
	private void empPhone()
	{

		System.out.println("9677353594");
	}
	private void empMail()
	{
		System.out.println("loganashok666@gamil.com");

	}
	private void empAddress() 
	{
		System.out.println("vellakovil");

	}
	public static void main(String[] args)
	{
		Employee  e = new Employee();
		
		e.empId();
		
		e.empName();
		
		e.empDob();
		
		e.empPhone();
		
		e.empMail();
		
		e.empAddress();
		
	}
			
	
}
