package week3;

public class MathUtilMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			MathUtil.divide(2, 0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("pas le droit de diviser par zero");
			e.printStackTrace();
		}
	}

}
