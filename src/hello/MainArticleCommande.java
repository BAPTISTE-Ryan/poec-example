package hello;

import java.util.Scanner;

public class MainArticleCommande {

	public static void main(String[] args) {
		
		
		Article a1 = new Article("samsung galaxy note 9",425);
		Article a2 = new Article("wacom intuos pro",1785);
		Article a3 = new Article("archos tablet 7 '' ",78);

		/*		
		a1.setTitre("samsung galaxy note 9");
		a1.setPrix(425);
		a2.setTitre("wacom intuos pro");
		a2.setPrix(1785);
		a3.setTitre("archos tablet 7 '' ");
		a3.setPrix(78);
*/
		
		Commande c1 = new Commande(5);
		
		/*
		c1.add(a1);
		c1.add(a2);
		c1.add(a3);
		*/

		
		//System.out.println(c1);
		
		//c1.total();
		
		
		/* //////// DEUXIEME PARTIE **********************************************************************
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("wacom, samsung  or archos ?");
		//////////////////////////////////////////////////////////
		for (;;) {

			String line;
			line = sc.nextLine();
			/////////////////////////////////////////////////
			if (line.equals("quit")) {
				
				System.out.println("ended");
				break;
				
			}
			///////////////////////////////////////////////
			/////////////////////////////////////////////////
			if (line.equals("samsung")) {
				
				c1.add(a1);
				c1.total();
				
				
			}else
			///////////////////////////////////////////////
			/////////////////////////////////////////////////
			if (line.equals("wacom")) {
				
				c1.add(a2);
				c1.total();
			
			}else
			///////////////////////////////////////////////
			/////////////////////////////////////////////////
			if (line.equals("archos")) {
				
				c1.add(a3);
				c1.total();
				
			
			}else{
				System.out.println("please enter a valid article");
			}
			///////////////////////////////////////w////////
			
			
			System.out.println(line);
		}
		///////////////////////////////////////////////////////

		//////FIN DE LA DEUXIEME PARTIE   */
		
		
		
		
		
		//TROISIEME PARTIE **********************************************************************
		
		
		
		LigneCommande cL1 = new LigneCommande();
		LigneCommande cL2 = new LigneCommande();
		LigneCommande cL3 = new LigneCommande();
		
		CommandVersionTwo cmd1 = new CommandVersionTwo();
		
		cL1.commande=a1;
		cL1.quantity=1 ;
		
		cL2.commande=a2;
		cL2.quantity=1 ;
		
		cL3.commande=a3;
		cL3.quantity=6 ;
		
		cmd1.add(cL1);	
		cmd1.add(cL2);		
		cmd1.add(cL3);	
		cmd1.total() ;
		
		
		
		
		
		
	}

}
