package hello;

public class Commande {

	//instance variables
	private Article[] commande ;
	
	//constructeurs
	public Commande(int nbMaxDarticlesDansLepanier) {
		this.commande= new Article[nbMaxDarticlesDansLepanier];
	}
	/*
	//getters setters
	public Article[] getCommande() {
		return commande;
	}
	*/


	public void setCommande(Article[] commande) {
		this.commande = commande;
	}

	
	
	

	// add method
	/**
	 * Ajoute un article a la commande
	 * @param a article a rajouter a la commande
	 * @throws NullPoijnterException si article est null
	 */
	public void  add(Article a) {
		 	if (a==null) {throw new NullPointerException("the article cannnot be null");}
		for (int j = 0; j < commande.length; j++) {
			if(commande[j]==null) {
				commande[j]=a;
				break;
			}	
		}
		
		
		//return commande;
	}

	
	public void total() {
	
		//just showing the articles
		for (int i = 0; i < commande.length; i++) {
			if(commande[i]!=null) {
			System.out.println(commande[i].getTitre());
			}
		}

		//printing the total , the total method
		int total=0;
		for (int i = 0; i < commande.length; i++) {
			if(commande[i]!=null) {
			total+=commande[i].getPrix();
			}
		}
		System.out.println("le total de votre commande est de ="+total+" euros ");
		
	}
	
	
	
	
	

}
