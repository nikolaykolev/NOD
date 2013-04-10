package com.sirma.itt.javacourse.intro;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * htth.
 * 
 * @author Fester
 */
public class testNOD {
	NOD tester = new NOD();

	/**
	 * hfhj.
	 * 
	 * @param args
	 *            jh
	 */
	public static void main(final String[] args) {

	}

	// testing NOD
	@Test
	public void NODtest() {
		assertEquals("GCD of 18 and 84 must be 6", 6, tester.nod(18, 84));
		assertEquals("GCD of 12 and 18 must be 6", 6, tester.nod(12, 18));
	}

	// testing NOD
	@Test
	public void NOKtest() {
		assertEquals("LCM of 14 and 84 must be 21", 42, tester.nok(14, 21));
		assertEquals("LCM of 84 and 120 must be 840", 840, tester.nok(84, 120));
	}

}
