package music;

import java.util.List;
import java.util.ArrayList;


public class PlayList {

	private ArrayList<Song> songs;
		
	public PlayList() {
	songs = new ArrayList<Song>();
	}
	
	public ArrayList<Song> songsByTitle() {
		// TODO Auto-generated method stub
		SongsByTitleComparator comparator = new SongsByTitleComparator();
		songs.sort(comparator);
		
		return songs;
	}
	
	public void add(Song song) {
		songs.add(song);
		
	}
	
	public ArrayList<Song> getSongs() {
		return songs;
	}

	public void setSongs(ArrayList<Song> songs) {
		this.songs = songs;
	}
	


	public ArrayList<Song> songsByDuration() {
		// TODO Auto-generated method stub
		
		return null;
	}

	public ArrayList<Song> songsByGenre() {
		// TODO Auto-generated method stub
		
		return null;
	}

	public ArrayList<Song> songsByAuthorName() {
		// TODO Auto-generated method stub
		
		return null;
	}


	@Override
	public String toString() {
		return songs.toString();
		
	}

}

