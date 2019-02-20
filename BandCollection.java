package bibli;

import java.util.ArrayList;

public class BandCollection {
	private ArrayList<Band> collec;
	
	public BandCollection() {
		collec=new ArrayList<Band>();
	}
	
	public void add(Band b) {
		if (!this.collec.contains(b)) {
			this.collec.add(b);
		}	
	}
	
	public void remove(Band b) {
		if (this.collec.contains(b)) {
			this.collec.remove(b);
		} 
	}
	
	
	public Band searchName(String s) {
		for(Band b : this.collec) {
			if(b.getName().equals(s) || b.getName().contains(s)) {
				return b;
			}
		}
		return null;
	}
}
