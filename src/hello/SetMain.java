package hello;

import java.util.HashSet;

public class SetMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Shape> mySet = new HashSet<Shape>();
		mySet.add(new Rectangle());
		mySet.add(new Circle());
		System.out.println("myset\tsize\t"+mySet.size());
		Rectangle r1 = new Rectangle();
		mySet.add(r1);
		mySet.add(r1);
		System.out.println("myset\tsize\t"+mySet.size());
		
		for (Shape shape : mySet) {
			System.out.println("for\tmyset\tshape\t"+shape);
		}
		
		
	}

}
