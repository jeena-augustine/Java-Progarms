package com.exmple.demo.questions;

import java.util.Arrays;

public class StringProgramExample {

	public static void main(String[] args) {
		String s1="anila";
		String s2="aliaa";
		checkAnagram(s1,s2);
	
		
	}

	private static void checkAnagram(String s1, String s2) {
		char[] arr1=s1.toCharArray();
		char[] arr2=s2.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		s1=new String(arr1);
		s2=new String(arr2);
		System.out.println(s1.equals(s2));
	}

}
