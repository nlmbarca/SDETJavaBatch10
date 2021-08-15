package com.syntax.class10;

public class TwoDArrayExamples {

	public static void main(String[] args) {
		
		String[][] food= {
				{"borcht","vareniki","draniki"},
				{"kebabs","palaw","mantu"},
				{"tacos","burrito","queso","salsa"},
				{"pasta","pizza","bread","risotto"}
		};
		
		System.out.println(food[2][1]);
		food[3][2]="cheese"; //how to reassign
		System.out.println(food[3][2]);
		
		System.out.println("----- HOW TO FIND TOTAL NUMBERS OF ROWS AKA ARRAYS -----");
		System.out.println(food.length); //4 ---> total # of rows aka arrays
		
		System.out.println("----- HOW TO FIND TOTAL ELEMENTS OF ARRAYS FROM EVERY ROW ------");
		int sizeOf1Array=food[0].length;
		System.out.println(sizeOf1Array);
		
		int sizeOf2Array=food[1].length;
		System.out.println(sizeOf1Array);
		
		int sizeOf3Array=food[2].length;
		System.out.println(sizeOf3Array);
		
		int sizeOf4Array=food[3].length;//3
		System.out.println(sizeOf4Array);
		
		System.out.println("------- how to get all values from 2D array with nested for loop -----------");
		
		for(int i=0; i<food.length; i++) { //iterates over rows/arrays
			for(int j=0; j<food[i].length; j++) {//iterate over columns/each element from an array
				
				System.out.println(food[i][j]);
			
		}
	}
	}
}
