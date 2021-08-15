package com.syntax.class04;

import java.util.Scanner;

public class AnotherExample {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Please enter your city");
		String city=input.nextLine(); //capturing String value
		
		System.out.println("Please enter temperature");
		double temp=input.nextDouble();
		System.out.println(temp);
	
		System.out.println("It is "+temp+" in "+city);
		
		
		
		

	}

}
