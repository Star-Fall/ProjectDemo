package com.starfall.sort;

import java.util.Arrays;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.sort
 * @className RadixSort
 * @date 2019/9/11 11:10
 * @description RadixSort 基数排序
 */
public class RadixSort {

	/**
	 * 基数排序
	 * 
	 * @param a
	 *            数组
	 * @param length
	 *            数组长度
	 */
	private static void radixSort(int[] a, int length) {
		// 数组最大值
		int max = getArrayMax(a);
		// 二维数组桶
		int[][] bucket = new int[10][length];
		// 计数器数组
		int[] counter = new int[10];
		/**
		 * 对数组元素每个位置的元素进行排序
		 */
		for (int exp = 1; max / exp > 0; exp *= 10) {
			// 数组a元素放入bucket中
			for (int i = 0; i < length; i++) {
				// 获取元素个位的值
				int index = (a[i] / exp) % 10;
				// 元素填入bucket
				bucket[index][counter[index]] = a[i];
				// 计数器对应坐标值自增
				counter[index]++;
			}
			// 取出bucket中元素 重新赋值到数组a中
			int k = 0;
			for (int i = 0; i < bucket.length; i++) {
				// 对应计数器中有值则取对应的桶中元素
				if (counter[i] != 0) {
					for (int j = 0; j < counter[i]; j++) {
						a[k] = bucket[i][j];
						k++;
					}
				}
				// 相应桶中的数据已经回收完，相应计数器归0。
				counter[i] = 0;
				// bucket不用归零，因为取元素是根据计数器取的。
			}
			printArray(bucket);
			System.out.println(exp + "位排序后：\t" + Arrays.toString(a));
			System.out.println("**********************************");
			bucket = new int[10][length];
		}
	}

	/**
	 * 输出二维数组
	 * 
	 * @param bucket
	 *            二维数组
	 */
	private static void printArray(int[][] bucket) {
		for (int i = 0; i < bucket.length; i++) {
			for (int j = 0; j < bucket[i].length; j++) {
				System.out.print(bucket[i][j] + "\t");
			}
			System.out.println();
		}
	}

	/**
	 * 基数排序 Plus
	 * 
	 * @param a
	 *            数组
	 * @param length
	 *            数组长度
	 */
	public static void radixSortPlus(int[] a, int length) {
		// 数组最大值
		int max = getArrayMax(a);
		for (int exp = 1; max / exp > 0; exp *= 10) {
			countSort(a, exp);
		}
	}

	/**
	 * 对数组按照"某个位数"进行排序(桶排序) <br>
	 * 例如，对于数组a <br>
	 * (01) 当exp=1表示按照"个位"对数组a进行排序 <br>
	 * (02) 当exp=10表示按照"十位"对数组a进行排序 <br>
	 * (03) 当exp=100表示按照"百位"对数组a进行排序
	 * 
	 * @param a
	 *            数组
	 * @param exp
	 *            指数
	 */
	private static void countSort(int[] a, int exp) {
		// 存储"被排序数据"的临时数组
		int[] output = new int[a.length];
		int[] buckets = new int[10];

		// 将数据出现的次数存储在buckets[]中
		for (int i = 0; i < a.length; i++) {
			buckets[(a[i] / exp) % 10]++;
		}
		// 更改buckets[i]。目的是让更改后的buckets[i]的值，是该数据在output[]中的位置。
		for (int i = 1; i < 10; i++) {
			buckets[i] += buckets[i - 1];
		}
		// 将数据存储到临时数组output[]中
		for (int i = a.length - 1; i >= 0; i--) {
			output[buckets[(a[i] / exp) % 10] - 1] = a[i];
			buckets[(a[i] / exp) % 10]--;
		}
		// 将排序好的数据赋值给a[]
		for (int i = 0; i < a.length; i++) {
			a[i] = output[i];
		}
		output = null;
		buckets = null;
	}

	/**
	 * 获取数组最大值
	 * 
	 * @param a
	 *            数组
	 * @return 最大值
	 */
	private static int getArrayMax(int[] a) {
		// 确定数组最大值
		int max = Integer.MIN_VALUE;
		for (int i : a) {
			max = Math.max(max, i);
		}
		return max;
	}

	public static void main(String[] args) {
		int array[] = { 50, 123, 543, 187, 49, 30, 2, 11, 100 };
		System.out.println("排序前：\t" + Arrays.toString(array));
		radixSort(array, array.length);
		// radixSortPlus(array, array.length);
		System.out.println("排序后：\t" + Arrays.toString(array));
	}
}