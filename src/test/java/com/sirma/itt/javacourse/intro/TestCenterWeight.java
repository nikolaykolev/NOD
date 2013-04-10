package com.sirma.itt.javacourse.intro;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Testing class for Center Weight task.
 * 
 * @author Fester
 */
public class TestCenterWeight {
	private CenterWeight tester = new CenterWeight();

	/**
	 * main.
	 */
	public static void main() {

	}

	/**
	 * testing center weight method.
	 */
	@Test
	public void testWeight() {
		int[] z = { 1, 2, 3, 4, 5 };
		int[] z2 = { 12, 3, 2, 4, 3, 1, 1, 1, 1, 8 };
		assertEquals("center must be 4", 4, tester.arrWeight(z));
		assertEquals("center must be 2", 4, tester.arrWeight(z2));
	}
}