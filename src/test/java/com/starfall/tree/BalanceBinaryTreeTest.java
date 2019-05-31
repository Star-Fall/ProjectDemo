package com.starfall.tree;

import org.junit.Test;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.tree
 * @className BalanceBinaryTreeTest
 * @date 2019/5/30 22:41
 * @description BalanceBinaryTreeTest平衡二叉树测试
 */
public class BalanceBinaryTreeTest {
	@Test
	public void test01() {
		BalanceBinaryTree<Integer> bbt = new BalanceBinaryTree<Integer>();
		// int arr[] = { 3, 2, 1, 4, 5, 6, 7, 16, 15, 14, 13, 12, 11, 10, 8, 9 };
		int arr[] = { 8, 4, 12, 2, 6, 1 };
		for (int i = 0; i < arr.length; i++) {
			bbt.insert(arr[i]);
		}
		bbt.preOrder();
		bbt.midOrder();
		bbt.backOrder();
		bbt.levelOrder();
	}

}