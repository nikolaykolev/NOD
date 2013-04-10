package com.sirma.itt.javacourse.intro;

import java.util.Arrays;

/**
 * masivi.
 * 
 * @author Fester
 */
public class ArraysTask {

	/**
	 * main.
	 * 
	 * @param args
	 *            x
	 */
	public static void main(String[] args) {
		final int[] arr = { 4, 7, 9, 3, 1, 7, 5, 12, 32, 67 };

		System.out.println(printArray(arr));
	}

	/**
	 * @param arr
	 *            integer array
	 * @return minElement
	 */
	public static int getMinElement(final int[] arr) {
		Arrays.sort(arr);
		return arr[0];
	}

	/**
	 * @param arr
	 *            integer array
	 * @return sum of elements
	 */
	public static int getSum(final int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}

		return sum;
	}

	/**
	 * @param arr
	 *            integer array
	 * @return sum of elements
	 */
	public static String printArray(final int[] arr) {
		String elements = "";
		for (int i = 0; i < arr.length; i++) {
			elements += arr[i];
			if (i < arr.length - 1)
				elements += ", ";
		}

		return elements;
	}
}
