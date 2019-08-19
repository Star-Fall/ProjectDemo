package com.starfall.sort;

import java.util.Arrays;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.sort
 * @className InsertionSort
 * @date 2019/5/29 22:52
 * @description InsertionSort插入排序
 */
public class InsertionSort {

	/**
	 * 直接插入排序
	 *
	 * @param array
	 *            int数组
	 * @param length
	 *            数组长度
	 */
	public static void insertionSort(int array[], int length) {
		// 外层循环：遍历无序序列
		for (int i = 1; i < length; i++) {
			// 待插入的元素
			int temp = array[i];
			int j = 0;
			// 内层循环：倒序循环有序序列，即i前面的序列
			for (j = i - 1; j >= 0; j--) {
				// 如果要插入的元素小于序列元素，序列元素后移
				if (temp < array[j]) {
					array[j + 1] = array[j];
				} else {
					// 不需要后移需要立即停止遍历，防止下标j越界
					break;
				}
			}
			// 插入待插入元素到j+1位置
			array[j + 1] = temp;
			System.out.println("第" + (i) + "趟：\t" + Arrays.toString(array));
		}
	}

	/**
	 * 直接插入排序优化
	 * 
	 * @param array
	 *            int数组
	 * @param length
	 *            数组长度
	 */
	public static void insertionSortPlus(int array[], int length) {
		for (int i = 1; i < length; i++) {
			int temp = array[i];
			int j = 0;
			// 把if中条件判断与for循环判断结合起来
			for (j = i - 1; j >= 0 && temp < array[j]; j--) {
				array[j + 1] = array[j];
			}
			array[j + 1] = temp;
			System.out.println("第" + (i) + "趟：\t" + Arrays.toString(array));
		}
	}

	public static void main(String[] args) {
		int array[] = { 2, 9, 6, 8, 4 };
		System.out.println("排序前：\t" + Arrays.toString(array));
		insertionSort(array, array.length);
		System.out.println("排序后：\t" + Arrays.toString(array));
	}
}
