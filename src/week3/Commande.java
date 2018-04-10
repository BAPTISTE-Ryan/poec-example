package week3;

public class Commande {
	// variables d'instance
	private Article[] articles;
	
	// constructeurs
	public Commande(int nbMaxArticlesDansPanier) {
		this.articles = new Article[nbMaxArticlesDansPanier];
	}
	
	// méthodes
	
	// getters / setters
	public Article[] getArticles() {
		return articles;
	}

	public void setArticles(Article[] articles) {
		this.articles = articles;
	}

	// autres méthodes
	public void addArticle(Article article) {
		for (int i = 0; i < articles.length; i++) {
			if(articles[i] == null) {
				articles[i] = article;
				return ; // or break;
			}
		}
	}

	public double computeTotal() {
		double total = 0;
		for (int i = 0; i < articles.length; i++) {
			if(articles[i] != null) {
				total += articles[i].getPrix();
			}
		}
		return total;
	}

}
