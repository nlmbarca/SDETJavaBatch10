package com.syntax.class02;

public class Recap {

	public static void main(String[] args) {

		byte b = 1;
		short s = 10;
		int i = 100;
		long l = 10000000000l;
		float f = 10.99f;
		double d = 100.99;

		char c = 'N';
		boolean bool = false;

		System.out.println(d);

		// how to change a value of the variable?

		// int i=200; we cannot declare same variable twice

		i = 200; // reassign value
		bool = true;

		System.out.println(bool);

		// can i do this?

		int number = i;

		System.out.println(number);

		number = 500;

		System.out.println(number);

		// number=1.99; error: type mismatch ! Why - variable number can hold integer
		// type of values

		float num = 1.99f;

		/*
		 * to format your code
		 *  Mac:cmd+shift+f 
		 * windows:ctrl+shift+f
		 */

	}

}
