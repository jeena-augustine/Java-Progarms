package com.example.demo.files.custom;

import java.io.File;

public class DeleteFile2 {

	public static void main(String[]args) {
		File file=new File("D:\\Sample.java");
		if(file.delete())
			System.out.println("File deleted successfully");
		else
			System.out.println("Error Occured");
	}
}
