package com.example.demo.files.custom;

import java.io.File;

public class FileInfo2 {

	public static void main(String[] args) {
		File file=new File("D:\\Sample.java");
		if(file.exists()) {
			System.out.println("File name is : "+file.getName());
			System.out.println("Absolute Path of the file: "+file.getAbsolutePath());
			System.out.println("Size of the file: "+file.length());
		}
		else
			System.out.println("File not exsist");
		
		
	}

}
