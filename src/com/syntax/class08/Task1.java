package com.syntax.class08;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {

		System.out.println("------------ TASK 1 -----------------");

		for (int i = 0; i <= 50; i++) {

			if (i % 3 == 0) {
				continue;
			}
			System.out.print(i + " ");
		}

		System.out.println("------------ TASK 2 -----------------");

		String answer;

		Scanner scan = new Scanner(System.in);

		do {
			System.out.println("Would you like to apply for credit card");
			answer = scan.nextLine();
			if (answer.equalsIgnoreCase("Yes")) { //this ignores casing so the way you spell yes anyway its still good
				break;
			}
		} while (true);
		System.out.println("Lets go!");

	}
}
