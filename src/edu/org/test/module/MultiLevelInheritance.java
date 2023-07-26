package edu.org.test.module;

import java.util.Scanner;

public class MultiLevelInheritance  extends Classf
{

	public static void main(String[] args) 
	{
		
		MultiLevelInheritance  ml = new MultiLevelInheritance ();
		ml.add();
		ml.sub();
		
		Scanner scr = new Scanner(System.in);
		System.out.println("please enter numbers for Multiplication");
		int i = scr.nextInt();
		int j = scr.nextInt();
		int k = i * j;
		System.out.println("Answer for multiplication is " + k);
		
	}}		
		
		
		
		
		
	

