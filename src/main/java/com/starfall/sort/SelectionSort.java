package com.starfall.sort;

import java.util.Arrays;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.sort
 * @className SelectionSort
 * @date 2019/9/9 17:12
 * @description SelectionSort 简单选择排序
 */
public class SelectionSort {
	/**
	 * 简单选择排序
	 * 
	 * @param a
	 *            int 数组
	 * @param length
	 *            数组长度
	 */
	public static void selectionSort(int a[], int length) {
		int i, j, index, temp;
		// 外层循环：遍历整个序列
		for (i = 0; i < length; i++) {
			// 初始index为首位元素下标
			index = i;
			// 内层循环：遍历无序序列，寻找最小的元素下标索引，记录为index
			for (j = i + 1; j < length; j++) {
				// 比较前后两个数，将较小值的元素索引记录为index
				if (a[j] < a[index]) {
					index = j;
				}
			}
			// 遍历完无序序列，找到最小值索引后与i位置元素交换
			if (index != i) {
				temp = a[index];
				a[index] = a[i];
				a[i] = temp;
			}
			System.out.println("第" + (i) + "趟：\t" + Arrays.toString(a));
		}
	}

	public static void main(String[] args) {
		int array[] = { 6, 1, 2, 7, 9, 3, 4, 5, 10, 8 };
		System.out.println("排序前：\t" + Arrays.toString(array));
		selectionSort(array, array.length);
		System.out.println("排序后：\t" + Arrays.toString(array));
	}
}
