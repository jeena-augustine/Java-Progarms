package com.example.demo.loops.pgms;

import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of columns for matrix1");
		int col1 = sc.nextInt();
		System.out.println("Enter the number of rows for matrix1 ");
		int row1 = sc.nextInt();
		
		System.out.println("Enter the number of columns for matrix2");
		int col2 = sc.nextInt();
		System.out.println("Enter the number of rows for matrix2 ");
		int row2 = sc.nextInt();
		
		
		int sum;
		int[][] matrix1 = new int[row1][col1];
		int[][] matrix2 = new int[row2][col2];
		int[][] result = new int[row1][col2];

		System.out.println("Enter the elements of Matrix 1");

		for ( int i = 0; i < row1; i++) {
			for (int j = 0; j < col1; j++)
				matrix1[i][j] = sc.nextInt();
			System.out.println();
		}

		System.out.println("Enter the elements of Matrix 2");
		for ( int i = 0; i < row2; i++) {
			for ( int j = 0; j < col2; j++)
				matrix2[i][j] = sc.nextInt();
			System.out.println();
		}

		System.out.println("Multiplication ");
		for ( int i = 0; i < row1; i++) {
			for ( int j = 0; j < col2; j++) {
				sum=0;
				for(int k=0;k<row2;k++) {
					sum=sum+ matrix1[i][k] * matrix2[k][j];
				}
				result[i][j]=sum;
			}
		}

		for( int i=0;i<row1;i++) {
			for(int  j=0;j<col2;j++) {
				System.out.print(result[i][j]+" ");
		}
		System.out.println();}
	}

}
