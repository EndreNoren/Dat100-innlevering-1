package no.hvl.dat100;

import java.util.Scanner;

public class Innleverig01oppgave3 {

	public static void main(String[] args) {
		
	try (Scanner scanner = new Scanner(System.in)) {
		System.out.println("Skriv inn et positivt tall");
		
		int n = scanner.nextInt();
		
		if(n > 0) {
			int fakulitet = fakulitet(n);
			System.out.println(n + "! = " + fakulitet);
		}
			else {
				System.out.println("n må være større enn 0");
				}
	       }
			
			
		}
	
	private static int fakulitet(int n) {
		int resultat = 1;
		for (int i = 1; i <= n; i++) {
			resultat *= i;
		}
		return resultat;
	}
				
}


