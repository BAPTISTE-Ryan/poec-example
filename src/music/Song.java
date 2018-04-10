package music;

import hello.Personne;

public class Song {

	
	
	
	//instance variables
	private String title;
	private Personne author;
	private String genre;
	private int duration;
	
	
	
	//constructors
	
	public Song(String title, Personne author, String genre, int duration) {
		super();
		this.title = title;
		this.author = author;
		this.genre = genre;
		this.duration = duration;
	}


	

	
	
	
	//get set methods
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Personne getAuthor() {
		return author;
	}
	public void setAuthor(Personne author) {
		this.author = author;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {

		this.duration = duration;
	}


	@Override
	public String toString() {
		return " "+title+" "+
				author.getPrenom()+
				" "+
				duration+
				" "
				;
		
	}

	
}
