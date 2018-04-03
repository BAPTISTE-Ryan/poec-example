package hello;

public class StringDemo {

	public static void main(String[] args) {
	
		String s = "bonjour";
        System.out.println(s.concat("le monde "));
        System.out.println(s.isEmpty());
        System.out.println("".isEmpty());
		System.out.println(s.length());
		System.out.println(s.substring(0,1));
		System.out.println("e");
		String space=" ";
		String result = "bonjour"+space+"le"+space+"monde";
		System.out.println(result);
		
		// Stringbuilder non thread safe use StringBuffer instead 
		
		StringBuilder sb = new StringBuilder();
		sb.append("bonjour");
		sb.append(space);
		sb.append("le");
		sb.append(space);
		sb.append("monde");
		//sb.insert sb.delete sb.replace sb.reverse
		result = sb.toString();
		
		System.out.println(sb);
		
		int a=3;
		int b=4;
		
		String s1 = new String("bonjour");
		String s2 = new String("bonjour");
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		String s3 = "bonjour";
		String s4 = "bonjour";
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
		
		String who = "toi";
		System.out.println("bonjour"+who);
		System.out.format("bonjour %s %s %n",who,"moi");
		double nb=05.54321;
		System.out.format(" nombre: %f",nb);
		//String res = System.format(" nombre: %f",nb);
	}

}
