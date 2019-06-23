package com.starfall.tree;

import org.junit.Test;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.tree
 * @className RedBlackTreeTest
 * @date 2019/6/5 15:19
 * @description RedBlackTreeTest红黑树测试
 */
public class RedBlackTreeTest {

	@Test
	public void test01() {
		RedBlackTree tree = new RedBlackTree();
		int a[] = { 10, 40, 30, 60, 90, 70, 20, 50, 80 };
		for (int i = 0; i < a.length; i++) {
			tree.insert(a[i]);
		}
		tree.preOrder();
		tree.midOrder();
		tree.backOrder();
		tree.levelOrder();
	}

	@Test
	public void test02() {
		RedBlackTree tree = new RedBlackTree();
		int a[] = { 10, 40, 30, 60, 90, 70, 20, 50, 80 };
		for (int i = 0; i < a.length; i++) {
			tree.insert(a[i]);
		}
		tree.preOrder();
		tree.midOrder();
		tree.backOrder();
		tree.levelOrder();
		System.out.println("*************删除节点*************");
		tree.remove(80);
		tree.preOrder();
		tree.midOrder();
		tree.backOrder();
		tree.levelOrder();
	}
}