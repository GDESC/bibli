package bibli;

import java.util.ArrayList;
import java.util.HashMap;

import javax.annotation.Generated;

public class Musician extends Artist {
	
	private ArrayList<Instruments> instruments=new ArrayList<Instruments>();
	private String band;
	private HashMap<String, Integer> albums=new HashMap<>();

	public Musician(String n, char g, int bY, Instruments i, String b) {
		super(n, g, bY);
		this.instruments.add(i);
		this.band=b;
	}

	public ArrayList<Instruments> getInstruments() {
		return instruments;
	}

	public void addInstruments(Instruments i) {
		this.instruments.add(i);
	}
	
	public void removeInstruments(Instruments i) {
		this.instruments.remove(i);
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
	 
}
