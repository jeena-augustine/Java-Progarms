package com.example.demo;

public class Student {

	public int id;
	public String name;
	Student(int id,String name){
		this.id=id;
		this.name=name;
	}
	Student(){
		super();
	}
	public void insert(int i,String s) {
		id=i;
		name=s;
	}
	
	public void display() {
		System.out.print("id :"+id+" ");
		System.out.print("Name :"+name);
		System.out.println();
	}
	

}
