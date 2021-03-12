package com.class11;

import java.util.Scanner;

public class ArrayRecap {

	public static void main(String[] args) {
		Scanner scan;
		String[] array;
		scan=new Scanner(System.in);
		System.out.println("How many String elements you would like to store");
		int size= scan.nextInt();
		array=new String[size];
		for(int i=0;i<size;i++) {
			System.out.println("Please enter a String");
			array[i]=scan.next();
		}
		for(String arrays:array) {
			System.out.print(arrays+" ");
		}
		scan.close();
	}

}
