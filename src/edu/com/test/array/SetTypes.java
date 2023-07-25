package edu.com.test.array;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetTypes 
{

	  public static void main(String[] args)
	  {
		
		  
	    HashSet hs = new HashSet();
	    hs.add(10);
	    hs.add("Hai");
	    hs.add('S');
	    hs.add(50.00);
	    System.out.println("The below hashset is ");
	    System.out.println(hs);
	    hs.add(10);
	    
	    LinkedHashSet lhs = new LinkedHashSet();
	    System.out.println("The below Linked hashset is ");
	    lhs.add(50);
	    lhs.add(100);
	    lhs.add(500);
	    lhs.add("Hey");
	    System.out.println(lhs); 
	    
	    TreeSet  s = new TreeSet();
	     s.add(10);
	     s.add(50);
	     s.add(5);
	     
	     System.out.println("The below Treeset is ");
	     
	     System.out.println(s); 
	     
	    
	    
	    
		  
	 }
	
	
}
