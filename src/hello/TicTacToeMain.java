
//there is a big on the counter in this program that should be solved later 




package hello;

import java.util.Scanner;

public class TicTacToeMain {

	public static void main(String[] args) {

		// 1 creer la classe grille suivant les specifications
		int gridSize = 3;
		TTTGrid grid = new TTTGrid(gridSize);

		// 2
		// grid.init();
		// grid.print();

		/*
		 * grid.put('X', 1, 2); grid.put('O', 0, 0); grid.put('X', 0, 1);
		 */

		// grid.put('v', 1, 1);

		// 2 creer une methods print qui permer dafficher la grille
		// grid.print();

		/*
		 * __________ |O . .| |X . .| |. X .| TTTTTTT
		 * 
		 */
		/*
		 * 
		 * Scanner sc = new Scanner(System.in); boolean toggle=true; for (;;) {
		 * 
		 * // x01 String line; line = sc.nextLine();
		 * 
		 * 
		 * 
		 * char symbol_xy = line.charAt(0); String string_coord_x = line.substring(1,2);
		 * String string_coord_y = line.substring(2,3);
		 * 
		 * int coord_x = Integer.parseInt(string_coord_x); int coord_y =
		 * Integer.parseInt(string_coord_y);
		 * 
		 * 
		 * System.out.println(symbol_xy+" "+coord_x+" "+coord_y);
		 * System.out.println(line+" 0: "+line.charAt(0)+" 1: "+line.charAt(1)+" 2: "
		 * +line.charAt(2)); grid.put(symbol_xy,coord_x,coord_y); grid.print();
		 * //grid.winner();
		 * 
		 * 
		 * }
		 * 
		 */
		//System.out.println("[40m [40mBlack[0m");
		Player p1 = new Player();
		Player p2 = new Player();

		Player[] players = new Player[2];
		//boolean[] boolFactor = { true, false };

		players[0] = p1;
		players[1] = p2;

		// p1.setName("e");
		// System.out.println(p1.getName());

		Scanner scan = new Scanner(System.in);

		String line = "";
		/////////////////////////////////////////////////////
		////////////////////////////////////////////////////
		//System.out.println("computer name");
		p1.setName("Maicrosauft_Windaub");
		//System.out.println("computer symbol");
		p1.setSymbol('x');
		
		
	

			//System.out.println("valueof "+ douible2Int);
		
		
		System.out.println("player 1 name");
		line = scan.nextLine();
		p2.setName(line);
		System.out.println("player 1 symbol");
		line = scan.nextLine();
		p2.setSymbol(line.charAt(0));
		///////////////////////////////////////////
		/*
		System.out.println("player 2 name");
		line = scan.nextLine();
		p2.setName(line);
		System.out.println("player 2 symbol");
		line = scan.nextLine();
		p2.setSymbol(line.charAt(0));
		*/
		//////////////////////////////////////////
		//////////////////////////////////////////////////
		System.out.println(p1.getName());
		System.out.println(p1.getSymbol());
		System.out.println(p2.getName());
		System.out.println(p2.getSymbol());
		//////////////////////////////////////////////////
		//////////////////////////////////////////////////

		//Scanner sc = new Scanner(System.in);

		boolean toggle = true;
		int score1 = 0;
		int score2 = 0;
		double douible2Int=0.0;
		Player current_player = p1;
		int score = score1;
		for (;;) {

			// x01 String line; line = sc.nextLine();
			// x=(x==1?2:3) operateur ternaire  switch

			System.out.println(current_player.getName() + "'s turn");
			
			char symbol_xy = current_player.getSymbol();
			
			String string_coord_x="";
			String string_coord_y= "";
			
			if (current_player == p1) {
				
				
				line = "123";
				 string_coord_x = Integer.toString((int)((gridSize)*Math.random()));
				 string_coord_y = Integer.toString((int)((gridSize)*Math.random()));
				 
				 





				
			} else {
				line = scan.nextLine();
				string_coord_x = line.substring(0, 1);
				string_coord_y = line.substring(1, 2);
			}

			System.out.println(string_coord_x);
			
			
			int coord_x = Integer.parseInt(string_coord_x);
			int coord_y = Integer.parseInt(string_coord_y);
			System.out.println(symbol_xy + " " + coord_x + " " + coord_y);
			System.out.println(line + " 0: " + line.charAt(0) + " 1: " + line.charAt(1));
			grid.put(symbol_xy, coord_x, coord_y);
			grid.print();
			// grid.winner();

			if (grid.checkIfWinner(current_player.getSymbol())) {
				
				
				//score=current_player.getScore(score);
				//current_player.setScore(  current_player.getScore(score) ) ;
				
				score += 1;
				current_player.setScore(score);
				System.out.println(p1.getName() + ": " + p1.getScore() + " points");
				System.out.println(p2.getName() + ": " + p2.getScore() + " points");
				System.out.println("do you want to quit ? type quit \n else press enter to continue ");
				line = scan.nextLine();
				if (line.equals("quit")) {

					System.out.println("ended");
					break;

				}

				grid.init();

			}

			if (current_player == p1) {
				current_player = p2;
				score2=score;
				score=score2;
			} else {
				current_player = p1;
				score1=score;
				score=score1;
			}

		}

		/*
		 * grid.put('X', 1, 2); grid.put('O', 0, 0); grid.put('X', 0, 1); grid.print();
		 * 
		 * String h="e   "; h=h.concat("dd"); System.out.println(h);
		 * 
		 */

		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * for (;;) {
		 * 
		 * // x01 String line; line = sc.nextLine();
		 * 
		 * 
		 * 
		 * char symbol_xy = line.charAt(0); String string_coord_x = line.substring(1,2);
		 * String string_coord_y = line.substring(2,3);
		 * 
		 * int coord_x = Integer.parseInt(string_coord_x); int coord_y =
		 * Integer.parseInt(string_coord_y);
		 * 
		 * 
		 * System.out.println(symbol_xy+" "+coord_x+" "+coord_y);
		 * System.out.println(line+" 0: "+line.charAt(0)+" 1: "+line.charAt(1)+" 2: "
		 * +line.charAt(2)); grid.put(symbol_xy,coord_x,coord_y); grid.print();
		 * //grid.winner();
		 * 
		 * 
		 * }
		 */

		/*
		 * grid.put('X', 1, 2); grid.put('O', 0, 0); grid.put('X', 0, 1); grid.print();
		 * 
		 * String h="e   "; h=h.concat("dd"); System.out.println(h);
		 * 
		 */

	}

}
