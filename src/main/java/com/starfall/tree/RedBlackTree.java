package com.starfall.tree;

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
	 *            选择的节点
	 */
	private void leftRotate(TreeNode<T> x) {
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

	static class TreeNode<T> {
		private T data;
		private boolean color;
		private TreeNode<T> left;
		private TreeNode<T> right;
		private TreeNode<T> parent;

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
