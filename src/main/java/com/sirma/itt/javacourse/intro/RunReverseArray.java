package com.sirma.itt.javacourse.intro;

public class RunReverseArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ReverseArray rev = new ReverseArray();
		int[] arr = { 1, 4, 7, 9, 6, 4, 3, 4, 6, 84, 55, 34, 76 };
		int[] newArr = rev.reverseArray(arr);

		for (int i = 0; i < newArr.length; i++) {
			System.out.print(newArr[i] + " ");
		}

	}

}
