package com.syntax.class12;

public class CarTester {

	public static void main(String[] args) {
		
		Car car1=new Car();
		car1.make="Toyota";
		car1.model="Rav4";
		car1.color="Black";
		car1.year=2020;
		System.out.println("I have a "+car1.make);
		car1.moveBackward();
		
		Car car2=new Car();
		car2.make="Tesla";
		car2.model="Model X";
		car2.color="Green";
		car2.year=2020;
		System.out.println("I have a "+car2.make);
		car2.moveForward();
		
		

	}

}
