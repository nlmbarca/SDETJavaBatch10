package com.syntax.class10;

public class HW2 {

	public static void main(String[] args) {

		String[][] grocery = { 
				{ "Apple", "Mango", "Pear", "Watermelon" },
				{ "Carrots", "Lettuce", "Brocolli", "Kale" },
				{ "Milk", "Yogurt", "Chesse", "IceCream" },
				{ "Gum", "Cake", "Cupcake", "Cookies" } 
				};

		for (int i = 0; i < grocery.length; i++) {
			for (int j = 0; j < grocery[i].length; j++) {
				System.out.println(grocery[i][j]);
			}
		}

		System.out.println("------------- ANOTHER WAY -----------------");

		for (String[] ga : grocery) {
			for (String g : ga) {
				System.out.print(g + " ");
			}
			System.out.println();
		}
	
	}
}
