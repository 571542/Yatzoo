package no.hvl.dat109;

public class Yatzoo {
	
	
	Blokk blokk;
	Spiller[] spillere;
	Integer nåværendeRunde;
	
	
	
	public void start() {
		nåværendeRunde = 0;
		
		while(nåværendeRunde < 12) {
			for(Spiller s : spillere) {
				s.spillRunde();
				
			}
			
			
			
			
			
			nåværendeRunde++;
		}
	}
	
//	private void startRunde() {
//		
//	}
	
	public Spiller finnVinner() {
		
		
		return null;
	}
}
