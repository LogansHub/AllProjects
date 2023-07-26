package org.green.test.mod;


public class DataTypess
{
	
	private void allDatas()
	{
		
		int empID = 914369;
		String empName = "Logan";
		String Email = "loganashok666@gmail.com";
		long empPhoneno = 9677353594l;
		float empSalary = 21000.0005f;
		char Gender = 'M';
		String City = "Vellakovil";
		System.out.println("empid is" + empID );
		System.out.println("empName is" + empName );
		System.out.println("mail is " + Email );
		System.out.println("empPhoneno" + empPhoneno);
		System.out.println("empSalary" + empSalary);
		System.out.println("Gender  is " + Gender );
	    System.out.println("Place is" + City);	

	}
	
	public static void main(String[] args)
	{
		
		DataTypess call = new DataTypess();
		call.allDatas();
			
	}

}
