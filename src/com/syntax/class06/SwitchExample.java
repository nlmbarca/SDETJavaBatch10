package com.syntax.class06;

public class SwitchExample {

	public static void main(String[] args) {
	
		char gender='M';
		
		switch(gender) {
		
		case 'M':
			System.out.println("Male");
		//case 'M': MATCHING CASES ARE NOT ALLOWED
			//System.out.println("Maldsfsdfe");
			break;
		case 'F':
			System.out.println("Female");
			break;
		default:
			System.out.println("Gender is unknown");
		}
		
		System.out.println(" ------------ LIMITATIONS ------------------------- ");
		
//		boolean=true;
//		
//		switch(boo) {
//	}

		double d=1.99;
		
//		switch(d) {
}
}
