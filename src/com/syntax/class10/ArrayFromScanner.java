package com.syntax.class10;

import java.util.Scanner;

public class ArrayFromScanner {

	public static void main(String[] args) {

		/*
		 * Using scanner create an array of integer elements;
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("How many elements do you want to store inside an array");
		int size = scan.nextInt();

		int[] numbers = new int[size];

		for (int i = 0; i < size; i++) {
			
			System.out.println("Enter your numbers for index "+i);
			
			numbers[i] = scan.nextInt();

		}
		
		System.out.println(" DISPLAY ALL NUMBERS FROM AN ARRAY ");
		
		for(int no:numbers) {
			System.out.print(no+" ");
		}

	}

}
