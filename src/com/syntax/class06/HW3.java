package com.syntax.class06;

import java.util.Scanner;

public class HW3 {

	public static void main(String[] args) {
		double num1,num2, result=0;
		char operator;
		String operation=null;
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter first number");
		num1=scan.nextDouble();
		System.out.println("Enter arithmetic operator +,-,*,/,%");
		operator=scan.next().charAt(0);
		System.out.println("Enter second number");
		num2=scan.nextDouble();
		
		switch(operator) {
		
		case '+':
			result=num1+num2;
			operation="Addition";
			break;
		case '-':
			result=num1-num2;
			operation="Subtraction";
			break;
		case '*':
			result=num1*num2;
			operation="Multiplication";
			break;
		case '/':
			result=num1/num2;
			operation="Division";
			break;
		case '%':
			result=num1%num2;
			operation="Modules";
			break;
		default:
			operation="not a arithmetic operator";
		}
		if(operation.equals("not a arithmetic operator")) {
			System.out.println(operation);
		}else {
			System.out.println("The result of "+operation+" "+num1+" and "+num2+" is "+result);
		}
		

	}

}
