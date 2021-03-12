package com.class09;

public class secondTestClass09 {

	public static void main(String[] args) {
		for(int i=1;i<=6;i++) {
			for(int j=0;j<=7;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
System.out.println("_________________________________________________");
	for(int i=1;i<=4;i++) {
		for(int j=1;j<=5;j++) {
			System.out.print(j);
		}
		System.out.println();
	}
	
	System.out.println("___________________________________________");
	
	for(int i=6;i>=1;i--) {
		for(int j=6;j>=i;j--) {
			System.out.print(j);
		
		}
		System.out.println();
	}
	
	System.out.println("_______________________________________________");
	for(int i=1;i<=5;i++) {
		for(int j=1;j<=5;j++) {
			System.out.print(i+" ");
		}
		System.out.println();
		}
	
	System.out.println(" __________________________________________________");
	
	for(int i=5;i>=1;i--) {
		for(int j=5;j>=i;j--) {
			System.out.print("* ");
		}
		System.out.println();
	}
	
	
	
	System.out.println("______________________________");
	
	
	for(int a=1; a<=5;a++) {
		for(int b=1; b<=a; b++) {
			System.out.print("* ");
		}
		System.out.println();
	}
	}

}
