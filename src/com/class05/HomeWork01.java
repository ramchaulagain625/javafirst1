package com.class05;

import java.util.Scanner;

public class HomeWork01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your birth month");
		String month = scan.nextLine();
		String season;
		if(month.equals("december") || month.equals("january") || month.equals("february")) {
			season = "winter";
		} else if(month.equals("march") || month.equals("april") || month.equals("may")) {
			season= "spring";
		}else if(month.equals("june") || month.equals("july") || month.equals("august")) {
			season= "summer";
		}else if(month.equals("september") || month.equals("octomber") || month.equals("november")) {
			season= "autumn";
		}else {
			season="Invalid month";
		}
		System.out.println("You were born in " + season + " season ");
	}
	
}
