package org.edu.test.mod;

import java.util.Iterator;
import java.util.Vector;

public class IteratorsPract 
{
    public static void main(String[] args)
   {
      Vector<Integer> v = new Vector<>();
      v.add(10); 
      v.add(20); 
      v.add(30); 
      v.add(40); 
      v.add(50); 
      Iterator<Integer> in = v.iterator();   
       while(in.hasNext())
    {
      Integer inte =    in.next();
      System.out.println(inte); 
      if(inte == 50)
      {
    	  in.remove();
      }
     
    } 
       System.out.println("After remove the elements");
       for (Integer integ : v) 
       {
	
    	System.out.println(integ);   
	   }
    
  
  }
}

