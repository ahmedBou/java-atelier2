package com.greeting;
import java.util.Scanner;

public class greeting {
	
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner firstnameIn = new Scanner(System.in);
		System.out.println("whats your firstname? ");
		String firstname = firstnameIn.nextLine();
		Scanner lastnameIn = new Scanner(System.in);
		System.out.println("whats your lastname? ");
		String lastname = lastnameIn.nextLine();
		System.out.println("bonjour "+ " " + firstname +" "+ lastname );		
	}


}
