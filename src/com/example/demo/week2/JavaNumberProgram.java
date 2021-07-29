package com.example.demo.week2;

public class JavaNumberProgram {

	public static void main(String[] args) {
		int n=21200;
		//display odd numbers
		printOddNumbers();
		printEvenNumbers();
		
		
	}

	

	private static void printEvenNumbers() {
		System.out.println("EVEN NUMBERS");
		for(int i=1;i<=100;i++)
			if(i%2==0)
				System.out.println(i);
	}

	private static void printOddNumbers() {
		System.out.println("ODD NUMBERS");
		for(int i=1;i<=100;i++)
			if(i%2!=0)
				System.out.println(i);
		
	}

	
}
