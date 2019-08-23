package com.starfall.sort;

import java.util.Arrays;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.sort
 * @className QuickSort
 * @date 2019/8/22 12:00
 * @description QuickSort 快速排序
 */
public class QuickSort {
	/**
	 * 快速排序
	 * 
	 * @param a
	 *            int 数组
	 * @param left
	 *            数组的左边界(例如，从起始位置开始排序，则left=0)
	 * @param right
	 *            数组的右边界(例如，排序截至到数组末尾，则right=a.length-1)
	 */
	public static void quickSort(int a[], int left, int right) {
		if (left > right)
			return;
		int i, j, temp, base;
		// 基准值赋值
		base = a[left];
		// 设置i,j哨兵
		i = left;
		j = right;
		while (i != j) {
			// 首先从右向左找小于base的元素
			while (a[j] >= base && i < j) {
				j--;
			}
			// 从左向右找大于base的元素
			while (a[i] <= base && i < j) {
				i++;
			}
			// 此处两处元素都已找到
			if (i < j) {
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
			System.out.println("\ti=" + i + ",j=" + j + " :\t" + Arrays.toString(a));
		}
		// 基准值与i,j相遇的元素交换
		a[left] = a[i];
		a[i] = base;
		System.out.println("base = " + base + " :\t" + Arrays.toString(a));
		// 递归排序左侧序列：从left开始到i-1结束
		quickSort(a, left, i - 1);
		// 递归排序右侧序列：从i+1开始到right结束
		quickSort(a, i + 1, right);
	}

	/**
	 * 快速排序优化
	 *
	 * @param a
	 *            int 数组
	 * @param left
	 *            数组的左边界(例如，从起始位置开始排序，则left=0)
	 * @param right
	 *            数组的右边界(例如，排序截至到数组末尾，则right=a.length-1)
	 */
	public static void quickSortPlus(int a[], int left, int right) {
		if (left > right)
			return;
		int i, j, temp, base;
		base = a[left];
		i = left;
		j = right;
		while (i != j) {
			// 首先哨兵j左移寻找小于base的元素
			while (a[j] >= base && i < j)
				j--;
			if (i < j)
				a[i] = a[j];
			System.out.println("\ti=" + i + ",j=" + j + " :\t" + Arrays.toString(a));
			// 然后哨兵i右移寻找大于base的元素
			while (a[i] <= base && i < j)
				i++;
			if (i < j)
				a[j] = a[i];
			System.out.println("\ti=" + i + ",j=" + j + " :\t" + Arrays.toString(a));
		}
		// 基准值直接赋值到i,j相遇的位置
		a[i] = base;
		System.out.println("base = " + base + " :\t" + Arrays.toString(a));
		// 递归排序左侧序列：从left开始到i-1结束
		quickSort(a, left, i - 1);
		// 递归排序右侧序列：从i+1开始到right结束
		quickSort(a, i + 1, right);
	}

	public static void main(String[] args) {
		int array[] = { 6, 1, 2, 7, 9, 3, 4, 5, 10, 8 };
		System.out.println("排序前：\t" + Arrays.toString(array));
		quickSortPlus(array, 0, array.length - 1);
		System.out.println("排序后：\t" + Arrays.toString(array));
	}
}
