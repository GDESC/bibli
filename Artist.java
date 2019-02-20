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

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
}

