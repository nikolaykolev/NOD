package com.sirma.itt.javacourse.intro;

/**
 * Run class for string calculator.
 * 
 * @author Fester
 */
class RunStringCalculator {

	/**
	 * main.
	 * 
	 * @param args
	 *            no args
	 */
	public static void main(String[] args) {
		String str1 = "asd";
		String str2 = "88876634513111";

		StringCalculator strCalc = new StringCalculator();
		System.out.println(strCalc.calc(str1, str2));
	}

}
