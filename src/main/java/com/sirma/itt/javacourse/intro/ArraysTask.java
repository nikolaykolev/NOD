package com.sirma.itt.javacourse.intro;

import java.util.Arrays;

/**
 * masivi.
 * 
 * @author Fester
 */
public class ArraysTask {

	/**
	 * calculating minimum element of array.
	 * 
	 * @param arr
	 *            integer array
	 * @return minElement
	 */
	public int getMinElement(int[] arr) {
		Arrays.sort(arr);
		return arr[0];
	}

	/**
	 * calculating sum of all elements in array.
	 * 
	 * @param arr
	 *            integer array
	 * @return sum of elements
	 */
	public int getSum(int[] arr) {
		int sum = 0;
		int arrLength = arr.length;
		for (int i = 0; i < arrLength; i++) {
			sum += arr[i];
		}

		return sum;
	}

	/**
	 * print all elements of an array.
	 * 
	 * @param arr
	 *            integer array
	 */
	public String printArray(int[] arr) {
		String elements = "";
		int arrLength = arr.length;
		for (int i = 0; i < arrLength; i++) {
			elements += arr[i];
			if (i < arrLength - 1) {
				elements += ", ";
			}
		}

		System.out.println(elements);
		return elements;
	}
}
