package org.green.test.multilevelinher;

public class ClassB extends ClassA
{
    public void bMethod()
    {
	
      System.out.println("Enter the e ven number");
      int b = 4;
      System.out.println("The even number is " +  b);
      ClassB bobj = new ClassB();
      bobj.aMethod();
}}
	

