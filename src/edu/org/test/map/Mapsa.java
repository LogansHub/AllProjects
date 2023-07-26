package edu.org.test.map;


import java.util.HashMap;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class Mapsa 
{

	public static void main(String[] args) 
	{
		
	
	
		Map<Integer,String> m = new HashMap<>();
		m.put(10, "c");
		m.put(20,"C++");
		m.put(30, "java");
		m.put(40, "Python");
		m.put(50, "Golang");
		Set<Entry<Integer, String>> entrySet2 = m.entrySet();
		System.out.println(entrySet2);
      
		Set<Entry<Integer,String>> entrySet = m.entrySet();
	//	int hashCode2 = entrySet.hashCode();
		//System.out.println(hashCode2);
		for (Entry<Integer, String> entry : entrySet)
		{
			    
		           entry.getKey();
		           System.out.println( entry.getKey());
		           entry.getValue();
		              System.out.println(entry.getValue());
		    
		}
		
	     
	}
}