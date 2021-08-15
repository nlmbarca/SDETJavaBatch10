package com.syntax.class08;

import java.util.Scanner;

public class LastTaskMyAttempt {

	public static void main(String[] args) {
	
		String enterUserItem;
		int itemPrice=900,amountHeGives,remainding;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter item you want to buy");
		enterUserItem=scan.nextLine();
		System.out.println("The price of that item is = "+"$"+itemPrice);
		System.out.println("How much do you have today");
		amountHeGives=scan.nextInt();
		do {
			
			if(amountHeGives<900) {
				System.out.println("You still owe "+(itemPrice-amountHeGives));
				break;
			}else if (amountHeGives>900) {
				System.out.println("Here is your change "+(amountHeGives-itemPrice));
				break;
			}	
		}while(amountHeGives != itemPrice);
		System.out.println("Thank you for shopping!");

}
}