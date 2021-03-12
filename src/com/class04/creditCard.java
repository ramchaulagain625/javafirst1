package com.class04;

import java.util.Scanner;

public class creditCard {

	public static void main(String[] args) {
		System.out.println("Hello ");
		System.out.println("Do you have a credit card?");
		System.out.println("If 'yes' please enter 1 otheewise enter any number.");
		Scanner scan = new Scanner(System.in);
		int ans = scan.nextInt();
		if(ans==1) {
			System.out.println("What is the balanceof the card ?");
			int amt=scan.nextInt();
			if(amt<1000) {
				System.out.println("you can spend more.");
			}else {
				System.out.println("Pay off immediately");
			}

			
		}else {
			System.out.println("You can apply for credit card.");
		}
		System.out.println("Thank you.");
	}
	

}
