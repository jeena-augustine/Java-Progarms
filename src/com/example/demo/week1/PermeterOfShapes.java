package com.example.demo.week1;

import java.text.DecimalFormat;

public class PermeterOfShapes {

	private static DecimalFormat df2 = new DecimalFormat("#.##");

	public static void main(String[] args) {
		int radius = 5;
		int side = 6, base = 4;
		int length = 4, width = 2;
		calculatePermiterOfCircle(radius);
		calculatePerimeterOfEquilateralTriangle(side);
		calculatePerimeterOfParallelogram(base, side);
		calculatePerimeterOfRectangle(length, width);
		calculatePerimeterOfSquare(side);
		calculatePerimeterOfRhombus(side);

	}

	public static void calculatePermiterOfCircle(int radius) {

		double p = (2 * 3.14 * radius);

		System.out.println("circumference=" + df2.format(p));
	}

	public static void calculatePerimeterOfEquilateralTriangle(int side) {
		int p = (3 * side);
		System.out.println("Perimeter of Equilateral Triangle=" + p);

	}

	public static void calculatePerimeterOfParallelogram(int base, int side) {

		int p = 2 * (base + side);
		System.out.println("Perimeter of Parallelogram=" + p);
	}

	public static void calculatePerimeterOfRectangle(int length, int width) {
		int p = 2 * (length + width);
		System.out.println("Perimeter of Rectangle=" + p);

	}

	public static void calculatePerimeterOfSquare(int side) {
		int p = 4 * side;
		System.out.println("Perimeter of Square=" + p);
	}

	private static void calculatePerimeterOfRhombus(int side) {
		int p = 4 * side;
		System.out.println("Perimeter of Rhombus=" + p);
	}

}
