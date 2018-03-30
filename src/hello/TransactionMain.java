package hello;

public class TransactionMain {

	public static void main(String[] args) {
		/*
		 * transaction a 2 variables d'instance: son -type: String débit ou crédit
		 * -amount double toujours positif Creer 4 transactions : D10 C20 D30 C15
		 */

		Transaction t1 = new Transaction("debit" ,10);
		Transaction t2 = new Transaction("credit",20);
		Transaction t3 = new Transaction("debit" ,30);
		Transaction t4 = new Transaction("credit",40);
		/*t1.setTransac("debit");
		t1.setAmount(10);
		t2.setTransac("credit");
		t2.setAmount(20);
		t3.setTransac("debit");
		t3.setAmount(30);
		t4.setTransac("credit");
		t4.setAmount(15);*/
		/*
		 * Transaction[] transactions = new Transaction[4]; transactions[0]= t1;
		 */
		Transaction[] transactions = { t1, t2, t3, t4 };
		double total = 0;
		for (int i = 0; i < transactions.length; i++) {
			if (transactions[i].getTransac().equals("credit")) {
				total += transactions[i].getAmount();
			} else if (transactions[i].getTransac().equals("debit")) {
				total -= transactions[i].getAmount();
			} else {
				System.out.println("type de transaction inconnu");
			}

		}

		System.out.println(total);

	}

}
