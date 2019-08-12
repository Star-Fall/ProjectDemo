package com.starfall.sort;

import java.util.Arrays;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.sort
 * @className BubbleSort
 * @date 2019/5/29 22:16
 * @description BubbleSort冒泡排序
 */
public class BubbleSort {

	/**
	 * 冒泡排序
	 * 
	 * @param arr
	 *            int数组
	 * @param length
	 *            数组长度
	 */
	public static void bubbleSort(int arr[], int length) {
		if (arr == null || length <= 1) {
			return;
		}
		for (int i = 0; i < length - 1; i++) {
			for (int j = 0; j < length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	/**
	 * 冒泡排序（优化）
	 * 
	 * @param arr
	 *            int数组
	 * @param length
	 *            数组长度
	 */
	public static void bubbleSortPlus(int arr[], int length) {
		if (arr == null || length <= 1) {
			return;
		}
		for (int i = 0; i < length - 1; i++) {
			boolean flag = false;
			for (int j = 0; j < length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					flag = true;
				}
			}
			if (!false) {
				break;
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = { 2, 9, 7, 6, 8, 5, 4 };
		bubbleSort(arr, arr.length);
		System.out.println(Arrays.toString(arr));
	}
}
