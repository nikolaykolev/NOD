package com.sirma.itt.javacourse.intro;

/**
 * NOT READY!!!.
 * 
 * @author Fester
 */
public class CenterWeight {
	/**
	 * @param arr
	 *            - array with integers
	 * @return center weight of the array
	 */
	public int arrWeight(int[] arr) {
		int sum = 0;
		int sum2 = 0;
		int i;

		if (arr == null)
			return 0;

		for (i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		sum = sum / 2;
		i = 0;
		while (sum >= sum2) {
			sum2 += arr[i];
			i++;
		}

		return i;
	}
}
