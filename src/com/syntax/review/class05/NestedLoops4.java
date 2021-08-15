package com.syntax.review.class05;

public class NestedLoops4 {

	public static void main(String[] args) {
		/*
		 * 11111
		 * 22222
		 * 33333
		 * 44444
		 * 55555
		 */
		/*
		 * 54321
		 * 54321
		 * 54321
		 * 54321
		 */
		for(int j=1; j<=5; j++) {
		for(int i=0; i<5; i++) {
			System.out.print(j);
		}
		System.out.println();
		}
		System.out.println("---------------------- TASK 2 ---------------");
		for(int x=0; x<4; x++) {
		for(int z=5; z>0; z--) {
			System.out.print(z);
		
	}
		System.out.println();
	}
}
}
