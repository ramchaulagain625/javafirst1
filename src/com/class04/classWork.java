package com.class04;

public class classWork {

	public static void main(String[] args) {
		boolean diploma = false;
		double grade = 2.5;

		if (diploma) {
			System.out.println("Congulation");
			if (grade >= 3.5) {
				System.out.println("You are eligible for scholarship");
			} else {
				System.out.println("You should have studied harder");
			}
		} else {
			System.out.println("Study and get diploma");
		}
		System.out.println("-----------------------------case 2-------------------");
		double mortageRate = 3.5;
		double mortagePrice = 20000;
		if (mortageRate<4.5) {
			System.out.println("mortage rate is  "+mortageRate+" I will buy a home");
			if (mortagePrice>200000) {
				System.out.println("mortage rate is  "+mortagePrice+"  I need home loan i dont have that much money");
			}else {
				System.out.println(mortagePrice+" I will pay cash");
			}
		}else {
			System.out.println("mortage rate is  "+mortageRate+" I m sorry im not buying home");
		}
	}

}
