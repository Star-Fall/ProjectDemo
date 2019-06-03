package com.starfall.sort;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.sort
 * @className InsertionSortTest
 * @date 2019/5/29 22:59
 * @description InsertionSortTest插入排序测
 */
public class InsertionSortTest {

	@Test
	public void test01() {
		InsertionSort sort = new InsertionSort();
		int[] arr = { 3, 2, 4, 7, 6, 8 };
		sort.straightInsertionSort(arr, arr.length);
		System.out.println(Arrays.toString(arr));
	}

	@Test
	public void test02() {
		System.out.println("1633147347".hashCode());
	}

}