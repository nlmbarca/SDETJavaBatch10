package com.syntax.class10;

public class HW6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 1, 4, 3, 6, 8, 2, 5 };

		int what = array[0];

		for (int index = 0; index < array.length; index++) {

		       if (array[index] > what) {

		                  what = array[index];

		        }

		}

		System.out.println(what);

		

  	}

}
