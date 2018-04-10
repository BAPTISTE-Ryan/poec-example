package week3;



public class Ecommerce {

	public static void main(String[] args) {
		Article livre1 = new Article("Java: A Beginner's Guide", 34.30);
		// livre1.setTitre("Java: A Beginner's Guide");
		// livre1.setPrix(34.30);
		
		Article l1 = livre1;
		livre1.setTitre("coucou");		
		
		Article livre2 = new Article("Java: The Complete Reference", 48.70);
//		livre2.setTitre("Java: The Complete Reference");
//		livre2.setPrix(48.70);
		
		Article livre3 = new Article("Effective Java", 51.25);
		
//		livre3.setTitre("Effective Java");
//		livre3.setPrix(51.25);
		
		Commande commande = new Commande(5);
	
		// double total = commande.computeTotal();
		Article[] articlesDeLaCommande = commande.getArticles();
		for (int i = 0; i < articlesDeLaCommande.length; i++) {
			Article articleCourant = articlesDeLaCommande[i];
		//	System.out.println(articleCourant.getTitre() + " " + articleCourant.getPrix());
		}
	System.out.println("yahoo i can bing a lot of numbers to the table a google of them");
		/*
		commande.articles[0] = livre1;
		commande.articles[1] = livre1;
		commande.articles[2] = livre2;
		commande.articles[3] = livre3;
		commande.articles[4] = livre3;
		*/

		 commande.addArticle(livre1);		
		 commande.addArticle(livre1);	
		 commande.addArticle(livre2);
		 commande.addArticle(livre3);
		 commande.addArticle(livre3);
		 
		 double total = commande.computeTotal();
		 System.out.println("Total commandé: " + total);
	}

}
