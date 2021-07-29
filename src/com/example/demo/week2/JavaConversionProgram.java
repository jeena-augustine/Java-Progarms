package com.example.demo.week2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class JavaConversionProgram {

	public static void main(String[] args) throws ParseException {
		//convert string to date
		
		String dateString= new String("10/07/2021");
		Date date=new SimpleDateFormat("DD/MM/YYYY").parse(dateString);
		 System.out.println(dateString+"\t"+date);  
	}

}
