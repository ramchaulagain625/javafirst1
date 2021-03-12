package com.class08;

import java.util.Scanner;
/*Write a program to ask a user to enter
 item they want to buy and the price of that item. 
 Every time user enters money, accumulate the amount and 
 tell the user how much is left to pay off. If user give more 
 money program should return a change. Whenever a 
 user done with payments program should say 
 “Thank you for shopping!”
*/
public class ClassWorkFour {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	
	
	String item;
	int price,amount,reminder;
	int sum=0;
	System.out.println("Please enter the item and price of that item");
	item=sc.nextLine();
	System.out.println("Please enter the price of "+item);
	price=sc.nextInt();
	System.out.println("Please pay for "+item);
	do {
	
	amount=sc.nextInt();
	sum+=amount;
	if(sum<price) {
		reminder=price-sum;
		System.out.println("Please give me more money "+reminder);
	
	}else if(price<sum) {
		reminder=sum-price;
		System.out.println("Here is your change "+ reminder);
		break;
	}
	}while(price!=sum);
	System.out.println("Thank you for shopping");
	
	
	
	
	
	
	

}
}