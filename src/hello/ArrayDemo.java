package hello;

public class ArrayDemo {

	public static void main(String[] args) {

		int[] tab = {1, 2, 3, 4, 5, 6};
		tab[0]=42;
		System.out.println(tab[0]);
		System.out.println(tab.length);
		// 
		String[] strab = {"hello","world"};
		System.out.println(strab[0]+" "+strab[1]);
		System.out.println(strab.length);
		
		
		int[] tabDeTeaille6 = new int[6];
		tabDeTeaille6[0]=1;
	    System.out.println(tabDeTeaille6[0]+" "+tabDeTeaille6[1]);
	
	    for (int i = 0; i < tab.length; i++) {
			System.out.println(tab[i]);
		} 
	    
	}

}
