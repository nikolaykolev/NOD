package com.sirma.itt.javacourse.intro;

/**
 * @author Fester
 */
final class RunArraysTask {

	/**
	 * run class for ArrayTask.
	 */
	public static void main(String[] args) {
		ArraysTask arr = new ArraysTask();
		final int[] test = { 100, 12, 12, 1, 2, 3 };
		System.out.println(arr.getMinElement(test));
		System.out.println(arr.getSum(test));
		System.out.println(arr.printArray(test));
	}

}
