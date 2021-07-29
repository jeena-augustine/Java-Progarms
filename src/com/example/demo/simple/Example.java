package com.example.demo.simple;
public class Example{
    public static void main(String[] args){
        Class c=Example.class;
        System.out.println(c.getClassLoader());
        System.out.println(String.class.getClassLoader());
       
    }
}