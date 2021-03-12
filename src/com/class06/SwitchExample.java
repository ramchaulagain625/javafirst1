package com.class06;

import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args) {
		Scanner input;
		String country,food;
		input=new Scanner (System.in);
		System.out.println("Please enter your country?");
		country =input.nextLine();
		
		switch(country.toLowerCase()) {
		case "usa":
			food="Burger";
			break;
		case "nepal":
			food=" Jhol MOMO, Choila, Sekuwa Veg.MOMO, Newari Khaja.";
			break;
		case "vietnam":
			food="Pho";
			default:
				food="unKnown";
		}
		System.out.println("Your country food is"+food);
	}

}
