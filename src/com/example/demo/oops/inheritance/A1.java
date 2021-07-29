package com.example.demo.oops.inheritance;

class A{  
void msg(){System.out.println("Hello");}  
}  
class B{  
void msg(){System.out.println("Welcome");}  
} 

public class A1 extends A{//suppose if it were  
	   
	 public static void main(String args[]){  
	   A1 obj=new A1();  
	   obj.msg();//Now which msg() method would be invoked?  
	}  
	}  
