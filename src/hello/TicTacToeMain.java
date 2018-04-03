package hello;

import java.util.Scanner;

public class TicTacToeMain {

	public static void main(String[] args) {

		// 1 creer la classe grille suivant les specifications
		TTTGrid grid = new TTTGrid();

		// 2
		//grid.init();
		// grid.print();
		
		/*
		grid.put('X', 1, 2);
		grid.put('O', 0, 0);
		grid.put('X', 0, 1);
		*/
		
		
		//grid.put('v', 1, 1);

		// 2 creer une methods print qui permer dafficher la grille
		grid.print();
		
		/*
		 * __________ |O . .| |X . .| |. X .| TTTTTTT
		 * 
		 */

		Scanner sc = new Scanner(System.in);
		
		for (;;) {

			// x01
			String line;
			line = sc.nextLine();
			
			char symbol_xy = line.charAt(0);
			String string_coord_x = line.substring(1,2);
			String string_coord_y = line.substring(2,3);

			int coord_x = Integer.parseInt(string_coord_x);
			int coord_y = Integer.parseInt(string_coord_y);

			
			System.out.println(symbol_xy+" "+coord_x+" "+coord_y);
			System.out.println(line+" 0: "+line.charAt(0)+" 1: "+line.charAt(1)+" 2: "+line.charAt(2));
			grid.put(symbol_xy,coord_x,coord_y);
			grid.print();
			grid.winner();
			
		}
		
	}

}
