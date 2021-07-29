package com.example.demo.week2;

import java.util.Arrays;

public class JavaStringProgram {

	public static void main(String[] args) {
		//replace space by with specific character;
		char c='*';
		String s="     Humpty Dumty Sat on a wall";
		char[] stringChar=new char[s.length()];
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' ') {
				stringChar[i]='*';
			}
			else
			{
				stringChar[i]=s.charAt(i);
			}
				
		}
		String newString=new String(stringChar);
		System.out.println("Original String= "+s);
		System.out.println("Modified String= "+newString);
	}

}
