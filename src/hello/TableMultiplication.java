package hello;

public class TableMultiplication {

	public void print(int x, int y) {

		for (int i = 1; i <= y; i++) {

			System.out.println(x + "*" + i + "=" + x * i);

		}

	}

	
	public void print(int x) {
	
		for (int j = 0 ; j <= x; j++) {
			
			System.out.print("["+j+"]");
			
		}
		for (int i = 1; i <=x ; i++) {
			System.out.println("\t");
			int n=0;
			for (int j = 1 ; j <= x; j++) {
				//System.out.print("["+j+" "+i+"]");
				if (n==0) {
					System.out.print("["+i+"]");
				}
				n=1;
				System.out.print("["+j*i+"]");
				
			}
			
			
			
			
		}
		
		
	}

	
}
