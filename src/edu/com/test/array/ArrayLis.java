package edu.com.test.array;


import java.util.ArrayList;

public class ArrayLis

{
     public static void main(String[] args)
     {
		
          ArrayList l = new ArrayList();
          l.add(50);
          l.add(50.00);
          l.add('A');
          l.add("HAI");
          System.out.println(l);
          l.add(1, 40.00);
          System.out.println(l);
          ArrayList l2 = new ArrayList();
          l2.addAll(l);
          System.out.println(l);
          l2.addAll(1, l);
          System.out.println(l);
          System.out.println(l2.size());
          System.out.println(l2.contains(50.0));
          System.out.println(l2.get(1));
          System.out.println(l2.remove(1));
          System.out.println(l2);
          System.out.println(l2.removeAll(l));
          System.out.println(l2.isEmpty());
          System.out.println(l.retainAll(l2));
          System.out.println(l2);
            Object remove = l2.remove(1);
          
          
    	 
    	 
     }
	
}
