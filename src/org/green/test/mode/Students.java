package org.green.test.mode;

public class Students

{
	
	private void studentRecords()
	
	{
		
		int studentId = 123456789;
		String studentName = "Logan";
		byte Mark1 = 35;
		byte Mark2 = 45;
		byte Mark3 = 55;
		byte Mark4 = 65;
		byte Mark5 = 75;
		int total = Mark1 + Mark2 + Mark3 + Mark4 + Mark5;
		System.out.println("  total is  " + total );
		int average = total / 5;
		System.out.println("average is   " + average);
		
	}
	public static void main(String[] args)
	{
		
		Students  caller = new Students();
		
		caller.studentRecords();
			
	}

}
