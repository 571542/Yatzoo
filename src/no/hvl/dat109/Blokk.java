/**
 * 
 */
package no.hvl.dat109;

/**
 * 
 * Denne klassen holder styr pa de forskjellige kategoriene, og inneholder metoden for a regne ut poengsum for alle kategorier/runder. 
 *
 */
public class Blokk {
	public static String[] kategorier = {
			"Love",
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
	 * @param runde Integer som sier hvilken runde spillet er i. Mellom 0-11
	 * @param verdier String-tabell over alle terningverdiene
	 * @return Poengsum for runde ut i fra hvilke terninger i parameter. 
	 */
	public static Integer regnPoengsum(Integer runde, String[] verdier) {
		
		if(runde < 6) {
			return antallAvDyr(kategorier[runde], verdier);
		}
		
		switch(runde) {
			case 6://Tre like
				if(antallLike(3, verdier) != null) {
					return 3;
				}
				break;
				
			case 7://Fire like
				if(antallLike(4, verdier) != null) {
					return 4;
				}
				break;
				
			case 8://To par
				if(toPar(verdier)) {
					return 4;
				}
				break;
				
			case 9://Hus
				if(toPar(verdier) && antallLike(3, verdier) != null) {
					return 5;
				}
				break;

			case 10://Unike
				if((antallLike(2,verdier)) == null) {
					return 5;
				}
				break;
			case 11://Yatzoo
				if(antallLike(5, verdier) != null) {
					return 10;
				}
				break;
			
		}
		return 0;
	}
	
	/**
	 * 
	 * Metoden finner hvor mange antall det er av et type dyr blant en string-tabell. Brukes i regnPoengsum().
	 * 
	 * @param dyr Hvilket dyr det letes etter
	 * @param verdier String-tabell over alle terningverdiene
	 * @return Antall av onsket dyr i verdier-tabellen. 
	 */
	private static Integer antallAvDyr(String dyr, String[] verdier) {
		Integer antall = 0;
		for(String s : verdier) {
			if(s == dyr) {
				antall++;
			}
		}
		return antall;
	}
	
	/**
	 * Metoden finner om det er et anntall like eller mer av en verdi av alle verdier i terning-tabellen. Brukes i regnPoengsum().
	 * 
	 * @param antall Hvor mange like av hver man skal finne. F.eks. ved tre like ma man sette antall = 3.
	 * @param verdier String-tabell over alle terningverdiene
	 * @return Returnerer hvilket dyr det er sa mange antall i tabellen. Returnerer null hvis ikke. 
	 */
	private static String antallLike(Integer antall, String[] verdier) {
		Integer like = 0;
		
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
	
	/**
	 * Sjekker om det er to par av ulik sort i terning-tabellen. Brukes i regnPoengsum().
	 * 
	 * @param verdier String-tabell over alle terningverdiene
	 * @return True hvis det er to par, false hvis ikke. 
	 */
	private static boolean toPar(String[] verdier) {
		/**
		 * TODO Denne metoden fungerer ikke som tenkt. Det ma ordnes.
		 */
		boolean toPar = false;
		String forstePar = antallLike(2, verdier);
		for (String s : verdier) {
			int like = 0;
			for (String r : verdier) {
				if(r.equals(s) && r != forstePar) {
					like++;
				}
				
				if(like >= 2) {
					toPar = true;
				}
			}
		}
		return (toPar);
	}
	
	/**
	 * Metode som returnerer navnet pa runden gitt rundenummer. 
	 * 
	 * @param runde Rundenummer
	 * @return String som tilsvarer runden
	 */
	public static String getRundeNavn(Integer runde) {
		return kategorier[runde];
	}
	
}
