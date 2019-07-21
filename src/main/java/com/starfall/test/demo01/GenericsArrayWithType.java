package com.starfall.test.demo01;

import java.lang.reflect.Array;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.test.demo01
 * @className GenericsArrayWithType
 * @date 2019/7/21 23:41
 * @description GenericsArrayWithType
 */
public class GenericsArrayWithType<T> {
	private T[] array;

	public GenericsArrayWithType(Class<T> type) {
		array = (T[]) Array.newInstance(type, 10);
	}

	public void put(int index, T item) {
		array[index] = item;
	}

	public T get(int index) {
		return array[index];
	}

	public T[] rep() {
		return array;
	}

	public static void main(String[] args) {
		GenericsArrayWithType<String> gen = new GenericsArrayWithType<>(String.class);
		gen.put(0, "22");
		String value = gen.get(0);
		System.out.println(value);
		// 调用 rep()方法的时候，就不会报 ClassCastException 异常了
		String[] rep = gen.rep();
		System.out.println(rep);
	}
}
