package com.syntax.class07;

import java.util.Scanner;

public class HW2 {

	public static void main(String[] args) {

		/*
		 * Ask user to pay for a candy keep asking use to pay for candy until entered
		 * price is not equal to 3
		 * 
		 * if entered value is more than 3 --> please give less money otherwise -->
		 * please give more money
		 * 
		 * after user got a write amount print"Please enjoy your candy
		 */
		
		int candyPrice = 3;
		int userValue;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please pay for your candy");

		do {	
			userValue = scan.nextInt();
			if (userValue > 3) {
				System.out.println("Please give less money");
			} else if (userValue < 3) {
				System.out.println("Please give more money");
			}
		} while (userValue != candyPrice);
		System.out.println("Enjoy your candy");
	}

}
