package com.example.demo.loops.patterns;

public class HollowRightTrianglePattern {

	public static void main(String[] args) {
		int n = 7;
		for (int i = 1; i <= n; i++) {

			if (i == 1)
				System.out.print("*");
			else  if(i==n) {
				for(int p=1;p<=i+2;p++)
				System.out.print("*");
			}
			else {
				System.out.print("*");
				for (int k = 1; k <= i; k++)
					System.out.print(" ");
				System.out.print("*");
			}

			System.out.println();
		}
	}

}
