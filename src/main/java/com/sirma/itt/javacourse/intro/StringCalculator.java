package com.sirma.itt.javacourse.intro;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Fester
 */
public class StringCalculator {

	/**
	 * calculating aggregation of 2 numbers with random length.
	 * 
	 * @param num1
	 *            random length number
	 * @param num2
	 *            random length number
	 * @return aggregation of the 2 numbers as string
	 */
	public String calc(String num1, String num2) {

		Pattern pattern = Pattern.compile("[^0-9]");
		Matcher m1 = pattern.matcher(num1);
		Matcher m2 = pattern.matcher(num2);

		// wrong data tests
		if (num1 == null || num2 == null) {
			throw new IllegalArgumentException();
		} else {
			if (m1.find() || m2.find()) {
				throw new IllegalArgumentException();
			}
		}

		char[] number1 = num1.toCharArray();
		char[] number2 = num2.toCharArray();
		int temp;
		int num1Length = number1.length - 1;
		int num2Length = number2.length - 1;
		char[] res = new char[num2Length + 2];
		res[0] = '1';
		int z = 0;
		int zero = 0;
		int diff;
		int i;

		// calculating

		if (num1Length > num2Length) {
			diff = num1Length;

			for (i = num2Length; i >= 0; i--) {
				temp = Character.getNumericValue(number2[i])
						+ Character.getNumericValue(number1[diff]);
				if (temp >= 10) {
					number1[diff] = Character.forDigit(temp % 10, 10);

					number1[diff - 1] = (char) (number1[diff - 1] + 1);

					zero = diff;
					if (number1[diff - 1] == ':') {
						number1[diff - 1] = '0';
					}
					while (number1[zero - 1] == '0') {
						zero--;
						number1[zero - 1] = (char) (number1[zero - 1] + 1);
						if (number1[zero - 1] == ':')
							number1[zero - 1] = '0';
					}

					diff--;
				} else {
					number1[diff] = Character.forDigit(temp % 10, 10);
					diff--;
				}
			}
			res = number1.clone();
		} else if (num2Length > num1Length) {
			diff = num2Length;

			for (i = num1Length; i >= 0; i--) {
				temp = Character.getNumericValue(number1[i])
						+ Character.getNumericValue(number2[diff]);
				if (temp >= 10) {
					number2[diff] = Character.forDigit(temp % 10, 10);

					number2[diff - 1] = (char) (number2[diff - 1] + 1);

					zero = diff;
					if (number2[diff - 1] == ':') {
						number2[diff - 1] = '0';
					}
					while (number2[zero - 1] == '0') {
						zero--;
						number2[zero - 1] = (char) (number2[zero - 1] + 1);
						if (number2[zero - 1] == ':')
							number2[zero - 1] = '0';
					}

					diff--;
				} else {
					number2[diff] = Character.forDigit(temp % 10, 10);
					diff--;
				}
			}
			res = number2.clone();
		} else {
			for (i = num1Length; i >= 0; i--) {
				temp = Character.getNumericValue(number1[i])
						+ Character.getNumericValue(number2[i]);
				if (temp >= 10) {
					number2[i] = Character.forDigit(temp % 10, 10);
					if (i >= 1) {
						number2[i - 1] = (char) (number2[i - 1] + 1);

						zero = i;
						if (number2[i - 1] == ':') {
							number2[i - 1] = '0';
							zero = i;
						}
						while (number2[zero - 1] == '0') {
							zero--;
							number2[zero - 1] = (char) (number2[zero - 1] + 1);
						}

					} else {
						while (z < num2Length + 1) {
							res[z + 1] = number2[z];
							z++;
						}

					}
				} else {
					number1[i] = Character.forDigit(temp % 10, 10);
					i--;
				}
			}
		}

		return String.copyValueOf(res);
	}
}
