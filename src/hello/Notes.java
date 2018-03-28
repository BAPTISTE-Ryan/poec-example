package hello;

public class Notes {

	public static void main(String[] args) {
		int[] notes = { 18, 20, 2, 14, 7, 10 };
// moyenne
		int somme = 0;
		for (int i = 0; i < notes.length; i++) {
			somme = somme + notes[i];
			//somme += notes[i]
		}
		double moyenne = 1.0 * somme / notes.length;
		System.out.println("la moyene est " + moyenne);
		
// minimum et maximum
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
		System.out.println("le note la plus basse est  " + notes[0]);
		System.out.println("le note la plus élevé est  " + notes[notes.length - 1]);
		
// variance
		double variance = 0;

		for (int j = 0; j < notes.length; j++) {
			variance = ((notes[j] * 1.0 - moyenne) * (notes[j] * 1.0 - moyenne)) + variance;
		}
		variance = variance / (notes.length - 1);
		System.out.println("la variance est  " + variance);

// écart type
		System.out.println("l'écart type est " + Math.sqrt(variance));

	}

}
