package com.sirma.itt.javacourse.intro;

/**
 * run class for CenterWeight.
 */
public class RunCenterWeight {

	/**
	 * main method launching CentherWeight.
	 */
	public static void main() {
		CenterWeight arr = new CenterWeight();
		int[] test = { 1, 1, 1, 1, 100, 1, 1, 1, 100 };
		System.out.println(arr.arrWeight(test));
	}

}
