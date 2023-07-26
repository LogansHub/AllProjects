package edu.org.test.string;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IndexBased
{
     public static void main(String[] args)
     {
	    List l = new ArrayList();
	    List l2 = new ArrayList();
	    l2.add(10);
	    Scanner s = new Scanner(System.in);
	    System.out.println("Enter the number of values you need");
    	int a = s.nextInt();
    	for (int i = 0; i < a; i++)
    	{   
    	    System.out.println("Enter the number of values ");

			int b = s.nextInt();
			l.add(b);
		}
    	
    	 
    	for (int i = 0; i <l.size(); i++)
    	 {
		    
    		 //System.out.println(l.get(i));
    		 if(l.get(i).equals(l2.get(0)))
    				 {
    			        int o = l.indexOf(l.get(i));
    			        l.set(o, 100);
    				 }
    		 
		 }
    	
    	
    	System.out.println(l);
    	
    	
    	
    	
	 }
	
	
}
