package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Holse;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		Holse[] vect = new Holse[10];
		
		for (int i=1; i<=n; i++) {
			
			System.out.println("");
			System.out.println("Rent #" + i + ":");
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Email: ");
			String email = sc.nextLine();
			
			System.out.print("Room: ");
			int quarto = sc.nextInt();
			vect[quarto] = new Holse(quarto, name, email);
		}
		System.out.println("");
		System.out.println("Busy rooms: ");
			
		for (int i=0; i<vect.length; i++) {
			if (vect[i] != null) {
				System.out.println(vect[i]);
		}
	}
		sc.close();
		
	}

}
