package hello;

public class Rectangle implements Shape {
	
	int width;
	int height;

	public double calcArea(){
		
		int result=height*width;
		
		return result; 
	}

}
