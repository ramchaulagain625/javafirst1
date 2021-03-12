package com.class06;

import java.util.Scanner;

public class Hw1day06 {

	public static void main(String[] args) {
		//System.out.println("Please provide your country name!!");
		Scanner input;
		String country, language;
		input = new Scanner(System.in);
		//country = input.nextLine();
		
		String ans=input.nextLine();
	    if(ans.equals("not")){
	      System.out.print("Today you will be learning Manual testing");
	    }else{
	      System.out.print("Today you will be learning Java");
	    }
		
	}}
		
		
		
		
		
		
		
		
		
//		
//		switch (country.toLowerCase()) {
//		case "usa":
//			language = "English";
//			break;
//		case "nepal":
//			language = "Nepali";
//			break;
//		case "india":
//			language = "Indian";
//			break;
//		case "mexico":
//			language = "Spanish";
//			break;
//		case "china":
//			language = "Chinise";
//			break;
//			default:
//				language=" uhmmm, you speak  different language then mention here sorry";
//				
//
//		}
//System.out.println("You are from "+country+" your language is "+language+".");
//	}
//
//}
