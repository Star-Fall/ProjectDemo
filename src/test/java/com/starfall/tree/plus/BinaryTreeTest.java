package com.starfall.tree.plus;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.tree.plus
 * @className BinaryTreeTest
 * @date 2019/5/22 20:30
 * @description BinaryTreeTest
 */
public class BinaryTreeTest {

	/**
	 * 添加子树创建二叉树
	 */
	@Test
	public void test01() {
		// 层序遍历：ABCDEFG
		// 根节点
		BinaryTree<String> btree = new BinaryTree<>("A");
		// 根节点左右子树
		BinaryTree<String> bt1, bt2;
		bt1 = new BinaryTree<>("B");
		btree.setLeftTree(bt1);
		bt2 = new BinaryTree<>("C");
		btree.setRightTree(bt2);
		// B左右子树
		BinaryTree<String> bt11, bt12;
		bt11 = new BinaryTree<>("D");
		bt1.setLeftTree(bt11);
		bt12 = new BinaryTree<>("E");
		bt1.setRightTree(bt12);
		// C左右子树
		BinaryTree<String> bt21, bt22;
		bt21 = new BinaryTree<>("F");
		bt2.setLeftTree(bt21);
		bt22 = new BinaryTree<>("G");
		bt2.setRightTree(bt22);
		// 遍历
		btree.preOrder();
		btree.midOrder();
		btree.backOrder();
		btree.levelOrder();
	}

	/**
	 * 前序遍历创建二叉树
	 */
	@Test
	public void test02() {
		// 补全空节点
		List<String> list = Arrays.asList("A", "B", "D", null, null, "F", "E", null, null, null, "C", "G", null, "H",
				null, null, "I", null, null);
		BinaryTree<String> bt = new BinaryTree<>();
		bt.preCreateTree(list);
		bt.preOrder();
		bt.midOrder();
		bt.backOrder();
		bt.levelOrder();
	}

	/**
	 * 层序遍历创建二叉树
	 */
	@Test
	public void test03() {
		// 补全空节点，转为完全二叉树
		List<String> list = Arrays.asList("A", "B", "C", "D", "F", "G", "I", null, null, "E", null, null, "H");
		BinaryTree<String> bt = new BinaryTree<>();
		bt.levelCreateTree(list);
		bt.preOrder();
		bt.midOrder();
		bt.backOrder();
		bt.levelOrder();
	}

	/**
	 * 二叉树其他用法
	 */
	@Test
	public void test04() {
		List<String> list = Arrays.asList("A", "B", "D", null, null, "F", "E", null, null, null, "C", "G", null, "H",
				null, null, "I", null, null);
		BinaryTree<String> bt = new BinaryTree<>();
		bt.preCreateTree(list);
		System.out.println(bt.getNodeNum());
		System.out.println(bt.getTreeDepth());
		System.out.println(bt.getLeafNum());
		System.out.println("************");
		BinaryTree<String> tree = bt.getBTree("F");
		System.out.println(tree.getNodeNum());
		System.out.println(tree.getTreeDepth());
		System.out.println(tree.getLeafNum());
		System.out.println(tree.getRoot().getData());
		tree.levelOrder();
	}
}