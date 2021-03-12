package com.class05;

import java.util.Scanner;

public class Classwork02 {

	public static void main(String[] args) {
		System.out.println("--------------cw1---------------------------");
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your height in inch");
		int high = input.nextInt();
		if(high<60) {
			System.out.println("you are short");
		}else if(high>=60 && high<=72) {
			System.out.println("you are medium");
		}else {
			System.out.println("you are tall");
		}
		
		System.out.println("------------------cw2---------------------");
		System.out.println("please enter a day in number 1 to 7");
		int day = input.nextInt();
		if(day<1) {
System.out.println("Invalid day");
		} else if(day>=1 && day<=5) {
			System.out.println(" It is a weekday");
		}else if(day==6 || day==7) {
			System.out.println("It is a weekend");
		}else
			System.out.println("Invalid day");
	}

}
