package com.starfall.tree.plus;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.tree.plus
 * @className BinaryTree
 * @date 2019/5/22 16:25
 * @description BinaryTree二叉树
 */
public class BinaryTree<T> {

	private TreeNode<T> root;
	private static int LIST_INDEX = 0;
	private static int LEVEL_LIST_INDEX = 1;

	public BinaryTree() {
		root = new TreeNode<>();
	}

	public BinaryTree(T data) {
		root = new TreeNode<>();
		root.data = data;
	}

	private BinaryTree(TreeNode<T> node) {
		this.root = node;
	}

	/**
	 * 增加某个节点的左右子树
	 */
	public void todo() {

	}

	public void destroyTree() {
		this.root = null;
	}

	/**
	 * 获取根节点
	 * 
	 * @return 根节点
	 */
	public TreeNode<T> getRoot() {
		return this.root;
	}

	/**
	 * 根据节点数据获取子树
	 * 
	 * @param t
	 *            节点数据
	 * @return 子树
	 */
	public BinaryTree<T> getBTree(T t) {
		TreeNode<T> node = getNodeByValue(this.root, t);
		if (node == null) {
			return null;
		} else {
			return new BinaryTree<>(node);
		}
	}

	private TreeNode<T> getNodeByValue(TreeNode<T> node, T t) {
		if (node == null) {
			return null;
		} else if (node.data == t) {
			return node;
		} else {
			return getNodeByValue(node.left, t) == null ? getNodeByValue(node.right, t) : getNodeByValue(node.left, t);
		}
	}

	/**
	 * 获取叶子节点数目
	 * 
	 * @return 叶子节点数目
	 */
	public int getLeafNum() {
		return getLeafNum(this.root);
	}

	private int getLeafNum(TreeNode<T> node) {
		if (node == null) {
			return 0;
		} else if (node.left == null && node.right == null) {
			return 1;
		} else {
			return getLeafNum(node.left) + getLeafNum(node.right);
		}

	}

	/**
	 * 获取节点个数
	 *
	 * @return 节点个数
	 */
	public int getNodeNum() {
		return getNodeNum(this.root);
	}

	private int getNodeNum(TreeNode<T> node) {
		if (node == null) {
			return 0;
		}
		return getNodeNum(node.left) + getNodeNum(node.right) + 1;
	}

	/**
	 * 获取树的深度
	 *
	 * @return 树的深度
	 */
	public int getTreeDepth() {
		return getTreeDepth(this.root);
	}

	private int getTreeDepth(TreeNode<T> node) {
		if (node == null) {
			return 0;
		}
		int leftDepth = getTreeDepth(node.left) + 1;
		int rightDepth = getTreeDepth(node.right) + 1;
		return leftDepth > rightDepth ? leftDepth : rightDepth;
	}

	/**
	 * 设置左子树
	 *
	 * @param tree
	 *            左子树
	 */
	public void setLeftTree(BinaryTree<T> tree) {
		this.root.left = tree.root;
	}

	/**
	 * 设置右子树
	 *
	 * @param tree
	 *            右子树
	 */
	public void setRightTree(BinaryTree<T> tree) {
		this.root.right = tree.root;
	}

	/**
	 * 层序遍历创建二叉树
	 * 
	 * @param list list参数
	 */
	public void levelCreateTree(List<T> list) {
		this.root = levelCreateTree(this.root, list, LEVEL_LIST_INDEX);
	}

	private TreeNode<T> levelCreateTree(TreeNode<T> node, List<T> list, int i) {
		if (i > list.size() || list.get(i - 1) == null) {
			node = null;
		} else {
			T t = list.get(i - 1);
			node = new TreeNode<>(t);
			node.left = levelCreateTree(node.left, list, 2 * i);
			node.right = levelCreateTree(node.right, list, 2 * i + 1);
		}
		return node;
	}

	/**
	 * 前序创建二叉树
	 *
	 * @param list
	 *            list参数
	 */
	public void preCreateTree(List<T> list) {
		this.root = preCreTree(this.root, list);
	}

	private TreeNode<T> preCreTree(TreeNode<T> node, List<T> list) {
		T t = list.get(LIST_INDEX++);
		if (t == null) {
			node = null;
		} else {
			node = new TreeNode<>(t);
			node.left = preCreTree(node.left, list);
			node.right = preCreTree(node.right, list);
		}
		return node;
	}

	/**
	 * 前序遍历
	 */
	public void preOrder() {
		System.out.print("[");
		preOrder(this.root);
		System.out.println("]");
	}

	private void preOrder(TreeNode<T> node) {
		if (node == null) {
			return;
		}
		System.out.print(node.data + "\t");
		preOrder(node.left);
		preOrder(node.right);
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

	/**
	 * 后序遍历
	 */
	public void backOrder() {
		System.out.print("[");
		backOrder(this.root);
		System.out.println("]");
	}

	private void backOrder(TreeNode<T> node) {
		if (node == null) {
			return;
		}
		backOrder(node.left);
		backOrder(node.right);
		System.out.print(node.data + "\t");
	}

	/**
	 * 层序遍历二叉树
	 */
	public void levelOrder() {
		System.out.print("[");
		levelOrder(this.root);
		System.out.println("]");
	}

	private void levelOrder(TreeNode<T> node) {
		Queue<TreeNode<T>> q = new LinkedList<>();
		q.offer(root);
		while (!q.isEmpty()) {
			TreeNode<T> temp = q.poll();
			System.out.print(temp.data + "\t");
			if (temp.left != null) {
				q.offer(temp.left);
			}
			if (temp.right != null) {
				q.offer(temp.right);
			}
		}
	}

	public static class TreeNode<T> {
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
