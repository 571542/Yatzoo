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
		
		//Linja under gjort av Ole. Forteller spilleren n�v�rende runde
		JOptionPane.showMessageDialog(null, "Runde " + n�v�rendeRunde + 1);
		
		while(n�v�rendeRunde < 12) {
			for(Spiller s : spillere) {
				s.spillRunde(n�v�rendeRunde);
				
			}
			
			
			
			
			
			n�v�rendeRunde++;
		}
	}
	
	
	/**
	 * 
	 * Metoden finner hvilken spiller har h�yest poengsum. 
	 * 
	 * Den skriver ut poengsummen til alle spillere i konsollen. 
	 * 
	 * @return Returnerer spilleren i spillere-tabellen med h�yest poengsum. 
	 */
	public Spiller finnVinner() {
		Spiller vinner = spillere[0];
		
		for(Spiller s : spillere) {
			System.out.println(s);
			if(s.getPoengsum() > vinner.getPoengsum()) {
				vinner = s;
			}
		}
		
		System.out.println(vinner + " er vinneren med "+vinner.getPoengsum()+" poeng!");
		
		return vinner;
	}
}
