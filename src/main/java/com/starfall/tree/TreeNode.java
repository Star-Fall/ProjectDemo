package com.starfall.tree;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.tree
 * @className TreeNode
 * @date 2019/5/21 22:43
 * @description TreeNode
 */
public class TreeNode<T> {
	public TreeNode<T> left;
	public TreeNode<T> right;
	public T value;

	public TreeNode() {

	}

	public TreeNode(T value) {
		this.value = value;
	}

	public void addLeft(T value) {
		TreeNode<T> leftChild = new TreeNode<>(value);
		this.left = leftChild;
	}

	public void addRight(T value) {
		TreeNode<T> rightChild = new TreeNode<>(value);
		this.right = rightChild;
	}
}
