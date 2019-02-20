package bibli;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("Welcome to bibli !");
		
		
		MusicianCollection musicians=new MusicianCollection();
		BandCollection bands=new BandCollection();
		
		Musician m1=new Musician("Jimi Hendrix", 'm', 1942, Instruments.GUITAR, "The Jimi Hendrix Experience");
		Musician m2=new Musician("Angus Young", 'm', 1955, Instruments.GUITAR, "AC/DC");
		Musician m3=new Musician("Keith Richards", 'm', 1943, Instruments.GUITAR, "The Rolling Stones");
		Musician m4=new Musician("Eric Clapton",'m',1945, Instruments.GUITAR, "Cream");
		Musician m5=new Musician("Janis Joplin", 'f', 1943, Instruments.VOICE, "Big Brother and the Holding Company");
	
		musicians.add(m1);
		musicians.add(m2);
		musicians.add(m3);
		musicians.add(m4);
		musicians.add(m5);
		
		Menu menu= new Menu(musicians,bands);
		menu.displayMainMenu();
		
	}	
}
