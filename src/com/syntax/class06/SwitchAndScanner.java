package com.syntax.class06;

import java.util.Scanner;

public class SwitchAndScanner {

	public static void main(String[] args) {
		
		/*
		 * I want to ask where you are from
		 * based on the country we will define traditional?
		 *  
		 */
		
		Scanner in;
		String country, traditionalFood;
		
		in=new Scanner(System.in);
		System.out.println("Hey, where are you from");
		country=in.nextLine();
		
		switch(country) {
		
		case "USA":
			traditionalFood="burger";
			break;
		case "Afghanistan":
			traditionalFood="qabeli Palaw";
			break;
		case "Peru":
			traditionalFood="ceviche";
			break;
		case "Italy":
			traditionalFood="pasta";
			break;
		case "Tajikistan":
			traditionalFood="kuruto";
			break;
		case "Ukraine":
			traditionalFood="borsch";
			break;
		case "Kazakhstan":
			traditionalFood="beshbarmak";
			break;
		case "Turkey":
			traditionalFood="borek";
			break;
		default:
			traditionalFood="unknown";
			break;
		}
		System.out.println("You are from "+country+" your traditional food is "+traditionalFood);
		
	}

}
