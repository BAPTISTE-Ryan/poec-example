package hello;

public class PersonneMain {

	public static void main(String[] args) {
		
		Personne p1 = new Personne("kunta","Bergowitz",43);
		Personne p2 = new Personne("babatunde","Wolfgang Amadeus",49);
		
		//p1.nom="Charles le duc"; 
		
		//p1.prenom="Maharajastani";

		/*p1.setPrenom("Bergowitz");
		
		p2.setPrenom("babatunde");
		p2.setNom("Wolfgang Amadeus");
		p2.setAge(49);*/
		/*
		System.out.println(p1.nom);
		System.out.println(p1.prenom);
		System.out.println( "le prenom est : "+    p1.getPrenom()   );
		System.out.println(p1.age);
		*/
		
		System.out.println(p1.getFullName());
		System.out.println(p1.getAge());
		System.out.println(p2.getFullName());
		System.out.println(p2.getAge());
		
		
		
	}

}


