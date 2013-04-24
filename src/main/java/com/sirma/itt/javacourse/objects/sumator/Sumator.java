package com.sirma.itt.javacourse.objects.sumator;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * sum of 2 random type variables.
 * 
 * @author Fester
 */
public class Sumator {

	/**
	 * sum of 2 ints.
	 * 
	 * @param num1
	 *            number
	 * @param num2
	 *            number
	 * @return sum
	 */
	public int sum(int num1, int num2) {
		return num1 + num2;
	}

	/**
	 * sum of 2 floats.
	 * 
	 * @param num1
	 *            number
	 * @param num2
	 *            number
	 * @return sum
	 */
	public float sum(float num1, float num2) {
		return num1 + num2;
	}

	/**
	 * sum of 2 Strings.
	 * 
	 * @param num1
	 *            number
	 * @param num2
	 *            number
	 * @return sum
	 */
	public String sum(String num1, String num2) {
		int sum = Integer.parseInt(num1) + Integer.parseInt(num2);

		return Integer.toString(sum);
	}

	/**
	 * sum of 2 Big Integers.
	 * 
	 * @param num1
	 *            number
	 * @param num2
	 *            number
	 * @return sum
	 */
	public BigInteger sum(BigInteger num1, BigInteger num2) {
		BigInteger res = num1.add(num2);
		return res;
	}

	/**
	 * sum of 2 Big Decimals.
	 * 
	 * @param num1
	 *            number
	 * @param num2
	 *            number
	 * @return sum
	 */
	public BigDecimal sum(BigDecimal num1, BigDecimal num2) {
		BigDecimal res = num1.add(num2);
		return res;
	}
}
