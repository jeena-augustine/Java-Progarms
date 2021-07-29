package com.example.demo.conditions;

public class LeapYearExample {
	public static void main(String[] args) {
		int year = 2020;
		leapYear(year);
		
	}

	 public static boolean leapYear(int year) {
		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
			return true;
		} else {
			return false;
		}
		
	}

}
