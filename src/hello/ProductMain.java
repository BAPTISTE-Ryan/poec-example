package hello;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class ProductMain {

	public static void main(String[] args) {
		Product p1 = new Product("citroen c4 coupé   ",10500);
		Product p2 = new Product("peugeot 307",56000);
		Product p3 = new Product("lenovo thinkpad ",2500);
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals("toto"));

		HashSet<Product> products = new HashSet<Product>();
		products.add(p1);
		products.add(p2);
		System.out.println(products.size());

	System.out.println("p1hash "+p1.hashCode()+" p2.hash "+p2.hashCode());
	
	System.out.println(p1.toString());
	System.out.println(p2);
	System.out.println("coco is  nuts");
	System.out.println("\n array list ********************************************* begin");
	ArrayList<Product> productSet = new ArrayList<Product>();
	productSet.add(p1);
	productSet.add(p2);
	productSet.add(p3);
	System.out.println("blablacar"+productSet.toString());
	
	
	System.out.println("\n array list ********************************************* end ");
	ProductByTitleLengthComparator comparatorByTitle = new ProductByTitleLengthComparator();
	System.out.println(comparatorByTitle.compare(p1, p2));
	
	System.out.println(comparatorByTitle.compare(p1, p3));
	
	ProductByPriceComparator comparatorByPrice = new ProductByPriceComparator();
	System.out.println("by price : "+comparatorByPrice.compare(p1, p2));
	System.out.println("by price : "+comparatorByPrice.compare(p1, p1));
	System.out.println("by price : "+comparatorByPrice.compare(p2, p1));
	System.out.println("\ncomparing ********************************************* begin");
	productSet.sort(comparatorByTitle);
	System.out.println("title"+productSet);
	productSet.sort(comparatorByPrice);
	System.out.println("price"+productSet);
	
	//trier les éléements d'un set Productsset
	
	ArrayList<Product> anotherProductList = new ArrayList<Product>(productSet);
	
	TreeSet<Product> productTreeSet = new TreeSet<Product>(comparatorByPrice);
	
	productTreeSet.add(p1);
	productTreeSet.add(p3);
	productTreeSet.add(p2);
	System.out.println("\n\n treetree ********************************************* begin");
	
	System.out.println(productTreeSet );
	
	
	}

}
