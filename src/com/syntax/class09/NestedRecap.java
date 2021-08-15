package com.syntax.class09;

public class NestedRecap {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			System.out.println("Loop i");
			for (int j = 1; j < 4; j++) {
				System.out.println("Loop j");
			}
		}

		System.out.println("-------------- MULTIPLICATION TABLE --------------------");

		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.println(i + " X " + j + " = " + (i * j));
			}
			System.out.println("-------------");
		}

		System.out.println("--------------24 HOUR CLOCK-----------------");

		for (int i = 0; i <= 23; i++) {
			for (int j = 0; j <= 59; j++) {
				if (i < 10 && j < 10) {
					System.out.println("0" + i + ":0" + j);
				} else if (i >= 10 && j < 10) {
					System.out.println(i + ":0" + j);
				} else if (i < 10 && j >= 10) {
					System.out.println("0" + i + ":" + j);
				} else {
					System.out.println(i + ":" + j);
				}

			}
		}

		System.out.println("---------------BLAKES CODE 24 HOUR CODE-----------------");

		for (int a = 0; a <= 2; a++) {
			for (int c = 0; c < 10; c++) {
				if (a == 2 && c == 4) {
					break;
				}
				for (int d = 0; d < 6; d++) {
					for (int b = 0; b < 10; b++) {
						System.out.println(a + "" + c + ":" + d + "" + b);
					}
				}
			}
		}

		System.out.println("--------------SERGES 24 HOUR CODE------------------");

		String min = "", hour = "";

		for (int h = 0; h <= 23; h++) {

			for (int m = 0; m <= 59; m++) {

				if (h < 10) {
					hour = "0" + h;
				} else {
					hour = "" + h;
				}

				if (m < 10) {
					min = "0" + m;
				} else {
					min = "" + m;
				}

				System.out.println(hour + ":" + min);
			}
		}
		
		System.out.println("----------------- WHAT IS THE OUTPUT -----------------------");
		
		for(int i=0; i<=3; i++) {
			System.out.println("Outer loop "+i);
			for(int j=0; j<3; j++) {
				System.out.println("Inner loop "+j);
				break;
			}
			
			System.out.println("-------");
		}
		
		System.out.println("ANOTHER BREAK EXAMPLE");
		boolean boo=true;
		
		for(int i=1; i<3; i++) {
			System.out.println("Outer for loop");
			while(boo) {
				System.out.println("I am nested while loop");
				break;
			}
			System.out.println("!!!!!!!!!!!!!!!!!!");
		}

	}

}
