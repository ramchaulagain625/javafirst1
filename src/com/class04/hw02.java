package com.class04;

import java.util.Scanner;

public class hw02 {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Hey welcome to DMV. Please provide your age below.");
	int age = sc.nextInt();
	if(age>=18) {
		System.out.println("I can give you driver license");
	}else {
		System.out.println("You need to be 18 and older to get driver license"
				+" get a learners permit.");
	}

	}

}
