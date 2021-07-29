package com.exmple.demo.questions;

import java.util.Scanner;

public class TravelAgency {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number of persons to travel");
		int numberOfPerson=sc.nextInt();
		System.out.println("Enter pickup point(agra/tamilnadu/bangaluru)");
		String pickupPoint=sc.next();
		System.out.println("Enter destination point(delhi/kerala/bangaluru)");
		String destinationPoint=sc.next();
		System.out.println("Enter the mode of transport(car/airline/bus)");
		String modeOfTransport=sc.next();
		Person p1=new Person(numberOfPerson,pickupPoint,destinationPoint,modeOfTransport);
		
		System.out.println("---Ticket---");
		System.out.println("Number of persons travel:"+p1.getNumberofPersons());
		System.out.println("Pickup point:"+p1.getPickUpPoint());
		System.out.println("Destination point:"+p1.getDestinationPoint());
		System.out.println("Mode of transport:"+p1.getModeOfTransport());
		System.out.println("Amout to Pay:"+p1.calculateAmount());
	}

}
