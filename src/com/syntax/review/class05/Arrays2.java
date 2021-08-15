package com.syntax.review.class05;

import java.util.Scanner;

public class Arrays2 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please Enter the size of the Arrays");
		int size=scan.nextInt();
		int[] numbers=new int[size];
		
		for(int i=0; i<size; i++) {
			System.out.println("Please Enter the numbers");
			numbers[i]=scan.nextInt();
			
		}
		System.out.println("------------------------");
		
		for(int i=0; i<size; i++) {
			System.out.println(numbers[i]);
		}

	}

}
