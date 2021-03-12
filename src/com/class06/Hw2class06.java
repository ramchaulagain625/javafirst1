package com.class06;

import java.util.Scanner;

public class Hw2class06 {

	public static void main(String[] args) {
		System.out.println("Please enter your valid Grade. Example:A,B... ");
	Scanner input;
	String result;
	char grade;
	input=new Scanner(System.in);
	grade=input.next().charAt(0);
	switch(grade) {
	case 'A':
		result="the Excellent";
		break;
	case 'B':
		result="Good";
		break;
	case 'C':
		result="Average";
		break;
	case 'd':
		result="Bad";
		break;
	default:
		result="Not Acceptable";
	
	}
System.out.println("Your grade is "+grade+" and you are "+result+" student.");
	}

}
