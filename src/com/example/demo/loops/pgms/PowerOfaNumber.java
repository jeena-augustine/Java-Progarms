package com.example.demo.loops.pgms;

import java.util.Scanner;

public class PowerOfaNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = sc.nextInt();

		System.out.println("Enter the exponent");
		int exponent = sc.nextInt();
		sc.close();

		powerofNumber(number, exponent);

	}

	public static int powerofNumber(int number, int exponent) {
		int result = 1;

		while (exponent > 0) {
			result = result * number;
			exponent--;
		}
		return result;
	}

}
