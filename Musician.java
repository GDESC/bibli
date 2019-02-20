package bibli;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Musician extends Artist {
	
	private Instruments instruments;
	private String band;
	private HashMap<String, Integer> albums=new HashMap<String, Integer>();

	public Musician(String n, char g, int bY, Instruments i, String b) {
		super(n, g, bY);
		this.instruments=i;
		this.band=b;
	}
	
	public Musician searchAlbum(String s) {
		for (Map.Entry album : albums.entrySet()) {
			if (album.getKey().equals(s) || album.getValue().equals(s)) {
				return this;
			}
		}
		System.out.println("Sorry, I can't find the album you're looking for");
		return null;
	}
	

	public Instruments getInstruments() {
		return this.instruments;
	}
	
	public void setInstruments(Instruments i) {
		this.instruments=i;
	}

	public String getBand() {
		return band;
	}

	public void setBand(String band) {
		this.band = band;
	}

	public HashMap<String, Integer> getAlbums() {
		return albums;
	}

	public void setAlbums(HashMap<String, Integer> albums) {
		this.albums = albums;
	}
	
	public String toString() {
		if (this.instruments.equals(Instruments.VOICE)) {
			return this.getName()+ " was born in "+this.getBirthYear()+" and sings in "+this.getBand()+".";
		}
		return this.getName()+ " was born in "+this.getBirthYear()+" and plays "+this.getInstruments().toString().toLowerCase() +" in "+this.getBand()+".";
	}
	
}
