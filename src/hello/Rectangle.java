package hello;

public class Rectangle implements Shape {
	
	private int width;
	private int height;
/**
 * Construit un rectangle a partir de sa longueur et sa hauteur
 * @param width  largeur du rectangle
 * @param height  hauteur du rectangle
 * @return
 * @throws IllegalArgumentException si width ou height est negatif
 */
	public Rectangle(int width, int height) {
		if (width <0) {throw new IllegalArgumentException("width must be positive") ;}
		if (height<0) {throw new IllegalArgumentException("height must be positive") ;}
		this.width = width;
		this.height = height;
		
	}

	public double calcArea(){
		
		int result=height*width;
		
		return result; 
	}

}
