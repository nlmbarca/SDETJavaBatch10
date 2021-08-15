package com.syntax.class07;

import java.util.Scanner;

public class Lotterey {

	public static void main(String[] args) {
	
		/*
		 * we have a secret number (any number from 1 till 20)
		 * ask user to guess your secret number
		 * continue guessing a number UNTILL user enter your secret number
		 * once guessed lets say Congratulations you got it!
		 */
		
		Scanner in;
		int secretNumber, userNumber;
		secretNumber=15;
		
		in=new Scanner(System.in);
		
		do {
		System.out.println("Please guess your secret number from 1 to 20");
		userNumber=in.nextInt();
		}while(userNumber !=secretNumber);
		
		System.out.println("Congratulations you got it!");
		
	}

}
