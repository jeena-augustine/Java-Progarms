package com.example.demo.simple;
public class Sample6 {
        public static void main(String[] args) {

                int a = 10;
                int b = 10;
                addMethod(a, b);
                floatVariable(a);
               

        }

        public static void addMethod(int a, int b) {
                int c = a + b;
                System.out.println("Adding two int"+c);
        }

        public static void floatVariable(int a){
                float f = a;
                System.out.println("Type casting int to float");
                System.out.println(a);
                System.out.println(f);
        }

}