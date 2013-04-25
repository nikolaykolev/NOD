package com.sirma.itt.javacourse.objects.figures;

/**
 * parallelogram.
 * 
 * @author Fester
 */
public class Task23parall extends Task23PolyLine {
	private int angle;
	private Task23Line a;
	private Task23Line b;

	/**
	 * Getter method for angle.
	 * 
	 * @return the angle
	 */
	public int getAngle() {
		return angle;
	}

	/**
	 * Setter method for angle.
	 * 
	 * @param angle
	 *            the angle to set
	 */
	public void setAngle(int angle) {
		this.angle = angle;
	}

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

}
