package hello;

public class ShapeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* creer une classe rectangle qui contient
		   qui possede une methode public int
		    CalcArea(int width, int height) */
		Rectangle r1 = new Rectangle();
		r1.width  = 10;
		r1.height = 50;
		
		Rectangle r2 = new Rectangle();
		r2.width  = 20;
		r2.height = 30;
		
		System.out.println(r1.CalcArea());
		System.out.println(r2.CalcArea());
		
	}         

}
