package com.starfall.tree;

import java.util.LinkedList;
import java.util.Queue;

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
		// node的父节点为红色的时候进行调整
		while (node != null && node != this.root && node.parent.color == RED) {
			// node的父节点是node祖父节点的左子树
			if (parentOf(node) == leftOf(parentOf(parentOf(node)))) {
				// y为node的叔叔节点
				TreeNode<T> y = rightOf(parentOf(parentOf(node)));
				// @case1 父节点为red、叔叔节点为red
				if (colorOf(y) == RED) {
					// 设置父节点为black、叔叔节点为black、祖父节点为red
					// 设置祖父节点为node，循环上述步骤
					setColor(parentOf(node), BLACK);
					setColor(y, BLACK);
					setColor(parentOf(parentOf(node)), RED);
					node = parentOf(parentOf(node));
				} else {
					// @case2 父节点为red、叔叔节点为black
					// @case2.1 node为父节点的右子树
					if (node == rightOf(parentOf(node))) {
						// 设置父节点为当前节点
						node = parentOf(node);
						// 左旋父节点，继续case2.2的步骤
						leftRotate(node);
					}
					// @case2.2 node为父节点的左子树
					// 设置父节点为black、祖父节点为red、右旋祖父节点
					setColor(parentOf(node), BLACK);
					setColor(parentOf(parentOf(node)), RED);
					rightRotate(parentOf(parentOf(node)));
				}
			} else {
				// node的父节点是node祖父节点的右子树
				TreeNode<T> y = leftOf(parentOf(parentOf(node)));
				if (colorOf(y) == RED) {
					setColor(parentOf(node), BLACK);
					setColor(y, BLACK);
					setColor(parentOf(parentOf(node)), RED);
					node = parentOf(parentOf(node));
				} else {
					// @case2 父节点为red、叔叔节点为black
					// @case2.1 node为父节点的左子树
					if (node == leftOf(parentOf(node))) {
						// 右旋父节点
						node = parentOf(node);
						rightRotate(node);
					}
					// @case2.2 node为父节点的右子树
					// 设置父节点为black、祖父节点为red、左旋祖父节点
					setColor(parentOf(node), BLACK);
					setColor(parentOf(parentOf(node)), RED);
					leftRotate(parentOf(parentOf(node)));
				}
			}
		}
		root.color = BLACK;
	}

	private TreeNode<T> parentOf(TreeNode<T> p) {
		return (p == null ? null : p.parent);
	}

	private TreeNode<T> leftOf(TreeNode<T> p) {
		return (p == null ? null : p.left);
	}

	private TreeNode<T> rightOf(TreeNode<T> p) {
		return (p == null ? null : p.right);
	}

	private boolean colorOf(TreeNode<T> p) {
		return (p == null ? BLACK : p.color);
	}

	private void setColor(TreeNode<T> p, boolean c) {
		if (p != null)
			p.color = c;
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
		System.out.print(node.data + "," + node.color + "  ");
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
		System.out.print(node.data + "," + node.color + "  ");
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
		System.out.print(node.data + "," + node.color + "  ");
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
			System.out.print(temp.data + "," + temp.color + "  ");
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
