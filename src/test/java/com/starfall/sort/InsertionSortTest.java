package com.starfall.sort;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

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
		int[] arr = { 12, 15, 9, 20, 6, 31, 24 };
		sort.straightInsertionSort(arr, arr.length);
		System.out.println(Arrays.toString(arr));
	}

}