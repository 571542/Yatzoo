package no.hvl.dat109.test;

import org.junit.Test;
import no.hvl.dat109.Blokk;
import static org.junit.Assert.assertEquals;
/**
 * 
 * JUnit testklasse for utregning av poeng. 
 *
 */
public class PoengUtregningTest {
	
	String[] terninger1 = {
			"Løve",
			"Løve",
			"Slange",
			"Panda",
			"Hval"
	};
	
	String[] terninger2 = {
			"Hval",
			"Hval",
			"Hval",
			"Gris",
			"Elefant"
	};
	
	String[] terninger3 = {
			"Elefant",
			"Elefant",
			"Elefant",
			"Elefant",
			"Elefant"
	};
	
	String[] terninger4 = {
			"Elefant",
			"Gris",
			"Hval",
			"Panda",
			"Løve"
	};
	
	String[] terninger5 = {
			"Gris",
			"Panda",
			"Panda",
			"Panda",
			"Gris"
	};
	
	@Test
	public void løveTest() {
		assertEquals(Integer.valueOf(2), Blokk.regnPoengsum(0, terninger1));
		assertEquals(Integer.valueOf(0), Blokk.regnPoengsum(0, terninger2));
		assertEquals(Integer.valueOf(0), Blokk.regnPoengsum(0, terninger3));
		assertEquals(Integer.valueOf(1), Blokk.regnPoengsum(0, terninger4));
		assertEquals(Integer.valueOf(0), Blokk.regnPoengsum(0, terninger5));
	}
	
	@Test
	public void slangeTest() {
		assertEquals(Integer.valueOf(1), Blokk.regnPoengsum(1, terninger1));
		assertEquals(Integer.valueOf(0), Blokk.regnPoengsum(1, terninger2));
		assertEquals(Integer.valueOf(0), Blokk.regnPoengsum(1, terninger3));
		assertEquals(Integer.valueOf(0), Blokk.regnPoengsum(1, terninger4));
		assertEquals(Integer.valueOf(0), Blokk.regnPoengsum(1, terninger5));
	}
	
	@Test
	public void pandaTest() {
		assertEquals(Integer.valueOf(1), Blokk.regnPoengsum(2, terninger1));
		assertEquals(Integer.valueOf(0), Blokk.regnPoengsum(2, terninger2));
		assertEquals(Integer.valueOf(0), Blokk.regnPoengsum(2, terninger3));
		assertEquals(Integer.valueOf(1), Blokk.regnPoengsum(2, terninger4));
		assertEquals(Integer.valueOf(3), Blokk.regnPoengsum(2, terninger5));		
	}

	@Test
	public void grisTest() {
		assertEquals(Integer.valueOf(0), Blokk.regnPoengsum(3, terninger1));
		assertEquals(Integer.valueOf(1), Blokk.regnPoengsum(3, terninger2));
		assertEquals(Integer.valueOf(0), Blokk.regnPoengsum(3, terninger3));
		assertEquals(Integer.valueOf(1), Blokk.regnPoengsum(3, terninger4));
		assertEquals(Integer.valueOf(2), Blokk.regnPoengsum(3, terninger5));
	}
	
	@Test
	public void elefantTest() {
		assertEquals(Integer.valueOf(0), Blokk.regnPoengsum(4, terninger1));
		assertEquals(Integer.valueOf(1), Blokk.regnPoengsum(4, terninger2));
		assertEquals(Integer.valueOf(5), Blokk.regnPoengsum(4, terninger3));
		assertEquals(Integer.valueOf(1), Blokk.regnPoengsum(4, terninger4));
		assertEquals(Integer.valueOf(0), Blokk.regnPoengsum(4, terninger5));
	}
		
	@Test
	public void hvalTest() {
		assertEquals(Integer.valueOf(1), Blokk.regnPoengsum(5, terninger1));
		assertEquals(Integer.valueOf(3), Blokk.regnPoengsum(5, terninger2));
		assertEquals(Integer.valueOf(0), Blokk.regnPoengsum(5, terninger3));
		assertEquals(Integer.valueOf(1), Blokk.regnPoengsum(5, terninger4));
		assertEquals(Integer.valueOf(0), Blokk.regnPoengsum(5, terninger5));
	}
	
	@Test
	public void treLikeTest() {
		assertEquals(Integer.valueOf(0), Blokk.regnPoengsum(6, terninger1));
		assertEquals(Integer.valueOf(3), Blokk.regnPoengsum(6, terninger2));
		assertEquals(Integer.valueOf(3), Blokk.regnPoengsum(6, terninger3));
		assertEquals(Integer.valueOf(0), Blokk.regnPoengsum(6, terninger4));
		assertEquals(Integer.valueOf(3), Blokk.regnPoengsum(6, terninger5));
	}
	
	@Test
	public void fireLikeTest() {
		assertEquals(Integer.valueOf(0), Blokk.regnPoengsum(7, terninger1));
		assertEquals(Integer.valueOf(0), Blokk.regnPoengsum(7, terninger2));
		assertEquals(Integer.valueOf(4), Blokk.regnPoengsum(7, terninger3));
		assertEquals(Integer.valueOf(0), Blokk.regnPoengsum(7, terninger4));
		assertEquals(Integer.valueOf(0), Blokk.regnPoengsum(7, terninger5));
	}
	
	@Test
	public void toParTest() {
		assertEquals(Integer.valueOf(0), Blokk.regnPoengsum(8, terninger1));
		assertEquals(Integer.valueOf(0), Blokk.regnPoengsum(8, terninger2));
		assertEquals(Integer.valueOf(0), Blokk.regnPoengsum(8, terninger3));
		assertEquals(Integer.valueOf(0), Blokk.regnPoengsum(8, terninger4));
		assertEquals(Integer.valueOf(4), Blokk.regnPoengsum(8, terninger5));		
	}
	
	@Test
	public void husTest() {
		assertEquals(Integer.valueOf(0), Blokk.regnPoengsum(9, terninger1));
		assertEquals(Integer.valueOf(0), Blokk.regnPoengsum(9, terninger2));
		assertEquals(Integer.valueOf(0), Blokk.regnPoengsum(9, terninger3));
		assertEquals(Integer.valueOf(0), Blokk.regnPoengsum(9, terninger4));
		assertEquals(Integer.valueOf(5), Blokk.regnPoengsum(9, terninger5));		
	}
	
	@Test
	public void unikTest() {
		assertEquals(Integer.valueOf(0), Blokk.regnPoengsum(10, terninger1));
		assertEquals(Integer.valueOf(0), Blokk.regnPoengsum(10, terninger2));
		assertEquals(Integer.valueOf(0), Blokk.regnPoengsum(10, terninger3));
		assertEquals(Integer.valueOf(5), Blokk.regnPoengsum(10, terninger4));
		assertEquals(Integer.valueOf(0), Blokk.regnPoengsum(10, terninger5));		
	}
	
	@Test
	public void yatzooTest() {
		assertEquals(Integer.valueOf(0), Blokk.regnPoengsum(11, terninger1));
		assertEquals(Integer.valueOf(0), Blokk.regnPoengsum(11, terninger2));
		assertEquals(Integer.valueOf(10), Blokk.regnPoengsum(11, terninger3));
		assertEquals(Integer.valueOf(0), Blokk.regnPoengsum(11, terninger4));
		assertEquals(Integer.valueOf(0), Blokk.regnPoengsum(11, terninger5));		
	}
	
}
