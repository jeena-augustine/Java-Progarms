package com.exmple.demo.questions;

public class Person {

	int numberofPersons;
	String pickUpPoint;
	String destinationPoint;
	String modeOfTransport;

	public Person(int numberofPersons, String pickUpPoint, String destinationPoint, String modeOfTransport) {
		super();
		this.numberofPersons = numberofPersons;
		this.pickUpPoint = pickUpPoint;
		this.destinationPoint = destinationPoint;
		this.modeOfTransport = modeOfTransport;
	}

	public double calculateAmount() {
		boolean flag = true;
		int basicCharge = 0;

		switch (modeOfTransport) {
		case "car": {
			basicCharge = 3000;
			break;
		}

		case "bus": {
			basicCharge = 100;
			break;
		}

		case "airline": {
			basicCharge = 5000;
			break;
		}

		default: {
			flag = false;
			break;

		}

		}
		if (flag == false) {
			System.out.println("Invalid mode of transport!!!!!");
			return 0.0;
		}

		else {
			basicCharge = basicCharge * numberofPersons;
			double charge = calculateDistance(pickUpPoint, destinationPoint, basicCharge);
			return charge;
		}

	}

	private double calculateDistance(String pickUpPoint2, String destinationPoint2, int basicCharge) {
		boolean flag = true;
		int distance = 0;
		if (pickUpPoint2.equals("agra") && destinationPoint2.equals("delhi"))
			distance = 242;
		else if (pickUpPoint2.equals("agra") && destinationPoint2.equals("kerala"))
			distance = 2134;
		else if (pickUpPoint2.equals("agra") && destinationPoint2.equals("bangaluru"))
			distance = 500;
		else if (pickUpPoint2.equals("tamilnadu") && destinationPoint2.equals("kerala"))
			distance = 309;
		else if (pickUpPoint2.equals("tamilnadu") && destinationPoint2.equals("bangaluru"))
			distance = 349;
		else if (pickUpPoint2.equals("tamilnadu") && destinationPoint2.equals("delhi"))
			distance = 1500;
		else if (pickUpPoint2.equals("bangaluru") && destinationPoint2.equals("agra"))
			distance = 500;
		else if (pickUpPoint2.equals("bangaluru") && destinationPoint2.equals("delhi"))
			distance = 600;
		else if (pickUpPoint2.equals("bangaluru") && destinationPoint2.equals("kerala"))
			distance = 309;

		if (distance > 1 && distance < 250)
			basicCharge = basicCharge + 400;
		else if (distance > 250 && distance < 350)
			basicCharge = basicCharge + 1000;
		else if (distance > 350)
			basicCharge = basicCharge + 2500;
		else {
			System.out.println("pickup point  or destination point  is not supported");
			flag = false;
		}
		if (flag == false) {
			return 0.0;
		} else {
			return basicCharge;
		}
	}

	public int getNumberofPersons() {
		return numberofPersons;
	}

	public void setNumberofPersons(int numberofPersons) {
		this.numberofPersons = numberofPersons;
	}

	public String getPickUpPoint() {
		return pickUpPoint;
	}

	public void setPickUpPoint(String pickUpPoint) {
		this.pickUpPoint = pickUpPoint;
	}

	public String getDestinationPoint() {
		return destinationPoint;
	}

	public void setDestinationPoint(String destinationPoint) {
		this.destinationPoint = destinationPoint;
	}

	public String getModeOfTransport() {
		return modeOfTransport;
	}

	public void setModeOfTransport(String modeOfTransport) {
		this.modeOfTransport = modeOfTransport;
	}

}
