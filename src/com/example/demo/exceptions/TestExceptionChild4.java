package com.example.demo.exceptions;

import java.io.*;  
class Parent4{  
  void msg()throws Exception{System.out.println("parent");}  
}  
  
class TestExceptionChild4 extends Parent4{  
  void msg()throws ArithmeticException{System.out.println("child");}  
  
  public static void main(String args[]){  
   Parent4 p=new TestExceptionChild4();  
   try{  
   p.msg();  
   }catch(Exception e){}  
  }  
}  