package com.starfall.tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

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
	private int LIST_INDEX = 0;

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
	 * 释放树
	 */
	public void releaseTree() {
		releaseTree(this.root);
	}

	private void releaseTree(TreeNode<T> node) {
		if (node != null) {
			releaseTree(node.left);
			releaseTree(node.right);
			node = null;
		}
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
	 * 根据节点数据获取该节点的左子树
	 * 
	 * @param t
	 *            节点数据
	 * @return 左子树
	 */
	public BinaryTree<T> getLeftChildTree(T t) {
		TreeNode<T> node = getNodeByValue(this.root, t);
		if (node == null) {
			return null;
		} else {
			return new BinaryTree<>(node.left);
		}
	}

	/**
	 * 根据节点数据获取该节点的右子树
	 * 
	 * @param t
	 *            节点数据
	 * @return 右子树
	 */
	public BinaryTree<T> getRightChildTree(T t) {
		TreeNode<T> node = getNodeByValue(this.root, t);
		if (node == null) {
			return null;
		} else {
			return new BinaryTree<>(node.right);
		}
	}

	/**
	 * 根据节点数据获取当前树
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
	 * @param list
	 *            list参数
	 */
	public void levelCreateTree(List<T> list) {
		this.root = levelCreateTree(list, 1);
	}

	private TreeNode<T> levelCreateTree(List<T> list, int i) {
		TreeNode<T> node;
		if (i > list.size() || list.get(i - 1) == null) {
			node = null;
		} else {
			T t = list.get(i - 1);
			node = new TreeNode<>(t);
			node.left = levelCreateTree(list, 2 * i);
			node.right = levelCreateTree(list, 2 * i + 1);
		}
		return node;
	}

	// private TreeNode<T> levelCreateTree(TreeNode<T> node, List<T> list, int i) {
	// if (i > list.size() || list.get(i - 1) == null) {
	// node = null;
	// } else {
	// T t = list.get(i - 1);
	// node = new TreeNode<>(t);
	// node.left = levelCreateTree(node.left, list, 2 * i);
	// node.right = levelCreateTree(node.right, list, 2 * i + 1);
	// }
	// return node;
	// }

	/**
	 * 前序创建二叉树
	 *
	 * @param list
	 *            list参数
	 */
	public void preCreateTree(List<T> list) {
		this.root = preCreTree(list);
	}

	private TreeNode<T> preCreTree(List<T> list) {
		T t = list.get(LIST_INDEX++);
		TreeNode<T> node;
		if (t == null) {
			node = null;
		} else {
			node = new TreeNode<>(t);
			node.left = preCreTree(list);
			node.right = preCreTree(list);
		}
		return node;
	}

	// private TreeNode<T> preCreTree(TreeNode<T> node, List<T> list) {
	// T t = list.get(LIST_INDEX++);
	// if (t == null) {
	// node = null;
	// } else {
	// node = new TreeNode<>(t);
	// node.left = preCreTree(node.left, list);
	// node.right = preCreTree(node.right, list);
	// }
	// return node;
	// }

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
		q.offer(node);
		while (!q.isEmpty()) {
			TreeNode<T> temp = q.poll();
			if (temp == null) {
				return;
			}
			System.out.print(temp.data + "\t");
			if (temp.left != null) {
				q.offer(temp.left);
			}
			if (temp.right != null) {
				q.offer(temp.right);
			}
		}
	}

	public void preOrderNoRecursion() {
		if (this.root == null) {
			return;
		}
		TreeNode<T> node = this.root;
		Stack<TreeNode<T>> stack = new Stack<>();
		while (node != null || !stack.empty()) {
			if (node != null) {
				System.out.print(node.data + "\t");
				stack.push(node);
				node = node.left;
			} else {
				node = stack.pop();
				node = node.right;
			}
		}
	}

	public void preOrderNoRecursion2() {
		if (this.root == null) {
			return;
		}
		TreeNode<T> node = this.root;
		Stack<TreeNode<T>> stack = new Stack<>();
		stack.push(node);
		while (!stack.empty() && node != null) {
			System.out.print(node.data + "\t");
			if (node.right != null) {
				stack.push(node.right);
			}
			if (node.left != null) {
				node = node.left;
			} else {
				node = stack.pop();
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
