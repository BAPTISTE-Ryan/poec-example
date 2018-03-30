package hello;

public class StringUtil {
	///////////////////////////////////////////////////////////////////////////

	private int counter;
	///////////////////////////////////////////////////////////////////////////

	public int countCaracters(String texte) {

		
		counter=0;
		for (int i = 0; i < texte.length(); i++) {
				
			
			if(texte.substring(i,i+1).equals(" ")) {
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

	
	
	
	
	
	///

}
	///////////////////////////////////////////////////////////////////////////
	
	
