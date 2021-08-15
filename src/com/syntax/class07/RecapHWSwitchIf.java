package com.syntax.class07;

import java.util.Scanner;

public class RecapHWSwitchIf {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double num1, num2, result = 0;
		char operator;
		String operation = null;

		System.out.println("Enter first number");
		num1 = scan.nextDouble();

		System.out.println("Enter arithmetic operator +,-,*,/");
		operator = scan.next().charAt(0);

		System.out.println("Enter second number");
		num2 = scan.nextDouble();

		// if (operator == '+' || operator == '-' || operator == '*' || operator == '/')
		// {
		if (operator == '+') {
			result = num1 + num2;
			operation = "Addition";
		} else if (operator == '-') {
			result = num1 - num2;
			operation = "Subtraction";
		} else if (operator == '*') {
			result = num1 * num2;
			operation = "Multiplication";
		} else if (operator == '/') {
			result = num1 / num2;
			operation = "Division";
		} else {
			System.out.println("Wrong arthmetic operator");
		}
		System.out.println("The result of " + operation + " " + num1 + " and " + num2 + " is " + result);
	}
}