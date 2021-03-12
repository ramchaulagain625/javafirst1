package com.class08;

public class ContinueKeyword {
	public static void main(String[] args) {
		for(int i= 1;i<=10;i++) {
			System.out.println("Hello");
			if(i==3) {
			continue;
			}
			System.out.println("I m inside the loop");
			
		
		}
		System.out.println("-----------------------------------------------------------------");
		for(int i=1;i<=10;i++) {
			//System.out.println("Here is the number betwn 1 to 10 except 5&6");
			if(i==5||i==6) {
				continue;
			}
			System.out.print(i+" ");
		}
		
		System.out.println("-----------------------------------------------------------------");
		for(int i=1;i<=40;i++) {
			if(i%4==0) {
				continue;
			}
			System.out.print(i+" ");
		}

	}	
}
