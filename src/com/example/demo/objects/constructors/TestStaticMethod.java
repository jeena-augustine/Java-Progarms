package com.example.demo.objects.constructors;

class Student8 {
	int rollno;
	String name;
	static String college = "ITS";

//static method to change the value of static variable  
	static void change() {
		college = "BBDIT";
	}

//constructor to initialize the variable  
	Student8(int r, String n) {
		rollno = r;
		name = n;
	}

//method to display values  
	void display() {
		System.out.println(rollno + " " + name + " " + college);
	}
}

//Test class to create and display the values of object  
public class TestStaticMethod {
	public static void main(String args[]) {
		Student8.change();// calling change method
//creating objects  
		Student8 s1 = new Student8(111, "Karan");
		Student8 s2 = new Student8(222, "Aryan");
		Student8 s3 = new Student8(333, "Sonoo");
//calling display method  
		s1.display();
		s2.display();
		s3.display();
	}
}