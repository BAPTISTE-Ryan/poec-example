// refer to teachers correction for the proper functions , all of them

package hello;

public class StringUtil {
	///////////////////////////////////////////////////////////////////////////

	private int counter;
	///////////////////////////////////////////////////////////////////////////

	public int countCaracters(String texte) {

		
		counter=0;
		for (int i = 0; i < texte.length(); i++) {
				
			
			//if(texte.substring(i,i+1).equals(" ")) {
			if(texte.charAt(i) ==' ') {	
				//counter =0;
				//System.out.println(texte.length());
			}else {
				counter +=1;
				//System.out.println(counter);
			}
			
		}
		return counter;
		
	}

	public int countWords(String texte) {

		counter=1;
		for (int i = 0; i < texte.length(); i++) {
				
			
			if(texte.substring(i,i+1).equals(" ")) {
				counter += 1;
				//System.out.println(texte.length());
			}else {
				//counter +=1;
				//System.out.println(counter);
			}
			
		}
		return counter;
		
	}

	
	public boolean isPalindrome(String texte) {
		
		
		int j=texte.length();
		boolean result=false;
		int realisation=0;
		for (int k = 0; k < texte.length(); k++) {
			
		
		
		j--;
		
		//ystem.out.println(k+" foward "+texte.substring(k,k+1));
		//System.out.println(j+"       backward "+texte.substring(j,j+1));
		
		if(		texte.substring(k,k+1).equals(texte.substring(j,j+1))){
			
			
			
			realisation+=0;
			
		}else {
			
			realisation+=1;
		
		}
		
		}
		
		if (realisation==0) {result=true;}
		
		return result;
	}

	
	
	public boolean isAnagramme(String texte1, String texte2) {
		
		counter = 0;
		boolean result=false;
		for (int i = 0; i < texte2.length(); i++) {
			for (int j = 0; j < texte1.length(); j++) {
				if (texte1.substring(i, i + 1).equals(texte2.substring(j, j + 1))) {
					texte2 = texte2.replace(texte2.substring(j, j + 1), " ");
				}

			}
		}


		if (countCaracters(texte2) ==0) {
			result=true;
		} else {
			
		}
		return result;
	}
	
	
	
	
	///

}
	///////////////////////////////////////////////////////////////////////////
	
	
