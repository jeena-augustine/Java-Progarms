package com.example.demo.loops.pgms;

public class TextSample {

	public static void main(String[] args) {
		int n = 6;

		displayHelloWorld();
		displayNumbers();
		displaySumOfNnumbers(n);
		averageOfNnumbers(n);
		int fact = factorial(n);
		System.out.println("Factorial=" + fact);
	}

	public  static int  averageOfNnumbers(int n) {
	 int sum=0;
	 for(int i=1;i<=n;i++) {
		 sum=sum+i;
	 }
	 
	 int average=sum/n;
	 return average;
	// System.out.println("Average of n numbers is:"+average);
	}

	public static int factorial(int n) {
		if (n == 1) {
			return n;
		} else
			return factorial(n - 1) * n;
	}

	private static void displayHelloWorld() {
		for (int i = 0; i < 5; i++)
			System.out.println("Hello");

	}

	private static void displaySumOfNnumbers(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum = sum + i;
		}
		System.out.println("Sum=" + sum);

	}

	private static void displayNumbers() {
		int i = 1;
		while (i <= 15) {
			System.out.println(i);
			i++;
		}
	}

}
