package com.starfall.tree.plus;

import java.util.List;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.tree.plus
 * @className BinaryTree
 * @date 2019/5/22 16:25
 * @description BinaryTree
 */
public class BinaryTree<T> {
    private TreeNode<T> root;
    private static int LIST_INDEX = 0;

    public BinaryTree() {
        root = new TreeNode<>();
    }

    public BinaryTree(T data) {
        root = new TreeNode<>();
        root.data = data;
    }

    /**
     * 获取节点个数
     *
     * @return 节点个数
     */
    public int getNodeNum() {
        return getNodeNum(this.root);
    }

    private int getNodeNum(TreeNode<T> node) {
        if (node == null) {
            return 0;
        }
        return getNodeNum(node.left) + getNodeNum(node.right) + 1;
    }

    /**
     * 获取树的深度
     *
     * @return 树的深度
     */
    public int getTreeDepth() {
        return getTreeDepth(this.root);
    }

    private int getTreeDepth(TreeNode<T> node) {
        if (node == null) {
            return 0;
        }
        int leftDepth = getTreeDepth(node.left) + 1;
        int rightDepth = getTreeDepth(node.right) + 1;
        return leftDepth > rightDepth ? leftDepth : rightDepth;
    }

    /**
     * 增加左子树
     *
     * @param tree 左子树
     */
    public void addLeftTree(BinaryTree<T> tree) {
        this.root.left = tree.root;
    }

    /**
     * 增加右子树
     *
     * @param tree 右子树
     */
    public void addRightTree(BinaryTree<T> tree) {
        this.root.right = tree.root;
    }

    /**
     * 前序创建二叉树
     *
     * @param list list参数
     */
    public void preCreateTree(List<T> list) {
        this.root = preCreTree(this.root, list);
    }

    private TreeNode<T> preCreTree(TreeNode<T> node, List<T> list) {
        T t = list.get(LIST_INDEX++);
        if (t == null) {
            node = null;
        } else {
            node = new TreeNode<>(t);
            node.left = preCreTree(node.left, list);
            node.right = preCreTree(node.right, list);
        }
        return node;
    }

    /**
     * 前序遍历
     */
    public void preOrder() {
        System.out.print("[");
        preOrder(this.root);
        System.out.println("]");
    }

    private void preOrder(TreeNode<T> node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + "\t");
        preOrder(node.left);
        preOrder(node.right);
    }

    /**
     * 中序遍历
     */
    public void midOrder() {
        System.out.print("[");
        midOrder(this.root);
        System.out.println("]");
    }

    private void midOrder(TreeNode<T> node) {
        if (node == null) {
            return;
        }
        midOrder(node.left);
        System.out.print(node.data + "\t");
        midOrder(node.right);
    }

    /**
     * 后序遍历
     */
    public void backOrder() {
        System.out.print("[");
        backOrder(this.root);
        System.out.println("]");
    }

    private void backOrder(TreeNode<T> node) {
        if (node == null) {
            return;
        }
        backOrder(node.left);
        backOrder(node.right);
        System.out.print(node.data + "\t");
    }

    public static class TreeNode<T> {
        TreeNode<T> left;
        TreeNode<T> right;
        T data;

        public TreeNode() {

        }

        public TreeNode(T data) {
            this.data = data;
        }
    }
}
