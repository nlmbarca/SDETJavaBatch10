package com.syntax.class04;

public class Task2 {

	public static void main(String[] args) {

		double mortgageRate = 4.6;
		int mortgagePrice = 300000;

		if (mortgageRate > 4.5) {
			System.out.println("User will not buy a houseb " + mortgageRate);
		} else {
			System.out.println("I will consider buying");

			if (mortgagePrice > 200000) {
				System.out.println("Take a loan" + mortgagePrice);
			} else {
				System.out.println("You can pay cash " + mortgagePrice);
			}
		}

		System.out.println("--------------SAME TASK DIFFERENT WAY OF DOING IT---------------------------");

		if (mortgageRate < 4.5) {

			System.out.println("I will consider buying");

			if (mortgagePrice > 200000) {
				System.out.println("Take a loan" + mortgagePrice);
			} else {
				System.out.println("You can pay cash" + mortgagePrice);
			}

		} else {
			System.out.println("I wont buy a house with rate " + mortgageRate);

		}

	}

}
