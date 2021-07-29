package com.example.demo.loops.patterns;

public class HollowDiamondPattern {

	public static void main(String[] args) {
		int n = 8;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++)
				System.out.print(" ");

			if (i == 1)
				System.out.print("*");
			else {
				System.out.print("*");
				for (int k = 1; k < (i-1)*2; k++) {
					System.out.print(" ");
				}
				System.out.print("*");
			}

			System.out.println();
		}

		for (int i = n; i >= 1; i--) {

			for (int j = n - i; j >= 1; j--)
				System.out.print(" ");
			if (i == 1)
				System.out.print("*");
			else {
				System.out.print("*");
				for (int k = (i-1)*2 ; k >= 1; k--) {
					System.out.print(" ");
				}
				System.out.print("*");

				System.out.println();
			}
		}
	}

}
