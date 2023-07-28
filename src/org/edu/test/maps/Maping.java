package org.edu.test.maps;


import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Maping 

{
      public static void main(String[] args)
      {
	
       Map<String,Integer> m = new HashMap<>();
       m.put("pen", 5);
       
       m.put("car", 2500);
       m.put("Truck", 2500);
       m.put("inkpen", 5);
       System.out.println(m);
       Set s = m.keySet();
       
       Collection c = m.values();
       Set e = m.entrySet();
       System.out.println(s);
       System.out.println(c);
       System.out.println(e);
       
       
       Map m1 = new HashMap();
       m1.putAll(m);
       System.out.println(m1);
       boolean b = m1.containsKey("ppen");
       System.out.println(b);
       System.out.println(m.containsValue(7));
       System.out.println(m.remove("pen"));
       System.out.println(m);
       System.out.println(m.remove("Truck", 2500));
       System.out.println(m);  
       m.clear();
       System.out.println(m); 
       System.out.println(m.isEmpty()); 
       System.out.println(m1); 
       Set st = m1.entrySet();
       
       
       Map  m5 = new HashMap();
       m5.put(10, "str");
       m5.put(10, "stri");
       m5.put(10, "string");
       Collection set = m5.entrySet();
       
        
       
      
       Iterator i = st.iterator();
       while(i.hasNext())
       {
           Object o = i.next();
           Map.Entry ee = (Map.Entry)o ;
           System.out.println(ee.getKey());
           System.out.println(ee.getValue());
    	   if(ee.getValue().equals(2500))
    	   {
    		   ee.setValue(5000);
    	   }
    		   
    		System.out.println(ee.getValue());   
       } 
       
       
      }  
}	  
    	  
      

