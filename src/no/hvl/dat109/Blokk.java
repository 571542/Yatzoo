/**
 * 
 */
package no.hvl.dat109;

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
				if(antallLike(3, verdier) != null) {
					return 3;
				}
				break;
				
			case 8://Fire like
				if(antallLike(4, verdier) != null) {
					return 4;
				}
				break;
				
			case 9://To par
				
				break;
				
			case 10://Hus
				break;
				
			case 11://Unike
				if((antallLike(2,verdier))== null) {
					return 5;
				}
				break;
				
			case 12://Yatzoo
				if(antallLike(5, verdier) != null) {
					return 10;
				}
				break;
			
		}
		return null;
	}
	
	/**
	 * 
	 * Metoden finner hvor mange antall det er av et type dyr blant en string-tabell.
	 * 
	 * @param dyr Hvilket dyr det letes etter
	 * @param verdier String-tabell over alle terningverdiene
	 * @return Antall av ønsket dyr i verdier-tabellen. 
	 */
	private static Integer antallAvDyr(String dyr, String[] verdier) {
		Integer antall = null;
		for(String s : verdier) {
			if(s == dyr) {
				antall++;
			}
		}
		return antall;
	}
	
	/**
	 * 
	 * Metoden finner om det er et anntall like eller mer av en verdi av alle verdier i terning-tabellen. 
	 * 
	 * @param antall Hvor mange like av hver man skal finne. F.eks. ved tre like må man sette antall = 3.
	 * @param verdier String-tabell over alle terningverdiene
	 * @return Returnerer hvilket dyr det er så mange antall i tabellen. Returnerer null hvis ikke. 
	 */
	private static String antallLike(Integer antall, String[] verdier) {
		Integer like;
		
		for(String s : verdier) {
			like = 0;
			for(String r : verdier) {
				if(r.equals(s)) {
					like++;
				}
				
				if(like >= antall) {
					return s;
				}
			}
		}
				
		return null;
	}
		
}
