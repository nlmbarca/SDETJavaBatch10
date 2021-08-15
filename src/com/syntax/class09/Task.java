package com.syntax.class09;

public class Task {

	public static void main(String[] args) {
		
		System.out.println("TASK 1");
		char[] grades=new char[6];
		grades[0]='A';
		grades[1]='B';
		grades[2]='C';
		grades[3]='D';
		grades[4]='E';
		grades[5]='F';
		
		System.out.println(grades[1]);
		System.out.println("OTHER WAY FOR TASK 1");
		
		char[]gradesTwo= {'A','B','C','D','E','F'};
		System.out.println(gradesTwo[1]);
		
		System.out.println("TASK 2");
		
		String[] toonSquad=new String[5];
		toonSquad[0]="Nicolas";
		toonSquad[1]="Michael";
		toonSquad[2]="Francisco";
		toonSquad[3]="Chris";
		toonSquad[4]="Mauricio";
		System.out.println(toonSquad[0]);
		int size=toonSquad.length;
		System.out.println("# of elements in array toonSquad = "+size);
		
		//declaration and storing values must be completed right away
		String[] names= {"Nicolas","Michael","Francisco","Chris","Mauricio"};
		System.out.println(names[2]);
		
		System.out.println(names.length);
		
		names[4]="Jose";
		System.out.println(names[4]);
		
		int[]num;
		num=new int[2];
		num[0]=1;
		num[1]=10;
		
		int[] n;
		//n= {10,20}; not possible to add values this way after declaration
		
		int[] array= {10,20,30,40,50};
		
		System.out.println("TASK 3");
		
		String[] words=new String[5];
		words[0]="Java";
		words[1]="Saturday";
		words[2]="day";
		words[3]="coding";
		words[4]="is";
		
		System.out.println(words[1]+" "+words[4]+" "+words[0]+" "+words[3]+" "+words[2]);
		
		
		
		
		

	}

}
