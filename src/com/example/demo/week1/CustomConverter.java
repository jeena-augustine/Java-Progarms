package com.example.demo.week1;

public class CustomConverter {

	public static void main(String[] args) {
		char c = 'a';
		String s = "anila";
		String s1 = "1";
		int i = 97;
		long l = 1234566;
		boolean b = true;
		double d = 10.0;
		Integer i1 = 10;
		charToString(c);
		StringToChar(s);

		charToInt(c);
		intToChar(i);

		intToLong(i);
		longToInt(l);

		booleanToString(b);
		stringToBoolean(s);

		StringToInt(s1);
		intToString(i);

		intToDouble(i);
		doubleToInt(d);

		stringToDouble(s1);
		doubleToString(d);

		primitiveToObject(i);
		ObjectToPrimitive(i1);
	}

	private static void charToString(char c) {
		String s = String.valueOf(c);
		System.out.println("\tchar To String");
		System.out.println("  input=" + c + "\t" + "Output=" + s);

	}

	private static void StringToChar(String s) {
		char c = s.charAt(0);
		System.out.println("\tString To char");
		System.out.println("  input=" + s + "\t" + "Output=" + c);

	}

	private static void charToInt(char c) {

		int i = c;
		System.out.println("\tchar To int");
		System.out.println("  input=" + c + "\t" + "Output=" + i);
	}

	private static void intToChar(int i) {
		char c = (char) i;
		System.out.println("\tint To char");
		System.out.println("  input=" + i + "\t" + "Output=" + c);

	}

	private static void intToLong(int i) {

		long l = i;
		System.out.println("\tint To Long");
		System.out.println("  input=" + i + "\t" + "Output=" + l);

	}

	private static void longToInt(long l) {
		int i = (int) l;
		System.out.println("\tLong To int");
		System.out.println("  input=" + l + "\t" + "Output=" + i);
	}

	private static void stringToBoolean(String s) {

		boolean b = Boolean.valueOf(s);
		System.out.println("\tString To boolean");
		System.out.println("  input=" + s + "\t" + "Output=" + b);
	}

	private static void booleanToString(boolean b) {
		String s = String.valueOf(b);
		System.out.println("\tBoolean To String");
		System.out.println("  input=" + b + "\t" + "Output=" + s);
	}

	private static void StringToInt(String s) {

		int i = Integer.parseInt(s);
		System.out.println("\tString To int");
		System.out.println("  input=" + s + "\t" + "Output=" + i);

	}

	private static void intToString(int i) {
		String s = String.valueOf(i);
		System.out.println("\tint To String");
		System.out.println("  input=" + i + "\t" + "Output=" + s);
	}

	private static void intToDouble(int i) {
		double d = i;
		System.out.println("\tint To double");
		System.out.println("  input=" + i + "\t" + "Output=" + d);
	}

	private static void doubleToInt(double d) {
		int i = (int) d;
		System.out.println("\tdouble To int");
		System.out.println("  input=" + d + "\t" + "Output=" + i);
	}

	private static void stringToDouble(String s1) {
		double d = Double.parseDouble(s1);
		System.out.println("\tString To double");
		System.out.println("  input=" + s1 + "\t" + "Output=" + d);
	}

	private static void doubleToString(double d) {
		String s = String.valueOf(d);
		System.out.println("\tdouble To String");
		System.out.println("  input=" + d + "\t" + "Output=" + s);
	}

	private static void primitiveToObject(int i) {
		Integer I=Integer.valueOf(i);
		System.out.println("\tprimitive To Object");
		System.out.println("  input=" + i + "\t" + "Output=" + I);
	}

	private static void ObjectToPrimitive(Integer i1) 
	{
		int i=i1.intValue();
		System.out.println("\tObject To Value");
		System.out.println("  input=" + i1 + "\t" + "Output=" + i);
	}

}