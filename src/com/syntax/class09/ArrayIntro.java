package com.syntax.class09;

public class ArrayIntro {

	public static void main(String[] args) {
		
		int num=10;
		
		int[] arr=new int[5];
		
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		
		System.out.println(arr[2]+arr[0]);
		
		String[]days=new String[7];
		days[0]="Monday";
		days[1]="Tuesday";
		days[2]="Wendesday";
		days[3]="Thursday";
		days[4]="Friday";
		days[5]="Saturday";
		days[6]="Sunday";
		
		System.out.println(days[5]+" "+days[6]);
		
		days[6]="10";
		System.out.println(days[5]+" "+days[6]);
		
		boolean[]boo=new boolean[3];
		boo[0]=true;
		boo[1]=true;
		boo[2]=false;
		
		System.out.println(boo[1]);
		
		if(boo[1]) {
			System.out.println("Value is true");	
		}
		

	}

}
