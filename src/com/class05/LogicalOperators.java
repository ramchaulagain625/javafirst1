package com.class05;

import java.util.Scanner;

public class LogicalOperators {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your first number");
		int a = input.nextInt();
		System.out.println("Please enter your Second number");
		int b = input.nextInt();
		System.out.println("Please enter your Third number");
		int c = input.nextInt();
		
		int result;
		if ((a>b)&&(a>c)) {
			result = a;
			
		}else if((b>a)&&b>c) {
			result =b;
		}else 
			result = c;
			
		System.out.println(result + " Is big number among three number");
	}

}
