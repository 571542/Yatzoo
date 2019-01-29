package no.hvl.dat109;

public class Yatzoo {
	
	
	Blokk blokk;
	Spiller[] spillere;
	Integer nåværendeRunde;
	
	
	
	public void start() {
		nåværendeRunde = 0;
		
		while(nåværendeRunde < 12) {
			for(Spiller s : spillere) {
				s.spillRunde(nåværendeRunde);
				
			}
			
			
			
			
			
			nåværendeRunde++;
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
		
		System.out.println(vinner + " er vinneren med "+vinner.getPoengsum()+" poeng!");
		
		return vinner;
	}
}
