package hello;

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
		super.makeSound();
		bark();
	}
}
