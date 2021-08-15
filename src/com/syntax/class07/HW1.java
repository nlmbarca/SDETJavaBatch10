package com.syntax.class07;

public class HW1 {

	public static void main(String[] args) {
		
		/*
		 * HW TASK
		 * 
		 * Please find sum of even and odd numbers from 1 to 100
		 */
		
		int sumOfEven=0;
		int sumOfOdd=0;
		
		for(int i=1; i<=100; i++) {
			if(i%2==0) {
				sumOfEven+=i;
			}else {
				sumOfOdd+=i;
			}
		}
		System.out.println("Summary of all even numbers from 1 to 100 is "+sumOfEven);
		System.out.println("Summary of all even numbers from 1 to 100 is "+sumOfOdd);

	}

}
