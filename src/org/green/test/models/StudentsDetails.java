package org.green.test.models;

import java.util.Scanner;

public class StudentsDetails 
{
 
	public static void main(String[] args)
	{
		 Scanner s = new Scanner(System.in);
		 System.out.println("Enter Employee Id");
		 int studentId = s.nextInt();
		 System.out.println("Employee Id is " + studentId);
		 System.out.println("Enter the student Name");
		 s.nextLine();
		 String studentName = s.nextLine();
		 System.out.println("Enter the Mark1");
		 int Mark1 = s.nextInt();
		 System.out.println("Enter the Mark2");
		 int Mark2 = s.nextInt();
		 System.out.println("Enter the Mark3");
		 int Mark3 = s.nextInt();
		 System.out.println("Enter the Mark4");
		 int Mark4 = s.nextInt();
		 System.out.println("Enter the Mark5");
		 int Mark5 = s.nextInt();
		 int totalMarks = (Mark1 + Mark2 + Mark3 + Mark4 + Mark5);
		 System.out.println("Total Mark is " + totalMarks);
		 int average = (totalMarks / 5);
		 System.out.println("The avearge is  " + average);}}
				
		
		
	
	

