package com.syntax.class05;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {

		Scanner variable = new Scanner(System.in);
		System.out.println("Please enter 1-7 for the days");
		int day = variable.nextInt();
		
		if (day == 1 || day == 2 || day == 3 || day == 4 || day == 5) {
			System.out.println("It is a weekday");
		} else if (day == 6 || day == 7) {
			System.out.println("It is a weekend");
		} else {
			System.out.println("Invalid day");
		}
		
		System.out.println("------------ANOTHER WAY OF DOING IT-----------------------------");
		
		Scanner input=new Scanner(System.in);
	
		System.out.println("Please input day of week (1-7)");
		day = input.nextInt(); // here you are reassigning day because you used it previously
		
		if (day >=1 && day <6) {
			System.out.println("It’s a weekday");
		} else if (day == 6 || day == 7) {
			System.out.println("It’s a weekend");
		} else {
			System.out.println("Invalid day");
		}
	}
}
