package com.class04;

import java.util.Scanner;

public class hw03 {

	public static void main(String[] args) {
		System.out.println("Hey how are you ? can you please provide me your city?");
		Scanner sc= new Scanner(System.in);
		String city= sc.nextLine();
		System.out.println("What is the current temp in fehrenheit?");
		int temp=sc.nextInt();
		float celc=(temp-32)/1.80f;
		System.out.println( "The temperature of the city "+city+" is "+ celc+"°C");
	}

}
