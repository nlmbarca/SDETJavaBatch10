package com.syntax.class05;

import java.util.Scanner;

public class HW3 {

	public static void main(String[] args) {

		Scanner scan;
		int num1, num2, num3, largest;

		scan = new Scanner(System.in);

		System.out.println("Please enter 3 distinct numbers");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		num3 = scan.nextInt();

		if (!(num1 == num2 && num2 == num3)) {

			if (num1 > num2) { // assuming num1 is larger than num2
				if (num1 > num3) {
					largest = num1;
				} else { // looking that num3 is larger than num1
					largest = num3;
				}
			} else { // num2 is larger than num1 num2>num1
				if (num2 > num3) {
					largest = num2;
				} else {
					largest = num3; // laooking into num3 is lrager than num2 num3>num2/
				}
			}
			System.out.println("The largest number is " + largest);
		}
	}
}
