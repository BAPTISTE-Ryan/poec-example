package com.breousakt.java.advanced;

public class Dog extends Animal {

	public void bark() {
		System.out.println("ouaffeu");
	}
	
	public void debug() {
		System.out.println(name);
	}

	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		//super.makeSound(); ( uncommented creates a double sound , animal first dog after
		bark();
	}
}
