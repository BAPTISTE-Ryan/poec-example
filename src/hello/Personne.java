package hello;

public class Personne {
	
	// variables d'instance  instance fields 
	private String prenom;
	private String nom; 
	private int age;
	
	
	
	public Personne(String prenom, String nom, int age) {
		super();
		this.prenom = prenom;
		this.nom = nom;
		this.age = age;
	}
	
	//methodes
	public String getFullName() {
		String fullName =nom+" "+prenom;
		
		return nom+" "+prenom;
	}
/////////////////////////////////////////////////////
	public String getPrenom() {
		//System.out.println(prenom);
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom=prenom;
		
	}

//////////////////////////////////////////////////
public String getNom() {
//System.out.println(prenom);
return nom;
}

public void setNom(String nom) {
this.nom=nom;

}
//////////////////////////////////////////////////
public int getAge() {
//System.out.println(prenom);
return age;
}

public void setAge(int age) {
this.age=age;

}
//////////////////////////////////////////////////
	
}
