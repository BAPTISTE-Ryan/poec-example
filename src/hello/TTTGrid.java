package hello;

public class TTTGrid {

	private char[][] tab2Dim = new char[3][3];
	// private char[][] tab2Dim = {{" "," "," "},{" "," "," "},{" "," "," "}};

	// initialisation

	public TTTGrid() {
		super();
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
		System.out.println("-------------");
		for (int i = 0; i < tab2Dim[0].length; i++) {

			// System.out.print(" |");
			for (int j = 0; j < tab2Dim[0].length; j++) {
				System.out.print("| " + tab2Dim[j][i] + " ");
			}
			System.out.print("| \n");
			System.out.println("-------------");
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



	private void testing(char players_letter) {

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



	public void winner() {
		
		testing('x'); 
		testing('o'); 
		
	}

	
	
}
