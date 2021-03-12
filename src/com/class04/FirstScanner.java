package com.class04;

public class FirstScanner {

	public static void main(String[] args) {
	int age = 19;
	int weight= 111;
	if (age>17) {
		System.out.println("you are qualify age but let me check your weight");
		if(weight>110) {
			System.out.println("You can donate");
		}else {
			System.out.println("your weight is " +weight+" you need atleast 110 lbs to donate");
		}
	}else {
		System.out.println("sorry you must be 18+ to donate");
	}

	}

}
