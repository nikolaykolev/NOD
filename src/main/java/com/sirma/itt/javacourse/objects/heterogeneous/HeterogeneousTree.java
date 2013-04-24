package com.sirma.itt.javacourse.objects.heterogeneous;

/**
 * binary tree.
 * 
 * @author Fester
 */
public class HeterogeneousTree {

	private HeterogeneousNode root;

	/**
	 * constructor.
	 * 
	 * @param data
	 *            the root
	 */
	public HeterogeneousTree(String data) {

		this.root = new HeterogeneousNode(data);
	}

	/**
	 * override method for node adding method.
	 * 
	 * @param data
	 *            root
	 */
	void addNode(String data) {
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
	public void addNode(String data, HeterogeneousNode node) {
		HeterogeneousNode current = node;
		if (current == null) {
			current = root;
		}

		if (data.compareTo(current.getValue()) > 0) {
			if (current.getRight() == null) {
				current.setRight(new HeterogeneousNode(data));
			} else {
				addNode(data, current.getRight());
			}
		} else {
			if (current.getLeft() == null) {
				current.setLeft(new HeterogeneousNode(data));
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
	boolean search(String data) {
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
	public boolean search(String data, HeterogeneousNode node) {
		HeterogeneousNode current;
		if (node == null) {
			current = root;
		}
		current = node;
		if (data.compareTo(current.getValue()) > 0) {
			if (current.getRight() != null) {
				return search(data, current.getRight());
			}
		} else if (data.compareTo(current.getValue()) < 0) {
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
	void printTree(HeterogeneousNode node) {
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
	public HeterogeneousNode getRoot() {
		return root;
	}

	/**
	 * Setter method for root.
	 * 
	 * @param root
	 *            the root to set
	 */
	public void setRoot(HeterogeneousNode root) {
		this.root = root;
	}

}
