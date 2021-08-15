package com.syntax.class04;

import java.util.Scanner;

public class HW3 {

	public static void main(String[] args) {

		Scanner data = new Scanner(System.in);
		System.out.println("Please enter your city");
		
		String city = data.nextLine();
		System.out.println("What is the citys temperature");
		
		Double fahrenheit = data.nextDouble();
		double cel = (fahrenheit-32 * .5556);
		System.out.println("The temperature in the city " + city + " is " + cel);
	}

}
