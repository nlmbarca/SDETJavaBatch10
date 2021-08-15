package com.syntax.class04;

public class NestedIf {

	public static void main(String[] args) {
		
		boolean vaccine=true;
		boolean secondDose=true;
		
		if(vaccine) { //yes THIS IS OUTER IF
			
			System.out.println("Lets check how many doses you got");
			
			if(secondDose) { // THIS IS INNER IF
				System.out.println("You are fully vaccinated");
			}else {
				System.out.println("You will need to get a 2nd dose.");
			}
			
			System.out.println("End of outer if block");
		}
		
		System.out.println(" ------- ANOTHER EXAMPLE OF NESTED IF ----------");
		
		/*
		 * Every friday is movie day
		 * if its is the 13th ---> you want to watch a scary movie
		 */
		
		int day=29;
		boolean isFriday=true;
		
		if(isFriday) {
			System.out.println("I am going to watch a movie");
			
			if(day==13) {
				System.out.println("Yay, I am wathcing scary movie");
			}else {
				System.out.println("I am wathcing whatever is popular");
			}
			
		}else {
			System.out.println("I am going to study");
		}
		
		
		System.out.println("End of the code");
		
		
	
	}

}
