package com.starfall.tree;

import java.util.LinkedList;
import java.util.Queue;

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

	private int max(int a, int b) {
		return a > b ? a : b;
	}

	/**
	 * LL旋转
	 * 
	 * @param k2
	 *            k2节点
	 * @return 旋转后的根节点
	 */
	private TreeNode<T> leftLeftRotation(TreeNode<T> k2) {
		TreeNode<T> k1;
		k1 = k2.left;

		k2.left = k1.right;
		k1.right = k2;
		k2.height = max(height(k2.left), height(k2.right)) + 1;
		k1.height = max(height(k1.left), k2.height) + 1;
		return k1;
	}

	/**
	 * RR旋转
	 * 
	 * @param k1
	 *            k1节点
	 * @return 旋转后的根节点
	 */
	private TreeNode<T> rightRightRotation(TreeNode<T> k1) {
		TreeNode<T> k2;
		k2 = k1.right;

		k1.right = k2.left;
		k2.left = k1;
		k1.height = max(height(k1.left), height(k1.right)) + 1;
		k2.height = max(height(k2.right), k1.height) + 1;
		return k2;
	}

	/**
	 * LR旋转
	 * 
	 * @param k3
	 *            k3旋转
	 * @return 旋转后的根节点
	 */
	private TreeNode<T> leftRightRotation(TreeNode<T> k3) {
		// 第一步：RR旋转
		k3.left = rightRightRotation(k3.left);
		// 第二部：LL旋转
		return leftLeftRotation(k3);
	}

	/**
	 * RL旋转
	 * 
	 * @param k1
	 *            k1节点
	 * @return 旋转后的根节点
	 */
	private TreeNode<T> rightLeftRotation(TreeNode<T> k1) {
		// 第一步：LL旋转
		k1.right = leftLeftRotation(k1.right);
		// 第二部：RR旋转
		return rightRightRotation(k1);
	}

	public void insert(T key) {
		this.root = insertNode(this.root, key);
	}

	private TreeNode<T> insertNode(TreeNode<T> node, T data) {
		if (node == null) {
			node = new TreeNode<>(data);
			node.height = max(height(node.left), height(node.right)) + 1;
			return node;
		}
		// 插入到node的左子树
		if (node.data.compareTo(data) > 0) {
			node.left = insertNode(node.left, data);
			// 重新设置node的高度
			node.height = max(height(node.left), height(node.right)) + 1;
			// 判断是否平衡
			if (height(node.left) - height(node.right) == 2) {
				if (data.compareTo(node.left.data) < 0)
					node = leftLeftRotation(node);
				else
					node = leftRightRotation(node);
			}
		}
		// 插入到node的右子树
		else if (node.data.compareTo(data) < 0) {
			node.right = insertNode(node.right, data);
			// 重新设置node的高度
			node.height = max(height(node.left), height(node.right)) + 1;
			// 判断是否平衡
			if (height(node.right) - height(node.left) == 2) {
				if (data.compareTo(node.right.data) > 0)
					node = rightRightRotation(node);
				else
					node = rightLeftRotation(node);
			}
		}
		return node;
	}

	/**
	 * 前序遍历
	 */
	public void preOrder() {
		System.out.print("前序遍历： [  ");
		preOrder(this.root);
		System.out.println("]");
	}

	private void preOrder(TreeNode<T> node) {
		if (node == null) {
			return;
		}
		System.out.print(node.data + "  ");
		preOrder(node.left);
		preOrder(node.right);
	}

	/**
	 * 中序遍历
	 */
	public void midOrder() {
		System.out.print("中序遍历： [  ");
		midOrder(this.root);
		System.out.println("]");
	}

	private void midOrder(TreeNode<T> node) {
		if (node == null) {
			return;
		}
		midOrder(node.left);
		System.out.print(node.data + "  ");
		midOrder(node.right);
	}

	/**
	 * 后序遍历
	 */
	public void backOrder() {
		System.out.print("后序遍历： [  ");
		backOrder(this.root);
		System.out.println("]");
	}

	private void backOrder(TreeNode<T> node) {
		if (node == null) {
			return;
		}
		backOrder(node.left);
		backOrder(node.right);
		System.out.print(node.data + "  ");
	}

	/**
	 * 层序遍历二叉树
	 */
	public void levelOrder() {
		System.out.print("层序遍历： [  ");
		levelOrder(this.root);
		System.out.println("]");
	}

	private void levelOrder(TreeNode<T> node) {
		Queue<TreeNode<T>> q = new LinkedList<>();
		q.offer(node);
		while (!q.isEmpty()) {
			TreeNode<T> temp = q.poll();
			if (temp == null) {
				return;
			}
			System.out.print(temp.data + "  ");
			if (temp.left != null) {
				q.offer(temp.left);
			}
			if (temp.right != null) {
				q.offer(temp.right);
			}
		}
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
