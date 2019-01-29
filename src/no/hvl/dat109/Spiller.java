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

	public void spillRunde(Integer runde) {
		AlleTerninger.trillTerninger();
		poengsum = regnPoengsum(runde, AlleTerninger.getVerdier());
		/**
		 * TODO regn ut poengsum
		 * Vet ikke om det skal skje i denne klassen eller i AlleTerninger klassen
		 */

		System.out.println();
	}

}
