package com.sirma.itt.javacourse.objects.figures;

/**
 * triangle class.
 * 
 * @author Fester
 */
public class Task23Triangle extends Task23PolyLine {
	private Task23Line a;
	private Task23Line b;
	private Task23Line c;

	/**
	 * Getter method for a.
	 * 
	 * @return the a
	 */
	public Task23Line getA() {
		return a;
	}

	/**
	 * Setter method for a.
	 * 
	 * @param a
	 *            the a to set
	 */
	public void setA(Task23Line a) {
		this.a = a;
	}

	/**
	 * Getter method for b.
	 * 
	 * @return the b
	 */
	public Task23Line getB() {
		return b;
	}

	/**
	 * Setter method for b.
	 * 
	 * @param b
	 *            the b to set
	 */
	public void setB(Task23Line b) {
		this.b = b;
	}

	/**
	 * Getter method for c.
	 * 
	 * @return the c
	 */
	public Task23Line getC() {
		return c;
	}

	/**
	 * Setter method for c.
	 * 
	 * @param c
	 *            the c to set
	 */
	public void setC(Task23Line c) {
		this.c = c;
	}
}
