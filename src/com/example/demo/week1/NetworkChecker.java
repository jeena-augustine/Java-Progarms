package com.example.demo.week1;

public class NetworkChecker {

	public static void main(String[] args) {
		String typeOfNetowrk = "mobile";
		int strength = 1;  // strength indicator  can range from 0 to 4
		switch (typeOfNetowrk) {
		case "wifi": {
			switch (strength) {
			case 0: {
				System.out.println("No internet connection!!!Check your Network Router");
				break;
			}
			case 1: {
				System.out.println("Poor wifi Connection");
				break;
			}
			case 2: {
				System.out.println("Stable wifi Connection");
				break;
			}
			case 3: {
				System.out.println("Good wifi Connection");
				break;
			}
			case 4: {
				System.out.println("Excellent wifi Connection");
				break;
			}
			}
			break;
		}
		case "mobile": {
			switch (strength) {
			case 0: {
				System.out.println("No internet connection!!!Please Check your Mobile data ");
				break;
			}
			case 1: {
				System.out.println("Poor network Connection");
				break;
			}
			case 2: {
				System.out.println("Stable network Connection");
				break;
			}
			case 3: {
				System.out.println("Good network Connection");
				break;
			}
			case 4: {
				System.out.println("Excellent network Connection");
				break;
			}
			}
		}
		}

	}

}
