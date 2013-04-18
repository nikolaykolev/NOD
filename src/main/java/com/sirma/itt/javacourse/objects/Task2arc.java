package com.sirma.itt.javacourse.objects;

import java.awt.Point;

/**
 * class for arc.
 * 
 * @author Fester
 */
public class Task2arc extends Task2ellipse {
	private Point p1;
	private Point p2;
	private int angle;

	/**
	 * set new arc.
	 * 
	 * @param p1
	 *            start point
	 * @param p2
	 *            end point
	 * @param angle
	 *            angle
	 */
	private void arc(Point p1, Point p2, int angle) {
		this.setP1(p1);
		this.setP2(p2);
		this.setAngle(angle);
	}

	/**
	 * set start point.
	 * 
	 * @param p1
	 *            start point
	 */
	private void setP1(Point p1) {
		this.p1 = p1;
	}

	/**
	 * get start point.
	 * 
	 * @return start point
	 */
	private Point getP1() {
		return p1;
	}

	/**
	 * set end point.
	 * 
	 * @param p2
	 *            end point
	 */
	private void setP2(Point p2) {
		this.p2 = p2;
	}

	/**
	 * get end point.
	 * 
	 * @return end point
	 */
	private Point getP2() {
		return p2;
	}

	/**
	 * set angle.
	 * 
	 * @param angle
	 *            angle
	 */
	private void setAngle(int angle) {
		this.angle = angle;
	}

	/**
	 * get angle.
	 * 
	 * @return angle
	 */
	private int getAngle() {
		return angle;
	}
}
