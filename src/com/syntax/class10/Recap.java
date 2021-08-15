package com.syntax.class10;

public class Recap {

	public static void main(String[] args) {
		System.out.println("DIFF WAY OF INITALIZING ARRAYS");
		String x[]=new String[2];
		System.out.println(x.length);
		
		for(String xx:x) {
			System.out.println(xx);
		}
		
		String [] s=new String[3];
		s[0]="Hello";
		s[1]="Hi";

		//System.out.println(s[3]); --> ArrayIndexOutOfBoundsException: 4
		System.out.println(s[2]); //null because its not provided but its still there
		
		int size=s.length;
		System.out.println(size);
		
		s[2]="How are you?";
		System.out.println(s[2]);
		
		for (int i=0; i<s.length; i++) {
			System.out.println(s[i]+" ");
		}
		
		System.out.println(" ADVANCED FOR LOOP/ENCHANCED FOR LOOP/FOR EACH LOOP");
		
		for(String sa:s) {
			System.out.print(sa+" ; ");
		}


	}

}
