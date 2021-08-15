package com.syntax.class10;

public class Task2DArrays {

	public static void main(String[] args) {
		System.out.println("----------- TASK 1 ----------");
		String[][] arrName = {
		        {"Mr", "Mrs", "Ms", "Miss"},
		        {"Smith", "Jordan", "Jackson", "Obama"}

		};
		System.out.println(arrName[0][1]+" "+arrName[1][0]);
		System.out.println(arrName[0][0]+" "+arrName[1][3]);
		System.out.println(arrName[0][2]+" "+arrName[1][2]);
		System.out.println(arrName[0][3]+" "+arrName[1][1]);
		
		System.out.println("----- HOW TO ACCESS ALL ELEMENTS FOR TASK 1 ------");
		
		for(int r=0; r<arrName.length; r++) {//outer loop iterates over rows
			
			for(int c=0; c<arrName[r].length; c++) {//inner loop iterates over columns
				System.out.print(arrName[r][c]);
			}
			
			System.out.println();
		}
		
		System.out.println(" ------------------- FOR EACH LOOP ----------------------- ");
		
		for(String[] arr:arrName) {
			for(String a:arr) {
				System.out.println(a+" ");
			}
			System.out.println();
		}
		
		System.out.println("--------- TASK 2 -------------");

		String[][] arrGrade = { { "Serge", "Eugene", "Olena", "Andrei" }, { "A", "B", "C", "D" } };
		System.out.println(arrGrade[0][0] + " " + arrGrade[1][0]);
		System.out.println(arrGrade[0][1] + " " + arrGrade[1][1]);
		System.out.println(arrGrade[0][2] + " " + arrGrade[1][0]);
		System.out.println(arrGrade[0][3] + " " + arrGrade[1][1]);

	}

}
