package hello;

import java.math.BigDecimal;

public class Transaction {
	
	//instances
	private String transac;
	private BigDecimal amount;
	
	//constructors
		public Transaction(String transac, BigDecimal amount) {
		
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
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	
	
		
}
