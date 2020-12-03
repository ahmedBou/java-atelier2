package com.factSom.app;
import java.util.Scanner;


public class factSomm {
	
	public static void main(String[] args) {		
		while(true) {
			Scanner choiceIn = new Scanner(System.in);
			int choice = choiceIn.nextInt();
			System.out.println("entrer 1 pour factoriel, 2 pour somme , 0 pour quitter:");
			int res = 1;
			switch(choice) {
				case 1:{	
					for(int i = 5; i>0; i--) {
						res *= i;	
					}
					System.out.println("the factoriel of 5 is:"+ res);;
					break;
				}
				case 2:{
					//System.out.println("hey");
					for(int i = 5; i>0; i--) {
						res += i;	
					}
					System.out.println("the sum of 5 is:"+ res);;
					break;
				}
			}
			if(choice == 0) {
				break;
			}
		}
	}

}
