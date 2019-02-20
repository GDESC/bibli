package bibli;

import java.util.ArrayList;

public class MusicianCollection {
	ArrayList<Musician> collec;
	
	public MusicianCollection() {
		collec=new ArrayList<Musician>();
	}
	
	public void add(Musician m) {
		if (!this.collec.contains(m)) {
			this.collec.add(m);
		} 
	}
	
	public void remove(Musician m) {
		if (this.collec.contains(m)) {
			this.collec.remove(m);
		}
	}
	
	public void print() {
		for(Musician m : this.collec) {
			System.out.println(m.getName()+" - "+ m.getBand() +" - "+ m.getInstruments());
		}
	}
	
	public Musician searchName(String s) {
		for(Musician m : this.collec) {
			if(m.getName().equals(s) || m.getName().contains(s)) {
				return m;
			}
		}
		System.out.println("I can't find the Musician you're looking for");
		return null;
	}
	
	public ArrayList<Musician> searchBand(String s) {
		ArrayList<Musician> list= new ArrayList<Musician>();
		for(Musician m : this.collec) {
			if(m.getBand().equals(s) || m.getBand().contains(s)) {
				list.add(m);
			}
		}
		if(list.isEmpty()) {
			System.out.println("I can't find the Band you're looking for");
			return null;			
		}
		return list;
	}
	
	public ArrayList<Musician> searchAlbum(String s) {
		ArrayList<Musician> list= new ArrayList<Musician>();
		for(Musician m : this.collec) {
			if (m.searchAlbum(s)!=null) {
				list.add(m);
			}
		}
		if(list.isEmpty()) {
			System.out.println("I can't find the Album you're looking for");
			return null;			
		}
		return list;
	}
}
