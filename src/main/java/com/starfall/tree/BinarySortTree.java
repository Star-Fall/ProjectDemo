package com.starfall.tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.tree
 * @className BinarySortTree
 * @date 2019/5/26 22:38
 * @description 二叉排序树
 */
public class BinarySortTree<T extends Comparable<T>> {

	private TreeNode<T> root;

	public BinarySortTree() {
		this.root = null;
	}

	public BinarySortTree(T data) {
		this.root = new TreeNode<>(data);
	}

	/**
	 * 递归插入节点创建二叉排序树
	 *
	 * @param list
	 *            序列
	 */
	public void createBSTRecursive(List<T> list) {
		for (T t : list) {
			if (t != null) {
				this.root = insertBSTRecursive(this.root, t);
			}
		}
	}

	/**
	 * 非递归插入节点创建二叉排序树
	 *
	 * @param list
	 *            序列
	 */
	public void createBSTNoRecursive(List<T> list) {
		for (T t : list) {
			if (t != null) {
				insertBSTNoRecursive(t);
			}
		}
	}

	/**
	 * 非递归插入节点创建二叉排序树2
	 *
	 * @param list
	 *            序列
	 */
	public void createBSTNoRecursive2(List<T> list) {
		for (T t : list) {
			if (t != null) {
				insertBSTNoRecursive2(t);
			}
		}
	}

	/**
	 * 释放树
	 */
	public void releaseTree() {
		releaseTree(this.root);
	}

	private void releaseTree(TreeNode<T> node) {
		if (node != null) {
			// 递归释放左子树
			releaseTree(node.left);
			// 递归释放右子树
			releaseTree(node.right);
			node = null;
		}
	}

	/**
	 * 获取二叉排序树最大值
	 *
	 * @return 最大值
	 */
	public T getMaxValue() {
		if (this.root == null || this.root.data == null) {
			return null;
		}
		TreeNode<T> node = this.root;
		while (node.right != null) {
			node = node.right;
		}
		return node.data;
	}

	/**
	 * 获取二叉排序树最小值
	 *
	 * @return 最小值
	 */
	public T getMinValue() {
		if (this.root == null || this.root.data == null) {
			return null;
		}
		TreeNode<T> node = this.root;
		while (node.left != null) {
			node = node.left;
		}
		return node.data;
	}

	/**
	 * 递归查找二叉树节点
	 *
	 * @param data
	 *            查找数据
	 * @return 节点
	 */
	public TreeNode<T> searchBSTRecursive(T data) {
		return searchBSTRecursive(this.root, data);
	}

	private TreeNode<T> searchBSTRecursive(TreeNode<T> node, T data) {
		if (node == null || node.data == null || data == null) {
			// 条件不符，未找到相同节点，递归结束
			return null;
		} else if (node.data.compareTo(data) > 0) {
			// 递归遍历左子树
			return searchBSTRecursive(node.left, data);
		} else if (node.data.compareTo(data) < 0) {
			// 递归遍历右子树
			return searchBSTRecursive(node.right, data);
		} else {
			// 遍历到相同节点，递归结束
			return node;
		}
	}

	/**
	 * 非递归查找二叉树节点
	 *
	 * @param data
	 *            节点数据
	 * @return 节点
	 */
	public TreeNode<T> searchBSTNoRecursive(T data) {
		TreeNode<T> current = this.root;
		while (current != null && current.data != null && data != null) {
			if (current.data.compareTo(data) == 0) {
				// 遍历到相同节点
				return current;
			} else if (current.data.compareTo(data) > 0) {
				// 遍历左子树
				current = current.left;
			} else if (current.data.compareTo(data) < 0) {
				// 遍历右子树
				current = current.right;
			}
		}
		// 未找到相同节点
		return null;
	}

	/**
	 * 插入节点
	 * 
	 * @param data
	 *            参数数据 不为null
	 * @param flag
	 *            是否使用递归
	 */
	public void insertBST(T data, boolean flag) {
		if (data != null) {
			if (flag) {
				// 使用递归算法
				this.root = insertBSTRecursive(this.root, data);
			} else {
				// 使用非递归算法
				insertBSTNoRecursive(data);
			}
		} else {
			throw new NullPointerException("data 不能为空");
		}
	}

	/**
	 * 递归插入节点算法
	 *
	 * @param node
	 *            根节点
	 * @param data
	 *            节点数据
	 * @return 根节点
	 */
	private TreeNode<T> insertBSTRecursive(TreeNode<T> node, T data) {
		if (node == null || node.data == null) {
			node = new TreeNode<>(data);
		} else if (node.data.compareTo(data) > 0) {
			// 递归插入左子树
			node.left = insertBSTRecursive(node.left, data);
		} else if (node.data.compareTo(data) < 0) {
			// 递归插入右子树
			node.right = insertBSTRecursive(node.right, data);
		}
		return node;
	}

	/**
	 * 非递归插入节点算法
	 *
	 * @param data
	 *            插入的数据
	 */
	private void insertBSTNoRecursive(T data) {
		if (this.root == null || this.root.data == null) {
			this.root = new TreeNode<>(data);
			return;
		}
		// 记录根节点引用
		TreeNode<T> current = this.root;
		while (true) {
			if (current.data.compareTo(data) > 0) {
				// 左子树为空，则插入到该节点的左孩子
				if (current.left == null) {
					current.left = new TreeNode<>(data);
					return;
				}
				// 左子树不为空，继续遍历左子树
				current = current.left;
			} else if (current.data.compareTo(data) < 0) {
				// 右子树为空，则插入到该节点的右孩子
				if (current.right == null) {
					current.right = new TreeNode<>(data);
					return;
				}
				// 右子树不为空，继续遍历右子树
				current = current.right;
			} else {
				return;
			}
		}
	}

	/**
	 * 非递归插入节点算法2
	 *
	 * @param data
	 *            插入的数据
	 */
	private void insertBSTNoRecursive2(T data) {
		if (this.root == null || this.root.data == null) {
			this.root = new TreeNode<>(data);
			return;
		}
		// 记录根节点引用
		TreeNode<T> current = this.root;
		// 记录搜索到空节点的父节点
		TreeNode<T> parent = null;
		// 搜索二叉排序树，找到可以插入的节点及其父节点。
		while (current != null && current.data != null) {
			parent = current;
			if (current.data.compareTo(data) > 0) {
				current = current.left;
			} else if (current.data.compareTo(data) < 0) {
				current = current.right;
			} else {
				return;
			}
		}
		// 插入到父节点的左右节点
		if (parent.data.compareTo(data) > 0) {
			parent.left = new TreeNode<>(data);
		} else if (parent.data.compareTo(data) < 0) {
			parent.right = new TreeNode<>(data);
		}
	}

	/**
	 * 删除节点
	 * 
	 * @param data
	 *            节点数据
	 */
	public void deleteNode(T data) {
		if (this.root == null || this.root.data == null) {
			return;
		}
		TreeNode<T> current = this.root; // 记录根节点引用
		TreeNode<T> parent = this.root; // 记录搜索到空节点的父节点
		boolean isLeftChild = true; // current是否是parent的左孩子
		/**
		 * 搜索二叉排序树，找到可以插入的节点及其父节点；并记录节点是父节点的左或右子树
		 */
		while (current.data.compareTo(data) != 0) {
			parent = current; // 记录parent节点
			if (current.data.compareTo(data) > 0) { // 搜索左子树
				current = current.left;
				isLeftChild = true;
			} else if (current.data.compareTo(data) < 0) { // 搜索右子树
				current = current.right;
				isLeftChild = false;
			}
			if (current == null) { // 左右子树搜索完毕，没有找到相同节点
				return;
			}
		}
		/**
		 * 进行删除
		 */
		// current左右子树为空
		if (current.left == null && current.right == null) {
			if (current == this.root) { // 删除的是根节点
				this.root = null;
			}
			if (isLeftChild) {
				parent.left = null;
			} else {
				parent.right = null;
			}
		}
		// current左子树不为空，右子树为空
		else if (current.left != null & current.right == null) {
			if (current == this.root) { // 删除的是根节点
				this.root = current.left;
			}
			if (isLeftChild) {
				parent.left = current.left;
			} else {
				parent.right = current.left;
			}

		}
		// current左子树不为空，右子树为空
		else if (current.right != null & current.left == null) {
			if (current == this.root) { // 删除的是根节点
				this.root = current.right;
			}
			if (isLeftChild) {
				parent.left = current.right;
			} else {
				parent.right = current.right;
			}
		}
		// current左右子树都不为空
		else if (current.left != null && current.right != null) {
			/**
			 * method 1：前驱替换删除的节点<br>
			 * 该节点的左子树中的最大节点，即左子树中最右侧节点
			 */

			/**
			 * method 2：后继替换删除的节点<br>
			 * 该节点的右子树中的最小节点，即右子树中最左侧节点
			 */
			// // 右子树
			// TreeNode<T> s = current.right;
			// // 后继者
			// TreeNode<T> successor = s;
			// // 后继者的父节点
			// TreeNode successorParent = null;
			// while (s != null) {
			// successorParent = successor;
			// successor = s;
			// s = s.left;
			// }
			// // 后继者父节点的左节点重新指向后继者的右节点(后继者无左节点）
			// successorParent.left = successor.right;
			// // 后继者数据替换删除的节点数据
			// current.data = successor.data;
		}
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
