package com.example.demo.week2;

import java.util.Scanner;

public class JavaMatrixProgram {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of rows  of matrix");
		int row = sc.nextInt();
		System.out.println("Enter the number of columns of matrix");
		int col = sc.nextInt();
		
		
		int[][] matrix1 = new int[row][col];
		int[][] transpose = new int[col][row];
		
		System.out.println("Enter the elements of Matrix");

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++)
				matrix1[i][j] = sc.nextInt();
			System.out.println();
		}

		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++)
				transpose[i][j] =matrix1[j][i];
			System.out.println();
		}

	
			System.out.println("Transpose of the matrix is ");

			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++)
					System.out.print(" "+transpose[i][j]+" ");
			System.out.println();
			}
		}

	}

