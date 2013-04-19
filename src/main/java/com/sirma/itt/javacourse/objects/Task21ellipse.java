package com.sirma.itt.javacourse.objects;

import java.awt.Point;

// TODO: Auto-generated Javadoc
/**
 * The Class Task2ellipse.
 * 
 * @author Fester
 */
public class Task21ellipse extends Figure {

	/** The center. */
	private Point center;
	private int width;
	private int height;

	/**
	 * Gets the width.
	 * 
	 * @return width
	 */
	private int getWidth() {
		return width;
	}

	/**
	 * Sets the width.
	 * 
	 * @param width
	 *            width
	 */
	private void setWidth(int width) {
		this.width = width;
	}

	/**
	 * Gets the height.
	 * 
	 * @return height
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * Sets the height.
	 * 
	 * @param height
	 *            height
	 */
	public void setHeight(int height) {
		this.height = height;
	}

	/**
	 * Sets the center.
	 * 
	 * @param center
	 *            the new center
	 */
	private void setCenter(Point center) {
		this.center = center;
	}

	/**
	 * Gets the center.
	 * 
	 * @return the center
	 */
	private Point getCenter() {
		return this.center;
	}

}
