package edu.org.test.string;

public class CapsSmallOthers 
{

	public static void main(String[] args) 
	{
	
		String s = "Welcome To Java class @123";
		int small = 0;
		int caps  = 0;
		int numbers = 0;
		int spcl   = 0;
		for (int i = 0; i <s.length(); i++)
		{
			char ch = s.charAt(i);
			
				if(ch>='A'&&ch<='Z')
				{
					caps++;
					
				}
			
				else if(ch>='a'&&ch<='z')
				{
					small++;
			     }
				
				else if(ch == '1'||ch == '2'||ch == '3')
				{
				
					numbers++;
	          	}
				else
				{
					spcl++;
					
				}
		}
		System.out.println(caps);
		System.out.println(small);
		System.out.println(numbers);
		System.out.println(spcl);
		
     String s2 = "Welcome";
     String replace = s2.replace('e', '@');
     System.out.println(replace);
     String replace2 = replace.replace('o', '@');
     System.out.println(replace2);		 
    		 
		
		
	
	}}
