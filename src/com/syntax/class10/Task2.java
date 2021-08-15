package com.syntax.class10;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("How many countries you want to add?");
		int size = in.nextInt();

		String[] country = new String[size];

		for (int i = 0; i < size; i++) {
			System.out.println("Please enter name of country in index " + i);
			country[i] = in.next();

		}
		System.out.println();
		System.out.println(" Countries:");
		String str = "";

		for (String s : country) {

			switch (s) {
			case "USA": {
				str = "Capital of " + s + " is Washincton DC";
				break;
			}
			case "Russia": {
				str = "Capital of " + s + " is Moscow";
				break;
			}
			case "France": {
				str = "Capital of " + s + " is Paris";
				break;
			}
			case "England": {
				str = "Capital of " + s + " is London";
				break;
			}
			default: {
				str = "Capital of " + s + " is unknown";
				break;
			}

			}

			System.out.println(str);

		}

		System.out.println(" ----- ");

		str = "";
		for (int i = 0; i < size; i++) {

			if (country[i].equals("USA")) {
				str = "Capital of " + country[i] + " is Washincton DC";
			} else if (country[i].equals("Russia")) {
				str = "Capital of " + country[i] + " is Moscow";
			} else if (country[i].equals("France")) {
				str = "Capital of " + country[i] + " is Paris";
			} else if (country[i].equals("England")) {
				str = "Capital of " + country[i] + " is London";
			} else {
				str = "Capital of " + country[i] + " is unknown";
			}
			System.out.println(str);

		}

	}

}