package com.example.demo.loops.pgms;

import java.util.Scanner;

public class DiscountExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Original price of the product");
		double price = sc.nextDouble();
		System.out.println("Discount of the product in percentage");
		double percentage = sc.nextDouble();
		double discount = percentage / 100;
		double original_price = price * discount;
		System.out.println("Price after discount :" + original_price);
	}

}
