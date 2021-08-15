package com.syntax.class03;

public class HW1 {

	public static void main(String[] args) {

		// Create a Java program and declare int variable that will hold a month. Based
		// on the value of the variable your program should print the name of the month.

		int month = 12;

		if (month == 1) {
			System.out.println("Janurary");
		} else if (month == 2) {
			System.out.println("Feburary");
		} else if (month == 3) {
			System.out.println("March");
		} else if (month == 4) {
			System.out.println("April");
		} else if (month == 5) {
			System.out.println("May");
		} else if (month == 6) {
			System.out.println("June");
		} else if (month == 7) {
			System.out.println("July");
		} else if (month == 8) {
			System.out.println("August");
		} else if (month == 9) {
			System.out.println("September");
		} else if (month == 10) {
			System.out.println("October");
		} else if (month == 11) {
			System.out.println("November");
		} else if (month == 12) {
			System.out.println("December");
		} else {
			System.out.println("This Number is invalid because its not a month");
		}
		System.out.println("----------------------------------------------");

		int num = 20;

		if (num < 0) {
			System.out.println("The number is negative");
		} else if (num > 0) {
			System.out.println("The number is postive");
		} else {
			System.out.println("The number is 0");
		}
		System.out.println("-----------------------------------------------");
		
		int num3=10;
		
		if (num3%2==0) {
			System.out.println("The number is even");
		}else {
			System.out.println("The number is odd");
		}
		
		/*
		 * Reminder Example
		 */
		
		int i=10/3;
		System.out.println(i);
		
		int mod=10%3;
		System.out.println(mod); //1
	}

}
