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
	Integer navaerendeRunde;
	
	/** 
	 * Starter spillets gang. Spillet spilles helt ut og vinneren vil bli skrevet ut nar spillet er ferdig.
	 */
	public void start() {
		navaerendeRunde = 0;
		
		while(navaerendeRunde < 11) {
			for(Spiller s : spillere) {
				JOptionPane.showMessageDialog(null, ""+s.getNavn()+" sin tur! Kategori: "+Blokk.getRundeNavn(navaerendeRunde));
				s.spillRunde(navaerendeRunde);
				
			}
			navaerendeRunde++;
		}
		
		finnVinner();
	}
	
	/**
	 * Ber brukeren om a spesifisere antall og navn pa spillere. Metoden skal kjores for spillet startes. 
	 */
	public void initSpillere() {
		
		/**
		 * spillere gir deg valget mellom a velge 2, 3, 4 eller 5 spillere
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
	    	String navn = JOptionPane.showInputDialog(null, "Gi navn pa spiller nummer " + i +": ");
	    	spillere[i-1] = new Spiller(navn);
	    }

	
	}
	
	/**
	 * 
	 * Metoden finner hvilken spiller har hoyest poengsum. 
	 * 
	 * Den skriver ut poengsummen til alle spillere i konsollen. 
	 * 
	 * @return Returnerer spilleren i spillere-tabellen med hoyest poengsum. 
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
