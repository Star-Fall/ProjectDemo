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
		// 外部循环，需要遍历的趟数为length-1
		for (int i = 0; i < length - 1; i++) {
			// 内部循环，第i趟需要比较的次数应该为length-i，因为i从0开始所以为length-1-i
			for (int j = 0; j < length - 1 - i; j++) {
				// 比较相邻的元素，如果前面的数大于后面的数，则交换
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
			System.out.println("第" + (i + 1) + "趟：\t" + Arrays.toString(arr));
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
			// 优化：设置标志，如果某一趟的遍历发现没有数据交换表示已经排序完毕，则不需要进行之后的遍历了。
			boolean flag = false;
			for (int j = 0; j < length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					flag = true;
				}
			}
			if (!flag) {
				break;
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = { 9, 8, 6, 4, 2 };
		System.out.println("排序前：\t" + Arrays.toString(arr));
		bubbleSort(arr, arr.length);
		System.out.println("排序后：\t" + Arrays.toString(arr));
	}
}
