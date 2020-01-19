package com.exercise101subprograms.app;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		//Variables declaration
		long factorial = 1;
		int nUser = -1;
		
		//Objects
		Scanner kInput = new Scanner(System.in);
		
		do {
			System.out.println("Give me a positive number:");
			nUser = kInput.nextInt();
			
			if (nUser <= 0) {
				System.out.println("Not valid number!");
			}
		} while (nUser<=0);
		
		factorial = GiveFactorial(nUser);
		
		System.out.format("The factorial of %d is: %d which is gotten by multiplying times %d", nUser, factorial, nUser);
	
		kInput.close();
	}
	
	public static long GiveFactorial(long nUser) {
		
		long factorial = 1;
		for (int i = 1; i <= nUser; i++) {
			factorial = factorial * i;
		}
		
		return factorial;
	}
	
	public static long GiveFactorial(double fac) {
		return 0;
	}

}
