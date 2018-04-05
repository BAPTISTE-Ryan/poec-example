package hello;

public class Product {

	// variable d'instances
	private String title;

	// constructor
	public Product(String title) {
		this.title = title;
	}

	// methodes
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	
	
	
	@Override
	
	public boolean equals(Object o) {
		if (!(o instanceof Product)) {
			return false;
		}
		System.out.println(this.title);
		System.out.println(o);
		Product p = (Product) o;
	
		return this.title.equals(p.getTitle());
	}

}
