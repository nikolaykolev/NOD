package com.sirma.itt.javacourse.objects;

/**
 * run class for sumator.
 * 
 * @author Fester
 */
final class RunSumator {
	private static Sumator sm = new Sumator();

	/**
	 * @param args
	 *            no
	 */
	public static void main(String[] args) {

		System.out.println(sm.sum(5, 5));

	}

}
