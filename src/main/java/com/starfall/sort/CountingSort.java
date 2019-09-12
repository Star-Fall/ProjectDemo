package com.starfall.sort;

import java.util.Arrays;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.sort
 * @className CountingSort
 * @date 2019/9/11 11:14
 * @description CountingSort 计数排序
 */
public class CountingSort {
	/**
	 * 计数排序
	 * 
	 * @param a
	 *            int数组
	 * @param length
	 *            数组长度
	 */
	public static void countingSort(int a[], int length) {
		// 确定数组最大值
		int max = Integer.MIN_VALUE;
		for (int i : a) {
			max = Math.max(max, i);
		}
		// 初始化countArray数组
		int[] countArray = new int[max + 1];
		// 将排序数组a中元素计数到countArray数组对应下标处
		for (int i = 0; i < length; i++) {
			countArray[a[i]]++;
		}
		System.out.println("countArray计数：\t" + Arrays.toString(countArray));
		// 遍历countArray数组，取出相应下标重新赋值到a数组中
		for (int i = 0, j = 0; i < countArray.length; i++) {
			// 如果countArray中i处的值大于0，则i为a数组中值，依次放入数组a中
			while ((countArray[i]--) > 0) {
				a[j++] = i;
			}
		}
	}

	public static void main(String[] args) {
		int array[] = { 6, 1, 2, 22, 9, 3, 4, 5, 10, 8 };
		System.out.println("排序前：\t" + Arrays.toString(array));
		countingSort(array, array.length);
		System.out.println("排序后：\t" + Arrays.toString(array));
	}
}
