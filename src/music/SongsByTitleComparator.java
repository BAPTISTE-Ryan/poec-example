package music;

import java.util.ArrayList;
import java.util.Comparator;

public class SongsByTitleComparator implements Comparator<Song>{

	@Override
	public int compare(Song s1, Song s2) {
		return s1.getTitle().compareTo( s2.getTitle()  )  ;  
	}

}

/*
ArrayList<Product> productSet = new ArrayList<Product>();
productSet.add(p1);
productSet.add(p2);
productSet.add(p3);
ProductByPriceComparator comparatorByPrice = new ProductByPriceComparator();
productSet.sort(comparatorByPrice);
System.out.println("price"+productSet);



*/