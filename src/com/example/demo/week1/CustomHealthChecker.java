package com.example.demo.week1;

public class CustomHealthChecker {

	public static void main(String[] args) {

		//height in cm and weight in kg
		double height = 163, weight = 55;
		calculateBMI(height, weight);

	}

	public static void calculateBMI(double height, double weight) {

		double heightInMeter = height / 100;
		double bmi = weight / (heightInMeter * heightInMeter);
		bmi = (int) bmi;
		if (bmi <= 18) {
			System.out.println("Your BMI is :" + bmi);
			System.out.println("You are underweight!!!!! ");
		} else if (bmi > 18 && bmi < 25) {
			System.out.println("Your BMI is :" + bmi);
			System.out.println("You are Normal Weight :) ");
		} else if (bmi >= 25 && bmi <= 30) {
			System.out.println("Your BMI is :" + bmi);
			System.out.println("You are Overweight !!!!! ");
		}
		else if (bmi > 30) {
			System.out.println("Your BMI is :" + bmi);
			System.out.println("You are Obese !!!!! ");
		}

	}

}
