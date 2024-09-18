package no.hvl.dat100;

import javax.swing.JOptionPane;

public class Innlevering01 {

	public static void main(String[] args) {
	
	for(int i = 1; i <= 10; i++) {
		int antall=0;
		antall++;
		
	String input = JOptionPane.showInputDialog("Skriv inn poengsummen din (0-100) " + "Eleven nummer "+i);
	int poeng = Integer.parseInt(input); 
	
	if(poeng>=90 && poeng<=100) {
		JOptionPane.showMessageDialog(null, "Din karakter er A");
		}
	else if(poeng>=80 && poeng<=89) {
		JOptionPane.showMessageDialog(null, "Din karakter er B");
	}
	else if(poeng>=60 && poeng<=79) {
		JOptionPane.showMessageDialog(null, "Din karakter er C");
	}
	else if(poeng>=50 && poeng<=59) {
		JOptionPane.showMessageDialog(null, "Din karakter er D");
	}
	else if(poeng>=40 && poeng<=49) {
		JOptionPane.showMessageDialog(null, "Din karakter er E");
	}
	else if(poeng>=0 && poeng<=39) {
		JOptionPane.showMessageDialog(null, "Din karakter er F"); 
	}
	else {i=-1; 
	   JOptionPane.showInputDialog(null, "Feil tall, prøv på nytt");
		
	}
	
	}
	
		}		
	}
	





