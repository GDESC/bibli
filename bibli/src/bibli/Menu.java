package bibli;

import java.util.Scanner;

public class Menu {
	public static  void displayMainMenu() {
		System.out.println("What are you looking for ?");
		System.out.println("[0] Exit");
		System.out.println("[1] A Musician");
		System.out.println("[2] A Band");
		System.out.println("[3] An Album");
		
		
		Scanner sc=new Scanner(System.in);
		boolean validForm=false;
		int choice=42;
		
		while (!validForm) {
			choice=  sc.nextInt();
			if (choice>=0 && choice>4) {
				validForm=true;
			}
		}
		
		switch(choice) {
			case 0:
				System.exit(0);
		 	case 1:
				displayMusicianMenu();
				break;
			case 2:
				displayBandMenu();
				break;
			case 3:
				displayAlbumMenu();
				break;
		}
	}
	
	public static void displayMusicianMenu() {
		System.out.println("You want to find a musician using:");
		System.out.println("[1] Musician's name");
		System.out.println("[2] Musician's band");
		System.out.println("[3] Musician's instrument");
	}
	
	public static void displayBandMenu() {
		
	}

	public static void displayAlbumMenu() {
		
	}
}
