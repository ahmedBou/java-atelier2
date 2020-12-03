package com.square.app;

import java.util.Scanner;


public class squareRoot {
	public static void main(String[] args) {
		while(true) {
			Scanner choiceIn = new Scanner(System.in);
			int choice = choiceIn.nextInt();
			int squareR; 
			if(choice > 0) {
				 squareR = sqrt(choice) ;
				 System.out.println("la racine carrée de "+choice+" et: " +squareR);
			 }
			else if(choice == 0) {
				break;
			}
			
			else {
				 System.out.println("entrer un nombre positif");
			 }		
		}
	System.out.println("sortir du prog");
	}


	
}
