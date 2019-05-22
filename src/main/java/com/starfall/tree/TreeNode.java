package com.starfall.tree;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.tree
 * @className TreeNode
 * @date 2019/5/21 22:43
 * @description TreeNode
 */
public class TreeNode<T> {
    public TreeNode<T> left;
    public TreeNode<T> right;
    public T value;

    public TreeNode() {

    }

    public TreeNode(T value) {
        this.value = value;
    }

    public TreeNode<T> getLeft() {
        return left;
    }

    public void setLeft(TreeNode<T> left) {
        this.left = left;
    }

    public TreeNode<T> getRight() {
        return right;
    }

    public void setRight(TreeNode<T> right) {
        this.right = right;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
