package com.starfall.tree;

import java.util.List;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.tree
 * @className BinarySortTree
 * @date 2019/5/26 22:38
 * @description 二叉排序树
 */
public class BinarySortTree<T extends Comparable> {

	private TreeNode<T> root;

	public BinarySortTree() {
		this.root = new TreeNode<>();
	}

	public BinarySortTree(T data) {
		this.root = new TreeNode<>(data);
	}

	public BinarySortTree(List<T> list) {
		for (T t : list) {
			insertBST(this.root, t);
		}
	}

	public void insertBST(TreeNode<T> node, T data) {
		if (node == null) {
			node = new TreeNode<>(data);
		} else if (node.data.compareTo(data) < 0) {
			insertBST(node.left, data);
		} else {
			insertBST(node.right, data);
		}
	}

	/**
	 * 中序遍历
	 */
	public void midOrder() {
		System.out.print("[");
		midOrder(this.root);
		System.out.println("]");
	}

	private void midOrder(TreeNode<T> node) {
		if (node == null) {
			return;
		}
		midOrder(node.left);
		System.out.print(node.data + "\t");
		midOrder(node.right);
	}

	static class TreeNode<T> {
		private TreeNode<T> left;
		private TreeNode<T> right;
		private T data;

		public TreeNode() {

		}

		public TreeNode(T data) {
			this.data = data;
		}

		public TreeNode<T> getLeft() {
			return left;
		}

		public TreeNode<T> getRight() {
			return right;
		}

		public T getData() {
			return data;
		}
	}
}
