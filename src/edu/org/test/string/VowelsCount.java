package edu.org.test.string;

public class VowelsCount 
{
	public static void main(String[] args) 
	{
		
	    String s = "Welcome";
	    String snew = s.toLowerCase();
	    int vow = 0;
    	int cons = 0;
	     for (int i = 0; i <snew.length(); i++) 
	     {
		
	    	char ch = snew.charAt(i);
	    	
	    	if(ch =='a'|| ch== 'e'||ch =='i'||ch =='o'||ch=='u')
	    	{	
	    			vow++;
	    			
	    	}	
	    	else
	    	{
	    		cons++;
	    		
	    	}
	    	
	    			
		}
	    System.out.println(vow);
	    System.out.println(cons);
	
	}}
	    
	
	
	
	
	
	
	
	

