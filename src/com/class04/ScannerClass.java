package com.class04;

import java.util.Scanner;

public class ScannerClass {
	 public static void main(String[] args) {
	        System.out.println("please enter your 1 number");
	       
	        Scanner scanner = new Scanner(System.in);
	       
	        System.out.println("Please enter your first name");
	       String a = scanner.next();
	       System.out.println("please enter your last name");
	       String b =scanner.next();
	     
	       System.out.println("Hello "+a+" "+b + " how old are you?");
	       int age = scanner.nextInt();
	       System.out.println("Only "+age+" years old you are now.");
	       System.out.println("What types of food you like? ");
	       String food =scanner.next();
	       System.out.println("oh you like "+food+" food.  ok; nice to talk to you. bye bye.");
	       
	        }
}
