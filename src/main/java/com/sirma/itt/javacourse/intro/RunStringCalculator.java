package com.sirma.itt.javacourse.intro;

public class RunStringCalculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str1 = "88876599945568";
		String str2 = "7768778899";

		StringCalculator strCalc = new StringCalculator();
		System.out.println(strCalc.calc(str1, str2));
	}

}
