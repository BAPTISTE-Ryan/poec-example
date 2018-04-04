package hello;

public class AnimalMain {
public static void main(String[] args) {
	
	Dog d = new Dog();
	d.setName("medor");;
	d.setAge(2);
	
	Cat c = new Cat();
	c.setName("fedo");;
	c.setAge(8);
	d.makeSound();
	//System.out.println(d.name);
	//d.makeSound();
	c.makeSound();
	System.out.println(d.getName()+":"+d.getAge());
	System.out.println(c.getName()+":"+c.getAge());
	
}
}
