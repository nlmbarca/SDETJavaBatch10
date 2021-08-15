package com.syntax.class05;

import java.util.Scanner;

public class HW2 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		String m, s;
		
		System.out.println("Please enter your birth month");
		
		m=scan.nextLine();
		s=null;
		
		if(m.equals("June") || m.equals("July") || m.equals("August")) {
				s="Summer";
		}else if (m.equals("September") || m.equals("October") || m.equals("November"))	{
			s="Autumn";
		}else if (m.equals("December") || m.equals("January") || m.equals("February"))	{
			s="Winter";
		}else if (m.equals("March") || m.equals("April") || m.equals("May"))	{
			s="Spring";	
		}		
		
		System.out.println("You were born in season "+s);
	}
	
}
