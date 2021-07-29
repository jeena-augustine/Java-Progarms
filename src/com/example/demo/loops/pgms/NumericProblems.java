package com.example.demo.loops.pgms;

import java.util.Scanner;

public class NumericProblems {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter amount");
		long amount=sc.nextLong();
		System.out.println("enter deprecation percentage");
		long percentage=sc.nextLong();
		System.out.println("enter number of years");
		int year=sc.nextInt();		
		calculateDeprecation(amount,percentage,year);
		sc.close();
	}

	public  static int calculateDeprecation(long amount, long percentage, int year) 
	{
		int temp=(int)amount;
		for(int i=0;i<year;i++) {
			temp=(int)((100-percentage)*temp)/100;
		}
		System.out.print("after deprecation:"+temp);
		return temp;
	}
	
	
	

}
