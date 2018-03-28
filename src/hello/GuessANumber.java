package hello;

import java.util.Scanner;

public class GuessANumber {

	public static void main(String[] args) {

		int nombreADeviner = 8;
		/*
		 * prog qui demande un util de deviner num entre 1 et 10 tant que util na pas
		 * devin le bon ecrire perdu redemander a deviner , quand il a le bon ecrire
		 * gagné et quitter
		 */
		System.out.println("devine un nombre entre 1 et 10");
		Scanner sc = new Scanner(System.in);
		int turns = 0;

		for (;;) {

			int tries;
			tries = sc.nextInt();
			if (tries == nombreADeviner) {

				System.out.println("gagné" + " en  " + turns + " coups");
				break;

			} else {
				System.out.println("perdu");
				turns++;
			}

		}

	}

}
