package edu.org.test.encap;

import java.util.LinkedHashSet;
import java.util.Set;

public class EncapsulationBySetss 

{
     public static void main(String[] args) 
     {	
	
	Set<PrivateDataSets > s = new LinkedHashSet<>();
	PrivateDataSets g = new PrivateDataSets();
	g.setName("Logan");
	g.setId(1);
	g.setClasses('A');
	
	PrivateDataSets g1 = new PrivateDataSets();
	g1.setName("kumar");
	g1.setId(2);
	g1.setClasses('B');
	
   s.add(g);
   s.add(g1);
   
   for (PrivateDataSets pv : s) 
   {
	  System.out.println(pv.getName());
	  System.out.println( pv.getId());
	  System.out.println(pv.getClasses());
	   
	}
	 
     }
}
	
	
	
	
	
     
