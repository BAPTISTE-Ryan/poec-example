package hello;

public class ShapeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* creer une classe rectangle qui contient
		   qui possede une methode public int
		    CalcArea(int width, int height) */
	
		Rectangle r1 = new Rectangle(10,50);
		Rectangle r2 = new Rectangle(10,49);
	
		
		System.out.println("r1\t"+r1.calcArea());
		System.out.println("r2\t"+r2.calcArea());
		
		Circle c = new Circle();
		
		c.r=4;
		System.out.println("circle\t"+c.calcArea());
		
		Object[] tab0 = {r1,c};
		Shape[] tab = {r1,c};
		for (int i = 0; i < tab.length; i++) {
			Shape o = tab[i];
			System.out.println(o.calcArea());
		}
		
	}         

}
