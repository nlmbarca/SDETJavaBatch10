package com.syntax.class07;

public class Task3 {

	public static void main(String[] args) {
		
		int num=20;
		while(num<=100) {
			System.out.println(num);
			num+=2;
		}
		
		System.out.println("SAME QUESTION BUT USING IF");
		
		num=20;
		
		while(num<=100) {
			
			if(num%2==0) {
				System.out.println(num);
			}
			num++;
		}

	}

}
