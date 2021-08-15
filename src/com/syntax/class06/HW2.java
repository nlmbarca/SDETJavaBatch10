package com.syntax.class06;

import java.util.Scanner;

public class HW2 {

	public static void main(String[] args) {
			
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your grade");
		char grade=scan.next().charAt(0);
		String letterGrade;
		
		switch(grade) {
		
		case 'A':
			letterGrade="Excellent";
			break;
		case 'B':
			letterGrade="Good";
			break;
		case 'C':
			letterGrade="Average";
			break;
		case 'D':
			letterGrade="Bad";
			break;
		default:
			letterGrade="Not Acceptable";
			break;	
		}
			
		System.out.println("Since your grade is "+grade+" your letter grade outcome is "+letterGrade);
		
		
		

	}

}
