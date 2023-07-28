package org.edu.test.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Mapswithset 

{
    public static void main(String[] args)
    {
		
    	Map<Integer,String> ma = new HashMap<>();
    	Scanner s = new Scanner(System.in);
    	System.out.println("Please enter keys as Intgers");
    	int i1 = s.nextInt();
    	int i2 = s.nextInt();
	    int i3 = s.nextInt();
	    System.out.println("Please enter values as String");
	    s.nextLine();
	    String s1 = s.nextLine();
	    String s2 = s.nextLine();
	    String s3 = s.nextLine();
	    ma.put(i1, s1);
	    ma.put(i2, s2);
	    ma.put(i3, s3);
	    ma.entrySet();
	    Set<Entry<Integer, String>> entrySet = ma.entrySet();
	    ma.entrySet()
	     
	    Set<Entry<Integer, String>> l = ma.entrySet();
	    System.out.println("The keys and values are ");
	    for (Entry<Integer, String> entry : l)
	    
	    {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
	   
	     
	   
	   
    }
}
