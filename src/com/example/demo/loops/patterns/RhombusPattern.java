package com.example.demo.loops.patterns;

public class RhombusPattern {

	public static void main(String[] args) {
		int n=7;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i;j++)
				System.out.print(" ");
			for(int k=0;k<n;k++) {
				System.out.print("*");}
			System.out.println();
		
		}
		
	}

}
