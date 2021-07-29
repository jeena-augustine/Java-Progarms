package com.example.demo.week1;

public class LargestOfThreeExample {

	public static void main(String[] args) {
		int a=10,b=55,c=40;
		
		int max=(a>c)?((a>b)?a:((b>c)?b:c)):(c>b)?c:b;
		System.out.println("Largest Number is "+max);
		

	}

}
