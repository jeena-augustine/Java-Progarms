package com.example.demo.files.custom;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile2 {

	public static void main(String[] args) throws IOException {
		File file = new File("D:\\Sample.java");
		FileWriter writer = new FileWriter(file);
		writer.write("System.out.println(Sample)");
		
		writer.write("\n"+"System.out.println(Simple)");
		writer.close();
		System.out.println("Content is successfully wrote to the file.");
	}

}
