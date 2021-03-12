package com.class11;

public class TwoDimensionArray {

	public static void main(String[] args) {
		String [][] names= {{"MR","MRS","MS","MISS"},
				{"Smith","Jackson","Jackson","Obama"}};
		
		System.out.println(names[0][1]+" "+names[1][0]);
		System.out.println(names[0][0]+" "+names[1][3]);
		System.out.println(names[0][2]+" "+names[1][2]);
	  System.out.println(names[0][3]+" "+names[1][1]);
	System.out.println("_____________________________________________");
	
	
	String [][] NamesAndGrade= {{"Jack","John","Harry","Asel"},{"A","B","A","C"}
			
	};
	
	
	System.out.println(NamesAndGrade[0][1]+" "+NamesAndGrade[1][0]);
	System.out.println(NamesAndGrade[0][0]+" "+NamesAndGrade[1][3]);
	System.out.println(NamesAndGrade[0][2]+" "+NamesAndGrade[1][2]);
  System.out.println(NamesAndGrade[0][3]+" "+NamesAndGrade[1][1]);
	
	
	
	
	
	
	
	
	
	
	}

}
