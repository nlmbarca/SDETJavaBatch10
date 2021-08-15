package com.syntax.class05;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {

		Scanner value = new Scanner(System.in);

		System.out.println("Hey how tall are you?");
		int height = value.nextInt();

		if (height < 60) {
			System.out.println("Short(under 60 inches)");
		} else if (height >= 60 && height <= 72) {
			System.out.println("Medium(between 60-72 inches)");
		} else if (height >= 72) {
			System.out.println("Tall(over 72 inches)");
		}

	}

}
