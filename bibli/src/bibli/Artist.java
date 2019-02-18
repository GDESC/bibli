package bibli;

import java.sql.Date;

public class Artist {
	private String Name;
	private char gender;
	private int birthYear;
	
	public Artist(String n, char g, int bY) {
		this.Name=n;
		this.gender=g;
		this.birthYear=bY;
	}
}

