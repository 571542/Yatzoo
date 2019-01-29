/**
 * 
 */
package no.hvl.dat109;

import java.util.List;

/**
 * @author Jostein
 *
 */
public class Blokk {
	public static String[] kategorier = {
			"Løve",
			"Slange",
			"Panda",
			"Gris",
			"Elefant",
			"Hval",
			"TreLike",
			"FireLike",
			"ToPar",
			"Hus",
			"Unike",
			"Yatzoo"			
	};
	
	/**
	 * 
	 * Tar inn rundenummer og terningverdier som parametere og regner ut poengsummen.
	 * 
	 * @param runde Integer som sier hvilken runde spillet er i. Mellom 1-12
	 * @param verdier String-tabell over alle terningverdiene
	 * @return Poengsum for runde ut i fra hvilke terninger i parameter. 
	 */
	
	public static Integer regnPoengsum(Integer runde, String[] verdier) {
		
		if(runde <= 6) {
			return antallAvDyr(kategorier[runde-1], verdier);
		}
		
		switch(runde) {				
			case 7://Tre like
				if(antallLike(3, verdier)) {
					return 3;
				}
				break;
				
			case 8://Fire like
				if(antallLike(4, verdier)) {
					return 4;
				}
				break;
				
			case 9://To par
				
				break;
				
			case 10://Hus
				if(treLike() && toPar()) {
					return 5;
				}
				break;
				
			case 11://Unike
				if(!(antallLike(2,verdier))) {
					return 5;
				}
				break;
				
			case 12://Yatzoo
				if(antallLike(5, verdier)) {
					return 4;
				}
				break;
			
		}
		return null;
	}
	
	private static Integer antallAvDyr(String dyr, String[] verdier) {
		Integer antall = null;
		for(String s : verdier) {
			if(s == dyr) {
				antall++;
			}
		}
		return antall;
	}
	
	private static boolean antallLike(Integer antall, String[] verdier) {
		
		
		
		
		return false;
	}
	
}
