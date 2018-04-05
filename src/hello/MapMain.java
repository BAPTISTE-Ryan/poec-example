package hello;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class MapMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String,String> myMap = new HashMap<String,String>();
	
		myMap.put("thomas","le formateur");
		myMap.put("m2i","le centre de formation");
	
		System.out.println(myMap.get("thomas"));
		System.out.println(myMap.get("m2i"));
		
		HashMap<String,String> colors = new HashMap<String,String>();
		colors.put("white","#FFFFFF");
		colors.put("black","#000000");
		colors.put("red",  "#FF0000");
		colors.put("green","#00FF00");
		//colors.put("green","#00FF04");
		colors.put("blue" ,"#0000FF");
		
		System.out.println(colors.get("green"));
		
		for (Entry<String,String> entry:colors.entrySet()) {
			System.out.println("getValue"+entry.getKey()+"\t"+entry.getValue());
		}
	}

}
