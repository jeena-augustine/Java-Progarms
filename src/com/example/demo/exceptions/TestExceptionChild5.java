package com.example.demo.exceptions;

import java.io.*;  
class Parent5{  
  void msg()throws Exception{System.out.println("parent");}  
}  
  
class TestExceptionChild5 extends Parent5{  
  void msg(){System.out.println("child");}  
  
  public static void main(String args[]){  
   Parent5 p=new TestExceptionChild5();  
   try{  
   p.msg();  
   }catch(Exception e){}  
  }  
}  