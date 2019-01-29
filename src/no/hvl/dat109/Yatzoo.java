package no.hvl.dat109;

public class Yatzoo {
	
	
	Blokk blokk;
	Spiller[] spillere;
	Integer n�v�rendeRunde;
	
	
	
	public void start() {
		n�v�rendeRunde = 0;
		
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
