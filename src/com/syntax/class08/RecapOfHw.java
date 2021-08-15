package com.syntax.class08;

public class RecapOfHw {

	public static void main(String[] args) {

		int sumOfEven = 0;
		int sumOfOdd = 0;

		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				sumOfEven += i;
			} else {
				sumOfOdd += i;
			}
		}
		System.out.println("Summary of all even numbers from 1 to 100 is " + sumOfEven);
		System.out.println("Summary of all even numbers from 1 to 100 is " + sumOfOdd);
	}
}