package com.syntax.review.class05;

public class NestedLoops3 {

	public static void main(String[] args) {

		/*
		 * 12345
		 * 12345
		 * 12345
		 * 12345
		 */
		for (int j = 0; j < 4; j++) {
			for (int i = 1; i < 10; i++) {
				if(j==1 && i==5) {
					continue;
				}
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
