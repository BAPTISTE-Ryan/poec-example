package com.breousakt.java.advanced;

//abstract blocks the instanciating of a new class
abstract class Animal {

	protected String name;
	protected int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	/*
	public void makeSound() {
		
		System.out.println("...");
	}
	*/
	abstract void makeSound() ; // forces the child classes to have an implimentation of makesound, a body in the child classes
}
