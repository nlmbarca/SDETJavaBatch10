package com.syntax.class06;

public class LogicalOperatorsRecap {

		public static void main(String[] args) {
			
			System.out.println(" -------- OR EXAMPLE ----------");
			String position="Automation Tester";
			
			if(position.equals("Automation Tester") || position.equals("Manual Tester")) {
				System.out.println("I am happy");
			}
			
			System.out.println(" ---------- AND EXAMPLE ------------ ");
			
			int salary=100000;
			
			if(position.equals("Automation Tester") && salary>=100000) {
				System.out.println("I am extremly happy");
			}
			
			System.out.println(" ---------- NOT EXAMPLE ------------- ");
			
			boolean study=false;
			
			if(!study) {
				System.out.println("You are not going to get a job");
			}
		}
}
