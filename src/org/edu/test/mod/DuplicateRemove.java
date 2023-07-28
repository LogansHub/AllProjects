package org.edu.test.mod;

import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateRemove 
{
	
	    	    public static void main(String[] args)
	    	    {
	    	      String s ="loogggan";
	    	      Set<Character> ss = new LinkedHashSet();
	    	      for(int i=0;i<s.length();i++)
	    	      {
	    	          char c = s.charAt(i);
	    	          if(ss.contains(c))
	    	          {
	    	              continue;
	    	          }
	    	          else
	    	          {
	    	              ss.add(c);
	    	          }
	    	      }
	    	      for (Character sss: ss)
	    	      {
	    	          System.out.println(sss);
	    	      }
	    	        
	    	    }
	    	     

}

	    
