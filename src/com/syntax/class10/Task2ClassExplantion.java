package com.syntax.class10;

public class Task2ClassExplantion {

	public static void main(String[] args) {
		System.out.println("------- USING IF ELSE -------");
		String[] countries = { "Afghanistan", "Tajikistan", "USA", "Japan" };

		String capital = "";
		for (int i = 0; i < countries.length; i++) {
			System.out.println(countries[i]);

			for (String countrys : countries) {

				if (countrys.equals("Afghanistan")) {
					countrys = "Kabul";
				} else if (countrys.equals("Tajikistan")) {
					countrys = "Dushanbe";
				} else if (countrys.equals("USA")) {
					countrys = "Washington DC";
				} else if (countrys.equals("Japan")) {
					countrys = "Tokyo";
				}
				System.out.println("The capital of " + countrys + " is " + capital);
			}
			
			System.out.println("---- USING SWITCH CASE -----");
			
			capital="";
			
			for (int x = 0; x < countries.length; x++) {
				
				switch(countries[i]) {
				
				case "Afghanistan":
					capital="Kabul";
					break;
				case "Tajikistan":
					capital="Dushhanbe";
					break;
				case "USA":
					capital="Washington DC";
					break;
				case "Japan":
					capital="Toyko";
					break;
				}
				System.out.println("The capital of " + countries[i] + " is " + capital);
				
			}
		}

	}

}
