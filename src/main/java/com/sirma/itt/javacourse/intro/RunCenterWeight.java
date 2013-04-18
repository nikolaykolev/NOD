package com.sirma.itt.javacourse.intro;

/**
 * run class for CenterWeight.
 */
public final class RunCenterWeight {
	private static CenterWeight arr = new CenterWeight();

	/**
	 * constructor.
	 */
	private RunCenterWeight() {

	}

	/**
	 * main method launching CentherWeight.
	 * 
	 * @param args
	 *            no
	 */
	public static void main(String[] args) {

		int[] test = { 1, 1, 1, 1, 100, 1, 1, 1, 100 };
		System.out.println(arr.arrWeight(test));
	}

}
