package com.syntax.class08;

import java.util.Scanner;

public class AnotherTask {

	public static void main(String[] args) {
		
		int start, end,sumOfEven=0, sumOfOdd=0;
	

		Scanner scan = new Scanner(System.in);

		
			System.out.println("Gimme the start");
			start = scan.nextInt();
			System.out.println("Gimme the end");
			end = scan.nextInt();
			
			for(int i=start; i<=end; i++) {
				if(i%2==0) {
					sumOfEven+=i;
				}else {
					sumOfOdd+=i;
				}
			}
			System.out.println("The sum of even numbers from range "+start+" till " +end+" = "+sumOfEven);
			System.out.println("The sum of even numbers from range "+start+" till " +end+" = "+sumOfOdd);

		}

	}
				