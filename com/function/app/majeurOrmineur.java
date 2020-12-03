package com.function.app;

public class majeurOrmineur {
	
	/*public static String majeur( int age, String genre) {
		String result = "";
		//System.out.print(age +" "+ genre);
		if(age>=18 && genre == "homme") {
			result = "vous est un "+ genre + " "+ "est vous etes majeur";
		}
		if(age<18 && genre == "homme") {
			result = "vous est un "+ genre + " "+ "est vous etes mineur";
		}
		if(age>=18 && genre == "femme") {
			result = "vous est un "+ genre + " "+ "est vous etes majeur";
		}
		if(age<18 && genre == "femme") {
			result = "vous est un "+ genre + " "+ "est vous etes mineur";
		}
		
		return result;
	}
	*/
	public static boolean homme(String genre) {
		boolean isgenre = true;
		if(genre == "femme") {
			isgenre = false;
		}
		return isgenre;
	}
	
	public static boolean majeur(int age) {
		boolean ismajeur = true;
		if(age < 18) {
			ismajeur = false;
		}
		return ismajeur;
	}
	
	public static String genreAge( int age, String genre) {
		String res = "";
		if(homme(genre)) {
			res += "vous etes un homme";
			if(majeur(age)) {
				res += " et vous etes majeur";
			}else {
				res += "vous etes mineur";
			}
		}else {
			res += "vous etes femme";
		}if(majeur(age)){
			res += " et vous etes majeur";
		}else {
			res += "vous etes mineur";
		}
		
		return res;
	}
	
	
	
	public static void main(String[] args) {
		System.out.println(genreAge(12, "femme"));
		
		/*
		System.out.println(majeur(16, "femme"));
		System.out.println(majeur(18, "homme"));
		System.out.println(majeur(18, "femme"));
		*/
		
	
	}

}
