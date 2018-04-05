// refer to teachers correction for the proper functions , all of them

package hello;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class StringUtil {
	///////////////////////////////////////////////////////////////////////////

	private int counter;
	///////////////////////////////////////////////////////////////////////////

	public int countCaracters(String texte) {

		counter = 0;
		for (int i = 0; i < texte.length(); i++) {

			// if(texte.substring(i,i+1).equals(" ")) {
			if (texte.charAt(i) == ' ') {
				// counter =0;
				// System.out.println(texte.length());
			} else {
				counter += 1;
				// System.out.println(counter);
			}

		}
		return counter;

	}

	public int countWords(String texte) {

		counter = 1;
		for (int i = 0; i < texte.length(); i++) {

			if (texte.substring(i, i + 1).equals(" ")) {
				counter += 1;
				// System.out.println(texte.length());
			} else {
				// counter +=1;
				// System.out.println(counter);
			}

		}
		return counter;

	}

	///////////////////////////////////////////////////
	///////////////////////////////////////////////////

	public int officialcountWords(String text) {

		int wordsCount = 0;
		String[] splittedText = text.split(" ");
		for (int i = 0; i < splittedText.length; i++) {
			if (!splittedText[i].isEmpty()) {
				wordsCount++;
			}
		}

		return wordsCount;

	}
	///////////////////////////////////////////////////
	//////////////////////////////////////////////////

	public String[] splitWords(String texte) {

		String[] splittedText = texte.split(" ");

		for (int i = 0; i < texte.length(); i++) {

			/*
			 * if(texte.substring(i,i+1).equals(" ")) { counter += 1;
			 * //System.out.println(texte.length()); }else { //counter +=1;
			 * //System.out.println(counter); }
			 */
		}
		return splittedText;

	}

	public boolean isPalindrome(String texte) {

		int j = texte.length();
		boolean result = false;
		int realisation = 0;
		for (int k = 0; k < texte.length(); k++) {

			j--;

			// ystem.out.println(k+" foward "+texte.substring(k,k+1));
			// System.out.println(j+" backward "+texte.substring(j,j+1));

			if (texte.substring(k, k + 1).equals(texte.substring(j, j + 1))) {

				realisation += 0;

			} else {

				realisation += 1;

			}

		}

		if (realisation == 0) {
			result = true;
		}

		return result;
	}

	public boolean isAnagramme(String texte1, String texte2) {

		counter = 0;
		boolean result = false;
		for (int i = 0; i < texte2.length(); i++) {
			for (int j = 0; j < texte1.length(); j++) {
				if (texte1.substring(i, i + 1).equals(texte2.substring(j, j + 1))) {
					texte2 = texte2.replace(texte2.substring(j, j + 1), " ");
				}

			}
		}

		if (countCaracters(texte2) == 0) {
			result = true;
		} else {

		}
		return result;
	}

  
	public HashMap<String, Integer> countWordOccurences(String texte) {

		HashMap<String, Integer> returnedMap = new HashMap<String, Integer>();
		String[] splittedText = texte.split(" ");

		// System.out.println(splittedText.get("fasting"));
		int wordCounter = 0;
		int[] wordCounters = new int[texte.length()];
		//for (int i = 0; i < splittedText.length; i++) {wordCounters[i]=0;}
		
		
		
		
		
		
		
		for (int i = 0; i < splittedText.length; i++)
		{
			
			for (int j = 0; j < splittedText.length; j++)
			{

					if (splittedText[i].equals(splittedText[j]))
					{
						wordCounters[i]++;
						wordCounter++;
					}
					
					//splittedText[i].
					
				
				//returnedMap.put(splittedText[i], wordCounter);
				
			}
			
			returnedMap.put(splittedText[i], wordCounters[i]);
			//System.out.println("wordCounter :"+wordCounter+" wordCounter[] :"+wordCounters[i]);
			wordCounter=0;
		}
		 

		return returnedMap;

	}

	
	
	
	
	
	
	
	
	
	
	

	public HashMap<String, Integer> simplifiedCountWordOccurences(String texte) {

		
		
		HashMap<String, Integer> returnedMap = new HashMap<String, Integer>();
		String[] splittedText = texte.split(" ");
		// System.out.println(splittedText.get("fasting"));
		//int wordCounter = 0;
		//int[] wordCounters = new int[texte.length()];
		//for (int i = 0; i < splittedText.length; i++) {wordCounters[i]=0;}
		
		//counter=0;
		// for(String currentWord : splittedText){
		
		
		// start of the those previous 16 lines
		
		/*for (int i = 0; i < splittedText.length; i++)
		{
			String currentWord = splittedText[i];
			
			if(!returnedMap.containsKey(currentWord)) {
				
				returnedMap.put(currentWord,1);
			}	else {
				Integer counter1=returnedMap.get(currentWord);
				counter1++;
				returnedMap.put(currentWord,counter1);
				
			}
			*/
		
		
			//the previous 16 lines could be replace with
			for(String currentWord1 : splittedText){
				Integer counter1=returnedMap.getOrDefault(currentWord1,0);
				returnedMap.put(currentWord1,counter1+1);
				
			}
			
			//System.out.println("wordCounter :"+wordCounter+" wordCounter[] :"+wordCounters[i]);
			//wordCounter=0;
		
		
		
			//System.out.println("wordCounter :"+wordCounter+" wordCounter[] :"+wordCounters[i]);
		 

		return returnedMap;

	}

	
	
	
	///

}
///////////////////////////////////////////////////////////////////////////
