package week3;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URI;

public class DownloadMain {

	public static void main(String[] args) {
		 // TODO coucou
		URI uri = URI.create("http://www.example.co");
	
		
		
		try {
			InputStream is = uri.toURL().openStream();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {System.out.println("finally done!");}
System.out.println("done");
		
		
		
	}

}
