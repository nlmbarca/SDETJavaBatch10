package com.syntax.class02;

public class ArithematicOperators {

	public static void main(String[] args) {
		
		/*
		 * +, -, *, /, %
		 */
		
		int num1=90;
		int num2=10;
		
		// syso+ctrl+space is a shortcut
		
		System.out.println(num1+num2);
		System.out.println(num1-num2);
		System.out.println(num1*num2);
		System.out.println(num1/num2);
		
		int sum=num1+num2;
		System.out.println(sum);
		
		int sub=num1-num2;
		System.out.println(sub);
		//up to 16 numbers
		double n1=2.99;
		double n2=3.05;
		
		double total=n1+n2;
		System.out.println(total);
		
		double resultOfDivision=n1/n2;
		System.out.println(resultOfDivision);
		//up to 6-7 numbers
		float f1=2.99f;
		float f2=3.05f;
		
		float floatDivison=f1/f2;
		System.out.println(floatDivison);
		
		//modulus % 
		int number1, number2, mod;
		
		number1=10;
		number2=6;
		
		mod=number1%number2;
		System.out.println(mod);
		
		//what is the result?
		int guess; //declared the variable
		
		guess=20+20*2;//assign the value to variable guess
		System.out.println(guess);
		
		guess=2*2+(4+10);//reassign the value to variable guess
		System.out.println(guess);
		
		
		

	}

}
