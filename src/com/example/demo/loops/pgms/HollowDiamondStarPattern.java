package com.example.demo.loops.pgms;

import java.util.Scanner;

public class HollowDiamondStarPattern {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=1;j<n-i;j++) {
				System.out.print(" ");
			}
			if(i==1)
				System.out.print("*");
			else
			{
				
			}
		}
		
	}

}
