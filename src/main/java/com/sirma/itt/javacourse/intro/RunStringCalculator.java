package com.sirma.itt.javacourse.intro;

/**
 * Run class for string calculator.
 * 
 * @author Fester
 */
public final class RunStringCalculator {
	private static StringCalculator strCalc = new StringCalculator();

	/**
	 * constructor.
	 */
	private RunStringCalculator() {

	}

	/**
	 * main.
	 * 
	 * @param args
	 *            no args
	 */
	public static void main(String[] args) {
		String str1 = "asd";
		String str2 = "88876634513111";

		System.out.println(strCalc.calc(str1, str2));
	}

}
