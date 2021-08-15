package com.syntax.review.class05;

public class Arrays {

	public static void main(String[] args) {
		
		int number=10;
		String name="Nicolas";
		String name1="Ortuno";
		/*
		 * limitation of arrays we can store only one value at a time in a variable
		 * if we try to store more values previous values are overwritten
		 * to overcome these issues we use Arrays
		 */
		
		String[] names=new String[120];
		names[0]="Nico";
		names[2]="O";
		System.out.println(names[0]);
	
	}

}
