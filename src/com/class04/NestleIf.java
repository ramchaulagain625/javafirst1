package com.class04;

public class NestleIf {

	public static void main(String[] args) {
		boolean complete = true;
		int score =90;
		if(complete) {
			if(score>90) {
				System.out.println("You are doing Great job");
			} else if(score>80) {
				System.out.println("You doing Good ");
				
			} else if(score>70) {
				System.out.println("Please study hard you almost there");
			}else {
				System.out.println("You need to do Very Very  hard job53");
			}
			
			
		}else {
			System.out.println("please complete your assignment on time ");
		}

	}

}
