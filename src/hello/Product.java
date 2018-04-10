package hello;

public class Product {

	// variable d'instances
	private String title;
	private int price;

	
	

	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	// constructor
	public Product(String title, int price) {
		super();
		this.title = title;
		this.price = price;
	}


	// methodes
	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}



	

	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + price;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (price != other.price)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "["+title+", "+price+"]";
		
	}

	
	
	
	
	

}
