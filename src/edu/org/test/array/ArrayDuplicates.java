package edu.org.test.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class ArrayDuplicates 
{
   public static void main(String[] args) 
   {
	int b = 0;
	int a[] = {10,10,20,50,60,80,60,50};
	 List l = new ArrayList();
	for (int i = 0; i < a.length; i++)
	{
	   
	    l.add(a[i]);	
	  
		
	} 
	for (int i = 0; i < l.size(); i++) 
	{
		System.out.println(l.get(i));
		
		
	}
      //System.out.println(l);
      Set s = new HashSet();
      s.addAll(l);
      System.out.println( s);
	
	
}}
