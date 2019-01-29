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
			"L�ve",
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
<<<<<<< HEAD
			case 6://Tre like
				if(antallLike(3, verdier) != null) {
=======
			case 7://Tre like
				if(antallLike(3, verdier)) {
>>>>>>> f406317153fea89de00c011ce9a7f24837569e53
					return 3;
				}
				break;
				
<<<<<<< HEAD
			case 7://Fire like
				if(antallLike(4, verdier) != null) {
=======
			case 8://Fire like
				if(antallLike(4, verdier)) {
>>>>>>> f406317153fea89de00c011ce9a7f24837569e53
					return 4;
				}
				break;
				
			case 8://To par
				if(toPar(verdier)) {
					return 4;
				}
				break;
				
<<<<<<< HEAD
			case 9://Hus
				if(toPar(verdier) && antallLike(3, verdier) != null) {
=======
			case 10://Hus
				if(treLike() && toPar()) {
>>>>>>> f406317153fea89de00c011ce9a7f24837569e53
					return 5;
				}
				break;
				
<<<<<<< HEAD
			case 10://Unike
				if((antallLike(2,verdier)) == null) {
=======
			case 11://Unike
				if(!(antallLike(2,verdier))) {
>>>>>>> f406317153fea89de00c011ce9a7f24837569e53
					return 5;
				}
				break;
				
<<<<<<< HEAD
			case 11://Yatzoo
				if(antallLike(5, verdier) != null) {
					return 10;
=======
			case 12://Yatzoo
				if(antallLike(5, verdier)) {
					return 4;
>>>>>>> f406317153fea89de00c011ce9a7f24837569e53
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
	 * @return Antall av �nsket dyr i verdier-tabellen. 
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
	
<<<<<<< HEAD
	/**
	 * Metoden finner om det er et anntall like eller mer av en verdi av alle verdier i terning-tabellen. 
	 * 
	 * @param antall Hvor mange like av hver man skal finne. F.eks. ved tre like m� man sette antall = 3.
	 * @param verdier String-tabell over alle terningverdiene
	 * @return Returnerer hvilket dyr det er s� mange antall i tabellen. Returnerer null hvis ikke. 
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
	
	/**
	 * Sjekker om det er to par av ulik sort i terning-tabellen
	 * 
	 * @param verdier String-tabell over alle terningverdiene
	 * @return True hvis det er to par, false hvis ikke. 
	 */
	private static boolean toPar(String[] verdier) {
		boolean toPar = false;
		String f�rstePar = antallLike(2, verdier);
		for (String s : verdier) {
			for (int i = 0; i < verdier.length; i++) {
				if (verdier[i].equals(s) && !verdier[i].equals(f�rstePar)) {
					toPar = true;
				}
			}
		}
		return (toPar);
	}
	
	/**
	 * Metode som returnerer navnet p� runden gitt rundenummer. 
	 * 
	 * @param runde Rundenummer
	 * @return String som tilsvarer runden
	 */
	public static String getRundeNavn(Integer runde) {
		return kategorier[runde];
	}
=======
	private static boolean antallLike(Integer antall, String[] verdier) {
		
		
		
>>>>>>> f406317153fea89de00c011ce9a7f24837569e53
		
		return false;
	}
	
}
