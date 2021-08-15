package com.syntax.class11;

public class Recap {

	public static void main(String[] args) {

		int[][] twoDArray = { 
				{ 10, 20,},
				{ 1, 2, 3 },
				{ 100, 200, 300, 400 }
				};
		int howManyArrays = twoDArray.length;
		System.out.println(howManyArrays);//total number of rows
		
		System.out.println(twoDArray[2].length);//how to find the elements in each row
		System.out.println("-------ENCHANCED NESTED FOR LOOP----------");
		for(int[] arr:twoDArray) {
		for(int num:arr) {
			System.out.print(num+" ");
		}
		
		System.out.println();
		}
		System.out.println("-----------REG NESTED FOR LOOP-----------------");
		
		for (int r=0; r<twoDArray.length; r++) {
		    for (int c=0; c<twoDArray[r].length; c++){
		    	System.out.print(twoDArray[r][c]+" ");
		    }
		    System.out.println();
	}
	
}
}