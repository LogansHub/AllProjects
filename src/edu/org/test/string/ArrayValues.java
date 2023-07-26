package edu.org.test.string;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class ArrayValues 
{
    public static void main(String[] args) 
    {
		
	List l = new ArrayList();
	List l2 = new ArrayList();
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the length of List");
	int len = s.nextInt();
	System.out.println("Enter the values of List");

    for (int i = 0; i <len; i++) 
    {
	 int se = s.nextInt();
	 l.add(se);
	}	
   
    System.out.println("Enter the length of Second List");
	int len2 = s.nextInt();
    for (int i = 0; i <len2; i++) 
    {
	 int se2 = s.nextInt();
	 l2.add(se2);
	
	}
    System.out.println(l);
    System.out.println(l2);
	/* Set s1 = new HashSet(l);
	 Set s2 = new HashSet(l2);
	 s1.retainAll(s2);
	 System.out.println(s1);
	 l.addAll(s1);
	 l2.addAll(s1);
	System.out.println(l);
*/
   
         //  l.removeAll(l2);
     l.replaceAll(null);
           System.out.println(l);
      

    }}	
	
	
	
	
	
	
	
	
	
	
	
	
    

