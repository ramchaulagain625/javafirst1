package com.class03;

public class CompoundOperator {
	
	public static void main(String[] args) {
		int a= 500;
		a+=100;
		System.out.println(a);
		a-=67;
		System.out.println(a);
		int cakePiece =11;
		cakePiece/=4;
		System.out.println(cakePiece);
		int cake =25;
		
		cake%=7;
		System.out.println(cake);
		
		// casting in java 
		// we can convert lower to higher auto but not higher to 
		//lower.
		// byet -> short-> int->long->float-->double --> widening
		//double;float;long;int;short;byte--> narrowing
	}

}