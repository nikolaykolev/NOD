package com.sirma.itt.javacourse.intro;

import org.junit.Test;

/**
 * Testing class for Center Weight task.
 * 
 * @author Fester
 */
public class TestHangman {
	private Hangman hang = new Hangman();

	/**
	 * testing center weight method.
	 */
	@Test
	public void testHangman() {
		String word = "domati";

		String inputData = "o\na\n b vdo";
		System.setIn(new java.io.ByteArrayInputStream(inputData.getBytes()));

		hang.hangmanMain(word);
	}

	/**
	 * testing null data.
	 */
	@Test(expected = NullPointerException.class)
	public void testWeightNull() {

		// assertEquals("null array", hang.hangmanMain(null));
	}

}