package com.sirma.itt.javacourse.objects.figures;

import java.awt.Point;

/**
 * class for arc.
 * 
 * @author Fester
 */
public class Task21arc extends Task21ellipse {
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
	public void arc(Point p1, Point p2, int angle) {
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
	public void setP1(Point p1) {
		this.p1 = p1;
	}

	/**
	 * get start point.
	 * 
	 * @return start point
	 */
	public Point getP1() {
		return p1;
	}

	/**
	 * set end point.
	 * 
	 * @param p2
	 *            end point
	 */
	public void setP2(Point p2) {
		this.p2 = p2;
	}

	/**
	 * get end point.
	 * 
	 * @return end point
	 */
	public Point getP2() {
		return p2;
	}

	/**
	 * set angle.
	 * 
	 * @param angle
	 *            angle
	 */
	public void setAngle(int angle) {
		this.angle = angle;
	}

	/**
	 * get angle.
	 * 
	 * @return angle
	 */
	public int getAngle() {
		return angle;
	}
}
