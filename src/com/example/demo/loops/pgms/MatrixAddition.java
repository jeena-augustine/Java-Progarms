package com.example.demo.loops.pgms;

import java.util.Scanner;

public class MatrixAddition {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of columns");
		int col = sc.nextInt();
		System.out.println("Enter the number of rows");
		int row = sc.nextInt();

		int[][] matrix1 = new int[row][col];
		int[][] matrix2 = new int[row][col];
		int[][] result = new int[row][col];

		System.out.println("Enter the elements of Matrix 1");

		for ( int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++)
				matrix1[i][j] = sc.nextInt();
			System.out.println();
		}

		System.out.println("Enter the elements of Matrix 2");
		for ( int i = 0; i < row; i++) {
			for ( int j = 0; j < col; j++)
				matrix2[i][j] = sc.nextInt();
			System.out.println();
		}

		System.out.println("Result is ");
		for( int i=0;i<row;i++) 
			for( int j=0;j<col;j++)
				result[i][j]=matrix1[i][j] + matrix2[i][j];
	
		
		for( int i=0;i<row;i++) {
			for(int  j=0;j<col;j++) {
				System.out.print(result[i][j]+" ");
		}
		System.out.println();}
		
	}

}
