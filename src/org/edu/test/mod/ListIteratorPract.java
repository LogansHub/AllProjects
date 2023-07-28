package org.edu.test.mod;

import java.util.ListIterator;
import java.util.Vector;

public class ListIteratorPract
{
   public static void main(String[] args)
   {
      Vector<Integer> v  =  new Vector<>();
      v.add(10);
      v.add(20);
      v.add(30);
      v.add(40);
      v.add(50);
      
      ListIterator<Integer> li = v.listIterator();
      while(li.hasNext())
      {
        Integer lii = li.next();
        if(lii == 50)
        {
          li.remove();
        	
        }
        System.out.println(lii);
      }
      System.out.println("After removing of elements");
      while(li.hasPrevious())
      {
    	  Integer previous = li.previous();
    	  System.out.println(previous);
      }
      
    }
} 
