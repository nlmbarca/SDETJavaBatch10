package com.syntax.class04;

import java.util.Scanner;

public class HW2 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("If you are 18 and older you will get your drivers license, How old are you?");
		int age=input.nextInt();
		
		if (age>=18) {
			System.out.println("You will get your license");
		}else {
			System.out.println("You need to go get your learners permit.");
		}

	}

}
