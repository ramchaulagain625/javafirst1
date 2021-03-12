package com.class02;

public class Task03Prac {

	public static void main(String[] args) {
		double d = 10.99;
		double d1 = 20.99;

		// operators
		double sum = d + d1;
		double sub = d - d1;
		double multi = d * d1;
		double div = d / d1;
		System.out.println("The sum of 2 number" + d + " and " + d1 + "is equal to" + sum);
		System.out.println("The sub of 2 number" + d + " and " + d1 + "is equal to" + sub);
		System.out.println("The multi of 2 number" + d + " and " + d1 + "is equal to" + multi);
		System.out.println("The div of 2 number" + d + " and " + d1 + "is equal to" + div);
// square of 
		double d2 = 3.9;
		double square = d2 * d2;
		System.out.println("The square of the " + d2 + " is " + square);

		// perimeter of rectangle
		int width = 5;
		int height = 8;
		int area = width*height;
		int perimeterOfRectangle = 2 * (width + height);
System.out.println("The perimeter of rectangle with width "+width+" and height "+ height+" is equal to "+ perimeterOfRectangle+" and the area is "+ area );
	}

}
