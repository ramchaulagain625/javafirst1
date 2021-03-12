package com.class06;

import java.util.Scanner;

public class AnuExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean sale=true;
		  if(!sale) {
			  System.out.println("I am not going for shopping");
		  }else {
			  System.out.println("What items are on sale?");
			    String items=sc.next();
			  System.out.println("What is the price?");
			      double price1, price2;
			      price1=sc.nextDouble();
			     
			      if(price1<=10) {
			    	  price2=0.05*price1;
			      }else if(price1>10 && price1<=100) {
			    	  price2=0.1*price1;
			      }else if(price1>=101 && price1<=500) {
			    	  price2=0.2*price1;
			      }else {
			    	  price2=0.3*price1;
			      }
			    System.out.println("The final price is :"+price2);
			 
		  }
	}

}
