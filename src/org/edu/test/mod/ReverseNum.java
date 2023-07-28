package org.edu.test.mod;

public class ReverseNum 
{
 public static void main(String[] args) 
 {
     int a = 1234,rem=0,rev=0;
    int  temp = a;  
     while(a>0)
     {
    	 rem =a%10;
    	 rev = rev*10 +rem;
    	 a = a/10;
    	 
    	 
     }
    
	 System.out.println(rev)  ; 
 
 if(rev==temp)
 {
	 System.out.println("its palindrome");
 }
 else
 {
	 System.out.println("its not  palindrome"); 
 }
 
 
 }
 
 
}
