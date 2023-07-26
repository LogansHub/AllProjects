package org.green.test.module;

public class MarksStudent 
{
   public static void main(String[] args)
   
   {
	
	   int studentId = 1234567;
	   String studentName = "Logankumar";
	   byte Mark1 = 50;
	   byte Mark2 = 50;
	   byte Mark3 = 50;
	   byte Mark4 = 50;
	   byte Mark5 = 50;
	   System.out.println("studentId  is " + studentId);
	   System.out.println("studentName is " +  studentName);
	   System.out.println("Mark1 is " + Mark1);
	   System.out.println("Mark2  is " + Mark2);
	   System.out.println("Mark3 is " +  Mark3);
	   System.out.println("Mark4 is  " + Mark4);
	   System.out.println("Mark5 is  " + Mark5);
	   int totalMarks =  Mark1 + Mark2 + Mark3 + Mark4 + Mark5;
	   float average = ( Mark1 + Mark2 + Mark3 + Mark4 + Mark5) / 5f;
	   System.out.println("Total marks is   " + totalMarks);
	   System.out.println("Average is "  + average);
	   
	      
   }
	
	
}
