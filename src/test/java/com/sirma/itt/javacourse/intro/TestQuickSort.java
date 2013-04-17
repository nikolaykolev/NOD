package com.sirma.itt.javacourse.intro;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

/**
 * testing array functions.
 * 
 * @author Fester
 */
public class TestQuickSort {
	private QuickSort arr = new QuickSort();

	/**
	 * testing minimum element function.
	 */
	@Test
	public void testQuickSort() {
		int[] test1 = { 1, 4, 7, 9, 6, 4, 3, 4, 6, 84, 55, 34, 76 };
		int[] test1Sorted = { 1, 4, 7, 9, 6, 4, 3, 4, 6, 84, 55, 34, 76 };
		Arrays.sort(test1Sorted);
		for (int i = 0; i < test1Sorted.length; i++) {
			System.out.print(test1[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < test1Sorted.length; i++) {
			System.out.print(test1Sorted[i] + " ");
		}
		assertEquals(test1Sorted, arr.qSort(test1, 0, test1.length - 1));

		int[] test2 = { 3, 6, 8, 4, 43, 6, 76 };
		int[] test2Sorted = test1.clone();
		Arrays.sort(test1Sorted);
		assertEquals(test2Sorted, arr.qSort(test2, 0, test2.length - 1));

		int[] test3 = { 7, 8, 9, 4, 54, 3, 4, 6 };
		int[] test3Sorted = test1.clone();
		Arrays.sort(test3Sorted);
		assertEquals(test3Sorted, arr.qSort(test3, 0, test3.length - 1));
	}
}
