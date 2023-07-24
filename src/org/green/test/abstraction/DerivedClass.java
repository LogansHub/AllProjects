package org.green.test.abstraction;

public class DerivedClass extends Abs
{

	private void car() {
		
   System.out.println("yes new car");
		
	                   }

     @Override
    void salary() 
     {
     
    	 System.out.println("Its 70k");	
    }
   
    @Override
    void benefits() {
    	
    	System.out.println("paid leaves");	
    }
   public static void main(String[] args) {
	DerivedClass a = new DerivedClass();
	a.employee();
	a.salary();
	a.benefits();
}}
   