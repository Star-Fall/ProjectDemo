package com.starfall.test;

import com.starfall.tree.BinaryTree;
import com.starfall.tree.TreeNode;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
        root.setLeft(new TreeNode<>(2));
        root.setRight(new TreeNode<>(3));
        root.getLeft().setLeft(new TreeNode<>(4));
        root.getLeft().setRight(new TreeNode<>(5));
        root.getRight().setLeft(new TreeNode<>(6));
        root.getRight().setRight(new TreeNode<>(7));
        BinaryTree bt = new BinaryTree();
        bt.preOrder(root);
        System.out.println();
        bt.midOrder(root);
        System.out.println();
        bt.backOrder(root);
    }

    @Test
    public void test02() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add(null);
        list.add("d");
        System.out.println(list);
    }

    @Test
    public void test03() {
        List<String> list = Arrays.asList("A", "B", "D", null, null, "F", "E", null, null, null, "C", "G", null, "H", null, null, "I", null, null);
        BinaryTree bt = new BinaryTree();
        TreeNode<String> root = new TreeNode<>();
        root = bt.create(root, list);
        bt.preOrder(root);
        System.out.println();
        bt.midOrder(root);
        System.out.println();
        bt.backOrder(root);
    }
}
