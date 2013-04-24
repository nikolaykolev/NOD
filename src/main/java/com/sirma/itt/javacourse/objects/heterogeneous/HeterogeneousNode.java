package com.sirma.itt.javacourse.objects.heterogeneous;

/**
 * class for one node of a tree.
 * 
 * @author Fester
 */
public class HeterogeneousNode {
	private String value;
	private HeterogeneousNode left;
	private HeterogeneousNode right;

	/**
	 * constructor.
	 * 
	 * @param data
	 *            node's value
	 */
	public HeterogeneousNode(String data) {
		this.value = data;
	}

	/**
	 * Getter method for value.
	 * 
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * Setter method for value.
	 * 
	 * @param value
	 *            the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	}

	/**
	 * Getter method for left.
	 * 
	 * @return the left
	 */
	public HeterogeneousNode getLeft() {
		return left;
	}

	/**
	 * Setter method for left.
	 * 
	 * @param left
	 *            the left to set
	 */
	public void setLeft(HeterogeneousNode left) {
		this.left = left;
	}

	/**
	 * Getter method for right.
	 * 
	 * @return the right
	 */
	public HeterogeneousNode getRight() {
		return right;
	}

	/**
	 * Setter method for right.
	 * 
	 * @param right
	 *            the right to set
	 */
	public void setRight(HeterogeneousNode right) {
		this.right = right;
	}
}
