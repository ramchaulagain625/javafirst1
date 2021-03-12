package com.class07;

public class hw1class07 {

	public static void main(String[] args) {
		int sumEven = 0 ,sumOdd=0;
		for(int i=0;i<=50;i+=2) {
			sumEven +=i;
		}
			System.out.println("Sum of Even number less then 50 is "+sumEven);
			for(int i=1;i<=50;i+=2) {
				sumOdd+=i;
			}
			System.out.println("Sum of Even number less then 50 is "+sumOdd);

	}

}
