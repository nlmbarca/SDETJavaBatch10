package com.syntax.review.class02;

public class TypeCasting {

	public static void main(String[] args) {
		//Example of narrowing
		double number1=20.6;
		int number2=(int)number1;
		System.out.println(number2); //answer is 20
		number2=45;
		//widening
		number1=number2;
		System.out.println(number1); //answer is 45.0
		
		int number3=10;
		int number4=4;
		System.out.println(number3/number4); //answer is 2 becuase its not double and show decimals
		
		double number5=10;
		double number6=4;
		System.out.println(number5/number6); //answer is 2.5 because it can give you decimal places
		System.out.println(10.0/4); //answer is 2.5 because its 10.0 and it makes it 4.0 s o
		
		
	}

}
