package hello;

public class NombresPairs {

	public static void main(String[] args) {

		// version1
		System.out.println("version 1");
		// for (int i = 1; i <= 100; i++) {
		for (int i = 1; i < 101; i++) {
			System.out.println(i);

		}

		// version2
		System.out.println("version 2");
		for (int i = 1; i < 101; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}

		// version2.1
		System.out.println("version 2.1");
		for (int i = 0; i < 100; i += 2) {

			System.out.println(i);

		}

	}

}
