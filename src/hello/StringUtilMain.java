package hello;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

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

		
		
		
		
		
		
		
		
		
		
		System.out.println("\nnew algorythms\n");
		
		///////////////////////////////////////////////////////////////
		
		//String text = "Intermittent fasting is better than alternate day fasting for two reasons, one , is that you can establish a habit easier and two, you get to have your cake and eat it";
		String text="one two two three three three four four four four ";
		String[] vuo=text.split(" ");
		
		System.out.println(vuo.length);
		//System.out.println(stringutil.countWords(text));
		//System.out.println(stringutil.officialcountWords(text));
		/*for (int i = 0; i < vuo.length; i++) {
		System.out.println(vuo.length);
			System.out.println(vuo[i]);
		}*/
		
		HashMap<String,Integer> occurences = stringutil.countWordOccurences(text);
		HashMap<String,Integer> occurences1 = stringutil.simplifiedCountWordOccurences(text);
		
		for (Entry<String,Integer>entry:occurences1.entrySet()) {
			System.out.format("%s :%d%n",entry.getKey(),entry.getValue());
		}
		System.out.println("\n\n");
		for (Entry<String,Integer>entry:occurences.entrySet()) {
			System.out.format("%s :%d%n",entry.getKey(),entry.getValue());
		}
		
	}

}
