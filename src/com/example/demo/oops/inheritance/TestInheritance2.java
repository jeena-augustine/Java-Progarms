package com.example.demo.oops.inheritance;

class TestInheritance2 {
	public static void main(String args[]) {
		BabyDog d = new BabyDog();
		d.weep();
		d.bark();
		d.eat();
	}
}

class Animal1 {
	String eat() {
		return "eating...";
	}
}

class Dog1 extends Animal1 {
	String bark() {
		return "barking...";
	}
}

class BabyDog extends Dog1 {
	String weep() {
		return "weeping...";
	}
}
