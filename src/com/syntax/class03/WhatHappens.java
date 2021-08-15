package com.syntax.class03;

public class WhatHappens {

	public static void main(String[] args) {
		
		// int i=1.99; error
		
		int i=(int)1.99; //narrowing or explicit(MANUAL) casting aka bigger to smaller
		System.out.println(i); //1
		
		double d=100; //widening or implicit casting aka smaller to bigger
		System.out.println(d); //100.0
		
		byte b=(byte)128; //narrowing
		System.out.println(b);
		
		int num=20;
		int num1=3;
		
		System.out.println(num/num1);
		
		double num2=20;
		double num3=3; //conversion from int to double happens
		
		System.out.println(num2/num3); //dividing 2 double value
		
		float f=10.99f;
		double number=10.99;
		
		int t=100;
		
		//example
		int n1 = 20;
		int n2 = 3;	
		double dd = n1 / n2; //we divide 2 int values and only then result are storing in the double type
		System.out.println(dd);//6.0 because its still a int value even if you use double dd
		
		

	}

}
