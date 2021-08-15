package com.syntax.class06;

import java.util.Scanner;

public class HW1 {

	public static void main(String[] args) {
		
		Scanner s;
		String country, language;
		
		s=new Scanner(System.in);
		System.out.println("Please enter your country");
		country=s.nextLine();
		
		switch(country) {
		
		case "USA":
			language="English";
			break;
		case "Bolivia":
			language="Spanish";
			break;
		case "Iraq":
			language="Arabic/Modern Standard Arabic";
			break;
		default:
			language="unknown";
			break;
		}
		
		System.out.println("Since your country is "+country+" your native language is "+language);
	}

}
