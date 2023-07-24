package org.green.test.abstraction;

public class GreenBank implements Icici,Axis
{

	@Override
	public void savings() {
		System.out.println("6%");
		
	}
	@Override
	public void loan() {
		System.out.println("8%");
		
	}
		
    @Override
    public void deposite() {
    	System.out.println("9%");
    	
    }
public static void main(String[] args)
{
  GreenBank g = new GreenBank();
  g.savings();
	g.loan();
	g.deposite();
}}
	


