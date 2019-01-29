package no.hvl.dat109;

import javax.swing.JOptionPane;

public class Yatzoo {
	
	
	Blokk blokk;
	Spiller[] spillere;
	Integer nåværendeRunde;
	
	public static int antallSpillere() {
		/**
		 * spillere gir deg valget mellom å velge 2, 3, 4 eller 5 spillere
		 */
		final Integer[] spillere  = { 2, 3, 4, 5 };
		
		/**
		 * Dialogboks som ber deg velge antall spillere 
		 */
		Integer spillereInput = (Integer) JOptionPane.showInputDialog(null,"Velg antall spillere: ",
			      "Antall spillere valgt ",
			        JOptionPane.QUESTION_MESSAGE, 
			        null, 
			        spillere, 
			        spillere[0]);

		return spillereInput;


	}
	
	
	public void start() {
		nåværendeRunde = 0;
		
		while(nåværendeRunde < 12) {
			for(Spiller s : spillere) {
				s.spillRunde(nåværendeRunde);
				
			}
			
			
			
			
			
			nåværendeRunde++;
		}
	}
	
//	private void startRunde() {
//		
//	}
	
	public Spiller finnVinner() {
		
		
		return null;
	}
}
