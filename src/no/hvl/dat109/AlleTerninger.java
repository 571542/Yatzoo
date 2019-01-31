package no.hvl.dat109;
/**
 * 
 */


import javax.swing.JOptionPane;

/**
 * 
 * Denne klassen er en samling av alle Terning-objekter. Har metoder for å trille alle terninger og for å hente verdier til alle terninger. 
 * 
 */
public class AlleTerninger {
	public static Terning[] terninger = { new Terning(), new Terning(), new Terning(), new Terning(), new Terning() };


	/**
	 * 
	 * Triller terningene i AlleTerninger klassen, opp til 3 ganger. 
	 * 
	 */
	public static void trillTerninger() {
		//triller terningene en første gang
		for (Terning t : terninger) {
			t.trill();
		}

		String[] res = null;
		//Denne for-løkken går gjennom de to ekstra kastemulighetene til spilleren
		for (int i = 0; i < 2; i++) {
			
			res = AlleTerninger.getVerdier();
			String input = JOptionPane.showInputDialog(null, "Dine terninger ble: 1:" + res[0] + ", 2:" + res[1]
					+ ", 3:" + res[2] + ", 4:" + res[3] + ", 5:" + res[4] + "\nHvilke vil du bytte ut? Skriv tall. F.eks. 125 for å bytte terning nr 1, 2 og 5");
			/**
			 * TODO sjekk om input er tall, eller om den er null
			 */
			
			
			if(input.matches("[0-9]{0,6}") && !input.equals("")) {
				char[] cha = input.toCharArray();
				Integer[] tal = new Integer[cha.length];
				for (int j = 0; j < cha.length; j++) {
					tal[j] = Character.getNumericValue(cha[j]) - 1;
				}

				AlleTerninger.trillTerninger(tal);
			}
			
			
			
		}
		res = AlleTerninger.getVerdier();
		JOptionPane.showMessageDialog(null, "Dine terninger ble: 1:" + res[0] + ", 2:" + res[1]
				+ ", 3:" + res[2] + ", 4:" + res[3] + ", 5:" + res[4]);

	}

	/**
	 * 
	 * Triller utvalgte terninger om igjen
	 * 
	 * @param skalTrilles En integer-tabell med indeksene på terningene som skal trilles igjen
	 */
	static void trillTerninger(Integer[] skalTrilles) {
		for (Integer i : skalTrilles) {
			terninger[i].trill();
		}
	}

	public Integer antall(String dyr) {
		Integer antall = 0;
		for (Terning t : terninger) {
			if (t.getDyr() == dyr) {
				antall++;
			}
		}
		return antall;
	}

	/**
	 * 
	 * Metoden henter en tabell med alle terning-verdiene til terningene i AlleTerninger. 
	 * 
	 * @return En tabell med alle terningverdier. 
	 */
	public static String[] getVerdier() {
		String[] retur = new String[5];

		for (int i = 0; i < terninger.length; i++) {
			retur[i] = terninger[i].getDyr();
		}

		return retur;
	}

	public Terning[] getTerninger() {
		return terninger;
	}

}
