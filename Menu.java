package bibli;

import java.util.ArrayList;
import java.util.Scanner;

import javax.sound.midi.Synthesizer;

public class Menu {
	
	private MusicianCollection collection;
	private BandCollection bands;
	
	public Menu(MusicianCollection c, BandCollection b) {
		this.collection=c;
		this.bands=b;
	}
	
	public void displayMainMenu() {
		System.out.println("What are you looking for ?");
		System.out.println("[0] Exit");
		System.out.println("[1] A Musician");
		System.out.println("[2] A Band");
		System.out.println("[3] An Album");
		
		
		Scanner sc=new Scanner(System.in);
		int choice=42;
		
		while (choice<0 || choice>4) {
			choice=  sc.nextInt();
		}
		
		switch(choice) {
			case 0:
				System.exit(0);
		 	case 1:
				this.displayMusicianMenu();
				break;
			case 2:
				this.displayBandMenu();
				break;
			case 3:
				this.displayAlbumMenu();
				break;
		}
	}
	
	public void displayMusicianMenu() {
		System.out.println("You want to find a musician using:");
		System.out.println("[1] Musician's name");
		System.out.println("[2] Musician's band");
		System.out.println("[3] Musician's instrument");
		
		Scanner sc=new Scanner(System.in);
		int choice=42;
		
		while (choice<0 || choice>4) {
			choice=  sc.nextInt();
		}
		
		switch(choice) {
		 	case 1:
		 		this.displayMusicianNameSearch();
				break;
			case 2:
				this.displayMusicianBandSearch();
				break;
			case 3:
				this.displayMusicianInstrumentSearch();
				break;
		}
	}
	
	public void displayBandMenu() {
		System.out.println("You want to find a musician using:");
		System.out.println("[1] Musician's name");
		System.out.println("[2] Musician's band");
		System.out.println("[3] Musician's instrument");
		
		Scanner sc=new Scanner(System.in);
		boolean validForm=false;
		int choice=42;
		
		while (choice<0 || choice >4) {
			choice=  sc.nextInt();
		}
		
		switch(choice) {
		 	case 1:
		 		this.displayMusicianNameSearch();
				break;
			case 2:
				this.displayMusicianBandSearch();
				break;
			case 3:
				this.displayMusicianInstrumentSearch();
				break;
		}
	}

	public static void displayAlbumMenu() {
		System.out.println("You want to find an album using:");
		System.out.println("[1] Album's name");
		System.out.println("[2] Album's band");
		System.out.println("[3] Album's launch year");
		
		Scanner sc=new Scanner(System.in);
		boolean validForm=false;
		int choice=42;
		
		while (!validForm) {
			choice=  sc.nextInt();
			if (choice>0 && choice>4) {
				validForm=true;
			}
		}
		
		/*switch(choice) {
		 	case 1:
		 		this.displayAlbumNameSearch();
				break;
			case 2:
				this.displayAlbumBandSearch();
				break;
			case 3:
				this.displayAlbumYearSearch();
				break;
		}*/
	}
	
	public void displayMusicianNameSearch() {
		System.out.println("Enter the name of the Musician: ");
		Scanner sc=new Scanner(System.in);
		String input= sc.nextLine();
		Musician m=this.collection.searchName(input);
		if(!m.equals(null)) {
			System.out.println(m.toString());
		} else {
			System.out.println("Sorry, I can't find who you're looking for");
		}
	}
	
	public void displayMusicianBandSearch() {
		System.out.println("Enter the name of the Band: ");
		Scanner sc=new Scanner(System.in);
		String input= sc.nextLine();
		Band b=this.bands.searchName(input);
		if(!b.equals(null)) {
			System.out.println(b.toString());
		} else {
			System.out.println("Sorry, I can't find what you're looking for");
		}
	}
	
	public void displayMusicianInstrumentSearch() {
		System.out.println("Which instruments are you looking for ? ");
		
	}
	
}
