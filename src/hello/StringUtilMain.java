package hello;

public class StringUtilMain {

	public static void main(String[] args) {

		StringUtil stringutil = new StringUtil();

		String texte = "bonjour le monde";

		// compte le nombre de caracteres aurtres que les espaces ::14
		stringutil.countCaracters(texte);

		// compte le nombre de mots separes par espaces :: 3

		stringutil.countWords(texte);

		// retourne true si palindrom sinon false
		System.out.println(stringutil.isPalindrome(texte));
		System.out.println(stringutil.isPalindrome("radar"));

		// retourne true si anagram
		/*
		 * stringutil.isAnagramme("romain","manoir")
		 */
		// System.out.println(stringutil.countWords(texte));
		// System.out.println(stringutil.isPalindrome(texte));

		/*
		 * create an array of the length range check if the reference is found in the
		 * other array
		 * 
		 */
		// char[] thestring =
		String texte1 = "apple12";
		String texte2 = "elppa12";
		System.out.println("anagramme "+	stringutil.isAnagramme(texte1,texte2));

	}

}
