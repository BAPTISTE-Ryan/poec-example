package hello;

public class CalculatorMain {

	public static void main(String[] args) {
		Calculator calc =new Calculator();
		int v= calc.add(5,3);
		calc.add(5,3);
		System.out.println(calc.add(5,3));
	}

}
