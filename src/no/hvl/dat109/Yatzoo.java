package no.hvl.dat109;

public class Yatzoo {
	
	
	Blokk blokk;
	Spiller[] spillere;
	Integer n�v�rendeRunde;
	
	
	
	public void start() {
		n�v�rendeRunde = 0;
		
		while(n�v�rendeRunde < 12) {
			for(Spiller s : spillere) {
				s.spillRunde();
				
			}
			
			
			
			
			
			n�v�rendeRunde++;
		}
	}
	
//	private void startRunde() {
//		
//	}
	
	public Spiller finnVinner() {
		
		
		return null;
	}
}
