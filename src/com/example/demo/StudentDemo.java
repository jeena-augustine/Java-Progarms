package com.example.demo;

public class StudentDemo {

	public static void main(String[] args) {
		//Through constructor
		Student st=new Student(0,"Anitha");
		System.out.print("id:"+st.id+" ");
		System.out.println("Name :"+st.name);
		//Through method
		Student st1=new Student();
		Student st2=new Student();
		st1.insert(1, "Ajitha");
		st2.insert(2, "Anila");
		st1.display();
		st2.display();
		
		//Through reference variable
		
		Student st3=new Student();
		st3.id=3;
		st3.name="Jenna";
		st3.display();
		
	}

}
