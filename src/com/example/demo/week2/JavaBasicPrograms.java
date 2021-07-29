package com.example.demo.week2;

import java.util.Scanner;

public class JavaBasicPrograms {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		System.out.println("Factorial = "+fact(n));
	}
	static int fact(int n) {
		if(n==1)
			return 1;
		else
			return n*fact(n-1);
		
	}

}
