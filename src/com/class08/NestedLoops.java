package com.class08;

public class NestedLoops {

	public static void main(String[] args) {
		for(int i=1;i<3;i++) {
			System.out.println("Im outer loop");
			for(int j=1;j<=3;j++) {
				System.out.println("I m inner loop");
			}
		}
	}

}
