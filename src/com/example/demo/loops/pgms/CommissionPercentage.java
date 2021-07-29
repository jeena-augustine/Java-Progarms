package com.example.demo.loops.pgms;

import java.util.Scanner;

public class CommissionPercentage {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount");
		double amount = sc.nextDouble();
		System.out.println("Enter the commission percentage");
		double percentage = sc.nextDouble();
		
		System.out.println("Commission Amount:" + calculateCommission(amount, percentage));
	}

	 public static int calculateCommission(double amount, double percentage) {
		int commission =(int)( (percentage / 100) * amount);
		return commission;
		
	}

}
