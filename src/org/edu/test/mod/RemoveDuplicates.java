package org.edu.test.mod;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates 
{
	
	public static void main(String[] args)
	{
	   int a[]= new int[5];
	   a[0]=10;
	   a[1]=20;
	   a[2]=10;
	   a[3]=50;
	   a[4]=50;
	   
	   Set<Integer> s = new LinkedHashSet<Integer>();
	   for(int i=0;i<(a.length);i++)
	   {
	     s.add(a[i]);
	   }
	   for (Integer x:s)
	    {
	      System.out.println(x);
	    }
	}
	
	}
	

