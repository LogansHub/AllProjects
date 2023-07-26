package edu.org.test.listandset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListsandSets
{
    public static void main(String[] args)
    {
		
	   List l = new ArrayList();
        l.add(50);
        l.add(123456789);
        l.add('c');
        l.add("Hai");
        for(int i = 0;i<l.size();i++)
        {  
        	System.out.println(l.get(i));
        	  
        }
        System.out.println("Above is for List");
        
        Set s = new HashSet();
        s.add(100);
        s.add(4678910);
        s.add('y');
        s.add("Logan");
        
        for (Object i : s)
        {
        	
		  System.out.println(i);	
		}
        
        System.out.println("Above is for Set");
        
    } 
}
