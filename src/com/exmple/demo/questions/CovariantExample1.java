package com.exmple.demo.questions;


class A11  
{  
    A11 foo()  
    {  
        return this;  
    }  
      
    void print()  
    {  
        System.out.println("Inside the class A1");  
    }  
}  
  
  
// A2 is the child class of A1  
class A21 extends A11  
{  
    @Override  
    A21 foo()  
    {  
        return this;  
    }  
      
    void print()  
    {  
        System.out.println("Inside the class A2");  
    }  
}  
  
// A3 is the child class of A2  
class A31 extends A21  
{  
    @Override  
    A31 foo()  
    {  
        return this;  
    }  
      
    @Override  
    void print()  
    {  
        System.out.println("Inside the class A3");  
    }  
}  
  
public class CovariantExample1  
{  
    // main method  
    public static void main(String argvs[])  
    {  
       A11 a1 = new A11();  
         
       a1.foo().print();  
         
       A21 a2 = new A21();  
         
       a2.foo().print();  
         
       A31 a3 = new A31();  
         
       a3.foo().print();  
         
    }  
}  
