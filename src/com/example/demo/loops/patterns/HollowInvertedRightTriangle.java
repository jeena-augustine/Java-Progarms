package com.example.demo.loops.patterns;

public class HollowInvertedRightTriangle {

	public static void main(String[] args) {
	
		int n=9;
		for(int i=n;i>0;i--) {
			for(int j=0;j<i;j++) {
				if(i==n) {
					System.out.print("*");
				}
				else {
				if(j==0||j==i-1)
				System.out.print("*");
				else
					System.out.print(" ");
				
			}}
			System.out.println();
			}
	}

}
