package com.calculSalair.app;
import java.util.Scanner;

public class calculeSalaire {
	
	
	
	public static void main(String[] args) {
		System.out.println("bonjour! veuillez entrer votre nom et prenom: ");
		
		Scanner nameIn = new Scanner(System.in);
		String name = nameIn.nextLine();
		
		System.out.println("bonjour monsieur :"+ name);
		
		System.out.println("bonjour! veuillez introduire le nombre d'heur travailler : ");
		
		Scanner nHourIn = new Scanner(System.in);
		int nHour = nHourIn.nextInt();

		
		if(nHour < 40) {
			System.out.println("veuillez introduire le tarif par heure inferieur a 40 ");
			Scanner tarifIn40 = new Scanner(System.in);
			int tarif = tarifIn40.nextInt();
			System.out.println(tarif);
		}
		else if(nHour > 40 && nHour < 60) {
			System.out.println("veuillez introduire le tarif par heure superieur a 40 ");
			Scanner tarifsup40 = new Scanner(System.in);
			int tarif = tarifsup40.nextInt();
			double result = tarif + 0.5*tarif;
			System.out.println(result);
		}
		else {
				System.out.println(": informations erronés !");	
			}
		}
	
	}

