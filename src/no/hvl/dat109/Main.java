package no.hvl.dat109;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
			String[] res = AlleTerninger.getVerdier();
			String input = JOptionPane.showInputDialog(null, "Dine terninger ble: 1:" + res[0] + ", 2:" + res[1] + ", 3:"
					+ res[2] + ", 4:" + res[3] + ", 5:" + res[4] + ", 6:" + res[5] + "\nKven vil du bytte ut? Skriv tal.");
			char[] cha = input.toCharArray();
			Integer[] tal = new Integer[cha.length];
			for (int j = 0; j < cha.length; j++) {
				tal[j] = Character.getNumericValue(cha[j])-1;
			}
	
			AlleTerninger.trillTerninger(tal);

		}
	}

}
