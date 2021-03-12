package com.class08;

import java.util.Scanner;

public class ExampleAnotherWay {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int money;
		money=sc.nextInt();
		while(money!=3) {
			if(money>3) {
				System.out.println("Please give me less money");
			}else {
				System.out.println("please give me more money");
				money=sc.nextInt();
			}
		}
		System.out.println("Thank you for buying soda");

	}

}
