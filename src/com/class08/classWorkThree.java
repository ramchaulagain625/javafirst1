package com.class08;

import java.util.Scanner;

public class classWorkThree {
	/*Write a program that reads a range of integers (start and end point), 
	 * provided by a user and then from that range prints the sum
	 *  of the even and odd integers.
     * 
	 */

	public static void main(String[] args) {
		System.out.println("please enter a number");
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int num2=sc.nextInt();
		int sumEven=0,sumodd=0;
		if(num<num2) {
			for(int i=num;i<num2;i++) {
				if(i%2!=0) {
					sumodd+=i;
				}else {
					sumEven+=i;
				}
				System.out.println("result odd "+sumodd);
				System.out.println("result even "+ sumEven);
			}
		} else {
			for(int i=num;i>num2;i--) {
				if(i%2!=0) {
					sumodd+=i;
				}else {
					sumEven+=i;
				}
			}
			System.out.println("result odd "+sumodd);
			System.out.println("result even "+ sumEven);
		}
		
		}
	
	}


