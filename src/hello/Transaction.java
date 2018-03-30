package hello;

public class Transaction {
	
	//instances
	private String transac;
	private double amount;
	
	//constructors
		public Transaction(String transac, double amount) {
		
		this.transac = transac;
		this.amount = amount;
	}
	
	
	//getter setter
	public String getTransac() {
		return transac;
	}

	public void setTransac(String transac) {
		this.transac = transac;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
		
}
