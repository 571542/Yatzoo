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
	
	public Spiller(String navn) {
		this.navn = navn;
		this.poengsum = 0;
	}
	
	/**
	 * Spiller runden for �n spiller. 
	 * 
	 * @param runde Den n�v�rende runden. 
	 */

	public static final Integer[] spillere  = { 2, 3, 4, 5 };

	public void spillRunde(Integer runde) {
		AlleTerninger.trillTerninger();
		Integer poengRunde = Blokk.regnPoengsum(runde, AlleTerninger.getVerdier());
		poengsum += poengRunde;
		JOptionPane.showMessageDialog(null, "Du fikk "+poengRunde+" poeng. Din totale poengsum er n�: " +poengsum);
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
