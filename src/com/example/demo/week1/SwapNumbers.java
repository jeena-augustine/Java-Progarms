package com.example.demo.week1;

public class SwapNumbers {

	public static void main(String[] args) {
		int a=10, b=20;
		swapNumberUsingTemp(a,b);
		System.out.println("\n");
		swapNumbersWithoutTemp(a,b);

	}

	private static void swapNumbersWithoutTemp(int a, int b) {
		System.out.println("Swapping Numbers without using Temp");
		System.out.println("Numbers before swapping--->"+"a="+a+"\t"+"b="+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Numbers after swapping--->"+"a="+a+"\t"+"b="+b);
	}

	private static void swapNumberUsingTemp(int a, int b) 
	{
		System.out.println("Swapping Numbers using Temp");
		System.out.println("Numbers before swapping--->"+"a="+a+"\t"+"b="+b);
		int temp=b;
		b=a;
		a=temp;
		System.out.println("Numbers after swapping--->"+"a="+a+"\t"+"b="+b);
		
	}

}
