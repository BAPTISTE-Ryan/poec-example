package hello;

public class AnimalMain {
public static void main(String[] args) {
	
	Dog d = new Dog();
	d.setName("medor");;
	d.setAge(2);
	
	Cat c = new Cat();
	Animal c2 = new Cat();
	Object c3 = new Cat();
	// notte geudz Cat c4 = new Animal() 
	c2.makeSound(); // returns a cat sound not an animal sound (because it exists in animal and is overritten after wards in cat 
	//c3.makeSound(); doesnt exist since makeSound is not a method of object 
	c.setName("fedo");;
	c.setAge(8);
	d.makeSound();
	//System.out.println(d.name);
	//d.makeSound();
	c.makeSound();
	
	System.out.println(d.getName()+":"+d.getAge());
	System.out.println(c.getName()+":"+c.getAge());
	
	
	System.out.println("\n \n naoweu\n");
	Animal[] animal = {c,d,c2};
	for (int i = 0; i < animal.length; i++) {
		animal[i].makeSound();
	}

	// Animal a = new Animal;
	
	
}
}
