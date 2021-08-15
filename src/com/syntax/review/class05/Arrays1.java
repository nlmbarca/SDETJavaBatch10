package com.syntax.review.class05;

public class Arrays1 {

	public static void main(String[] args) {
		
		int[]numbers=new int[5];
		
		for(int i=0; i<5; i++) {
			numbers[i]=i+1;
		}
		for(int i=0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		System.out.println("------------------------");
		for(int num:numbers) {
			System.out.println(num);
		}
	}

}
