package com.class11;

import java.util.Scanner;

public class classWork01 {

	public static void main(String[] args) {
		double total=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("How many element you would like to store?");
		int size=sc.nextInt();
		double[] num=new double[size];
		for(int i=0;i<size;i++) {
			System.out.println("Please enter your double value");
			num[i]=sc.nextDouble();
			total +=num[i];
		}
		System.out.println(total);
	}

}
