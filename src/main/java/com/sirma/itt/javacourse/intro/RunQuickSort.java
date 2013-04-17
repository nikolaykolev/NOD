package com.sirma.itt.javacourse.intro;

public class RunQuickSort {

	/**
	 * @param args
	 */
	public static void main(String args[]) {
		QuickSort qs = new QuickSort();
		int[] arr = { 1, 4, 7, 9, 6, 4, 3, 4, 6, 84, 55, 34, 76 };
		int[] newArr = qs.qSort(arr, 0, arr.length - 1);

		for (int i = 0; i < newArr.length; i++) {
			System.out.print(newArr[i] + " ");
		}
	}

}
