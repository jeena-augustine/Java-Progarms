package com.exmple.demo.operators;

public class OperatorExample7 {
	public static void main(String args[]){  
		 //For positive number, >> and >>> works same  
		System.out.println(20>>2); //10100>>2 00101(5) 
		System.out.println(20>>>2);  
		 //For negative number, >>> changes parity bit (MSB) to 0  
		 System.out.println(-20>>2);  
		  System.out.println(-20>>>2);  
		}

}
