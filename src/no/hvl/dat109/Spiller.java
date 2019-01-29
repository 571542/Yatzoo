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

	public static final Integer[] spillere  = { 2, 3, 4, 5 };


	public void spillRunde(Integer runde) {
		AlleTerninger.trillTerninger();
		poengsum = Blokk.regnPoengsum(runde, AlleTerninger.getVerdier());
		/**
		 * TODO regn ut poengsum
		 * Vet ikke om det skal skje i denne klassen eller i AlleTerninger klassen
		 */

		System.out.println();
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
