package org.edu.test.mod;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ListandDuplicates
{
     public static void main(String[] args)
     {
    	 
    	 List<Integer> li = new ArrayList<Integer>();
    	 
    	 li.add(10);
    	 li.add(20);
    	 li.add(30);
    	 li.add(10);
    	 
    	 Set<Integer> s = new LinkedHashSet<Integer>();
    	 
    	 for (Integer listing : li) 
    	 {
    		 if (s.contains(listing))
    		 {
    		    System.out.println("Number already there" + " " +  listing);
    		 }
    		 else 
    		 {
    			 s.add(listing);
    		 }
    	
            }
    	 for (Integer s2 : s) 
    	 {
		     System.out.println(s2);	
		} 
    	 
     }
}    
     
