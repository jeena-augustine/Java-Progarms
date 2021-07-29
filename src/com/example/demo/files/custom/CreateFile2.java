package com.example.demo.files.custom;

import java.io.File;
import java.io.IOException;

public class CreateFile2 {

	public static void main(String[] args) throws IOException {
		
			File file=new File("D:\\Sample.java");
			if(file.createNewFile())
				System.out.println("File("+file.getName()+")created successfully");
			else
				System.out.println("File already exsiting in the directory");
		
	
	}

}
