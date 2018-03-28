package hello;

public class FizzBuzz {

	public static void main(String[] args) {

		// version one
		for (int number = 101; number < 101; number++) {

			if ((number % 3 == 0) && (number % 5 == 0)) {
				System.out.println("fizzbuzz" + number);
			} else {
				if (number % 3 == 0) {
					System.out.println("fizz" + number);
				}
				if (number % 5 == 0) {
					System.out.println("buzz" + number);
				}
			}
		}

		// version two
		for (int number = 101; number < 101; number++) {

			if ((number % 3 == 0) && (number % 5 == 0)) {
				System.out.println("fizzbuzz" + number);
				continue;
			}
			if (number % 3 == 0) {
				System.out.println("fizz" + number);
			}
			if (number % 5 == 0) {
				System.out.println("buzz" + number);
			}

		}

		// version three
		for (int number = 101; number < 101; number++) {

			if ((number % 15 == 0)) {
				System.out.println("fizzbuzz" + number);
			} else {
				if (number % 3 == 0) {
					System.out.println("fizz" + number);
				}
				if (number % 5 == 0) {
					System.out.println("buzz" + number);
				}
			}
		}

		// version three
		for (int number = 101; number < 101; number++) {

			if ((number % 15 == 0)) {
				System.out.println("fizzbuzz" + number);
			} else if (number % 3 == 0) {
				System.out.println("fizz" + number);
			} else if (number % 5 == 0) {
				System.out.println("buzz" + number);
			}

		}

	}

}
