package com.example.demo.week2;

public class JavaPatternProgram {

	//Hollow Rombus Pattern
		public static void main(String[] args) {
			int n=7;
			for(int i=1;i<=n;i++) {
				for(int j=1;j<=n-i;j++)
					System.out.print(" ");
				System.out.print("*");
				if(i==1 ||i==n) 
				{
					for(int k=0;k<n-2;k++) {
						System.out.print("*");
					}
					//System.out.println();
				}
				else {
				for(int k=1;k<=(n-2);k++)
				{
					System.out.print(" ");
				}}
				System.out.print("*");
				System.out.println();
			}

		}

	}

