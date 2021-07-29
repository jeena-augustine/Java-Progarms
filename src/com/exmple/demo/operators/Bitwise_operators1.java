package com.exmple.demo.operators;

public class Bitwise_operators1 {
	public static void main(String as[])
    {
        int a = 50; 
        int b = 25; 
        int c = 0;

        c = a & b;        
        System.out.println("a & b = " + c );

        c = a | b;        
        System.out.println("a | b = " + c );

        c = a ^ b;      //Bitwise XOR  
        System.out.println("a ^ b = " + c );

        c = ~a;     //bitwise complement      
        System.out.println("~a = " + c );

        c = a << 2;      
        System.out.println("a << 2 = " + c );

        c = a >> 2;       
        System.out.println("a >>2  = " + c );

        c = a >>> 2;     
        System.out.println("a >>> 2 = " + c );
    }

}
