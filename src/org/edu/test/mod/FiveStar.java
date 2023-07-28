package org.edu.test.mod;

public class FiveStar 
{
	public static void main(String[] args)
	{
	   String[] s = {"4.5","4","3.5","3"};
	 //4.5 full full full full half
	//4 full full full full empty
	//3.5 full full full half empty
	//3 full full  full empty empty

	  
	      String ratings;       
	   for(int i=0;i<s.length;i++)
	 {
	     int a=0;
	     float f =Float.parseFloat(s[i]);
	     while(a<5)
	        {
	             ratings ="";
	     if(f>=1)
	     {
	       ratings=ratings+"full"; 
	       f=f-1;
	     }
	    else if(f>0)
	    {
	      if(f=f+0.25>=1)
	     {
	        ratings = ratings +"full";
	     }
	    else if(f=f+0.25>=0.5)
	     {
	       ratings = ratings + "half";
	     }
	    else
	    {
	        ratings = ratings +  "empty";
	    }
	      f =f -f;
	  }
	   else
	   {
	       ratings = ratings +"empty";
	   }
	    a++;
	 }
	     System.out.println(ratings);
	          }
	}
	}

	         


	             
	  

