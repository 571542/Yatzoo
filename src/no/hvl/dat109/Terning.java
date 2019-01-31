/**
 * 
 */
package no.hvl.dat109;

/**
 *
 * Enkel klasse for terninger. En terning kan ha forskjellige Dyr som verdier.
 *
 */
public class Terning {
	String dyr;

	public Terning() {
		trill();
	}

	public String getDyr() {
		return dyr;
	}

	public void setDyr(String dyr) {
		this.dyr = dyr;
	}
	
	/**
	 * Triller terningen
	 * 
	 */
	public void trill() {
		Integer tilf = (int) (Math.random() * 6);
		switch (tilf) {
		case 0:
			dyr = "Løve";
			break;
		case 1:
			dyr = "Slange";
			break;
		case 2:
			dyr = "Panda";
			break;
		case 3:
			dyr = "Gris";
			break;
		case 4:
			dyr = "Elefant";
			break;
		case 5:
			dyr = "Hval";
			break;
		}
	}

}
