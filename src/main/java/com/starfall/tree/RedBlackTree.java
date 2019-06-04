package com.starfall.tree;

import sun.reflect.generics.tree.Tree;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.tree
 * @className RedBlackTree
 * @date 2019/6/4 10:41
 * @description RedBlackTree红黑树
 */
public class RedBlackTree<T extends Comparable<T>> {

	private TreeNode<T> root;
	private static final boolean RED = false;
	private static final boolean BLACK = true;

	/**
	 * 左旋
	 * 
	 * @param x
	 *            旋转的节点
	 */
	private void leftRotate(TreeNode<T> x) {
		if (x == null) {
			return;
		}
		TreeNode<T> y = x.right;
		// y的左子树设置为x的右子树
		x.right = y.left;
		// y左子树的父节点设置为x
		if (y.left != null) {
			y.left.parent = x;
		}
		// x的父节点设置为y的父节点
		y.parent = x.parent;
		// 设置x的父节点的左右节点为y
		if (x.parent == null) {
			this.root = y;
		} else if (x.parent.left == x) {
			x.parent.left = y;
		} else if (x.parent.right == x) {
			x.parent.right = y;
		}
		// x设置为y的左节点
		y.left = x;
		// y设置为x的父节点
		x.parent = y;
	}

	/**
	 * 右旋
	 * 
	 * @param y
	 *            旋转的节点
	 */
	private void rightRotate(TreeNode<T> y) {
		if (y == null) {
			return;
		}
		TreeNode<T> x = y.left;
		// x的右子树设置为y的左子树
		y.left = x.right;
		// y设置为x右子树的父节点
		if (x.right != null) {
			x.right.parent = y;
		}
		// y的父节点设置x的父节点
		x.parent = y.parent;
		// 设置y父节点的左右子树为x
		if (y.parent == null) {
			this.root = x;
		} else if (y.parent.right == y) {
			y.parent.right = x;
		} else if (y.parent.left == y) {
			y.parent.left = x;
		}
		// 设置x的右子树为y
		x.right = y;
		// 设置x为y的父节点
		y.parent = x;
	}

	/**
	 * 插入节点
	 * 
	 * @param data
	 *            插入数据
	 */
	public void insert(T data) {
		if (data != null) {
			insert(new TreeNode<>(data, BLACK));
		}
	}

	private void insert(TreeNode<T> node) {
		// 依据二叉排序树特效插入节点
		TreeNode<T> current = this.root;
		if (current == null) {
			this.root = node;
			return;
		}
		TreeNode<T> parent = null;
		while (current != null) {
			parent = current;
			if (current.data.compareTo(node.data) > 0)
				current = current.left;
			else if (current.data.compareTo(node.data) < 0)
				current = current.right;
			else
				return;
		}
		node.parent = parent;
		if (parent.data.compareTo(node.data) > 0) {
			parent.left = node;
		} else {
			parent.right = node;
		}
		// 着色
		node.color = RED;
		// 修正
		fixAfterInsertion(node);
	}

	/**
	 * 插入节点后调整
	 * 
	 * @param node
	 *            调整的节点
	 */
	private void fixAfterInsertion(TreeNode<T> node) {

	}

	static class TreeNode<T> {
		private T data;
		private boolean color;
		private TreeNode<T> left;
		private TreeNode<T> right;
		private TreeNode<T> parent;

		TreeNode() {

		}

		TreeNode(T data) {
			this.data = data;
		}

		TreeNode(T data, boolean color) {
			this.data = data;
			this.color = color;
		}

		public T getData() {
			return data;
		}

		public void setData(T data) {
			this.data = data;
		}

		public boolean isColor() {
			return color;
		}

		public void setColor(boolean color) {
			this.color = color;
		}

		public TreeNode<T> getLeft() {
			return left;
		}

		public void setLeft(TreeNode<T> left) {
			this.left = left;
		}

		public TreeNode<T> getRight() {
			return right;
		}

		public void setRight(TreeNode<T> right) {
			this.right = right;
		}

		public TreeNode<T> getParent() {
			return parent;
		}

		public void setParent(TreeNode<T> parent) {
			this.parent = parent;
		}
	}
}
