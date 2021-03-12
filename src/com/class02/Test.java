package com.class02;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		System.out.println("hello ");
		System.out.println("Please provide me your number that you want add");
		Scanner sc= new Scanner(System.in);
		int x= sc.nextInt();
		int y= sc.nextInt();
		Test test= new Test();
		int add = test.add(x,y);
		test.result(add);
		test.result(add);
		test.sub(x, y);
		System.out.println(test.multi(x, y));
		System.out.println(test.div(x, y));
		
		int i = (int)(Math.random()*100);
		int j=(int)(Math.random()*100);
		for(i=0;i<10;i++) {
			System.out.println(i+"  i love java");
		for(j=0;j<1;j++) 
			System.out.println(j +  "  Hello ");
		}
	
	}
	public int add(int x,int y) {
		int add=x+y;
		return add;
	}
	public int sub(int x, int y) {
		int sub = x-y;
		return sub;
	}
	public int multi(int x,int y) {
		int multi =  x*y;
		return multi;
	}
	public int div(int x,int y) {
		int div = x/y;
		return div;
	}
	public void result(int add) {
	
		

		
		System.out.println("your answer is : "+ add);
		
	}

	
		
	


	
	
	
	
	
	
}
