package com.syntax.class09;

public class Task2 {

	public static void main(String[] args) {
		
		String[] cars= {"Honda","BMW","Lambo","Telsa","Ayudi","Maybach"};
		
		for(int i=0; i<cars.length; i++){
			System.out.println(cars[i]);
		}
		
		System.out.println(" ------- advance for loop/ ehnaced for loop/ for each loop ------");
		
		for(String car:cars) {
			
			System.out.println(car);
		}
		
		System.out.println(" -------- NUMBERS ARRAY -------- ");
		
		int[] numbers= {100,20,67,45,90,23};
		
		for(int n=0; n<numbers.length; n++) {
			System.out.println(numbers[n]);
		}
		
		System.out.println(" ------- advance for loop/ ehnaced for loop/ for each loop ------");
		
		for(int num:numbers) {
			System.out.println(num);
		}
		
		System.out.println(" ---------- CHAR ARRAY ----------- ");
		
		char[]grades= {'A','B','C','D','E','F'};
		
		for(char grade:grades) {
			System.out.print(grade+" ");
		}
		

	}

}
