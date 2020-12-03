package com.bankAccount.app;

import java.util.Scanner;

public class bankAccount {
	
	public static void main(String[] args) {
		Scanner accountIn = new Scanner(System.in);
		System.out.println("enter your account");
		double account = accountIn.nextInt();
		
		Scanner cumulIn = new Scanner(System.in);
		System.out.println("enter number of mounth: ");
		double cumul = cumulIn.nextInt();
		
		double res = account * 0.01 * cumul;
		
		System.out.println("you accumulate " + res);
	}
	

}
