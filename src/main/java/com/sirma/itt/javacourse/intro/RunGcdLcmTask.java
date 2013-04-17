package com.sirma.itt.javacourse.intro;

public class RunGcdLcmTask {

	/**
	 * run class for GcdLcmTask.
	 */
	public static void main() {
		GcdLcmTask calc = new GcdLcmTask();
		int num1 = 12;
		int num2 = 32;

		System.out.println(calc.gcd(num1, num2));
		System.out.println(calc.lcm(num1, num2));
	}

}
