package com.example.demo.objects.constructors;

class Student9 {
	int rollno;
	String name;
	float fee;

	Student9(int rollno, String name, float fee) {
		rollno = rollno;
		name = name;
		fee = fee;
	}

	void display() {
		System.out.println(rollno + " " + name + " " + fee);
	}
}

class TestThis1 {
	public static void main(String args[]) {
		Student9 s1 = new Student9(111, "ankit", 5000f);
		Student9 s2 = new Student9(112, "sumit", 6000f);
		s1.display();
		s2.display();
	}
}
