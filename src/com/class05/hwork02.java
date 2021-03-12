package com.class05;

import java.util.Scanner;

public class hwork02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your first number");
		int a = input.nextInt();
		System.out.println("Please enter your Second number");
		int b = input.nextInt();
		System.out.println("Please enter your Third number");
		int c = input.nextInt();
		
		int result = 0;
		if(a>b || b>c ||a>c ||c>a ||b>a) {
			if(a>b && a>c) {
				result =a;
			}else if(b>a && b>c){
				result=b;
			}else {
				result=c;
		}
			}
			System.out.println("Here is the gretest among three "+ a+" "+ b +" "+ c + " is "+result );
		}
		

	}


