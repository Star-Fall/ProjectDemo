package com.starfall.test;

import com.starfall.tree.BinaryTree;
import com.starfall.tree.TreeNode;
import org.junit.Test;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.test
 * @className DemoTest
 * @date 2019/5/21 23:51
 * @description DemoTest
 */
public class DemoTest {
	@Test
	public void test01() {
		TreeNode<Integer> root = new TreeNode<>(1);
		root.addLeft(2);
		root.addRight(3);
		root.left.addLeft(4);
		root.left.addRight(5);
		root.right.addLeft(6);
		root.right.addRight(7);
		BinaryTree bt = new BinaryTree();
		bt.preOrder(root);
	}
}
