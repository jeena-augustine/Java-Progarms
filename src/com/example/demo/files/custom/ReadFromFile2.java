package com.example.demo.files.custom;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromFile2 {

	public static void main(String[] args) throws FileNotFoundException {
		File file=new File("D:\\Sample.java");
		Scanner sc=new Scanner(file);
		while(sc.hasNextLine()) {
			String line=sc.nextLine();
			System.out.println(line);
		}
		sc.close();
		
	}

}
