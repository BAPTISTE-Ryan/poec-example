
      /*     MY MAIN METHOD      */
      /*                         */
      /*                         */
      /*                         */
      /*                         */
      /*                         */
      /*                         */
      /*                         */
      /*                         */







package hello;

public class TTTGrid {

	private char[][] tab2Dim ;
	
	// private char[][] tab2Dim = {{" "," "," "},{" "," "," "},{" "," "," "}};

	// initialisation


	
	public TTTGrid(int size) {
		super();
		tab2Dim= new char[size][size]; 
		
		for (int i = 0; i < tab2Dim[0].length; i++) {

			for (int j = 0; j < tab2Dim[0].length; j++) {
				tab2Dim[i][j] = ' ';
			}
		}
		
	}
	
	
	
///////////////////////////////////////////////////////////////////////////////////////////
	public void init() {
		for (int i = 0; i < tab2Dim[0].length; i++) {

			for (int j = 0; j < tab2Dim[0].length; j++) {
				tab2Dim[i][j] = ' ';
			}
		}
	}
	
	
		public void put(char c, int i, int j) {

		if (tab2Dim[i][j] == ' ') {
		 tab2Dim[i][j] = c;
		}
	}
	
	
	
	public void put2(char c, int i, int j) {

		tab2Dim[i][j] = c;

	}
	


	public void print() {
		String h="";
		for (int i = 0; i < tab2Dim.length; i++) {
			h=h.concat("----");
		}
		h=h.concat("-");
		System.out.println(h);
		for (int i = 0; i < tab2Dim[0].length; i++) {

			// System.out.print(" |");
			for (int j = 0; j < tab2Dim[0].length; j++) {
				System.out.print("| " + tab2Dim[j][i] + " ");
			}
			System.out.print("| \n");
			System.out.println(h);
		}
	}

	public void print2() {
		for (int i = 0; i < tab2Dim[0].length; i++) {

			System.out.print(" |");
			for (int j = 0; j < tab2Dim[0].length; j++) {
				System.out.print(" " + tab2Dim[j][i] + " ");
			}
			System.out.print("| \n");
		}
	}


////////////////////////////////////////////////////////////////////////////////////////////////

	public void testing(char players_letter) {

		//winning combinations
		for (int i = 0; i < tab2Dim.length; i++) {
			
			if(
					(tab2Dim[i][0]==tab2Dim[i][1] &&     //horizontal
				     tab2Dim[i][1]==tab2Dim[i][2] &&
					 tab2Dim[i][2]==players_letter)
												  ||
					  
					(tab2Dim[0][i]==tab2Dim[1][i] &&     //vertical
					 tab2Dim[1][i]==tab2Dim[2][i] &&
					 tab2Dim[2][i]==players_letter)							  
												  ||
												 
				    (tab2Dim[0][0]==tab2Dim[1][1] &&     //diagonal 1
					 tab2Dim[1][1]==tab2Dim[2][2] && 
					 tab2Dim[2][2]==players_letter)
				    							  ||
				    							  
				    (tab2Dim[2][0]==tab2Dim[1][1] &&     //diagonal 2
					 tab2Dim[1][1]==tab2Dim[0][2] && 
					 tab2Dim[0][2]==players_letter)
							
					) {
				
				System.out.println(players_letter + " has won");
				System.out.println(players_letter + " End of Game");
				return;
				//break;
				
			}
			
			
			
			
			
			
			
		}
		
	}

////////////////////////////////////////////////////////////////////////////////////////////////
	public boolean checkIfWinner(char players_letter) {

		//winning combinations
		boolean resultOfBool=false;
		for (int i = 0; i < tab2Dim.length; i++) {
			
			if(
					(tab2Dim[i][0]==tab2Dim[i][1] &&     //horizontal
				     tab2Dim[i][1]==tab2Dim[i][2] &&
					 tab2Dim[i][2]==players_letter)
												  ||
					  
					(tab2Dim[0][i]==tab2Dim[1][i] &&     //vertical
					 tab2Dim[1][i]==tab2Dim[2][i] &&
					 tab2Dim[2][i]==players_letter)							  
												  ||
												 
				    (tab2Dim[0][0]==tab2Dim[1][1] &&     //diagonal 1
					 tab2Dim[1][1]==tab2Dim[2][2] && 
					 tab2Dim[2][2]==players_letter)
				    							  ||
				    							  
				    (tab2Dim[2][0]==tab2Dim[1][1] &&     //diagonal 2
					 tab2Dim[1][1]==tab2Dim[0][2] && 
					 tab2Dim[0][2]==players_letter)
							
					) {
				
				System.out.println(players_letter + " has won");
				
				
				
				resultOfBool=true;
				break;
			}		 	
			
			
		}
		return resultOfBool;
		
		
	}
	
	
	
	
////////////////////////////////////////////////////////////////////////////////////////////////

	public void winner() {
		
		testing('x'); 
		testing('o'); 
		
	}

	
	
}



////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////
      /*  STRING CONCATENATION   */
      /*                         */
      /*                         */
      /*                         */
      /*                         */
      /*                         */
      /*                         */
      /*                         */
      /*                         */
/*
package hello;

public class TTTGrid {

	private char[][] tab;
	String stringVersionOfThePrintLns="8y";
	

	public TTTGrid(int size) {
		tab = new char[size][size];
		//String[] stringVersionOfThePrintLns = new String[size];
		
	}
	
	public void put(char c, int x, int y) {
		tab[x][y] = c;
	}

	public void print() {
	// 1) générer la grille dans une String (\n pour passer à la ligne)
	// 2) à la fin faire un System.out.println de la string générée en 1)
	
	// 3) mettre à jour le point 1). Ne plus utiliser de String
	// mais utiliser un StringBuilder
		
		
		
		// pour toutes les lignes
		for(int y = 0; y < tab.length; y++) {	
			// séparateur haut
			for(int i = 0; i < tab.length; i++) {
				stringVersionOfThePrintLns=stringVersionOfThePrintLns.concat("----");  //	System.out.print("----");	
			}
			stringVersionOfThePrintLns=stringVersionOfThePrintLns.concat("-\n");   	//	System.out.println("-");
			
			// générer une ligne
			for(int x = 0; x < tab.length; x++) {
				stringVersionOfThePrintLns=stringVersionOfThePrintLns.concat("| ");   	//	System.out.print("| ");
				if(tab[x][y] == '\u0000') {
					stringVersionOfThePrintLns=stringVersionOfThePrintLns.concat(" ");   	//	System.out.print(" ");
				} else {
					stringVersionOfThePrintLns=stringVersionOfThePrintLns.concat(Character.toString(tab[x][y]));//	System.out.print(tab[x][y]);
				}
				stringVersionOfThePrintLns=stringVersionOfThePrintLns.concat(" ");   	//	System.out.print(" ");
			}
			stringVersionOfThePrintLns= stringVersionOfThePrintLns.concat("|\n");   	//	System.out.println("|");
			
		}
		
		// dernier séparateur
		for(int i = 0; i < tab.length; i++) {
			stringVersionOfThePrintLns=stringVersionOfThePrintLns.concat("----"); 		//System.out.print("----");	
		}
		stringVersionOfThePrintLns=stringVersionOfThePrintLns.concat("-\n");  			//System.out.println("-");
	
		System.out.println(stringVersionOfThePrintLns);
		
	}

}

*/
////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////
      /*       STRING BUILDER    */
      /*                         */
      /*                         */
      /*                         */
      /*                         */
      /*                         */
      /*                         */
      /*                         */
      /*                         */
/*

package hello;

public class TTTGrid {

	private char[][] tab;

	public TTTGrid(int size) {
		tab = new char[size][size];
	}
	
	public void put(char c, int x, int y) {
		tab[x][y] = c;
	}

	public void print() {
	// 1) générer la grille dans une String (\n pour passer à la ligne)
	// 2) à la fin faire un System.out.println de la string générée en 1)
	
	// 3) mettre à jour le point 1). Ne plus utiliser de String
	// mais utiliser un StringBuilder
		
		
		StringBuilder sb = new StringBuilder();
		String result = "";
		
		result = sb.toString();
		
		System.out.println(sb);
		
		
		
		// pour toutes les lignes
		for(int y = 0; y < tab.length; y++) {	
			// séparateur haut
			for(int i = 0; i < tab.length; i++) {
				sb.append("----");	
			}
			sb.append("-\n");
			
			// générer une ligne
			for(int x = 0; x < tab.length; x++) {
				sb.append("| ");
				if(tab[x][y] == '\u0000') {
					sb.append(" ");
				} else {
					sb.append(tab[x][y]);
				}
				sb.append(" ");
			}
			sb.append("|\n");
			
		}
		
		// dernier séparateur
		for(int i = 0; i < tab.length; i++) {
			sb.append("----");	
		}
		sb.append("-\n");
	
		result = sb.toString();
		System.out.println(sb);
		
	}

////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////            MY ADDENDUM
	
	
	

	
	
	
	
	
	

}
	*/
