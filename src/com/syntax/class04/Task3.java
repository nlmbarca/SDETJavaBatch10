package com.syntax.class04;

public class Task3 {

	public static void main(String[] args) {

		/*
		 * Create a Java program and call it a Donor. In order to be eligible to donate
		 * your blood you have to be 18 years old. Also once you identify age
		 * eligibility then we have to see if person matches weight requirements. If
		 * person weight it more than 110 lbs then he/she is eligible, otherwise we
		 * cannot accept such a patient.
		 */

		int age = 17;
		double weight = 120;

		if (age >= 18) {
			System.out.println("Lets check if you meet all other requirements");
			if (weight > 110) {
				System.out.println("you can donate");
			} else {
				System.out.println("you can not donate ");
			}
		} else {
			System.out.println("Sorry, for this time you are not eligible for a blood donation");
		}

	}

}
