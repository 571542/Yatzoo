package no.hvl.dat109;

import javax.swing.JOptionPane;

public class Yatzoo {
	
	
	Blokk blokk;
	Spiller[] spillere;
	Integer n�v�rendeRunde;
	
	public static int antallSpillere() {
		/**
		 * spillere gir deg valget mellom � velge 2, 3, 4 eller 5 spillere
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
		n�v�rendeRunde = 0;
		
		while(n�v�rendeRunde < 12) {
			for(Spiller s : spillere) {
				s.spillRunde(n�v�rendeRunde);
				
			}
			
			
			
			
			
			n�v�rendeRunde++;
		}
	}
	
//	private void startRunde() {
//		
//	}
	
	public Spiller finnVinner() {
		
		
		return null;
	}
}
