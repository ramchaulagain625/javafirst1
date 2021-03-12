package com.class09;

public class firstTryClass09 {

	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			for(int j=0;j<=9;j++) {
				for(int k=0;k<=9;k++) {
					for(int l=0;l<=9;l++) {
						for(int m=0;m<=9;m++) {
							System.out.println(i+""+j+""+k+""+l+""+m);
						}
					}
				}
				
			}
		}
	
	System.out.println("____________________Next Example______________________________");
	
	for(int a=0;a<=23;a++) {
		for(int b=0;b<6;b++) {
			for(int c=0;c<=9;c++) {
				if(a<10) {
					System.out.println("0"+a+":"+b+""+c);
				}else
				    System.out.println(a+":"+b+""+c);
			}
		}
	}
	
	
	for(int i=1;i<=9;i++) {
		for(int j=1;j<=9;j++) {
			
			System.out.println(i+" * "+j+" = "+(i*j));
		}
	}
	
	
	
	
	}

}
