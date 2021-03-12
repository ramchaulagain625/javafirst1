package com.class04;

import java.util.Scanner;

public class WorkedYears {

	public static void main(String[] args) {
		System.out.println("Hello, Please provide me your years of service");
		Scanner scan = new Scanner(System.in);
		int year = scan.nextInt();
		if(year>=5) {
			System.out.println("you are eligible for bonus");
System.out.println("What is your salary?");
			int salary=scan.nextInt();
			
			if(salary>=50000) {
				System.out.println("You are eligible for $5000 bonus.");
			}else {
				System.out.println("You are eligible for $3000 bonus.");
			}
		}else {
			System.out.println("sorry may be next year");
		}
	}

}
