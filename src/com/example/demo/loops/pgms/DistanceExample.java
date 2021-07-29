package com.example.demo.loops.pgms;

import java.util.Scanner;

public class DistanceExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first point");
		double p1 = sc.nextDouble();
		System.out.println("Enter the second point");
		double p2 = sc.nextDouble();
		calculateDistanceBW2Points(p1, p2);
		
	}

	 public static int calculateDistanceBW2Points(double p1, double p2) {
		int distance =(int) Math.abs(p2 - p1);
		System.out.println("Distance between " + p1 + " and " + p2 + " is " + distance);
		return distance;
	}

}
