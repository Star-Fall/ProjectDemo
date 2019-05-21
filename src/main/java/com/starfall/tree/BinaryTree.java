package com.starfall.tree;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.tree
 * @className BinaryTree
 * @date 2019/5/21 22:44
 * @description BinaryTree二叉树
 */
public class BinaryTree {

	public <T> void preOrder(TreeNode<T> node) {
		if (node == null) {
			return;
		}
		System.out.println(node.value);
		preOrder(node.left);
		preOrder(node.right);
	}
}
