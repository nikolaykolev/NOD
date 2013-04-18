package com.sirma.itt.javacourse.intro;

/**
 * @author Fester
 */
public final class RunArraysTask {
	private static ArraysTask arr = new ArraysTask();

	/**
	 * constructor.
	 */
	private RunArraysTask() {

	}

	/**
	 * run class for ArrayTask.
	 * 
	 * @param args
	 *            no
	 */
	public static void main(String[] args) {

		final int[] test = { 100, 12, 12, 1, 2, 3 };
		System.out.println(arr.getMinElement(test));
		System.out.println(arr.getSum(test));
		System.out.println(arr.printArray(test));
	}

}
