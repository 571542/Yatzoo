/**
 * 
 */
package no.hvl.dat109;

import javax.swing.JOptionPane;

/**
 * @author Jostein
 *
 */
public class Spiller {
	private String navn;
	private Integer poengsum;
<<<<<<< HEAD
	
	public Spiller(String navn) {
		this.navn = navn;
		this.poengsum = 0;
	}
	
	/**
	 * Spiller runden for én spiller. 
	 * 
	 * @param runde Den nåværende runden. 
	 */
=======

	public static final Integer[] spillere  = { 2, 3, 4, 5 };


>>>>>>> f406317153fea89de00c011ce9a7f24837569e53
	public void spillRunde(Integer runde) {
		AlleTerninger.trillTerninger();
		Integer poengRunde = Blokk.regnPoengsum(runde, AlleTerninger.getVerdier());
		poengsum += poengRunde;
		JOptionPane.showMessageDialog(null, "Du fikk "+poengRunde+" poeng. Din totale poengsum er nå: " +poengsum);
	}

	public String getNavn() {
		return navn;
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}

	public Integer getPoengsum() {
		return poengsum;
	}

	public void setPoengsum(Integer poengsum) {
		this.poengsum = poengsum;
	}

	@Override
	public String toString() {
		return navn + ": "+ poengsum+" poeng.";
	}

}
