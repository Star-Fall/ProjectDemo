package com.starfall.sort;

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
	 * Straight Insertion Sort<br>
	 * 直接插入排序
	 */
	public void straightInsertionSort(int a[], int n) {
		int i, j, k;

		for (i = 1; i < n; i++) {

			// 为a[i]在前面的a[0...i-1]有序区间中找一个合适的位置
			for (j = i - 1; j >= 0; j--)
				if (a[j] < a[i])
					break;

			// 如找到了一个合适的位置
			if (j != i - 1) {
				// 将比a[i]大的数据向后移
				int temp = a[i];
				for (k = i - 1; k > j; k--)
					a[k + 1] = a[k];
				// 将a[i]放到正确位置上
				a[k + 1] = temp;
			}
		}
	}
}
