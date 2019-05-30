package com.starfall.tree;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.tree
 * @className BalanceBinaryTree
 * @date 2019/5/30 15:48
 * @description BalanceBinaryTree平衡二叉树/AVL树
 */
public class BalanceBinaryTree<T extends Comparable<T>> {

	private TreeNode<T> root;

	/**
	 * 节点的高度
	 * 
	 * @param node
	 *            节点
	 * @return 高度
	 */
	private int height(TreeNode<T> node) {
		if (node != null) {
			return node.height;
		}
		return 0;
	}

	private TreeNode<T> leftLeftRotation(TreeNode<T> k2) {
		TreeNode<T> k1;
		k1 = k2.left;

		k2.left = k1.right;
		k1.right = k2;
		k2.height = (height(k2.left) >= height(k2.right) ? height(k2.left) : height(k2.right)) + 1;
		k1.height = (height(k1.left) >= k2.height ? height(k1.left) : k2.height) + 1;
		return k1;
	}

	private TreeNode<T> insertNode(TreeNode<T> node, T data) {
		if (node == null) {
			node = new TreeNode<>(data);
			return node;
		}
		// 插入到node的左子树
		if (node.data.compareTo(data) > 0) {
			node = insertNode(node.left, data);
			// 判断是否平衡

		}

		node.height = (height(node.left) >= height(node.right) ? height(node.left) : height(node.right)) + 1;
		return node;
	}

	static class TreeNode<T> {
		private T data;
		private int height;
		private TreeNode<T> left;
		private TreeNode<T> right;

		TreeNode() {

		}

		TreeNode(T data) {
			this.data = data;
		}
	}
}
