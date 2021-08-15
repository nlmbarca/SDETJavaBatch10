package com.syntax.class10;

public class HW {

	public static void main(String[] args) {
		
		String[][]cars= {
				{"Ford","Honda","Tesla"},
				{"Mercedes","Audi","BMW","Porsche"},
				{"Hyundai","Kia","Chevrolet"},
				{"Lambo","Maserati","Ferrari"}
				};
		
		for(int i=0; i<cars.length; i++) {
			for(int j=0; j<cars[i].length; j++) {
				System.out.println(cars[i][j]);
			}
		}
		
		System.out.println("------------------ ANOTHER WAY ----------------------");
		
		for(String[] car:cars) {
			for(String c:car) {
				System.out.println(c+" ");
			}
			System.out.println();
		}
	}
}