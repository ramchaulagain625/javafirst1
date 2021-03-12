package com.class06;

import java.util.Scanner;

public class ExampleA {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String country, food;
		   System.out.println("Please enter your country");
		   country=sc.nextLine();
		   switch(country.toLowerCase()) {
		   case "nepal":food="Momo";break;
		   case "india":food="Panipuri";break;
		   case "usa":food="Burger";break;
		   case "china":food="Noodles";break;
		   case "afganistan":food="Kebab";break;
		   case "vietnam":food="Pho";break;
		   case "poland":food="Pierogi";break;
		   case "kazakastan":food="horse";break;
		   case "mexico":food="Tacos";break;
		   default: food="Unknown";
		   }
		 System.out.println("Your favorite food is : "+food);

	}

}
