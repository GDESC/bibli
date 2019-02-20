package bibli;

import java.util.ArrayList;

public class Band {
	private String name;
	private int formationYear;
	private ArrayList<Musician> members = new ArrayList<Musician>();
	
	public Band(String n, int y, Musician[] m) {
		this.name=n;
		this.formationYear=y;
		for(int i=0; i<m.length;i++) {
			this.members.add(m[i]);
		}
	}
	
	public void setName(String n) {
		this.name=n;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void addMembers(Musician m) {
		this.members.add(m);
	}

	public void removeMembers(Musician m) {
		this.members.remove(m);
	}
	
	public void removeAllMembers() {
		this.members.clear();
	}
	
	public ArrayList<Musician> getMembers() {
		return this.members;
	}
	
	public String getMembersToString() {
		String res="";
		for (Musician m: this.members) {
			res+= m.getName() + " " + m.getInstruments()+ "\n";
		}
		return res;
	}
	
	public void setFormationYear(int y) {
		this.formationYear=y;
	}
	
	public int getFormationYear() {
		return this.formationYear;
	}
	
	public String toString() {
		return this.getName() + " is a band formed in "+ this.getFormationYear() + " with : \n"+this.getMembersToString();
	}
	
}
