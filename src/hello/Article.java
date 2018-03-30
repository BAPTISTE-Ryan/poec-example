package hello;

public class Article {

	//instance variables
	private String titre;
	private double prix;
	
	//constructeurs
	public Article(String titre, double prix){
		this.titre=titre;
		this.prix=prix;
	}
	
	
	
	//getters and setters
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(int prix) {
		this.prix = prix;
	}
	
	

}
