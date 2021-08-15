package com.syntax.class03;

public class DoubleComparison {

	public static void main(String[] args) {
		
		double num=20.99;
		double num1=10.99;
		
		if (num>num1) {
			System.out.println("Double value "+num+" is larger than "+num1+".");
		}else {
			System.out.println();
		}
		
		System.out.println(" ------------------------ ");
		
		double temp = 75;		if (temp < 32) {
			System.out.println("Water will freeze with temperature " + temp);
		} else {
			System.out.println("Water will NOT freeze with temperature " + temp);
		}
	}
}
