package com.exmple.demo.questions;

public class Test {

	int a;
	int b;

	Test() {
		this(10, 20);

	}

	Test(int a, int b) {
		this.a = a;
		this.b = b;
	}

	Test get() {
		return this;
	}

	void display() {
		displayThis(this);
		
	}

	private void displayThis(Test test) {
		System.out.println("a=" + a +"\n"+ "b=" + b);
	}

	public static void main(String[] args) {
		Test obj = new Test();
		obj.get().display();

	}

}
