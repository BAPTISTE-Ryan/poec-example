package week3;

public class MathUtil {
/**
 * divide
 * @param a numerator
 * @param b denominator
 * @return result
 * @throws Exception si b==0
 */
	public static int divide(int a, int b) throws Exception {
		if (b == 0) {
			//throw new IllegalArgumentException("b must be ! = 0 ");
			throw new Exception("b must be ! = 0 ");
		}
		return a / b;
	}

}
