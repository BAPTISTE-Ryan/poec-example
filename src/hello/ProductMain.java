package hello;

public class ProductMain {

	public static void main(String[] args) {
		Product p1 = new Product("voiture rouge");
		Product p2 = new Product("voiture rouge");
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals("toto"));

	}

}
