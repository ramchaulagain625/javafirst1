package com.class05;

import java.util.Scanner;

public class ClassWork1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your name");
		String name = input.next();
		System.out.println(name+ " enter your age");
		int age = input.nextInt();
		if(age<1) {
			System.out.println("I think you not born yet or you just born.ssa");
		}else if(age>=1&& age<3) {
			System.out.println(name +" you are baby");
		} else if(age>=3 && age<5) {
			System.out.println(name+ " you are still baby");
		}else if(age>=5 && age<=12) {
			System.out.println(name+ " you are kid");
		}else if(age>=13 && age<=19) {
			System.out.println(name+ " you are teenager");
	}else 
		System.out.println(name + " you are adult.");
	}
}
