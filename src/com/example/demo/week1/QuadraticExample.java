package com.example.demo.week1;

public class QuadraticExample {

	// Test cases: a=1 b=1 c=1 Imaginary roots
	// a=1 b=7 c=12 //d>0
	// a=1 b=-2 c-1
	public static void main(String[] args) {
		double a = 1, b = 1, c = 1;
		findQuadraticSolution(a, b, c);
	}

	public static void findQuadraticSolution(double a, double b, double c) {

		double x1, x2;
		double d = (b * b) - (4 * a * c);
		double sqrt = Math.sqrt(d);
		if (d > 0) {

			x1 = (-b + sqrt) / 2 * a;
			x2 = (-b - sqrt) / 2 * a;
			System.out.println("Roots are real\n" + x1 + "\n" + x2);
		}

		else if (d == 0) {
			x1 = (-b + sqrt) / 2 * a;
			System.out.println("Root is real \n" + x1);
		} else {
			double imaginaryPart = Math.sqrt(-d) / (2 * a);
			double real = -b / (2 * a);
			System.out.println("Roots are not real");
			System.out.println(real + "+i" + imaginaryPart);
			System.out.println(real + "-i" + imaginaryPart);
		}
	}

}
