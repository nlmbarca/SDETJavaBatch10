package com.syntax.class06;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String sale;
		double price;
		int discount = 0;
		double finalPrice;

		System.out.println("Is there a sale now");
		sale = in.nextLine();

		if (sale.equals("yes")) {
			System.out.println("What would you like to purchase");
			String item = in.nextLine();

			System.out.println("What is the price for item?");
			price = in.nextDouble();

			if (price >= 1 && price <= 20) {
				discount = 10;
			} else if (price > 20 && price < 100) {
				discount = 20;
			} else if (price >= 100 && price < 500) {
				discount = 30;
			} else if (price >= 500) {
				discount = 50;
			}

			finalPrice =price-(price * discount / 100);

			System.out.println("After discount " + discount + "% the price of the item "+item+" reduced from $" + price + " to "
					+ finalPrice);

		} else {
			System.out.println("Sorry no shopping today");
		}

	}

}
