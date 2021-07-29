package com.example.demo.week1;

import java.text.DecimalFormat;

public class VolumeOfShapes {

	private static DecimalFormat df2 = new DecimalFormat("#.##");

	public static void main(String[] args) {

		int radius = 8, height = 7;
		int base = 6;
		calculateVolumeofCone(radius, height);
		calculateVolumeOfPrism(base, height);
		calculateVolumeOfCyclinder(radius, height);
		calculateVolumeOfSphere(radius);
	}

	public static void calculateVolumeofCone(int radius, int height) {
		double volume = (3.14 * radius * radius) * (height) / 3;
		System.out.println("Volume of the Cone=" + df2.format(volume));
	}

	public static void calculateVolumeOfPrism(int base, int height) {
		int volume = base * height;
		System.out.println("Volume of the Prism=" + volume);
	}

	public static void calculateVolumeOfCyclinder(int radius, int height) {

		double volume = ((3.14 * radius * radius) * height);
		System.out.println("Volume of the Cyclinder=" + df2.format(volume));
	}

	public static void calculateVolumeOfSphere(int radius) {

		double volume = (4 * 3.14 * radius * radius * radius) / 3;
		System.out.println("Volume of the Sphere=" + df2.format(volume));
	}
}
