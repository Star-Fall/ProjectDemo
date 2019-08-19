package com.starfall.sort;

import java.util.Arrays;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.sort
 * @className ShellSort
 * @date 2019/8/19 10:55
 * @description ShellSort 希尔排序
 */
public class ShellSort {
	/**
	 * 希尔排序
	 * 
	 * @param array
	 *            int 数组
	 * @param length
	 *            数组长度
	 */
	public static void shellSort(int array[], int length) {
		int k = 0, i = 0, j = 0, temp = 0;
		int gap = length / 2;
		while (gap >= 1) {
			// 遍历每个分组，总共gap个分组
			for (k = 0; k < gap; k++) {
				/* 直接插入排序算法，将以前的步长1换成步长gap */
				// 外层循环：遍历无序列表
				/* 对于一个分组，两个元素相隔gap距离，外层循环每次递增gap */
				for (i = k + gap; i < length; i += gap) {
					// 记录待插入的元素temp
					temp = array[i];
					// 内层循环：遍历有序列表
					/* 对于一个分组，两个元素相隔gap距离，内层循环每次递减gap */
					for (j = i - gap; j >= 0 && temp < array[j]; j -= gap) {
						// 有序元素后移gap个位置
						array[j + gap] = array[j];
					}
					// 将待插入元素temp插入到无需后移的位置
					array[j + gap] = temp;
				}
			}
			System.out.println("第" + gap + "步：\t" + Arrays.toString(array));
			// 每个分组排序完成，缩小步长
			gap = gap / 2;
		}
	}

	/**
	 * 希尔排序优化
	 * 
	 * @param array
	 *            int 数组
	 * @param length
	 *            数组长度
	 */
	public static void shellSortPlus(int array[], int length) {
		int i = 0, j = 0, temp = 0, gap = length / 2;
		while (gap >= 1) {
			for (i = gap; i < length; i++) {
				temp = array[i];
				for (j = i - gap; j >= 0 && temp < array[j]; j = j - gap) {
					array[j + gap] = array[j];
				}
				array[j + gap] = temp;
				System.out.println("\t第" + i + "趟：\t" + Arrays.toString(array));
			}
			System.out.println("第" + gap + "步：\t" + Arrays.toString(array));
			gap = gap / 2;
		}
	}

	public static void main(String[] args) {
		// int array[] = { 49, 38, 65, 97, 26, 13, 27, 77, 55, 4 };
		int array[] = { 45, 23, 19, 16, 11, 9, 2, 1 };
		System.out.println("排序前：\t" + Arrays.toString(array));
		shellSort(array, array.length);
		System.out.println("排序后：\t" + Arrays.toString(array));
	}
}
