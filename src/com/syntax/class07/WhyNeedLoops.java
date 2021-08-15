package com.syntax.class07;

public class WhyNeedLoops {

	public static void main(String[] args) {
		
		// I want to say hi 4 times
		
		System.out.println("hi");
		System.out.println("hi");
		System.out.println("hi");
		System.out.println("hi");
		
		int a=1;
		
		System.out.println(" ----------- Hello using if statment -------------");
		if(a<4) {
			System.out.println("Hello");
		}
		
		System.out.println(" ----------- Hello using while loop -------------");
		
		while(a<=4) {
			System.out.println("Hello");
			a++;
		}
		
		/* EXAMPLE OF INFINITE LOOP
		 * 
		 * while(a<=4) {
			System.out.println("Hello");
		}
		 */
		
		
	}

}
