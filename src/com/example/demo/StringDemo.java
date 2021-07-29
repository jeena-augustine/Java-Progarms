package com.example.demo;

public class StringDemo {

	   public static void main(String args[]) {
//	      char[] helloArray = { 'h', 'e', 'l', 'l', 'o', '.' };
//	      String helloString = new String(helloArray);  
//	      System.out.println( helloString );
//	      String palindrome = "J A V A";
//	      int len = palindrome.length();
//	      System.out.println( "String Length is : " + len );
//	      String string1 = "saw I was ";
//	      System.out.println("Dot " + string1 + "Tod");
		   float floatVar=6;
		   int intVar=1;
		  String stringVar="anila";
	      System.out.printf("The value of the float variable is " +
                  "%f, while the value of the integer " +
                  "variable is %d, and the string " +
                  "is %s", floatVar, intVar, stringVar);
	      System.out.println();
	      String fs = String.format("The value of the float variable is " +
                  "%f, while the value of the integer " +
                  "variable is %d, and the string " +
                  "is %s", floatVar, intVar, stringVar);
	      System.out.println(fs);

	      String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	      System.out.println("The length of the txt string is: " + txt.length());
	       
	      String txt1 = "Hello World";
	      System.out.println(txt1.toUpperCase());   // Outputs "HELLO WORLD"
	      System.out.println(txt1.toLowerCase());   // Outputs "hello world"
	       
	      String txt2 = "Please locate where 'locate' occurs!";
	      System.out.println(txt2.indexOf("locate")); // Outputs 7
	       
	      String firstName = "John";
	      String lastName = "Doe";
	      System.out.println(firstName + " " + lastName);


	   }
	   
	   
	   
	}


