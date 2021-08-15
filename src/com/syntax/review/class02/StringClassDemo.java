package com.syntax.review.class02;

public class StringClassDemo {

	public static void main(String[] args) {
		
		String name="Nicolas";
		String country="USA";
		//this is called concatination
		System.out.println(name+" "+country);
		int num1=10;
		int num2=20;
		//we will get 30 because they are numbers
		System.out.println(num1+num2);
		
		String strNumber="10";
		//will be 1010 because its not with a int
		System.out.println(num1+strNumber);
		//will be "Result of addition is 1020 because string+int+int=string
		System.out.println("Result of addition is "+num1+num2);
		// since its in (  ) its will prioritize it first
		System.out.println("Result of addition is "+(num1+num2));
		

	}
}
