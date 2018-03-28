package hello;

public class Search {

	public static void main(String[] args) {

		int[] data = { 1, 2, 5, 10, 72, 42, 33 };
		boolean found = false;
		for (int i = 0; i < data.length; i++) {
			if (data[i] == 10) {
				found = true;
				break;  //early exit 
			}
		}
		//if (found == true) {
		if (found) {	
			System.out.println("found");
		} else {
			System.out.println("404 not found");
		}

	}

}
