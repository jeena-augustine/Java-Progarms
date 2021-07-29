package com.exmple.demo.questions;

import java.util.Scanner;

public class BMIExample {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Please enter your gender(m/f)");
		String gender = sc.nextLine();
		System.out.println("Please enter your age");
		int age = sc.nextInt();
		System.out.println("Please enter your height in cm");

		double height = sc.nextDouble();
		System.out.println("Please enter your weight in kg");
		double weight = sc.nextDouble();
		calculateBMI(gender, age, height, weight);
	}

	public static int calculateBMI(String gender, int age, double height, double weight) {
		double heightInMeter = height / 100;
		// System.out.println(heightInMeter);
		double weightIntoPounds = weight * 2.2;
		double heightIntoInches = height / 2.54;
		if (age >= 2 && age <= 20) {// Children
			double W = weightIntoPounds * 703;
			double H = heightIntoInches * heightIntoInches;
			int BMI = (int) (W / H);
			if (BMI < 5) {
				System.out.println("Child is Underweight");
			} else if (BMI >= 5 && BMI <= 84) {
				System.out.println("Child is Healthy weight");
			} else if (BMI >= 85 && BMI <= 95) {
				System.out.println("Child is Overweight");
			}

			else if (BMI > 95) {
				System.out.println("Child is Obese");
			}
			return BMI;
		}

		else {
			int bmi = (int) (weight / (heightInMeter * heightInMeter));
			switch (gender) {
			case "m": {
				if (bmi <= 18) {
					System.out.println("Your BMI is :" + bmi);
					System.out.println("You are underweight!!!!! ");
				} else if (bmi > 18 && bmi <= 25) {
					System.out.println("Your BMI is :" + bmi);
					System.out.println("You are Normal Weight :) ");
				} else if (bmi > 25 && bmi < 30) {
					System.out.println("Your BMI is :" + bmi);
					System.out.println("You are Overweight !!!!! ");
				} else if (bmi >= 30) {
					System.out.println("Your BMI is :" + bmi);
					System.out.println("You are Obese !!!!! ");
				}

				break;
				
			}
			case "f": {
				if (bmi <= 18) {
					System.out.println("Your BMI is :" + bmi);
					System.out.println("You are underweight!!!!! ");
				} else if (bmi > 18 && bmi < 25) {
					System.out.println("Your BMI is :" + bmi);
					System.out.println("You are Normal Weight :) ");
				} else if (bmi >= 25 && bmi < 30) {
					System.out.println("Your BMI is :" + bmi);
					System.out.println("You are Overweight !!!!! ");
				} else if (bmi >= 30) {
					System.out.println("Your BMI is :" + bmi);
					System.out.println("You are Obese !!!!! ");
				}

				break;
				
			}
		
			}
			return bmi;
		}

	}

}
