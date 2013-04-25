package com.sirma.itt.javacourse.objects.figures;

/**
 * rhombus class.
 * 
 * @author Fester
 */
public class Task22rhombus extends Task22fourSide {
	private int width;
	private Task22square a;

	/**
	 * Getter method for width.
	 * 
	 * @return the width
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * Setter method for width.
	 * 
	 * @param width
	 *            the width to set
	 */
	public void setWidth(int width) {
		this.width = width;
	}

	/**
	 * Getter method for a.
	 * 
	 * @return the a
	 */
	public Task22square getA() {
		return a;
	}

	/**
	 * Setter method for a.
	 * 
	 * @param a
	 *            the a to set
	 */
	public void setA(Task22square a) {
		this.a = a;
	}

}
