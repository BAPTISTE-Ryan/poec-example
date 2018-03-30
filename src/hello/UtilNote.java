package hello;

public class UtilNote {

	public double calcMoyenne(int[] notes) {

		int somme = 0;
		for (int i = 0; i < notes.length; i++) {
			somme = somme + notes[i];
			// somme += notes[i]
		}
		double moyenne = 1.0 * somme / notes.length;

		return moyenne;
	}

	public double findMin(int[] notes) {
		int temp = 0;

		for (int j = 0; j < notes.length * notes.length; j++) {

			for (int i = 0; i < notes.length - 1; i++) {

				if (notes[i] > notes[i + 1]) {
					temp = notes[i];
					notes[i] = notes[i + 1];
					notes[i + 1] = temp;
				}
			}
		}
		return notes[0];
	}

	public double findMax(int[] notes) {
		int temp = 0;

		for (int j = 0; j < notes.length * notes.length; j++) {

			for (int i = 0; i < notes.length - 1; i++) {

				if (notes[i] > notes[i + 1]) {
					temp = notes[i];
					notes[i] = notes[i + 1];
					notes[i + 1] = temp;
				}
			}
		}
		return notes[notes.length - 1];
	}

}
