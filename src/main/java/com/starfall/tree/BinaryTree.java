package com.starfall.tree;

import java.util.List;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.tree
 * @className BinaryTree
 * @date 2019/5/21 22:44
 * @description BinaryTree二叉树
 */
public class BinaryTree {

    /**
     * 前序遍历
     *
     * @param node TreeNode节点
     * @param <T>  泛型参数
     */
    public <T> void preOrder(TreeNode<T> node) {
        if (node == null) {
            return;
        }
        System.out.print(node.value + "\t");
        preOrder(node.left);
        preOrder(node.right);
    }

    /**
     * 中序遍历
     *
     * @param node TreeNode节点
     * @param <T>  泛型参数
     */
    public <T> void midOrder(TreeNode<T> node) {
        if (node == null) {
            return;
        }
        midOrder(node.left);
        System.out.print(node.value + "\t");
        midOrder(node.right);
    }

    /**
     * 后序遍历
     *
     * @param node TreeNode节点
     * @param <T>  泛型参数
     */
    public <T> void backOrder(TreeNode<T> node) {
        if (node == null) {
            return;
        }
        backOrder(node.left);
        backOrder(node.right);
        System.out.print(node.value + "\t");
    }

    private static int INDEX = 0;

    /**
     * 前序创建二叉树
     *
     * @param node TreeNode节点
     * @param list list
     * @param <T>  泛型参数
     * @return 节点
     */
    public <T> TreeNode<T> create(TreeNode<T> node, List<T> list) {
        T t = list.get(INDEX++);
        if (t == null) {
            node = null;
        } else {
            node = new TreeNode<>(t);
            node.left = create(node.left, list);
            node.right = create(node.right, list);
        }
        return node;
    }
}
