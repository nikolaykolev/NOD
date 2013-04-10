package com.sirma.itt.javacourse.intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import javax.swing.text.html.MinimalHTMLWriter;

public class arrays {

	public static void main(String[] args) {
		int arr[] = {4,7,9,3,1,7,5,12,32,67};
		
		System.out.println(getMinElement(arr));
	}

	
	public static int getMinElement(int [] arr) {
		Arrays.sort(arr);
		return arr[0];
	}
	
	public static int getSum(int [] arr) {
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];
		}
		
		return sum;
	}
}
