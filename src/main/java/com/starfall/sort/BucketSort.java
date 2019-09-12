package com.starfall.sort;

import java.util.*;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.sort
 * @className BucketSort
 * @date 2019/9/10 17:19
 * @description BucketSort 桶排序
 */
public class BucketSort {
	/**
	 * 桶排序
	 * 
	 * @param a
	 *            int数组
	 * @param length
	 *            数组长度
	 */
	public static void bucketSort(int[] a, int length) {
		// Bucket桶的个数，与数组长度保持一致。
		int N = length;
		// 创建桶，每个桶使用链表（LinkedList）表示
		LinkedList<Integer>[] bucket = new LinkedList[N];
		// 待排序数组中的最大值
		// int maxValue = Arrays.stream(arr).max().getAsInt();
		int maxValue = Integer.MIN_VALUE;
		for (int i : a) {
			maxValue = Math.max(maxValue, i);
		}
		// 根据每个元素的值，分配到对应范围的桶中
		for (int i = 0; i < a.length; i++) {
			int index = toBucketIndex(a[i], maxValue, N);
			// 没有桶才建立桶(延时)
			if (bucket[index] == null) {
				bucket[index] = new LinkedList<>();
			}
			// 有桶直接使用
			bucket[index].add(a[i]);
		}
		// 对每个非空的桶排序，排序后顺便存入临时的List，则list中已经有序）
		List<Integer> temp = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			if (bucket[i] != null) {
				Collections.sort(bucket[i]);
				temp.addAll(bucket[i]);
			}
		}
		// 将temp中的数据写入原数组
		for (int i = 0; i < N; i++) {
			a[i] = temp.get(i);
		}
	}

	// 映射函数，将值转换为应存放到的桶数组的索引
	private static int toBucketIndex(int value, int maxValue, int N) {
		return (value * N) / (maxValue + 1);
	}

	public static void main(String[] args) {
		int array[] = { 6, 1, 2, 22, 9, 3, 4, 5, 10, 8 };
		System.out.println("排序前：\t" + Arrays.toString(array));
		bucketSort(array, array.length);
		System.out.println("排序后：\t" + Arrays.toString(array));
	}
}