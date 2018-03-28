package hello;

public class Mention {

	public static void main(String[] args) {

		int note = 12;
		// int[] echel = {0,10,12,14,16};
		int[] echel = { 0, 9, 11, 13, 15, 17 };
		String[] apprec = { "peut mieux faire", "passable", "assez bien", "bien", "tres bien", "null" };

		for (int j = 0; j < 5; j++) {

			if (echel[j] < note && (echel[j + 1] > note || echel[j + 1] == note)) {
				System.out.println("note obtenu "+note+"/20 appréciation "+apprec[j]);
			}

		}

	}

}
