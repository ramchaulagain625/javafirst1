package com.class05;

import java.util.Scanner;

public class ClassWork03 {

	public static void main(String[] args) {
		int quize,midterm,finalScore;
		char grade;
		Scanner scan = new Scanner(System.in);
		System.out.println("please enter your quize score");
		quize=scan.nextInt();
		System.out.println("please enter your mid term score");
		midterm= scan.nextInt();
		System.out.println("please enter your final term score");
		finalScore=scan.nextInt();
		int avgScore;
		avgScore=(quize+midterm+finalScore)/3;
		if(avgScore>=90) {
			grade='A';
		} else if(avgScore>70 && avgScore<90) {
			grade ='B';
		} else if(avgScore<70 && avgScore>50) {
			grade = 'C';
			
		}else {
			grade = 'F';
			
		}
			
		System.out.println("You are "+ grade +" grade student");
	}

}
