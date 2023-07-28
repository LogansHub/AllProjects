package org.edu.test.mod;

public class Vowelscount 
{

	public static void main(String[] args) 
	{
		String s = "welcome";
		String vowels="",cons="";
		int vowelscount=0,conscount=0;
		for (int i = 0; i < s.length(); i++)
		{
			char c = s.charAt(i);
             if(c=='a'||c=='A'||c=='e'||c=='E'||c=='i'||c=='I'||c=='o'||c=='O'||c=='u'||c=='U')
             {
            	 
            	vowels= vowels + c;
            	vowelscount++;
             }
             else
             {
            	 cons = cons + c;
            	 conscount++;
             }
			
		}
		System.out.println("vowels are" + " " + vowels + "  " + "and count is " + vowelscount);
		System.out.println("cons are " + " " + cons  + "  " + "and cons count is " + conscount);
		
	}
	
}
