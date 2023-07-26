package edu.org.test.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Sets 
{

	 public static void main(String[] args)
	 {
		
		  Set s = new  HashSet();
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter how many elements you need for set ");
		 int len = sc.nextInt();
		 for (int i = 0; i < len; i++) 
		 {
		    int val = sc.nextInt();
		    s.add(val);
		 	 
		 }
		 Set s2 = new  HashSet();
		 Scanner sc2 = new Scanner(System.in);
		 System.out.println("Enter how many elements you need for set ");
		 int len2 = sc.nextInt();
		 for (int i = 0; i < len2; i++) 
		 {
		    int val = sc.nextInt();
		    s2.add(val);
		 	 
		 }
		 System.out.println(s);
		 System.out.println(s2);
		 Set s3= new HashSet();
		 s3.addAll(s2);
		 s3.removeAll(s);
		 System.out.println(s3);
		 
		
	}
	
	
}
