package hello;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Random;

public class Nombres {

	public static void main(String[] args) {
		
		int i0 =1 ;
		Integer i1 = new Integer(1);
		// Wrong i1.parseInt("123")
		// Right Integer.parseint("123");
		
		//methods tatique depuis classe et pas objet
		Double d1 = new Double(2.0);

		//litte int >> big int constructor "new" or valueOf() 
		// factory methods , design patterns
		int i2 = Integer.parseInt("123");
		System.out.println(i2);
		System.out.println(Integer.valueOf(123));
		System.out.println(Integer.SIZE);
		System.out.println(Long.MAX_VALUE);
		
		BigInteger bi1 = new BigInteger("1000030000000000000000000");
		BigInteger bi2 = new BigInteger("1000000001000000010000000");
		System.out.println(bi1.add(bi2));
		
		BigDecimal bd1 = new BigDecimal("0.1");
		BigDecimal bd2 = new BigDecimal("0.2");
		System.out.println(bd1.add(bd2));
		System.out.println(0.1+0.2);
		
		Random rand = new java.util.Random()	;
		rand.nextInt(50);
		
		Integer.valueOf(123).toString();
		String.valueOf(123);
		Integer.parseInt("123");
		
		
		
		}

}
