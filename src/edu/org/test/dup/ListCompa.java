package edu.org.test.dup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListCompa 
{
public static void main(String[] args)
{
	List<Integer> org = new ArrayList<Integer>();
	org.add(1);
	org.add(2);
	org.add(3);
	org.add(4);
	org.add(5);
	
	System.out.println(org);
	
	List<Integer> ascending = new ArrayList<Integer>();
	List<Integer> descending = new ArrayList<Integer>();
	
	ascending.addAll(org);
	
	
	Collections.sort(ascending);
	
	System.out.println(ascending);
	
	Collections.addAll(descending);
	
	
	Collections.reverse(descending);
	
 if(org.equals(ascending))
 {
	 System.out.println("yes its in ascedning order");
 }

	 
	
}
}
