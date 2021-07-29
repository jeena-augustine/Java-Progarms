package com.example.demo;

public class ClassDemo {

	public static void main(String[] args) {
		Test test = new Test();
		System.out.println("Area of triangle =" + test.calculateOfTriangle());
	
	}

}

class Test {
	private int height = 7, base = 8;

	public int calculateOfTriangle() {
		return (height * base) / 2;
	}
}