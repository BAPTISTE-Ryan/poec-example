package hello;

public class Operator {

	public static void main(String[] args) {
 
		System.out.println(1/3.0);
		
		//modulo
		//reste de la division euclidienne
		
		//  a % b => a = q * b + r
		//  4 % 2 => 4 = 2 * 2 + 0 (ne depasse pas)
		//  10% 3 = 10 = 9 * 9 + 1 
		//  a%b == 0 alors a est divisible par b 
	    //  a%2 == 0 
		//System.out.println(6%4);
		int i = 42;
		int a =0;
		a=++i;
		System.out.println(i);
		System.out.println(a);
		i += 10; //i=i+10;
		a *= 10;
		System.out.println(i);
		System.out.println(a);
		
		// opérateurs de comparaison
		char c='r';
		char d=++c;
		System.out.println(d);
		
	}

}
