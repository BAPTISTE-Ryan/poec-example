package music;

import java.util.ArrayList;
import java.util.List;

import hello.Personne;

public class MusicMain {

	public static void main(String[] args) {

		Personne Drake= new Personne("Drake","Graham", 31) ;
		Personne Beyonce = new Personne("Beyonce","knowles",43) ;	
		Personne Truthseekah= new Personne("Truth","Seekah",33) ;
		
		Song song1 = new Song("title: Gods Plan",Drake, "genre: HIPOHOP", 360);
		Song song2 = new Song("title: xHalo",Beyonce, "genre: RNB",720);
		Song song3 = new Song("title: Seven Stars ",Truthseekah, "genre: Underground", 180);
		
        
		
		PlayList playList = new PlayList();
		//ArrayList<Song> playList = new ArrayList<Song>();
		playList.add(song1);
		playList.add(song2);
        playList.add(song3);
        
		System.out.println(playList);
		
        List<Song> soundsOrderedByTitle = playList.songsByTitle();
        System.out.println(soundsOrderedByTitle);
        
        
        SongsByTitleComparator comparatorByTitle = new SongsByTitleComparator();
        //playList.sort(comparatorByTitle);
        //System.out.println("blablacar"+playList.toString());
        
	//ArrayList<Song> songOrderedByTitle = new ArrayList<Song> playList.songsByTitle();
	/*		songOrderedByTitle.add(song1);
		songOrderedByTitle.add(song2);
		songOrderedByTitle.add(song3);
		*/
        
		
    //	ArrayList<Song>songOrderedByTitle.sort(comparatorByTitle);
		//System.out.println(songOrderedByTitle.toString());
		
		
		
		
		
		/*
		ArrayList<Song> songOrderedByGenre = playList.songsByGenre();
		ArrayList<Song> songOrderedByDuration = playList.songsByDuration();
		ArrayList<Song> songOrderedByAuthorName = playList.songsByAuthorName();
		*/
		// "bonjour".compareTo("le monde")
		
		
		
		
		
		
		
		
		

	}

}
