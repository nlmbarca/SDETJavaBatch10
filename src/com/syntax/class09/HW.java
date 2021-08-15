package com.syntax.class09;

public class HW {

	public static void main(String[] args) {
		System.out.println("TASK 1");
		String[] animalsOne = { "Tiger", "Seal", "Zebra", "Dog", "Cat", "Eagle" };

		for (int i = 0; i < animalsOne.length; i++) {
			System.out.println(animalsOne[i]);
		}

		System.out.println("OTHER WAY OF TASK 1");
		for (String animal : animalsOne) {
			System.out.println(animal);
		}

		System.out.println("TASK 2 REVERSE");
		double[] d = { 1.02, 1.03, 1.04 };
		for (int i = d.length - 1; i >= 0; i--) {
			System.out.println(d[i]);
		}

		System.out.println("TASK 3 FINDING SUM");

		int[] numbers = { 10, 20, 30, 40 };

		int sum = 0;

		for (int i = 0; i < numbers.length; i++) {
			sum = sum + numbers[i];
		}
		System.out.println("sum is " + sum);

		System.out.println("TASK 3 USING ENCHANCED FOR LOOP TO FIND SUM");
		sum = 0;

		for (int num : numbers) {

			sum += num;
		}
		System.out.println(sum);

		System.out.println("TASK 4 FINDING LARGEST NUMBER");
		int[] numberz = { 10, 20, 100, 50, 222 };
		int max = numberz[0];

		for (int i = 1; i < numberz.length; i++) {
			if (numberz[i] > max) {
				max = numberz[i];
			}
		}
		System.out.println("The largest number is:" + max);

		System.out.println(" TASK 4 USING ENCHANCED FOR LOOP");

		max = numberz[0];

		for (int nn : numberz) {
			if (nn > max) {
				max = nn;
			}
		}
		System.out.println(max);
	}

}
