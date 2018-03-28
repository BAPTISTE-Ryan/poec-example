package hello;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		/*
		 * String line; line = sc.nextLine(); System.out.println(line);
		 * 
		 * 
		 * int i = sc.nextInt(); System.out.println();
		 */

		for (;;) {

			String line;
			line = sc.nextLine();
			if (line.equals("quit")) {
				
				System.out.println("ended");
				break;
				
			}
			System.out.println(line);
		}

	}

}
