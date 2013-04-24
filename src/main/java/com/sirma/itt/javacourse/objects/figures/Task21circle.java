package com.sirma.itt.javacourse.objects.figures;

import java.awt.Point;

// TODO: Auto-generated Javadoc
/**
 * The Class Task2circle.
 * 
 * @author Fester
 */
public class Task21circle extends Task21ellipse {

	/** The center. */
	private Point center;

	/** The radius. */
	private int radius;

	/**
	 * Circle.
	 * 
	 * @param center
	 *            set center
	 * @param radius
	 *            set radius
	 */
	public void circle(Point center, int radius) {
		this.setCenter(center);
		this.setRadius(radius);
	}

	/**
	 * Sets the center.
	 * 
	 * @param center
	 *            the new center
	 */
	@Override
	public void setCenter(Point center) {
		this.center = center;
	}

	/**
	 * Gets the center.
	 * 
	 * @return the center
	 */
	@Override
	public Point getCenter() {
		return this.center;
	}

	/**
	 * Sets the radius.
	 * 
	 * @param radius
	 *            the new radius
	 */
	public void setRadius(int radius) {
		this.radius = radius;
	}

	/**
	 * Gets the radius.
	 * 
	 * @return the radius
	 */
	public int getRadius() {
		return this.radius;
	}
}
