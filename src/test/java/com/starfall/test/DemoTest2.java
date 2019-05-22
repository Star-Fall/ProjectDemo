package com.starfall.test;

import com.starfall.tree.plus.BinaryTree;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.test
 * @className DemoTest2
 * @date 2019/5/22 16:26
 * @description todo
 */
public class DemoTest2 {

    @Test
    public void test1() {
        List<String> list = Arrays.asList("A", "B", "D", null, null, "F", "E", null, null, null, "C", "G", null, "H", null, null, "I", null, null);
        BinaryTree<String> bt = new BinaryTree<>();
        bt.preCreateTree(list);
        bt.preOrder();
        bt.midOrder();
        bt.backOrder();
        System.out.println(bt.getTreeDepth());
        System.out.println(bt.getNodeNum());
    }

    @Test
    public void test02() {
        BinaryTree<String> btree = new BinaryTree<>("A");
        BinaryTree<String> bt1, bt2, bt3, bt4;
        bt1 = new BinaryTree<>("B");
        btree.addLeftTree(bt1);
        bt2 = new BinaryTree<>("D");
        bt1.addLeftTree(bt2);

        bt3 = new BinaryTree<>("C");
        btree.addRightTree(bt3);
        bt4 = new BinaryTree<>("E");
        bt3.addLeftTree(bt4);
        bt4 = new BinaryTree<>("F");
        bt3.addRightTree(bt4);
        btree.preOrder();
        btree.midOrder();
        btree.backOrder();
    }
}
