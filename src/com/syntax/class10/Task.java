package com.syntax.class10;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double sum = 0.0;
		double[] array;

		System.out.println("How many elements do you want to store inside an array");
		int size = scan.nextInt();

		array = new double[size];

		for (int i = 0; i < size; i++) {

			System.out.println("Enter your numbers for index " + i);
			array[i]=scan.nextDouble();
			sum+=array[i];

		}
		System.out.println("Total: "+sum);

	}
}
