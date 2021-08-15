package com.syntax.review.class02;

import java.util.Scanner;

public class IfElseConditions {

	public static void main(String[] args) {

		String storedUserName = "Nicolas";
		String storedPassword = "pass123";
		Scanner scan = new Scanner(System.in);

		System.out.println("Please Enter your UserName");
		String username = scan.nextLine();

		System.out.println("Please Enter your Password");
		String password = scan.nextLine();
		// == operator only works with primitive data types
		// for non primitive data types we should use equals method
		if (storedUserName.equals(username)) {
			System.out.println("Correct Username");
			if(storedPassword.equals(password)) {
				System.out.println("Password is also correct");
			}else {
				System.out.println("Username is correct but passwod is not");
			}
		}else {
			System.out.println("Wrong Username");
		}

	}

}
