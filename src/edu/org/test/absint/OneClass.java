package edu.org.test.absint;

public   class OneClass extends CClassabs implements CClassinterface

{

	@Override
	public void CClassabs()
	{
		
		System.out.println("i am a cclassabstract");
	
	}
	
	@Override
	public void aClassAbstract() {
		System.out.println("i am a aclassabstract");
		
	}
	@Override
	public void bClassAbstract() 
	{
		
		System.out.println("i am a bclassabstract");	
	}

	@Override
	public void firstInterface() {
		
		System.out.println("i am a firstinterface");
	}
	
	@Override
	public void secondInterface() {
	
		System.out.println("i am a secondinterface");
		
	}
	@Override
	public void thirdInterface() {
		
		System.out.println("i am a thirdinterface");
	}
	
		
	public static void main(String[] args) 
	{
		OneClass a = new OneClass();
		a.aClassAbstract();
		a.bClassAbstract();
		a.CClassabs();
		a.firstInterface();
		a.secondInterface();
		a.thirdInterface();
	
		
	}
		
		
		
}			 
			  
			 
			 
			 
		 
		 
		 
		 


	
	
	
	
		
	
		
			
			
			
			
			
			
		 
	
		 
		  
		 
		 
		 

	
		
		
		 
		 
		 
	
		 
		 
	
	
	
	  
		
		
       
		
	
	
	
	
	

