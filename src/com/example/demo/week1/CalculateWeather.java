package com.example.demo.week1;

public class CalculateWeather {

	public static void main(String[] args) {
		int temperature = 21;

		if (temperature > 38)
			System.out.println("The current season is Summer");
		else if (temperature < 38 && temperature > 34)
			System.out.println("The current season is Spring");
		else if (temperature <= 34 && temperature > 28)
			System.out.println("The current season is Autumn ");
		else if (temperature <= 28 && temperature > 20)
			System.out.println("The current season is Pre winter ");
		else if (temperature <= 20)
			System.out.println("The current season is Winter ");

	}

}
