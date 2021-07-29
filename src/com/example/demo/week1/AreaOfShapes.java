package com.example.demo.week1;

import java.text.DecimalFormat;

public class AreaOfShapes {

	private static DecimalFormat df2 = new DecimalFormat("#.##");

	public static void main(String[] args) {
		int radius = 6;
		int base = 2, height = 6;
		int length = 4, width = 1;
		int diagonal1 = 6, diagonal2 = 4;
		int side = 5;

		calcualateCircleArea(radius);
		calculateTriangleArea(base, height);
		calculateIsoscelesTriangleArea(base, height);
		calculateRectangleArea(length, width);
		calculateParallelogramArea(base, height);
		calculateRhombusArea(diagonal1, diagonal2);
		calcuateEquilateralTriangleArea(side);

	}

	public static void calcualateCircleArea(int radius) {

		double area = 3.14 * (radius * radius);
		System.out.println("Area of the Circle=" + area);
	}

	public static void calculateTriangleArea(int base, int height) {

		int area = (base * height) / 2;
		System.out.println("Area of the Triangle=" + area);

	}

	public static void calculateRectangleArea(int length, int width) {
		int area = length * width;
		System.out.println("Area of the Rectangle=" + area);

	}

	public static void calculateIsoscelesTriangleArea(int base, int height) {
		int area = (base * height) / 2;
		System.out.println("Area of the Isosceles Triangle=" + area);
	}

	public static void calculateParallelogramArea(int base, int height) {
		int area = (base * height);
		System.out.println("Area of the Parallelogram=" + area);
	}

	public static void calculateRhombusArea(int diagonal1, int diagonal2) {
		int area = (diagonal1 * diagonal2) / 2;
		System.out.println("Area of the Rhombus=" + area);

	}

	public static void calcuateEquilateralTriangleArea(int side) {
		double area = (Math.sqrt(3) / 4) * (side * side);
		System.out.println("Area of the Equilateral Triangle=" + df2.format(area));
	}

}
