package com.syntax.review.class04;

public class NestedForLoop2 {

	public static void main(String[] args) {
		
		for(int i=0;i<23;i++) {
			System.out.println(i);
			for(int j=0;j<2;j++) {
				System.out.println(j);
				for(int k=0;k<2;k++) {
				System.out.println(k);
				}
			}
		}

	}

}
