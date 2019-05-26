package com.starfall.tree;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.tree
 * @className BinarySortTreeTest
 * @date 2019/5/26 22:41
 * @description 二叉排序树测试
 */
public class BinarySortTreeTest {

    @Test
	public void test01() {
		List<Integer> list = Arrays.asList(63, 55, 90, 42, 58, 70, 10, 45, 67, 83);
		BinarySortTree<Integer> bst = new BinarySortTree<>(list);
		bst.midOrder();
	}
}