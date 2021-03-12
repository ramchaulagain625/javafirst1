package com.class04;

import java.util.Scanner;

public class hwClass0401 {

	public static void main(String[] args) {
	//Homework1
		System.out.println("----------------hw1--------------");
		Scanner sc = new Scanner(System.in);
		System.out.println("Hello , How can i help you today? ");
		String input1=sc.nextLine();
			System.out.println(" you want to talk "+ input1 + "  How much loan you want?");
			int loan=sc.nextInt();
			if(loan<=200000) {
				System.out.println("You are qualify for your loan");
			}else {
				System.out.println("Sorry we are unable give a loan this time,please! "
						+ "visit next time . Thank you");
				
			}

	}

}
