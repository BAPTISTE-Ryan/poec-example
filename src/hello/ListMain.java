package hello;

import java.math.BigDecimal;
import java.util.ArrayList;

public class ListMain {

	public static void main(String[] args) {
		
		//ArrayList myList = new ArrayList();
		ArrayList<Object> myList = new ArrayList<Object>();
		myList.add(new Cat());
		myList.add(new Dog());
		myList.add(new Cat());
		myList.add(new Transaction("debit",new BigDecimal(10)));
		System.out.println(myList.get(2));
		for (int i = 0; i < myList.size(); i++) {
			System.out.println(myList.get(i));
		}
		
		ArrayList<Shape> myList2 = new ArrayList<Shape>();
		myList2.add(new Rectangle());
		myList2.add(new Circle());
		Circle c1 =  new Circle();
		myList2.add(c1);
		myList2.add(c1);
		System.out.println("\t\t\r");
		for (int i = 0; i < myList2.size(); i++) {
			System.out.println(myList2.get(i));
		}
		System.out.println("\t\t\r");
		for (Shape shape : myList2) {
			System.out.println(shape);
		}
	
	
	}

}
