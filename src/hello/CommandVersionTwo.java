package hello;

public class CommandVersionTwo {

	LigneCommande[] lignecommande = new LigneCommande[5];
	
	// add method
	public void  add( LigneCommande a) {
		 	
		for (int j = 0; j < lignecommande.length; j++) {
			if(lignecommande[j]==null) {
				lignecommande[j]=a;
				break;
			}	
		}
		
		
		//return commande;
	}

	
	public void total() {
	
		//just showing the articles
		for (int i = 0; i < lignecommande.length; i++) {
			if(lignecommande[i]!=null) {
			System.out.println(" ("+lignecommande[i].quantity+"x )"+lignecommande[i].commande.getTitre());
			}
		}

		//printing the total , the total method
		int total=0;
		for (int i = 0; i < lignecommande.length; i++) {
			if(lignecommande[i]!=null) {
			total+=lignecommande[i].quantity*lignecommande[i].commande.getPrix();
			}
		}
		System.out.println("le total de votre commande est de ="+total+" euros ");
		
	}
	
	
	
	
	

}
