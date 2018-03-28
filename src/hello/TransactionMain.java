package hello;

public class TransactionMain {

	public static void main(String[] args) {
		/*transaction a 2 variables d'instance:
		son 
		-type: String débit ou crédit  
		-amount double  toujours positif
		Creer 4 transactions : D10 C20 D30 C15
		*/

		Transaction t1= new Transaction();
		Transaction t2= new Transaction();
		Transaction t3= new Transaction();
		Transaction t4= new Transaction();
		t1.transac = "debit";
		t1.amount  = 10;
		t2.transac = "credit";
		t2.amount  = 20;
		t3.transac = "debit";
		t3.amount  = 30;
		t4.transac = "credit";
		t4.amount  = 15;
		/*
		Transaction[] transactions = new Transaction[4];
		transactions[0]= t1;
		*/
		Transaction[] transactions = {t1,t2,t3,t4};
		double total=0;
		for (int i = 0; i < transactions.length; i++) {
			if (transactions[i].transac.equals("credit")) {total+=transactions[i].amount;}
			else if(transactions[i].transac.equals("debit")){total-=transactions[i].amount;}
			else {System.out.println("type de transaction inconnu");}
			
		}
		
		System.out.println(total);
		
	}

}
