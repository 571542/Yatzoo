package no.hvl.dat109;

import javax.swing.JOptionPane;
/**
 * 
 * @author Jostein
 *
 */
public class Yatzoo {
	
	
	//Blokk blokk;
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
	
	/** 
	 * Starter spillets gang. Spillet spilles helt ut og vinneren vil bli skrevet ut når spillet er ferdig.
	 */
	public void start() {
		nåværendeRunde = 0;
		
		while(nåværendeRunde < 11) {
			for(Spiller s : spillere) {
				JOptionPane.showMessageDialog(null, ""+s.getNavn()+" sin tur! Kategori: "+Blokk.getRundeNavn(nåværendeRunde));
				s.spillRunde(nåværendeRunde);
				
			}
			nåværendeRunde++;
		}
		
		finnVinner();
	}
	
	/**
	 * Ber brukeren om å spesifisere antall og navn på spillere. Metoden skal kjøres før spillet startes. 
	 */
	public void initSpillere() {
		
		/**
		 * spillere gir deg valget mellom å velge 2, 3, 4 eller 5 spillere
		 */
		final Integer[] antallSpillereAlternativ  = { 2, 3, 4, 5 };
		
		/**
		 * Dialogboks som ber deg velge antall spillere 
		 */
		Integer spillereInput = (Integer) JOptionPane.showInputDialog(null,"Velg antall spillere: ",
			      "Antall spillere valgt ",
			        JOptionPane.QUESTION_MESSAGE, 
			        null, 
			        antallSpillereAlternativ, 
			        antallSpillereAlternativ[0]);
		
		Integer antall = spillereInput;
		spillere = new Spiller[antall];
		
	    for(int i = 1; i <= antall; i++) {
	    	String navn = JOptionPane.showInputDialog(null, "Gi navn på spiller nummer " + i +": ");
	    	spillere[i-1] = new Spiller(navn);
	    }

	
	}
	
	/**
	 * 
	 * Metoden finner hvilken spiller har høyest poengsum. 
	 * 
	 * Den skriver ut poengsummen til alle spillere i konsollen. 
	 * 
	 * @return Returnerer spilleren i spillere-tabellen med høyest poengsum. 
	 */
	public Spiller finnVinner() {
		Spiller vinner = spillere[0];
		
		for(Spiller s : spillere) {
			System.out.println(s);
			if(s.getPoengsum() > vinner.getPoengsum()) {
				vinner = s;
			}
		}
		
		System.out.println(vinner.getNavn() + " er vinneren med "+vinner.getPoengsum()+" poeng!");
		
		return vinner;
	}
}
