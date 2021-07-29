package com.example.demo.week2;

import java.util.Arrays;

public class JavaArrayPrograms {

	public static void main(String[] args) {
		// ThirdLargest Element in an array
		int[] n = { 1, 4, 6, 7, 45 };
		System.out.println("Third Largest Element" + findThirdLargest(n, n.length));

	}

	public static int findThirdLargest(int[] a, int length) {
		int temp;
		for (int i = 0; i < length - 1; i++) {

			if (a[i] > a[i + 1]) {
				temp = a[i];
				a[i] = a[i + 1];
				a[i + 1] = temp;
			}
		}
		System.out.println(Arrays.toString(a));
		return a[length - 3];
	}

}
