package com.sirma.itt.javacourse.intro;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Testing class for Nok Nod Task.
 * 
 * @author Fester
 */
public class TestNokNodTask {
	private NokNodTask tester = new NokNodTask();

	/**
	 * main.
	 */
	public static void main() {

	}

	/**
	 * testing GCD method.
	 */
	@Test
	public void testGcd() {
		assertEquals("GCD of 18 and 84 must be 6", 6, tester.nod(18, 84));
		assertEquals("GCD of 12 and 18 must be 6", 6, tester.nod(12, 18));
	}

	/**
	 * testing LCM method.
	 */
	@Test
	public void testLcm() {
		assertEquals("LCM of 14 and 84 must be 21", 42, tester.nok(14, 21));
		assertEquals("LCM of 84 and 120 must be 840", 840, tester.nok(84, 120));
	}

}
