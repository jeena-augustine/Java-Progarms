package com.example.demo.loops.pgms;

import java.util.Scanner;

public class DiamondStarPattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the value of n");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++)
				System.out.print(" ");
			for(int j=1;j<=i*2-1;j++)
				System.out.print("*");
			System.out.println();
			
		}
		
		for(int i=n;i>0;i--)
		{
			for(int j=1;j<=n-i;j++)
				System.out.print(" ");
			for(int j=1;j<=i*2-1;j++)
				System.out.print("*");
			System.out.println();
			
		}	
	}

}
