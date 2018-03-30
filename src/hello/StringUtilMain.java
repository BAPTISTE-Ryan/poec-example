package hello;

public class StringUtilMain {

	public static void main(String[] args) {
		
		StringUtil stringutil = new StringUtil();
		
		String texte = "bonjour le monde";
		
		//compte le nombre de caracteres aurtres que les espaces  ::14
		stringutil.countCaracters(texte);
		
		//compte le nombre de mots separes par espaces :: 3
		
		stringutil.countWords(texte);
		
		
		//retourne true si palindrom sinon false
		System.out.println(stringutil.isPalindrome(texte));
		System.out.println(stringutil.isPalindrome("radar"));
		/*
		//retourne true si anagram
		stringutil.isAnagramme("romain","manoir")
		*/
		//System.out.println(stringutil.countWords(texte));
		//System.out.println(stringutil.isPalindrome(texte));
		
		
		
		
		
	}

}
