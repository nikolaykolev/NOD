package com.sirma.itt.javacourse.objects;

/**
 * binary tree.
 * 
 * @author Fester
 */
public class HomogeneousTree {

	private HomogeneousNode root;

	/**
	 * constructor.
	 * 
	 * @param data
	 *            the root
	 */
	public HomogeneousTree(int data) {

		this.root = new HomogeneousNode(data);
	}

	/**
	 * override method for node adding method.
	 * 
	 * @param data
	 *            root
	 */
	void addNode(int data) {
		addNode(data, root);
	}

	/**
	 * add node method.
	 * 
	 * @param data
	 *            value to be added
	 * @param node
	 *            root
	 */
	public void addNode(int data, HomogeneousNode node) {
		HomogeneousNode current = node;
		if (current == null) {
			current = root;
		}

		if (data > current.getValue()) {
			if (current.getRight() == null) {
				current.setRight(new HomogeneousNode(data));
			} else {
				addNode(data, current.getRight());
			}
		} else {
			if (current.getLeft() == null) {
				current.setLeft(new HomogeneousNode(data));
			} else {
				addNode(data, current.getLeft());
			}
		}
	}

	/**
	 * override for search method.
	 * 
	 * @param data
	 *            value to be found
	 * @return true/false
	 */
	boolean search(int data) {
		return search(data, root);
	}

	/**
	 * search method.
	 * 
	 * @param data
	 *            value to be found
	 * @param node
	 *            root
	 * @return true/false
	 */
	public boolean search(int data, HomogeneousNode node) {
		HomogeneousNode current;
		if (node == null) {
			current = root;
		}
		current = node;
		if (data > current.getValue()) {
			if (current.getRight() != null) {
				return search(data, current.getRight());
			}
		} else if (data < current.getValue()) {
			if (current.getLeft() != null) {
				return search(data, current.getLeft());
			}
		} else {
			return true;
		}
		return false;
	}

	/**
	 * override for print method.
	 */
	void printTree() {
		printTree(root);
	}

	/**
	 * print method.
	 * 
	 * @param node
	 *            root
	 */
	void printTree(HomogeneousNode node) {
		if (node.getLeft() != null) {
			printTree(node.getLeft());
		}
		System.out.println(node.getValue());

		if (node.getRight() != null) {
			printTree(node.getRight());
		}

	}

	/**
	 * Getter method for root.
	 * 
	 * @return the root
	 */
	public HomogeneousNode getRoot() {
		return root;
	}

	/**
	 * Setter method for root.
	 * 
	 * @param root
	 *            the root to set
	 */
	public void setRoot(HomogeneousNode root) {
		this.root = root;
	}

}
