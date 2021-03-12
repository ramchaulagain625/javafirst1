package com.class11;

public class ClassWork02 {

	public static void main(String[] args) {
		String [][]cars= {{"Ram","Ford","Chevi","Tesla"},{"Mercedes","Audi","BMW"},
		{"Hyundai","kia"},{"lamborghini","Ferrari","Maserati"}
		};
	
	for(int i=0;i<cars.length;i++) {
		for(int j=0;j<cars[i].length;j++) {
			System.out.println(cars[i][j]);
		}
		System.out.println();
	}
	System.out.println("________________Another Way______________Forloop________");
	
	for(String []car:cars) {
		for(String name:car) {
			System.out.println(name);
		}
		System.out.println();
	}
	
	System.out.println("__________example 2________________________");
	String grocery[][]= { {"Cucumber","Carrot","Cauliflower","Oakra"},{
		"Apple","Banana","Orange","Mango","Peach","Strawberry"},{"milk","yogurt","Cream"},
			{"Laddu","Peda"}
};
	
	
	for(int i=0;i<cars.length;i++) {
		for(int j=0;j<grocery[i].length;j++) {
			System.out.println(grocery[i][j]);
		}
		System.out.println();
	}
	System.out.println("________________Another Way______________Forloop________");
	

	for(String []name1:grocery) {
		for(String name:name1) {
			System.out.println(name);
		}
		System.out.println();
	}
	
	}

}
