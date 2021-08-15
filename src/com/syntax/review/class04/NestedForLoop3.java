package com.syntax.review.class04;

public class NestedForLoop3 {

	public static void main(String[] args) {

		for (int i = 0; i < 2; i++) {

			for (int j = 0; j < 2; j++) {

				for (int k = 0; k < 3; k++) {
					System.out.println(i+" "+j+" "+k);
				}
			}
		}

	}

}
