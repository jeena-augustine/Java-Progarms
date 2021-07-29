package com.exmple.demo.questions;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		int[] arr = { 0, 2, 3, 15, 5, 6, 1 };
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		// findThefrequency(arr);
		System.out.println();
		largestElement(arr);
		smallestNumber(arr);
		sortArrayAsc(arr);
		sortArrayDesc(arr);
		printOddOrEven(arr);
		rotateArryRight(arr,2);
	}

	private static void rotateArryRight(int[] arr, int n) {
		while(n>0)
		{
			int temp=0;
			for(int i=arr.length-2;i>=0;i--)
			{
				temp=arr[arr.length-1];
				arr[i+1]=arr[i];
			}
			arr[0]=temp;
			n--;
		}
		System.out.println(Arrays.toString(arr));
	}

	private static void printOddOrEven(int[] arr) {
		System.out.println("Even numbers");
		for(int i:arr)
		{
			if(i%2==0) {
				System.out.print(" "+i);
			}
			
		}
		System.out.println();
		System.out.println("Odd numbers");
		for(int i:arr)
			if(i%2!=0) {
				System.out.print(" "+i);
			}
	}

	private static void sortArrayDesc(int[] arr) {
		// descending order
		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("desc order:" + Arrays.toString(arr));

	}

	private static void sortArrayAsc(int[] arr) {
		// Arrys.sort(arr);
		// Ascending Order
		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Asc" + Arrays.toString(arr));
	}

	private static void smallestNumber(int[] arr) {
		int smallest = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < smallest)
				smallest = arr[i];
		}
		System.out.println("Largest number in the array is :" + smallest);
	}

	private static void largestElement(int[] arr) {

		int largest = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest)
				largest = arr[i];
		}
		System.out.println("Largest number in the array is :" + largest);
	}

	private static void findThefrequency(int[] arr) {
		int count = 1;
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j])
					count++;
			}

			System.out.println("Frequency of" + i + "is:" + count);

		}

	}

}
