package com.class06;

import java.util.Scanner;

public class Hw03class06 {

	public static void main(String[] args) {
		System.out.println("How can i help you?");
		System.out.println("if you like to add mention 'add'"
				+ "subtract 'sub' divide 'div' multiply 'multi' ");
		
		Scanner input;
		int num1,num2, result;
		String calc;
		input =new Scanner(System.in);
		char c = input.next().charAt(0);
		calc= input.nextLine();
		System.out.println("Please provide your first number");
		num1=input.nextInt();
		System.out.println("Please provide your second number");
		num2=input.nextInt();
		switch(calc.toLowerCase()) {
		case "add":
			result=num1+num2;
			break;
		case "sub":
			result=num1-num2;
			break;
		case "multi":
			result=num1*num2;
			break;
		case "div":
			result=num1/num2;
			break;
			default:
				result=0;
			
		} 
		System.out.println("Your number are "+num1+" and "+num2+" your result is "+result);
	}

}
