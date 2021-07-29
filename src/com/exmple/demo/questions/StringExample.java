package com.exmple.demo.questions;

import java.util.Arrays;

public class StringExample {

	public static void main(String[] args) {
		String str="Hellos";
		System.out.println(findLength(str));
		
		int n=1;
		
		String toUpper=str.toUpperCase();
		String toLower=str.toLowerCase();
		System.out.println("Upper case"+toUpper);
		System.out.println("Lower case="+toLower);
		StringBuilder s1=new StringBuilder(str);
		System.out.println("reverse of the string is ="+s1.reverse().toString());
		divideString(str,n);
		
	}

	public static int findLength(String str) {
		// TODO Auto-generated method stub
		return str.length();
	}

	private static void divideString(String str, int n) {
	
		int length=str.length();
		int partsSize=length/n;
		int temp=0;
		String[] equalStr=new String[length];
		if(length%n!=0)
			System.out.println("DIVIDING IS NOT POSSIBLE");
		else {
			
			for(int i=0;i<length;i=i+partsSize) {
				String part=str.substring(i, i+partsSize);
				equalStr[temp]=part;
				temp++;
			}
			
			
			
		}
}
}